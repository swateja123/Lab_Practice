# Java Lab Assignment Part 1
## This project Contains 3 Assignment Code

1) Employee Salary
2) Calculate Perimiter and Area
3) Team Result

## Features

Assignment 1:
Program to calculate salary of an Employee based on given criteria.

Assignment 2:
Program to print the perimeter and the area of a square, a rectangle and a circle.

Assignment 3:
Program to manage the ranking points of different teams based on given CSV files.

## Installation

All assignment developed using Intellij Idea and JDK 11,
Maven is used for automation.
junit4 is used for unit testing.

## Development

Development of project is done using java.

## Funtionalities

Assignment 1:
To calculate Final salary of employee based on additional salary, additional working hours.

computeBasesalary() //returns base salary 
addSal() //return additional salary based on given condition
addWork // return additional work pay based on given condition
FinalSalary()  // returns final salary 


Assignment 2:
program to print the perimeter and the area of a square, a rectangle and a circle.

CalculatePerimeter()
//perimeter of a square, a rectangle and a circle

CalculateArea()
//Area of a square, a rectangle and a circle

Assignment 3:
This program includes following Functionalities:

1.Load teams parameters from teams.csv file; for each line define the instance for a team; 
2.Print standing of Football teams (ordering by points); 
3.Print standing of Basketball teams (ordering by points); 
4.Load results of the last matches from results.csv file and update teams points based on loaded results; 
5.Print new standing of Football teams (ordering by points); 
6.Print new standing of Basketball teams (ordering by points).

Iteam Interface includes
updatePoints(),  getTeamName(),  getPoints() 

TeamFootball and BasketBall implemets ITeam

File teams.csv format: 
Sport, Team Name, Points, Sponsor 
File results.csv format: 
Team Name, Result 

Collect the instance of Football and Basketball teams use collection of type Team 

#### Code Structure 

```sh
getTeamName() //returns name of Team
```


```sh
getPoint() //returns points of given team
```
```sh
updatePoints() //returns updated point of team
```
```sh
collection.sort(object a, object b)
//implements comparator interface
//use to sort team data based on points
```

#### Exicution
For each assignment separate module is created which contains the main file, class file, testing file, and CSV file.
Assignment 1
```sh
  JavaLab1
Employee.java
```

Assignment 2


```sh
 JavaLabAss2
PerimeterArea.java
```
Assignment 3
```sh
 JavaLab3
GameResult.java
```

## Testing
Test cases are given for each assignment:
JUnit testing is used to check individual functionalities;
Please make sure to update tests as appropriate.

## License
@author Swateja Bagal


