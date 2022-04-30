# Login_Register
- This is my first ever project. It is build using Java Programming Language which is popular OOP language.
- The advanatage of using Java as a Programming Language is that it is platform independent which means the source code of the program can be same throughtout the        different system. But the tool used to convert it into object code must plaform dependent.
- Using Java, developer can develop the Program more quickly for many platform at a time.



Basily, in this application, there are two main functionality.They are:
         - Registration 
         - Login


Here the credentials used during Login is retrieved from database which was taken from user during the Registration process.
Every details are stored in plain/text form in database except the password field. The password is first encrypted into hash using Bcrypt library  which is then stored in the database.


In this application, user can be either a Student or Teacher.
Details of Student and Teacher are stored in different table in Database.


