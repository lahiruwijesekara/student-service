/**
 * 
 */
package com.javamastermind.student.service;

import org.springframework.http.ResponseEntity;

import com.javamastermind.student.model.Student;

/**
 * @author lahiru_w
 */
public interface StudentService
{
    public int addOrUpdateStudent(Student student);

    public boolean deleteStudent(Student student);
    
    public ResponseEntity<Object> generateAddResponse(Student student);

    /**
     * @param student
     * @return SuccessReponse or ErrorResponse
     */
    public ResponseEntity<Object> generateDeleteResponse(Student student);
    
}
