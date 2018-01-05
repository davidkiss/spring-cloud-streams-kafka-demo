package com.kaviddiss.streamkafka.config;

import com.kaviddiss.streamkafka.stream.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}
