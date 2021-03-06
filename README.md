# BP-Wallet

 ![bp-wallet-hld](https://user-images.githubusercontent.com/2044872/46343424-46fb5480-c65b-11e8-89e2-84bcb08c44ca.png)

### Sub Projects 

* bp-wallet-client(BPWC): Client Accessible Make Transaction Request via HTTP2 to server.
* bp-wallet-server(BPWS): Keeps a record user Wallet and Balance 
* bp-wallet-proto(BPWP): Has  proto file and Generated Stubs and Domains shared by BPWC and BPWS.


### Assumptions and Few Points:

* Server Handles Transaction on First Come First Serve.
* Wallet Client can be accessed CLI and Swagger.
	SWAGGER URL: http://localhost:8080/swagger-ui.html#/
	CLI Command: Not Implemented
* About "Make sure the client exits when all rounds has been executed."
	Client Runs on Spring Boot Application and has also exposed SWAGGER API for Testing.
	Client Will process the Request and Wait for next.
* Technologies

	* Java 8.
	* gRPC
	* MySQL and H2  
	* Gradle
	* JUnit and Test Containers
	* SLF4J
	* Docker
	* Hibernate
	* Spring and Spring Boot.
	* Swagger
	
* Junits Coverage of > 80% is out of scope.
* The docker containers should be run via Compose/Kubernetes - OOS.
* The Client/Server Doesn't retry failed transactions. OOS(Out of Scope)
* The user ID is Taken from Number of Users param (userID:1 for numberOfuser=1,userID:1,userID:2 for numberOfuser=2).
* Database schema has been kept Simple with One table only.
* The actual applicable schema is included in Below Section with SQL and Schema Diagram.
* The Service Response/Request has been kept same for RAD(Rapid Application Development) Otherwise it should be different for each transaction type example https://github.com/Akash-Mittal/bp-wallet/blob/master/docs/wallet.proto.

### How to run the client and the server (run gradlew.bat in root project. first)

#### Database

##### LOCAL 

	If local/remote instance of MY SQL is running nothing else to do.
	Replace the `IP/PORT/SCHEMA` in `application.yaml` in `bp-wallet-server`

##### DOCKER

Script: `start-bp-wallet-mysql-docker.bat `

	Run above in root folder it takes 5-10 Minutes on my machine.
	Execute following command to get the IP of docker-machine.
	`bash#docker-machine -ip `
	Make Sure MYSQL or Any DB is UP and its properties are configured in `application.yaml`
	Replace this URL Data-source with your IP in application.yaml in bp-wallet-server.

#### JAVA(bp-wallet-server)

##### LOCAL 

Script: `start-bp-wallet-server.bat` 
(Please read the comments for more info.)

##### Docker
	
Script: `start-bp-wallet-docker.bat`
	
#### JAVA(bp-wallet-client)

##### LOCAL 

Script: `start-bp-wallet-client.bat`

##### Docker 

Script: `start-bp-wallet-docker.bat`
	
##### Access Client using 

###### LOCAL 

http://localhost:8080/swagger-ui.html#/

##### Docker

http://<dockermachine -ip>:8080/swagger-ui.html#/
	

	* Time Needed to start the Apps - 5 Minutes (JAVA(bp-wallet-client) + JAVA(bp-wallet-server + H2))
	* Time Needed to start the Apps - 5-10 Minutes With Some configuration Changes (Docker(bp-wallet-mysql) + JAVA(bp-wallet-client) + JAVA(bp-wallet-server)) OR ((bp-wallet-mysql) + JAVA(bp-wallet-client) + JAVA(bp-wallet-server))
	* Time Needed to start the Apps -5-10 Minutes With Some configuration Changes (Docker(bp-wallet-mysql) + Docker(bp-wallet-client) + Docker(bp-wallet-server))

### Request Input
`
{
  "transactions": {
    "TRANSACTION_SUCCESS": 1,
    "TRANSACTION_FAILED": 6
  },
  "timeTaken": 0
}

`
### Request Output
`
{
  "transactions": {
    "TRANSACTION_SUCCESS": 1,
    "TRANSACTION_FAILED": 6
  },
  "timeTaken": 0
}

`


### Important choices in Solution

* The Whole Structure of the BP-wallet application is loosely coupled SOA.
* Each Client,Server,DB Instances are developed keeping Scalability,Elasticity and Fault tolerance in mind.
* Docker Instances make it possible to enable containerization and Helps in Deployments.
* The Performance Tuning Options is not yet configurable. [Time Constraints]
* Server Side - Connection Pooling (That Depends on Given Deployment Platform)
* Client Side - Task Executer is Configurable with Concurrent Worker Threads.
* The `bp-wallet-proto` is shared with Client and Server.
* Synchronization or any code level locking on DB has been avoided as there can be multiple instances running.
* Optimistic Locking is implemented (Which can also be configured for retry mechanism[Disabled for Now])
* User Registration: User is registered if he is  non existent while making deposit this was necessary for testing.
* Logging has been minimized via debug for improved performance.

### Transactions Per Seconds.

This is a difficult question as there are many scenarios, and requires performance tuning.

#### Per Transaction Variant:

Application Variant : All below are 10 Concurrent Calls but they take different execution time because of their nature.

* Single user Making 10 Deposit:
* Single user Making 5 Withdraws 5 Deposit:
* Single user Making 4 Withdraws 4 Deposit 2 Balance:

#### Database Variant:
	
* Embedded H2 DB:
* MYSQL DB:
* Dockerized MYSQL DB:
* Over the Cloud:
	
#### Database Connection Pooling Variant:
	
* HIKARI:
* Apache:
	
#### Platform Variant:

* Wallet Server Deployed Local Machine -(4 GB RAM 4 Cores i5):
* Wallet Server Deployed on other Machines:


## Deduction on Number of Transactions per Request:

* K Users Should Run Concurrently.
* Each Kth User Can Spawn N number of New Concurrent Requests.
* Each Nth Request can Spawn M number of Concurrent Operations(Rounds)
* Total Number of threads will K x M x N (X Transaction Per Round avg 8)

### Future Aspirations.

* Cloud Ready.
* Load Balancer.
* Service Discovery.
* Authentication.
* UI Client.
* Docker Images provisioning ans Orchestration via compose.
* Caching enabled Entities - if needed.
* DB Schema.
  * Schema File - https://github.com/Akash-Mittal/bp-wallet/blob/master/docs/db-schema.sql

![bp-wallet-schema](https://user-images.githubusercontent.com/2044872/46343515-9fcaed00-c65b-11e8-88d1-a9ef37b8c6a3.png)


### Planned Features.[Implemented and Closed]

* The Proto Generation need to be done in a Separate Project.
* Although Client Should be able to generate its own stub from 
`.proto `   file , for the sake of  Loose Coupling Client and Server Need to add in proto project in ` build.gradle `

* The Server and Client are both based on Spring boot and uses grpc wrapper of spring boot that supports ` GrpcClient` and ` GrpcServer ` annotations.
* The Server will not expose Rest API's it will be called via ``` stub ``` 
* Server will be Dockerized.
