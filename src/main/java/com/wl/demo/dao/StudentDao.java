package com.wl.demo.dao;

import com.wl.demo.entity.Student;

/**
 * 学生信息接口
 * @author w.z
 * @date 2019/11/1 10:54
 */
public interface StudentDao {

    /**
     * 新增学生信息
     * @param student
     * @return
     */
    int insert(Student student);

    /**
     * 根据学号查找学生
     * @param studentno
     * @return
     */
    Student selectByNo(String studentno);
}
