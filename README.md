19BDS0042 - SAMARTH GUPTA

# CSE-1007-Java-Programming-Lab-Codes

Java Programming - Lab Codes - CSE : 1007

# Questions
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

1) Consider a class of 5 students for the course CSE1001. Below is mark scored by the
students?
Register Number  Mark
    REG1001       56
    REG1002       76
    REG1003       85
    REG1004       92
    REG1005       66
Calculate Grade as per data given below:
___________________________________________________________________________
| < 50 | >=50 and <60 | >=60 and <70 | >=70 and <80 | >=80 and <90 | <=90 |
---------------------------------------------------------------------------
|  F   |       D      |       C      |       B      |       A      |   S  |
---------------------------------------------------------------------------
Display the absolute grade for each student and class average. (Use Array implementation).

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2) Vowelgrams are words or sentences that has every vowel (a,e,i,o,u) of the English
alphabet occurring at the most once. Write a Java method to check whether a string is a
vowelgram or not. For example,”You black tiger" is a vowelgram. Test the method with
main().

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3) Create a Driver class to describe a Driver details. Add fields such as driverName, age,
drivingLicenseType (LMV, HMV, MGV, HGMV). Define constructors to initialize the
objects. Create atleast 5 objects and Write Java code display the Objects with
drivingLicenseType as ‘HMV’.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
4) Write a program to demonstrate the knowledge of students in Inheritance. Assume that a bank maintains two kinds of accounts for customers, one called as savings account and the other as current account. The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides cheque book facility but no interest. Current account holders should maintain a minimum balance and if the balance falls below this level, a service charge is imposed. Create a class account that stores customer name, account number and type of account. From this derive the classes cur_acct and sav_acct to make them more specific to their requirements. Include necessary member functions in order to achieve the following tasks: 
a) Accept deposit from a customer and update the balance. 
b) Display the balance
c) Compute and deposit interest. 
d) Permit withdrawal and update the balance. 
e) Check for the minimum balance, impose penalty, necessary, and update the balance.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
5) Write a program to demonstrate the knowledge of students in working with user-defined packages and sub-packages. Eg., Within the package named ‘primespackage’, define a class Primes which includes a method checkForPrime() for checking if the given number is prime or not. Define another class named TwinPrimes outside of this package which will display all the pairs of prime numbers whose difference is 2. (Eg, within the range 1 to 10, all possible twin prime numbers are (3, 5), (5,7)). The TwinPrimes class should make use of the checkForPrime() method in the Primes class.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
6) Write a program to demonstrate the knowledge of students in Java Exception handling. Eg., Read the Register Number and Mobile Number of a student. If the Register Number does not contain exactly 9 characters or if the Mobile Number does not contain exactly 10 characters, throw an IllegalArgumentException. If the Mobile Number contains any character other than a digit, raise a NumberFormatException. If the Register Number contains any character other than digits and alphabets, throw a NoSuchElementException. If they are valid, print the message ‘valid’ else ‘invalid’.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
7) Write a Java program using JavaFX, when user enter a coursecode in one textfield, course title should be displayed in another textfield with an action event.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
8) Using JDBC, create a state table with statename, statecapital as data fields. Perform CRUD operations on state table using JDBC.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
9) Write a program to demonstrate the knowledge of students in JSP.
Eg: Client sends user name and password to JSP on the Server. Server receives, validates and
sends back the validation result to client as response.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
10) Write a program to demonstrate the knowledge of students in JSP.
Eg: Create a JSP page for an online multiple choice test. The questions are randomly selected
from a database and displayed on the screen. The choices are displayed using radio buttons.
When the user clicks on next, the next question is displayed. When the user clicks on submit,
display the total score on the screen.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
11) Write a program to demonstrate the knowledge of students in Servlet programming.
Eg., Write a servlet which counts how many times a user has visited a web page. If the user is
visiting the page for the first time, display a welcome message. If the user is re-visiting the
page, display the number of times visited. (Use cookies)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
12) Write a program to demonstrate the knowledge of students in handling HTTP Request and
Response.
Eg: Write a program to create a shopping mall. User must be allowed to do purchase from two
pages. Each page should have a page total. The third page should display a bill, which consists
of a page total of whatever the purchase has been done and print the total. (Use HttpSession)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
13) Write a program called DecipherCaesarCode to decipher the Caesar's code described in the
previous Question 1.a. The program shall prompts user for a ciphertext string consisting of mixcase
letters only; compute the plaintext; and print the plaintext in uppercase. For example,
Enter a ciphertext string: wHVwLQJ
The plaintext string is: TESTING

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
14) Write a Java program ‘WordCount’ that counts the words in two files. Start a new thread for
each file. Assume file name as data1.txt and data2.txt, then the program might print
data1.txt: 100
data2.java: 130

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
15) Create a HTML form to accept coursecode and course title. The form should call a Java servlets to check whether the course code begins with ‘CSE’ and display the course details if matches else display an invalid message.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
16) Create a JavaFx application to enter a course name in a text field. When a user clicks a button, display (in new text field) curriculum category (UC,PC,UE,PE) offered in our university.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
17) Using JavaFX, create a menu named Shape. Add sub menu items such as Circle, Rectangle, Square, and Triangle. When user clicks the sub menu items, display the formula to find area of the selected shape.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
18) Create a class named Vehicle with the following attributes.

·         Owner

·         Make

·         Speed

·         Year of Manufacture

The class should hide these attributes from outside access but any sub classes of the Vehicle Class should be able to access them directly.
Provide methods to get the values of these attributes and set values to them.
Create two other classes for particular vehicle types that extend the Vehicle class to include fields and methods appropriate to the particular type of vehicle.
(E.g. :- Bus with attributes maximum number of passengers and engine capacity and methods to set values to these attributes and get values from them.)
In one of your two sub classes of Vehicle class, define a speed limit in such a way that it is common to all the objects of that class. Override the method which sets the speed in that class so that it raises an exception if the speed limit is violated. In order to do so you have to define a new exception class for reporting speed limit violations. (Hint : You will also have to change the method signature of the Vehicle class to add a "throws" clause as well so that you can add a "throws" clause to the method signature of the sub class which raises an exception)
Write a separate class with main() in Java to check the functionalities of the above defined classes.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
