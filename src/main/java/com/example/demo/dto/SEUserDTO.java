package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SEUserDTO {

    // 테이블 : seuser

    private Long seq; // 번호
    private String name; // 이름
    private String tel; //전화번호
    private String gender; // 성별
}
