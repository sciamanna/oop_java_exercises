package com.techreturners.cats;

class DomesticCat extends AbstractCat {

    DomesticCat() {
        super("domestic", 23);
    }

    public String eat() {
        return "Purrrrrrr";
    }
}