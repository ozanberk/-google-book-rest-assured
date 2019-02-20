package com.cellxpert.core;

public enum Books {
    LettersToMilena("9788804682646");

    private String number;

    Books(String number){
        this.number = number;
    }

    public String asString(){
        return this.number;
    }
}
