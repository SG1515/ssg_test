package com.ll.exam;

public class WiseSaying {

     int num;
     String wise;
     String writer;

    public WiseSaying(int num, String wise, String writer) {
        this.num = num;
        this.wise = wise;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return  num +  "/ " + wise  + " / " + writer;
    }
}
