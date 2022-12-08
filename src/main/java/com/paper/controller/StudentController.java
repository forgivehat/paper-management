package com.paper.controller;

import com.paper.entity.Account;
import com.paper.entity.Student;
import com.paper.entity.Thesis;
import com.paper.service.AccountService;
import com.paper.service.StudentService;
import com.paper.util.Result;
import com.paper.util.TokenUtil;
import com.paper.util.VerifyToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;

@RestController
@RequestMapping("/student")
@VerifyToken
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    AccountService accountService;

    @VerifyToken
    @RequestMapping("/showInfo")
    public Result showInfo(HttpServletRequest request) {
        Account acc = getCurAcc(request);
        return studentService.getStuInfo(acc);
    }

    @VerifyToken
    @RequestMapping("/editInfo")
    public Result EditInfo(Student student) {
        return studentService.updateStuInfo(student);
    }

    @VerifyToken
    @RequestMapping("/searchPhase")
    public Result searchPhase(HttpServletRequest request) throws ParseException {
        return studentService.searchPhase(getCurAcc(request));
    }

    @VerifyToken
    @PostMapping("/thesisList")
    public Result showThesisList(@RequestBody Thesis thesis, HttpServletRequest request) {
        Account acc = getCurAcc(request);
        return studentService.searchThesisList(acc, thesis);
    }

    @VerifyToken
    @RequestMapping("/selectThesis")
    public Result selectThesis(HttpServletRequest request,@RequestParam(value = "id") int thesis_id, @RequestParam(value = "preference") int preference) {
        Account acc = getCurAcc(request);
        return studentService.setThesisPreference(thesis_id, preference, acc);
    }

    public Account getCurAcc(HttpServletRequest request) {
        String username = TokenUtil.getUsernameFromToken(request);
        return accountService.findByUsername(username);
    }
}
