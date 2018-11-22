package com.waylau.spring.boot.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    /**
     * 自定义配置
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.authorizeRequests()
                .antMatchers("/css/**", "/js/**", "/fonts/**", "/index")
                .permitAll()
                .antMatchers("/users/**")
                .hasRole("ADMIN")
                .and()
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login-error");
    }

    /**
     * 认证信息管理
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.inMemoryAuthentication()
                .withUser("waylau")
                .password("{noop}123456")
                .roles("ADMIN");
    }
}
