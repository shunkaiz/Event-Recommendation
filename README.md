# Yup
Online Event Recommendation Tool

### Author
[Shunkai Zhang](http://github.com/shunkaiz)

## About
The web application helps people look for nearby events of all kinds with the given customized filter tool.

### Installation Instructions
##### Built With
* Java/Java Servlet/Tomcat
* HTML/CSS3/JavaScript
* MongoDB/MySQL
* AWS EC2 
##### Download Prerequisites
Download and install MySQL and MongoDB on your PC, official links given below  
[MySQL](https://www.mysql.com/downloads/) [MongoDB](https://www.mongodb.org/downloads#production)
##### Clone the Repo
In your command line/terminal, type in:
```
git clone git@github.com:shunkaiz/NBA-ShotChart.git
```

##### Project Deployment
The project is developed in Eclipse, you may start Eclipse locally and import cloned folders 
```
npm start react
```

##### Download Dependencies
* MySQL [MySQL java driver...](https://www.google.com) 
* MongoDB [MongoDB java driver](https://oss.sonatype.org/content/repositories/releases/org/mongodb/mongo-java-driver/3.6.1/mongo-java-driver-3.6.1.jar),
[bson](https://oss.sonatype.org/content/repositories/releases/org/mongodb/bson/3.6.1/bson-3.6.1.jar)

### Features
When you start the project, you should see the following paget at localhost:8080  
The events displayed in "Nearby" tab has sorted based on geological distance
<img width="1024" alt = "1" src="https://user-images.githubusercontent.com/24465921/47537786-a58fa900-d87c-11e8-8ab8-e4487b56a482.png">  
You may select the favorite icon to add events into "My Favorites" tab 
<img width="1024" alt = "2" src="https://user-images.githubusercontent.com/24465921/47538072-387d1300-d87e-11e8-8efc-651cd513c8ac.png">  
You will see recommended events under "Recommendation" tab, where events are sorted by implicit algorithm based on distance, reviews and cost.
<img width="1024" alt = "3" src="https://user-images.githubusercontent.com/24465921/47537957-8c3b2c80-d87d-11e8-91e2-244add8b8e13.png">  

