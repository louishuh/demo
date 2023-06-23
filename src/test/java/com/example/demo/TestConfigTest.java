package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class TestConfigTest {

    @TestConfiguration
    static class InnerTestConfiguration {
        @Bean
        public SomeBean someBean() {
            return new SomeBean("id1");
        }
    }

    @Autowired
    private SomeBean someBean;

    @Test
    void test() {
        System.out.println("bean: " + someBean.toString());
    }
}
