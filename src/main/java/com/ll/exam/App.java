package com.ll.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public void run() throws IOException {
        System.out.println("=== 명언 SSG ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 가장 마지막 명언글의 번호
        List<WiseSaying> wiseSayings = new ArrayList<>();
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
                    wiseSayings.add(wiseSaying); // 등록시마다 리스트에 내용추가

                    System.out.println(num + "번 명언이 등록되었습니다.");
                    break;
                case "목록":
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("-------------");
                    for (int i = wiseSayings.size() - 1; i >= 0; i--) {
                        WiseSaying wiseSaying1 = wiseSayings.get(i); // 저장된 리스트에서 데이터 가져오기 위해 변수선언
                        System.out.printf("%d / %s / %s\n", wiseSaying1.num, wiseSaying1.wise, wiseSaying1.writer);
                    }
                    break;

                case "종료":
                    break outer;


            }
        }

        br.close();

    }
}

