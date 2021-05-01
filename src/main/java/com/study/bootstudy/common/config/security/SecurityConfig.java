package com.study.bootstudy.common.config.security;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.AntPathMatcher;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /*
    HttpSecurity & WebSecurity 차이 봐둘까.
    
    configure(WebSecurity)
        : Spring Security의 Filter 연결 관련 설정
        Security 전역 설정을 할 수 있다.
        HttpSecurity보다 우선시 되며, static 파일 등 인증이 필요없는 리소스를 설정 가능

        그러니까 SpringSecurity는 FilterInterceptor 기반이니까
        그 Interceptor가 Reqeust를 캐치해서 인증 관련 처리를 하기 전에
        처리 목록에서 제외시킬 수 있다는 거네.
        제외하는거랑, 확인 후 허용하는 것(permitALl())은 다른 것
    
    configure(HttpSecurity)
        : Interceptor로 요청을 안전하게 보호하는 방법 관련 설정
        Interceptor가 인증 관련 처리를 할 때, Request별 허용 불허용 등의 처리를 할 수 있는거고.
    
    configure(AuthenticationManagerBuilder) 
        : 사용자 세부 서비스를 관련 설정
    */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //  이 부분 좀
//        web.ignoring().antMatchers("/static/**", "/resources/**");
        web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
    }
}
