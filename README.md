# ga-reddit-api-microservices
Reddit application using microservices architecture
        
- A README.md file with:
        Explanations of the technologies used.
        
        A couple of paragraphs about the general approach you took.
        
        Design: your design
                why you chose your design
                if intercommunication
                    if no, then why not
            
                demo 
                
        
        Installation instructions for any dependencies.
        
        A link to your ERD — sketches of major views or interfaces in your application.
        

## Table of contents

- [User Stories](#user-stories)
- [Timeline](#timeline)
- [ERD](#erd)
- [Diagrams](#class-diagrams)
- [API](#api)
- [API Responses](#responses)
- [Objects](#objects)
- [Testing](#testing)
- [Test Results](#results)
- [What's Included](#whats-included)
- [Creators](#developers)

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

#erd

## Technologies Used

    IntelliJ
    
    VSCode Live

    Docker
    
    Postgres
    
    Psql  

## General Approach

    The general approach was to build each individual microservice with full CRUD functionality and then added on as needed to fulfill the front end routes required.
    

## Unsolved problems and other hurdles

    The only unsolved problem left was the editing of user profile. It seems to be a CORS issue, but CORS issue was already solved before.

## Dependency Installation Instructions

    

## ERD 
##### Rough Sketch of ERD.
![ERD](./img/ERD.jpg)