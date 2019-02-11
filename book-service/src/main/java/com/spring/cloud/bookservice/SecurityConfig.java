package com.spring.cloud.bookservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.httpBasic().disable().authorizeRequests()
        .antMatchers("/books").permitAll()
        .antMatchers("/books/*").hasAnyRole("USER", "ADMIN").anyRequest()
        .authenticated().and().csrf().disable();
  }
}
