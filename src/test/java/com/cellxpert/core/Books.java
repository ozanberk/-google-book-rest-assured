package com.cellxpert.core;

public enum Books {
    LettersToMilena("9788804682646"),
    TheTrial("9780749399559"),
    TheMetamorphosis("153953507X"),
    TheCastle("0805211063");

    private String number;

    Books(String number){
        this.number = number;
    }

    public String asString(){
        return this.number;
    }
}
