# Starting Kafka locally
See https://kafka.apache.org/quickstart:
> bin\windows\zookeeper-server-start.bat config\zookeeper.properties
> bin\windows\kafka-server-start.bat config\server.properties

If Kafka is not running and fails to start after laptop wakes up from hibernation, delete the ```c:\tmp\kafka-logs``` folder and then start Kafka.