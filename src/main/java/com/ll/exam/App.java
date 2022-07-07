package com.ll.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public void run() throws IOException {
        System.out.println("=== 명언 SSG ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int LastId = 0;

        outer:
        while(true){
            System.out.print("명령) ");
            String cmd = br.readLine().trim();



            //"종료"
            switch ( cmd ){
                case "등록":
                    System.out.print("명언 : ");
                    String wise = br.readLine().trim();
                    System.out.print("작가 : ");
                    String writer = br.readLine().trim();
                    int num = ++LastId; //글 번호 증가

                    WiseSaying wiseSaying = new WiseSaying(num, wise, writer); //클래스로 만들기
                    System.out.println(wiseSaying);
                    System.out.println(num + "번 명언이 등록되었습니다.");
                    break;
                case "목록":
                    System.out.println("-------------");
                case "종료":
                    break outer;


            }
        }

        br.close();;

    }
}

