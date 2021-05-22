package com.study.bootstudy.common.config.security.jwt;

import io.jsonwebtoken.Jwts;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "syrongk.jwt")
@Getter @Setter
public class JwtProvider {

    /*
    * 1. token 생성 : client에게 전달용
    * 2. token 검증 : client 및 정보 검증용
    * */

    public String createToken() {

         /*Jwt Claims 구성 설정 필요
         * 사용자가 누구인지
         * 이 token으로 무엇에 접근할 수 있는지
         * 언제 만료되는지
         * */

        return Jwts.builder()
                 /*jwt token 커스텀 설정*/
                .compact();
    }

    public void parseToken() {

    }

}
