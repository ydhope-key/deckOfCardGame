package com.heiyu.service;

import com.heiyu.entity.Card;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PokerServiceImpl implements PokerService {

    private List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        for (String suit : new String[]{"Hearts", "Diamonds", "Clubs", "Spades"}) {
            for (int rank = 1; rank <= 13; rank++) {
                deck.add(new Card(suit, rank));
            }
        }
        return deck;
    }

    public List<Map> shuffle(int num) {
        List<Card> deck = createDeck(); // 创建一副扑克牌
        Collections.shuffle(deck); // 洗牌
        System.out.println("Deck after shuffling:");
        deck.forEach(System.out::println); // 打印整副纸牌顺序
        List<Map> dealList = new ArrayList<>();
        for (int j = 0;j<num;j++){
            List<Card> dealCard = new ArrayList<>();
            Map dealMap = new HashMap<>();
            for (int i = 0+j*5; i < 5+j*5; i++) {
                dealCard.add(deck.get(i));
            }
            dealMap.put("player","第"+(j+1)+"位牌友");
            dealMap.put("card",dealCard);
            dealList.add(dealMap);
        }
        return dealList;
    }

}
