package com.paper.service.impl;

import com.paper.entity.Teacher;
import com.paper.entity.Thesis;
import com.paper.mapper.TeacherMapper;
import com.paper.mapper.ThesisMapper;
import com.paper.service.TeacherService;
import com.paper.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    ThesisMapper thesisMapper;

    @Override
    public Result getTeacherById(int id) {
        Teacher t = teacherMapper.selectById(id);
        return new Result("100","search success", t);
    }

    @Override
    public Result getTeacherList() {
        List<Teacher> teachers = teacherMapper.selectAll();
        return new Result("100","search success", teachers);
    }

    @Override
    public Result updateTeacherInfo(Teacher teacher) {
        return null;
    }

    @Override
    public Result addThesis(Thesis thesis, int teacher_id) {
        Teacher t = teacherMapper.selectById(teacher_id);
        if(t == null) {
            return new Result("200","没有找到当前老师！");
        }
        int thesis_count = thesisMapper.SelectNums(t);
        if(t.getMax_thesis_num() >= thesis_count) {
            return new Result("200","达到命题上限！");
        }

        if(thesisMapper.insertThesis(thesis) != 1) {
            return new Result("200","添加命题失败！");
        }
        return new Result("100", "添加题目成功！");
    }

    @Override
    public Result getAllThesisByTeacherId(int teacher_id) {
        Thesis thesis = new Thesis();
        thesis.setTeacher_id(teacher_id);
        List<Thesis> theses = thesisMapper.selectWhere(thesis);
        return null;
    }


}
