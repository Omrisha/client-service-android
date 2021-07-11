# client-service-android

Microservice build with Java and SpringBoot, with Gradle build tools.

Built for Cloud Mobile Applications Course in Afeka College of Management.

## Description

Microservice for saving and querying clients of a restaurant.

## Installation

* `git clone https://github.com/Omrisha/client-service-android`
* Open project in IntelliJ (Open project menu or import from git menu)
* Open project in Eclipse (File -> Import -> Import existing Gradle Project menu)
* after opening let gradle built and make the project.
* Run (Eclipse -> Run as SpringBoot App, IntelliJ -> via Play button)

## Environment Installation
* Install Docker
* Run `docker compose up -d`
* In application.properties 
   * In Production Uncomment `# For producation` section and fill your database credentials
   * In development Uncomment `# for localhost use` section.

## Usage

- POST /users
 Get client details and save to database.
 Returns 500 error code if already exists.
- GET /users/search?sortOrder={order}&page={page}&size={size}
  Get all the clients in the system. if there aren't the result will be empty list.

- DELETE /users
  Delete all clients in the system.

## User JSON Examples
    {
      "id": "42",
      "email": "omri@gmail.com",
      "firstName": "Omri",
      "lastName": "Shapira",
      "password": "Passw0rd!",
    }  
