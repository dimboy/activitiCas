/*package com.jamxin.config.authenticator;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

@Override
protected void configure(HttpSecurity http) throws Exception {

// @formatter:off
http
.authorizeRequests()
.antMatchers(HttpMethod.GET, "/","/static/**", "/resources/**","/resources/public/**").permitAll()
.anyRequest().authenticated()
.and()
.formLogin()
.and()
.httpBasic().disable()
.requiresChannel().anyRequest().requiresSecure();
// @formatter:on
}
}*/