package com.company;

public class Human {
    class Head {
        private String hairColor;
        public Head() {
        }
        public Head(String hairColor) {
            this.hairColor = hairColor;
        }
        public void setHairColor(String color) {
            this.hairColor = color;
        }
        public String getHairColor() {
            return hairColor;
        }
    }

    class Hand {
        private int handSize;
        public Hand() {}
        public Hand(int size) {
            this.handSize = size;
        }
        public void setHandSize(int size) {
            this.handSize = size;
        }
        public int getHandSize() {
            return handSize;
        }
    }
    class Leg {
        private int legSize;
        public Leg() {}
        public Leg(int size){
            this.legSize = size;
        }
        public void setLegSize(int size) {
            this.legSize = size;
        }
        public int getLegSize(){return legSize;}
    }
    Head head = new Head();
    Hand hand = new Hand();
    Leg leg = new Leg();
    public Human() {};
    public Human(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }
}
