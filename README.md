# Student-service : simple REST API to add and delete student object with HashSet

## Introduction
There is a university which needs to add students through the system in registration. Once added, there should be a method to update a particular student. Student deletion should remove a student from a student data set.  The data dictionary is as per below.

## Data Dictonary

<p align="middle">
  <img src="../master/readme-images/data-dictonary.jpg"/>
 </p>
 
 ### Add Student API
 
 1. Sample Request
 `{

   "name":"chathuranga krishani",
   "age":"24",
   "gender":"Female",
   "address":"12/A, Dikwalla Road, Malambe",
   "email":"yxzabd@yzm.com",
   "birthday":"10/07/1993",
   "phone":"+94776600259"
}
`


Sample Response
\
&nbsp;
`
{
"description":"Student has successfully added",
"studentID":"45",
"responseCode":"20",
"transactionId":"31b408f9-eec7-4c76-8d6c-9609a30e6cab"
}
`

2.Update student API

`
{
   "name":"chathuranga krishani",
   "age":"24",
   "gender":"Female",
   "address":"12/A, Dikwalla Road, Malambe",
   "email":"yxzabd@yzm.com",
   "birthday":"25/07/1993",
   "phone":"94776600300"
}
`

3.Delete Student API

 Sample Request
 `
{
"studentID":"45"
}
`
\
&nbsp;
Sample Response
`
{
"description":"Student has deleted successfully."
"reponseCode": "22"
}
`
 

