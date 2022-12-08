package com.paper.service.impl;

import com.paper.entity.*;
import com.paper.mapper.PhaseMapper;
import com.paper.mapper.StudentMapper;
import com.paper.mapper.TeacherMapper;
import com.paper.mapper.ThesisMapper;
import com.paper.service.StudentService;
import com.paper.util.DateUtil;
import com.paper.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.ParseException;
import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;
    @Autowired
    PhaseMapper phaseMapper;

    @Autowired
    ThesisMapper thesisMapper;



    @Override
    public Student getById(int id) {
        return studentMapper.selectById(id);
    }

    @Override
    public List<Student> getStudentList(Student student) {
        return studentMapper.selectWhere(student);
    }

    @Override
    public Result updateStuInfo(Student student) {
        Student s = studentMapper.selectById(student.getId());
        if(null == s) {
          return new Result("200", "student not exit!");
        }
        student.setNo(null);
        student.setClazz_id(null);
        student.setAcc_id(null);
        if(studentMapper.updateNotNull(student) == 0) {
            return new Result("200", "update fail!");
        }
        return new Result("100","update success!");
    }

    @Override
    public Result searchPhase(Account account) throws ParseException {
        Student cs = getCurStuByAcc(account);
        Phase p = new Phase();
        p.setCollege_name(cs.getCollege_name());
        p.setDep_name(cs.getCollege_name());
        List<Phase> phases = phaseMapper.selectWhere(p);
        for(Phase phase : phases) {
            // 如果当前时间在某个（些）阶段内，返回这个（些）阶段的通知信息
            if(!DateUtil.belongCalendar(DateUtil.returnNowTime(), phase.getStart_time(), phase.getEnd_time())) {
                phases.remove(phase);
            }
        }
        return new Result("100","success", phases);
    }

    @Override
    public Result searchThesisList(Account account, Thesis thesis) {
        Student cs = getCurStuByAcc(account);
        List<Thesis> list = null;
        // 学生只能查询到自己所在系的论文命题
        if(!Objects.equals(cs.getDep_id(), thesis.getDep_id())) {
            return new Result<>("100", "wrong department id", list);
        }
        list = thesisMapper.selectWhere(thesis);
        return new Result<>("100", "success", list);
    }

    @Override
    public Result readThesisDetail(int id) {
        return new Result("100", "success", thesisMapper.selectById(id));
    }

    @Override
    public Result getStuInfo(Account account) {
        return new Result("100","success", getCurStuByAcc(account));
    }

    @Override
    public Result setThesisPreference(int id, int prefer_level, Account account) {
        Thesis thesis = thesisMapper.selectById(id);
        Student cs = getCurStuByAcc(account);
        Preference preference = new Preference();
        preference.setStu_id(cs.getId());
        preference.setStu_preference(prefer_level);
        return null;
    }

    public Student getCurStuByAcc(Account account) {
        return studentMapper.selectByAccId(account.getId());
    }
}
