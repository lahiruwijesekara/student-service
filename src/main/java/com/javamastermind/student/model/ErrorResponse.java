package com.javamastermind.student.model;

/**
 * @author lahiru_w
 */
public class ErrorResponse
{
    private String description;

    private String errorCode;

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    @Override
    public String toString()
    {
        return "ErrorResponse [description=" + description + ", errorCode=" + errorCode + "]";
    }

    
}
