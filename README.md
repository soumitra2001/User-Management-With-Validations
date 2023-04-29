<h1 align="center"> 👤User Management System With Validation👤</h1>

>### Framework Used 
* [SpringBoot](javatpoint.com/spring-boot-tutorial)

>### Language Used
* [Java](https://www.java.com/en/download/help/whatis_java.html)
## Data Model

The user data model is defined in the User class, which has the following attributes:
```
UserId : Unique identifies fir each user
username : User Name of the user
DateOfBirth : Date of Birth of the user
email : email id of the user
Phone Number : Phone number of the user
Date : Date when user added or updated
Time : Time when user added or updated
```

---

## Data Flow

```
The user sends a request to the application through the API endpoints.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The API receives the request and sends it to the appropriate controller method.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The controller method makes a call to the method in service class.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The method in service class builds logic and retrieves or modifies data, which is in turn given to controller class
```

<center>
<font color="blue">
&#8595;</font>
<center>

```
The controller method returns a response to the API.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The API sends the response back to the user.
```

---

## Functions used :-

### API Endpoints :-


* PostMapping: /addUser
```
In database we add a new user given through API.
```

* GetMapping: /getAll
```
This endpoint gives us the data of all users stored in our data baase
```

* GetMapping: "getUser/{userid}"
```
This endpoint returns data of specific user based on userid through API
```

* PutMapping
```
In database we update a user by userid given through API.
```

* DeleteMapping
```
In database we delete a user by userid given through API.
```

---

## Data structure Used
* ArrayList
```
We have used ArrayList as a database to implement Operations 
```
---

## Project Summary
The User Management System with Validations is a Spring Boot project written in Java that enables basic functionality for managing users. This project is built using the Spring Boot framework. The project uses ArrayList as the data structure to store and manage user data.

You can read, read by specific id, update userName of specific userId, delete a user by their userId by api calls.
