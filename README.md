# Pace University CS612 RESTful Web Service Implementation + Docker Assignment

## Intro

For this project, our class was tasked with the following:
* Create a RESTful service with two endpoints running inside a Docker container.
* The web service will contain two GET routes:
  * One that displays a collection of records
  * One that displays a single record that the corresponds to an ID
    Example: If I created two routes, /customers and /customers/35 (note, that 35 is the ID of a given customer in my database)
    The data returned from your web service routes must be in JSON or XML form.
* Create a hardcoded JSON file based database as the backing datastore for your web service routes. (SQL of No-SQL DB is optional)
* The data model is something you make up. Meaning you can store a collection of cars, customers, food items, restaurants, video games, sports teams etc. Be creative :)

I decided to use data representing the current New York Jets roster. I implemented 3 endpoints:
* GET host:port/
  * Returns general team info, with a list of player names/ids. This was an extra endpoint and not required for this project.
* GET host:port/players
  * Returns a list of player names/ids.
* GET host:port/players/{id}
  * Returns a single player's info, including, id, first name, last name, position, jersey number, birth date, weight, height, birth place, college, college conference, and rookie year.

## Install


## Run in Docker

