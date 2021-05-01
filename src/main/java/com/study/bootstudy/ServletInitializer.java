package com.study.bootstudy;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
Servlet Container 구성 : 서버와 통신하기 위한 설정들.
            어느 request에 어느 servlet을 실행할 것인가?
            web.xml - DispatcherServlet
            ContextLoadListener : DispatcherServlet의 부모
            Filter관련 설정도 타고 가면 있음


            ** Interceptor는 Spring Container 안에서 동작하는 것.
            Spring Context 안에 있기 때문에, Spring 관리 객체로 등록된 모든 객체를 주입받아서 사용할 수 있다.
            -> 그래서 Interceptor 구현 클래스 생성하고 어노테이션 달아두면
                @SpringBootApplication에 의해 인식되어서 돌아가는거구나.

            ** Filter & Interceptor
                Request URI를 통해 적용하고, HttpServletRequest와 HttpServletResponse를 파라미터로 사용 가능.
*/
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootStudyApplication.class);
    }

}
