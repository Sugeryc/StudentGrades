package com.score.service;

import com.github.pagehelper.PageInfo;


import com.github.pagehelper.PageInfo;
import com.score.bean.TStudent;

import java.util.List;

public interface TStudentService {

    List<TStudent> selectloginStudent(TStudent student);

    PageInfo<TStudent> getAll(TStudent student, int page, int limit);

    TStudent selectByNo(Integer studentNo);

    void addStudent(TStudent student);

    Integer updateStudent(TStudent student);

    Integer deleteStudent(int studentNo);

    List<TStudent> selectAllStudent();


}
