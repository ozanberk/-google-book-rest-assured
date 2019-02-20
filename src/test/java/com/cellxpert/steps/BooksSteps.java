package com.cellxpert.steps;

import com.cellxpert.clients.api.CellXpertClient;
import com.cellxpert.core.Books;
import com.cellxpert.core.entitiy.Book;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BooksSteps {
    private CellXpertClient cellXpertClient;
    private Book book;

    public BooksSteps(CellXpertClient cellXpertClient){
        this.cellXpertClient = cellXpertClient;
    }

    @When("^I search \"([^\"]*)\" on google books$")
    public void iSearchOnGoogleBooks(String bookName) throws Throwable {
        String isbn = bookName.replace(" ", "");
        book = cellXpertClient.getBook(Books.valueOf(isbn).asString());
    }

    @Then("^I should see that book author is \"([^\"]*)\"$")
    public void iShouldSeeThatBookWriterIs(String author) throws Throwable {
        Assert.assertEquals(book.items.get(0).volumeInfo.authors.get(0), author);

    }

    @And("I should see that books is not shipped to Montenegro")
    public void iShouldSeeThatBooksIsNotShippedToMontenegro() {
        Assert.assertEquals(book.items.get(0).saleInfo.isEbook, false);
    }

}
