package com.ps.dept.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("support")
public class GlobalProperties {

    public String email;
}
