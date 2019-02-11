package com.spring.cloud.ratingservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.httpBasic().disable().authorizeRequests()
        .antMatchers("/ratings").hasRole("USER")
        .antMatchers("/ratings/all").hasAnyRole("USER", "ADMIN").anyRequest()
        .authenticated().and().csrf().disable();
  }
}
