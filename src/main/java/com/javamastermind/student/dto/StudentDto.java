/**
 * 
 */
package com.javamastermind.student.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author lahiru_w
 */
public class StudentDto
{

    private int id;

    @Size(min = 10, max = 100)
    private String name;

    @Size(min = 2, max = 3)
    private String age;

    @Size(min = 1, max = 10)
    private String gender;

    @Size(min = 20, max = 150)
    private String address;

    @Email
    private String email;

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private String birthDay;

    @Pattern(regexp = "\\d{10}",message = "shoud be a 10 digit number")
    private String phone;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getBirthDay()
    {
        return birthDay;
    }

    public void setBirthDay(String birthDay)
    {
        this.birthDay = birthDay;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

}
