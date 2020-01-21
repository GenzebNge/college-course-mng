College - Course management System

Database Resources/Entities Requiered 

Student
Teachers
Courses

Sudent can have many teachers and many course
Teachers can have many students and many course
Course may be taken by many students and given by many teachers

Steps 
Create project 
push it to github to Dev, Test and Prod environment
Try to set up CICD pipeline with Jenkin or AWS
only back end development using java with spring framework 

student can register to many course any time 
teachers can assigned to any course any time by admin users

Studets user stories 
As a student user i can retrive all the course found int the university
as a user i can add course to my List 
as a user i can see all the course i am taking
as a user i can see a single course i have taking
as a user i can delet the course from my course List

git worl flow
git init
git status
ls -a
git add filename
git rm --cached filename
git commit -m "This is the commit messages"
git log   allows us to see our commit history locally
git log  --oneline to check the condensed version of that repository 
working area --git add ->> Staging area -- git commit ==> repository

git remote add origin git@github.com:GenzebNge/college-course-mng.git


Change your remote's URL from SSH to HTTPS with the git remote set-url command.

$ git remote set-url origin https://github.com/USERNAME/REPOSITORY.git
git remote -v

https://github.com/GenzebNge/college-course-mng.git

