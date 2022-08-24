package tech.hiddenproject.compajcloud.gatewayservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

  @Bean
  public SecurityWebFilterChain springSecurityFilterChain (ServerHttpSecurity http) {
    return http
        .csrf()
        .disable()
        .authorizeExchange()
        .pathMatchers("/auth/**")
        .permitAll()
        .pathMatchers("/")
        .permitAll()
        .pathMatchers("/hello")
        .authenticated()
        .and()
        .oauth2Login()
        .and().build();
  }

}
