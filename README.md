# Bank-Finder-Microservices
 
"Bank Finder" is a reference application based on microservices developed in Java using SpringBoot Framework.
This project can be used for testing purpose.

## Reference implementations

In this repository there are four different implementations of Bank Finder:

1. Structured Bank Finder following Client-To-Microservice Communication
2. Structured Bank Finder following API Gateway Pattern
3. Event-Driven Bank Finder following Client-To-Microservice Communication
4. Event-Driven Bank Finder following API Gateway Pattern

### Instructions

To run **Structured Bank Finder following Client-To-Microservice Communication**:
1. Go to Client-To-Microservice & Gateway directory
2. Download or clone the two directories: bank.accounts and interest.manager
3. mvn clean package
4. Run the .jar of bank.accounts and the .jar of interest.manager

To run **Structured Bank Finder following API Gateway Pattern**:
1. Go to Client-To-Microservice & Gateway directory
2. Download or clone the three directories: bank.accounts, interest.manager and api.gateway
3. mvn clean package
4. Run the .jar of bank.accounts, the .jar of interest.manager and the .jar of api.gateway

To run **Event-Driven Bank Finder following Client-To-Microservice Communication**:
1. Go to Event-Driven Bank Finder directory
2. Download or clone the two directories: event.driven.bank.accounts and event.driven.interest.manager
3. mvn clean package
4. Run the .jar of event.driven.bank.accounts and the .jar of event.driven.interest.manager

To run **Event-Driven Bank Finder following Client-To-Microservice Communication**:
1. Go to Event-Driven Bank Finder directory
2. Download or clone the two directories: event.driven.bank.accounts and event.driven.interest.manager
3. mvn clean package
4. Run the .jar of event.driven.bank.accounts and the .jar of event.driven.interest.manager
5. Go to Client-To-Microservice & Gateway directory
6. Download or clone api.gateway
7. mvn clean package
8. Run the .jar of API Gateway
