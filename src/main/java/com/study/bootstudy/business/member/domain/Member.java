package com.study.bootstudy.business.member.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Member {

    private int idx;
    private String id;
    private String pwd;
    private String name;
}
