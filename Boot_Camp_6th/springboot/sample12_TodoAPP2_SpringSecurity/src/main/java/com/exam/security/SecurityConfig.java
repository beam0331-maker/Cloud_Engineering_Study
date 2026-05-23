package com.exam.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        // csrf 비활성화 ( 실무에서 활성화 권장 )
        // http.csrf(csrf -> csrf.disable());
        http.csrf(AbstractHttpConfigurer::disable);

        // 1. 어떤 요청을 인증/비인증해야 되는지 설정
        http.authorizeHttpRequests(authorizeRequests -> authorizeRequests
                .requestMatchers("/","/home", "/signup", "/login").permitAll()
//                .requestMatchers("/","/home", "/signup", "/login").hasRole("USER").permitAll()
                .anyRequest()
                .authenticated());

        // 인증하기 위한 로그인 화면 구성하기
        http.formLogin(formLogin ->
                formLogin
                        // login화면을 보여주는 url 명시
                        // LogController.java -> @GetMapping("/login")
                        .loginPage("/login")
                        // loginForm.html에서 사용하는 action값, name값 설정
                        // POST 방식으로만 전달 받는다
                        .loginProcessingUrl("/auth")
                        .usernameParameter("userid")
                        .passwordParameter("password")
                        // true로 지정하면 이전에 가고자하는 경로가 아닌 인증후에 /home으로 고정된다.
                        // forward 키워드가 지정된 스트림이 아니면 redirect가 기본값이다.
                        .defaultSuccessUrl("/home", true) // redirect
                        // error = true 파라미터는 LoginForm.html에서 사용됨
                        .failureUrl("/login?error=true")
                        .permitAll()
                        // 거의 대부분의 요청을 redirect로 처리함 (PRG패턴)
                        );

        // 로그아웃 설정
        http.logout(logout ->
                logout
                        // logout을 처리할 때 사용하는 url 경로지정
                        .logoutUrl("/logout")
                        // logout을 처리할 떄 사용하는 url 경로지정
                        .logoutSuccessUrl("/home")
                        // Session clear
                        .invalidateHttpSession(true)
                        // 클라이언트에 남아있는 쿠키 삭제
                        // JSESSIONID: 톰캣에서 각 브라우저에 세션을 유지하기 위해 부여하는 ID
                        .deleteCookies("JSESSIONID")
                        .permitAll()

        );

        return http.build();
    }

    // 암호화할 때 사용하는 빈
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
