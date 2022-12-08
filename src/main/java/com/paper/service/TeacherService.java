package com.paper.service;

import com.paper.entity.Teacher;
import com.paper.entity.Thesis;
import com.paper.util.Result;

import java.util.List;

public interface TeacherService {

    Result getTeacherById(int id);

    Result getTeacherList();

    Result updateTeacherInfo(Teacher teacher);

    Result addThesis(Thesis thesis, int teacher_id);

    Result getAllThesisByTeacherId(int teacher_id);
}
