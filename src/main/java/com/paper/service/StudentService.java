package com.paper.service;



import com.paper.entity.Account;
import com.paper.entity.Student;
import com.paper.entity.Thesis;
import com.paper.util.Result;

import java.text.ParseException;
import java.util.List;

public interface StudentService {


    Student getById(int id);

    List<Student> getStudentList(Student student);

    public Result updateStuInfo(Student student);

    public Result searchPhase(Account account) throws ParseException;


    Result searchThesisList(Account account, Thesis thesis);

    Result readThesisDetail(int id);

    Result getStuInfo(Account account);

    Result setThesisPreference(int id, int willing, Account account);
}
