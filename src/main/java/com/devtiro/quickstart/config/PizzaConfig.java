package com.devtiro.quickstart.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "pizza") // env variables must start with "pizza" prefix, for example pizza.sauce=bbq or PIZZA_SAUCE=bbq
@AllArgsConstructor // lombok annotation
@NoArgsConstructor // lombok annotation
@Data // lombok annotation
public class PizzaConfig {
    private String sauce;
    private String topping;
    private String crust;
}
