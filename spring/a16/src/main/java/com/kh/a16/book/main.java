package com.kh.a16.book;

import com.kh.a16.PersonVo;

public class main {
    public static void main(String[] args) {
        System.out.println("main");
//        PsersonVo vo = new PsersonVo();
//        vo.setName("Hone");
//        vo.setAge(20);

//        PersonVo vo = new PersonVo("Hong", 21);

        PersonVo vo = PersonVo.builder().name("Hong").age(20).build();
        System.out.println("vo = " + vo);



    }
}
