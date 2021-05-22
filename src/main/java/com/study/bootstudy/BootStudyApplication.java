package com.study.bootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
    스프링 부트 자동 환경설정
    jar은 스프링부트 자동설정 의존성에 따라 설정이 자동 적용된다. 의존성 버전 직접 안맞춰도 됨.
    @SpringBootApplication = 아래 합
    1. @SpringBootConfiguration : 스프링부트의 설정을 나타내는 어노테이션.
                스프링의 @Configuration을 대체하며, 스프링 부트 전용 어노테이션이다.
                테스트 어노테이션을 사용할 때, 이 어노테이션을 찾기 때문에 필수 어노테이션이다.
    2. @ComponentScan : @component 어노테이션 및 @Service, @Repository, @Controller 등의
                어노테이션을 스캔하여 Bean으로 등록해주는 어노테이션
                basePackages 프로퍼티 value에 별도의 경로를 설정하지 않으면 해당 어노테이션이 위치한 패키지가 루트 경로가 된다.
    3. @EnableAutoConfiguration : 자동 설정의 핵심 어노테이션. 클래스 경로에 지정된 내용을 기반으로 설정 자동화를 수행한다.
                사전에 정의한 라이브러리들을 condition만족시 Bean으로 등록해주는 어노테이션

    -> Spring Container를 구성한단 얘기같은데. : was의 각 기능 관리.
                xxx-context.xml & xxx-config.xml
 */
//exclude   excluedName scanBasePackages    scanBasePackagesClasses nameGenerator   proxyBeanMethods
@SpringBootApplication(scanBasePackages = "com.study.bootstudy")
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class BootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootStudyApplication.class, args);
    }

}
