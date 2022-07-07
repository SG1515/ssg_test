package com.ll.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public void run() throws IOException {
        System.out.println("=== 명언 SSG ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        outer:
        while(true){
            System.out.print("명령) ");
            String cmd = br.readLine().trim();

            int n = 1;

            //"종료"
            switch ( cmd ){
                case "등록":
                    System.out.print("명언 : ");
                    String wise = br.readLine().trim();
                    System.out.print("작가 : ");
                    String writer = br.readLine().trim();
                    System.out.println(n + "번 명언이 등록되었습니다.");
                    n++;
                    break;
                case "종료":
                    break outer;


            }
        }

        br.close();;

    }
}
