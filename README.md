### CompaJ Cloud
This is a cloud version of [CompaJ](https://github.com/CrissNamon/compaj) - programming and numeric computing platform for math modeling and visualization.
<br>
<br>
Cloud version provides API for processing CompaJ scripts on external servers and get results for local processing.
____

### Architecture

##### Config server
Notifies other services about config changes. It uses Spring Cloud Config Bus with Kafka.

##### Discovery server
Registers all services, so they can found each other and communicate. Uses Eureka.
