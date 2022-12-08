package com.paper.controller;

import com.paper.entity.Teacher;
import com.paper.service.TeacherService;
import com.paper.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/editInfo")
    public Result editInfo(Teacher teacher) {
        return null;
    }
}
