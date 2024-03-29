package com.wl.demo.service;

import com.wl.demo.entity.Student;

/**
 * 
 * @author w.z
 * @date 2019/11/1 11:04
 */
public interface StudentService {

    /**
     * 添加学生信息
     * @param student
     * @return
     */
    boolean insert(Student student);

    /**
     * 根据学号查找学生信息
     * @param studentno
     * @return
     */
    Student select(String studentno);
}
