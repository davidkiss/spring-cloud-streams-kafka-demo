# Overview
This sample project demonstrates how to build [real-time streaming](https://aws.amazon.com/streaming-data/) applications using [event-driven architecture](https://thenewstack.io/event-driven-architecture-wave-future/),
 [Spring Boot](https://thenewstack.io/event-driven-architecture-wave-future/),
 [Spring Cloud Stream](https://cloud.spring.io/spring-cloud-stream/) and
 [Apache Kafka](https://kafka.apache.org).

# What is Spring Cloud Streaming
Spring Cloud Stream is a framework for building message-driven microservices and it's built upon Spring Boot.

# What is Kafka
Kafka is a high performant and horizontally scalable messaging platform originally developed by LinkedIn and later on donated to the Apache Foundation.

# Installing Kafka
1. Download Kafka from [here](https://kafka.apache.org/downloads) and untar it:
```
> tar -xzf kafka_2.11-1.0.0.tgz
> cd kafka_2.11-1.0.0
```

2. Start the server

On Windows:
```
bin\windows\zookeeper-server-start.bat config\zookeeper.properties
bin\windows\kafka-server-start.bat config\server.properties
```

On Linux or Mac:
```
> bin/zookeeper-server-start.sh config/zookeeper.properties
> bin/kafka-server-start.sh config/server.properties
```

If Kafka is not running and fails to start after laptop wakes up from hibernation, delete the ```c:\tmp\kafka-logs``` folder and then start Kafka.

