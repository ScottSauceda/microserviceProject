# ga-reddit-api-microservices
Reddit application using microservices architecture
        
## Table of contents

- [User Stories](#user-stories)
- [Timeline](#timeline)
- [Technologies](#Technologies-Used)
- [Approach](#General-Approach)
- [Hurdles](#Hurdles)
- [Dependencies](#Dependency-Instructions)
- [ERD](#erd)

## User-stories

[Pivotal Tracker](https://www.pivotaltracker.com/n/projects/2418961)

#timeline

1. Requirement Analysis
    * Friday(Nov 8, 2019) - User Stories & ERD
        
        We give our user stories points, so that we could prioritize our development steps. 
        
    * Monday(Nov 11, 2019) - Post and comment services.
        
        Began building posts and comments micro services with basic CRUD for each.
         
    * Tuesday(Nov 12, 2019) - User micro service.
    
         Built user micro service with basic CRUD.
            
    * Wednesday(Nov 13, 2019) - Began implementing API Gateway Security.
    
            Began adding UserJWT/Gateway security functionality on user service and api-gateway service respectively.
        
    * Thursday(Nov 14, 2019) - Continued implementing API Gateway Security.
    
            Finished implementation of Gateway Security and user JWT generation.
            
    * Friday(Nov 15, 2019) - Tested all route functionality.
    
            Added functionality between front end and back end services
    
            *-*-*-*-*-*-*

## Technologies-Used

    IntelliJ
    
    VSCode Live

    Docker
    
    Postgres
    
    Psql  

## General-Approach

    The general approach was to use our user stories to instruct us how to build each individual microservice.
    Our ERD told us how to build out our database. This differs in previous projects because we achieved this
    using microservices with Dcoker as opposed to a monoloithic approach.
    
    Gateway security was also implemented on the Api Gateway. This allowed us to do all authentication through user
    and pass the username and id as required in the front end. This was simpler than interconnection and only required
    a username and user id column to be saved in the post, comment, and user profile tables.
    

## Hurdles

    A major hurdle was implementing security on the Api Gateway. Since this was a new way of implementing security,
    it made it difficult to understand what exactly needed to be where in order to pass authentication in user signup and login
    to generate the JWT.
    
    Another big hurdle to overcome was understanding how the front end worked. This made it difficult to understand exactly what was needed on the backend. 
    Initially CORS issues were experienced when trying to connect to the front end. After this issue was solved, I was able to pass data to the front. This led
    to more issues, because the posts and comments objects did not have the required user information saved in their table columns.

## Dependency-Instructions

    In order to install dependencies. Open this project with IntelliJ from the terminal via the 
    "idea ." command from each microservice directory. Go to pom.xml file for reach microservice and forever
    depencies have installed. If not you must enable auto-import here.
    

## ERD 
##### Rough Sketch of ERD.
![ERD](./img/ERD.jpg)

## Design 
##### Design sketch.

![Design](./img/design.jpg)