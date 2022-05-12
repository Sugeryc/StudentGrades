package com.score.service;

<<<<<<< HEAD
=======
import com.github.pagehelper.PageInfo;
>>>>>>> jiaxin
import com.score.bean.TStudent;

import java.util.List;

public interface TStudentService {
<<<<<<< HEAD
    List<TStudent> selectloginStudent(TStudent student);
=======
    PageInfo<TStudent> getAll(TStudent student, int page, int limit);

    TStudent selectByNo(Integer studentNo);

    void addStudent(TStudent student);

    Integer updateStudent(TStudent student);

    Integer deleteStudent(int studentNo);

    List<TStudent> selectAllStudent();
>>>>>>> jiaxin

}
