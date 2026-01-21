package com.xjh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    static HashMap<Integer, String> pokerBox = new HashMap<>();
    static ArrayList<Integer> serialNumberList = new ArrayList<>();

    static {
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int serialNumber = 0;
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < colors.length; i++) {
                String s = colors[i] + numbers[j];
                pokerBox.put(serialNumber, s);
                serialNumberList.add(serialNumber);
                serialNumber++;
            }
        }
        pokerBox.put(serialNumber, "小王");
        serialNumberList.add(serialNumber);
        serialNumber++;
        pokerBox.put(serialNumber, "大王");
        serialNumberList.add(serialNumber);
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(serialNumberList);
        //发牌
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> bottomCards = new TreeSet<>();
        for (int i = 0; i < serialNumberList.size(); i++) {
            if (i >= 51) {
                bottomCards.add(serialNumberList.get(i));
                continue;
            }
            if (i % 3 == 0) {
                player1.add(serialNumberList.get(i));
            } else if (i % 3 == 1) {
                player2.add(serialNumberList.get(i));
            } else if (i % 3 == 2) {
                player3.add(serialNumberList.get(i));
            }
        }
        //看牌
        lookPoker(player1);
        lookPoker(player2);
        lookPoker(player3);
        lookPoker(bottomCards);
    }

    public static void lookPoker(TreeSet<Integer> treeSet) {
        for (Integer i : treeSet) {
            String s = pokerBox.get(i);
            System.out.print(s+", ");
        }
        System.out.println();
    }
}

