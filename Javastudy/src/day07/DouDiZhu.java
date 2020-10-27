package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DouDiZhu {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index += 1;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index += 1;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
//        System.out.println(poker);
//        System.out.println(pokerIndex);
        Collections.shuffle(pokerIndex);  //洗牌
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer integer = pokerIndex.get(i);
            if (i >= 51) {
                diPai.add(integer);
            } else if (i % 3 == 0) {
                player1.add(integer);
            } else if (i % 3 == 1) {
                player2.add(integer);
            } else if (i % 3 == 2) {
                player3.add(integer);
            }
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);

        lookPoker("刘德华", poker, player1);
        lookPoker("周润发", poker, player2);
        lookPoker("周星驰", poker, player3);
        lookPoker("底牌", poker, diPai);
    }

    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        System.out.print(name + ": ");
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
