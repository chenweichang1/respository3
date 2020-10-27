package day04;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        //    1.准备牌
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        poker.add("大王");
        poker.add("小王");
        for (String color :
                colors) {
            for (String number :
                    numbers) {
//                System.out.println(color + number);
                poker.add(color + number);
            }
        }
//        System.out.println(poker);
//        2.洗牌
        Collections.shuffle(poker);
//        System.out.println(poker);
//        3.发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i); //获取每一张牌
            if (i >= 51) {
                diPai.add(p);
            } else if (i % 3 == 0) {
                player1.add(p);
            } else if (i % 3 == 1) {
                player2.add(p);
            } else if (i % 3 == 2) {
                player3.add(p);
            }
        }
//        4.看牌
        System.out.println("刘德华："+player1);
        System.out.println("郭富城："+player2);
        System.out.println("张学友："+player3);
        System.out.println("黎明："+diPai);
    }
}
