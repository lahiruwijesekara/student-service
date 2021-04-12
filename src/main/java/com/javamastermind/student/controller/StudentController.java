/**
 * 
 */
package com.javamastermind.student.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import com.javamastermind.student.dto.StudentDto;
import com.javamastermind.student.model.Student;
import com.javamastermind.student.service.StudentService;
import com.javamastermind.student.util.RequestEndPoint;

/**
 * @author lahiru_w
 */
@RestController
public class StudentController
{
    @Autowired
    StudentService studentService;

    @PostMapping(value = RequestEndPoint.ADD_STUDENT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Object> addStudent(@Valid @RequestBody StudentDto studentDto)
    {
        ModelMapper modelMapper = new ModelMapper();
        Student student = modelMapper.map(studentDto, Student.class);
        return studentService.generateAddResponse(student);
    }

    @PostMapping(value = RequestEndPoint.DELETE_STUDENT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Object> deleteStudent(@Valid @RequestBody StudentDto studentDto)
    {
        ModelMapper modelMapper = new ModelMapper();
        Student student = modelMapper.map(studentDto, Student.class);
        return studentService.generateDeleteResponse(student);
    }
}
