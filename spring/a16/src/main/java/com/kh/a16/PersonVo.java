package com.kh.a16;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

public class PersonVo {

    public static Builder builder(){
        return new Builder();
    }

    private PersonVo(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    private String name;
    private int age;

    public static class Builder{
        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public PersonVo build(){
            return new PersonVo(this);
        }

    }//inner class


}//class