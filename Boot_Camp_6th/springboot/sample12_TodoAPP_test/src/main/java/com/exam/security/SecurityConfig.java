package com.exam.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
public class SecurityConfig {

   @Bean
   public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

       http.csrf(csrf -> csrf.disable());

       http.authorizeHttpRequests(authorizeRequests
               -> authorizeRequests.requestMatchers("/","/login","/home","/signup").permitAll()
                                   .anyRequest().authenticated());

       http.formLogin(formLogin
               -> formLogin.loginPage("/login")
                           .usernameParameter("userid")
                           .passwordParameter("password")
                           .defaultSuccessUrl("/home",true)
                           .failureUrl("/login?error=true")
                           .loginProcessingUrl("/auth")
                           .permitAll()
       );
       http.logout(logout
               -> logout.logoutUrl("/logout").logoutSuccessUrl("/home")
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID")
                        .permitAll());

       return http.build();
   }

    @Bean
    public PasswordEncoder passwordEncoder(){
       return  new BCryptPasswordEncoder();
   }
}
