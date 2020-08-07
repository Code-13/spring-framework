package com.github.code13.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Code13
 * @date 2020-07-14 14:27
 */
@ComponentScan("com.github.code13")
@EnableAspectJAutoProxy
@Configuration
public class AppConfig {
}
