package com.company;

public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human();
        human.head.setHairColor("Blond");
        human.hand.setHandSize(18);
        human.leg.setLegSize(42);
        System.out.println(human.head.getHairColor());
        System.out.println(human.hand.getHandSize());
        System.out.println(human.leg.getLegSize());
    }
}
