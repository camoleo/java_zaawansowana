package com.camoleo.zad24;

public class Basket {

    public static final int MAX_CAPACITY = 10;

    private int elements;

        public Basket() {
            this.elements = 0;
        }

        public void addToBasket() throws BasketFullException {
            if (elements == MAX_CAPACITY) {
                throw new BasketFullException();
            }
            elements++;
        }

        public void removeFromBasket() throws BasketEmptyException {
            if (elements == 0) {
                throw new BasketEmptyException();
            }
            elements--;
        }
    }
