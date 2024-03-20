package com.example.Projectinfocg.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.hazelcast.config.*;
@Configuration
    public class CacheConfig {

        @Bean
        public Config configure() {
            return new Config()
                    .setInstanceName("hazel-instance")
                    .addMapConfig(new MapConfig()
                            .setName("project-cache")
                            .setTimeToLiveSeconds(3000)
                            .setEvictionConfig(new EvictionConfig()
                                    .setSize(200)
                                    .setMaxSizePolicy(MaxSizePolicy.FREE_HEAP_SIZE)
                                    .setEvictionPolicy(EvictionPolicy.LRU)
                            )
                    );
        }

    }

