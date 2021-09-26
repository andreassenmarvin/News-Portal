# NEWS PORTAL
This is a REST API project for querying and retrieving information. The user can view the departments present, news articles and create users within a department as well as view information regarding a particular department or user.
## Setup/Installation Requirements
* Fork/Clone the repository
```
   $ git clone https://github.com/andreassenmarvin/News-Portal.git
```
* Open your project on IntelliJ
* Run project
```
   $ gradle run
```
## Database Setup Instructions
##### In PSQL:
* CREATE DATABASE news-portal;
* CREATE TABLE users (id SERIAL PRIMARY KEY, name varchar, position varchar, role varchar, department varchar);
* CREATE TABLE news (id SERIAL PRIMARY KEY, title varchar, description varchar, type varchar, author varchar);
* CREATE TABLE departments (id SERIAL PRIMARY KEY, name varchar, description varchar, employees int);

* CREATE DATABASE news_portal_test WITH TEMPLATE news_portal;

## Known Bugs
No known bugs
## Technologies Used
* Java
* Spark 
* PostgreSQL
* Heroku
* REST API
## Support and contact details
 Incase of any contributions,query or issues,you can reach me through the email below:
machariamarvin625@gmail.com
### License
This project is licensed under the [MIT License](https://github.com/andreassenmarvin/News-portal/blob/master/LICENSE).