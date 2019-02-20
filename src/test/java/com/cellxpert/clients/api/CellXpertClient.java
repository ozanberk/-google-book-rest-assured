package com.cellxpert.clients.api;

import com.cellxpert.core.configuration.ConfigParser;
import com.cellxpert.core.entitiy.Book;
import static io.restassured.RestAssured.*;

public class CellXpertClient {
    private String url;

    public CellXpertClient(){
        this.url = ConfigParser.getValue("BaseUrl");;
    }

    public Book getBook(String isbn){
        return get(url + isbn).as(Book.class);
    }
}
