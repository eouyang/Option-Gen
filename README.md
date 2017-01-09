# Option-Gen


# Required

1. maven 3+
2. Java 8
3. Node and npm
4. Poster of some sort e.g Postman

# How to Start Application

1. inside "/src/webapp" run command "npm install" to install necessary modules
2. inside "/src/webapp" run command "npm start"

You may access page through "localhost:8080 or localhost:3000"


# Rest APIs:

## option chain

GET
http://localhost:8080/option-strategizer/option/chain?symbol=aapl&expiry=2017-01-06


## option expiry

GET
http://localhost:8080/option-strategizer/option/expirations?symbol=msft





Inside "option-strategizer.properties", please input own token
