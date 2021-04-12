/**
 * 
 */
package com.javamastermind.student.model;

/**
 * @author lahiru_w
 */
public class SucessResponse
{
    private String description;

    private String studentId;

    private String responseCode;

    private String transactionId;

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getStudentId()
    {
        return studentId;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public String getResponseCode()
    {
        return responseCode;
    }

    public void setResponseCode(String responseCode)
    {
        this.responseCode = responseCode;
    }

    public String getTransactionId()
    {
        return transactionId;
    }

    public void setTransactionId(String transactionId)
    {
        this.transactionId = transactionId;
    }

    @Override
    public String toString()
    {
        return "SucessResponse [description=" + description + ", studentId=" + studentId + ", responseCode="
            + responseCode + ", transactionId=" + transactionId + "]";
    }

}
