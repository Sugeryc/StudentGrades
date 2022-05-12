package com.score.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.score.bean.TStudent;
import com.score.dao.TStudentMapper;
import com.score.service.TStudentService;

@Service // 标识为服务类
public class StudentServiceImpl implements TStudentService {

    @Autowired(required = false)
    private TStudentMapper studentMapper;
    private int size;

    @Override
    public PageInfo<TStudent> getAll(TStudent student, int page, int limit) {
        // 首先开启PageHelper的分页
        PageHelper.startPage(page, size);
        // 查询分页信息 调用方式与普通方式一致
        List<TStudent> list = studentMapper.selectAll(student);
        //生成PageInfo对象
        PageInfo<TStudent> pageInfo=new PageInfo<TStudent>(list);
        return pageInfo;
    }

    @Override
    public TStudent selectByNo(Integer studentNo) {
        TStudent student=studentMapper.selectByPrimaryKey(studentNo);
        return student;
    }

    @Override
    public void addStudent(TStudent student) {

        Integer total=studentMapper.insert(student);
    }

    @Override
    public Integer updateStudent(TStudent student) {
        Integer total=studentMapper.insert(student);
        return total;
    }

    @Override
    public Integer deleteStudent(int studentNo) {
        Integer total=studentMapper.deleteByPrimaryKey(studentNo);
        return total;
    }

    @Override
    public List<TStudent> selectAllStudent() {
        return studentMapper.selectAll(null);
    }
}
