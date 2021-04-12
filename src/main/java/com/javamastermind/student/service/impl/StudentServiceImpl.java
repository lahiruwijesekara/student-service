package com.javamastermind.student.service.impl;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.javamastermind.student.model.ErrorResponse;
import com.javamastermind.student.model.Student;
import com.javamastermind.student.model.SucessResponse;
import com.javamastermind.student.service.StudentService;

/**
 * @author lahiru_w
 */
@Service
public class StudentServiceImpl implements StudentService
{

    private Set<Student> studentHashSet = new HashSet<>();

    @Override
    public int addOrUpdateStudent(Student student)
    {
        Random random = new Random();
        student.setId(random.nextInt(10));
        studentHashSet.add(student);
        return student.getId();
    }

    @Override
    public boolean deleteStudent(Student student)
    {
        // Objects.nonNull(student) &&
        if (studentHashSet.contains(student)) {
            return studentHashSet.remove(student);
        }
        return false;
    }

    @Override
    public ResponseEntity<Object> generateAddResponse(Student student)
    {
        if (this.addOrUpdateStudent(student) != 0) {
            SucessResponse sucessResponse = new SucessResponse();
            sucessResponse.setDescription("Student has successfully added");
            sucessResponse.setResponseCode("41");
            sucessResponse.setStudentId(String.valueOf(student.getId()));
            sucessResponse.setTransactionId(UUID.randomUUID().toString());
            return new ResponseEntity<>(sucessResponse, HttpStatus.ACCEPTED);
        } else {
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setDescription("Error in adding student");
            errorResponse.setErrorCode("45");
            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
        }

    }

    @Override
    public ResponseEntity<Object> generateDeleteResponse(Student student)
    {
        if (this.deleteStudent(student)) {
            SucessResponse sucessResponse = new SucessResponse();
            sucessResponse.setDescription("Student has deleted");
            sucessResponse.setResponseCode("50");
            sucessResponse.setStudentId(String.valueOf(student.getId()));
            sucessResponse.setTransactionId(UUID.randomUUID().toString());
            return new ResponseEntity<>(sucessResponse, HttpStatus.ACCEPTED);
        } else {
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setDescription("Error in deleting student");
            errorResponse.setErrorCode("55");
            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
        }
    }

}
