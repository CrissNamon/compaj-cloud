### CompaJ Cloud
This is a cloud version of [CompaJ](https://github.com/CrissNamon/compaj) - programming and numeric computing platform for math modeling and visualization.
<br>
<br>
Cloud version provides API for processing CompaJ scripts on external servers and get results for local processing.
____

### Architecture

## Services

##### [Config service](https://github.com/HiddenPrj/compaj-cloud-config)
Notifies other services about config changes. It uses Spring Cloud Config Bus with Kafka.

##### [Discovery service](https://github.com/HiddenPrj/compaj-cloud-discovery)
Registers all services, so they can find each other and communicate. Uses Eureka.

##### [Gateway service](https://github.com/HiddenPrj/compaj-cloud-gateway)
Reverse proxy, which hides all infrastructure and routes all requests from single point to all services. Uses Redis to store sessions.

## Security
All services use OAuth for secured communication with Keycloak as provider. 
Gateway is a client in OAuth, and it propagates tokens to services behind.