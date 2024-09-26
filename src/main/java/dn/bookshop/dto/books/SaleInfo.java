package dn.bookshop.dto.books;

import com.fasterxml.jackson.annotation.JsonProperty;
import dn.bookshop.dto.books.ListPrice;

import java.util.ArrayList;

public class SaleInfo {
    @JsonProperty("country")
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    String country;

    @JsonProperty("saleability")
    public String getSaleability() {
        return this.saleability;
    }

    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    String saleability;

    @JsonProperty("isEbook")
    public boolean getIsEbook() {
        return this.isEbook;
    }

    public void setIsEbook(boolean isEbook) {
        this.isEbook = isEbook;
    }

    boolean isEbook;

    @JsonProperty("listPrice")
    public ListPrice getListPrice() {
        return this.listPrice;
    }

    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    ListPrice listPrice;

    @JsonProperty("retailPrice")
    public dn.bookshop.dto.books.RetailPrice getRetailPrice() {
        return this.retailPrice;
    }

    public void setRetailPrice(dn.bookshop.dto.books.RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    dn.bookshop.dto.books.RetailPrice retailPrice;

    @JsonProperty("buyLink")
    public String getBuyLink() {
        return this.buyLink;
    }

    public void setBuyLink(String buyLink) {
        this.buyLink = buyLink;
    }

    String buyLink;

    @JsonProperty("offers")
    public ArrayList<com.example.MyBookShopApp.data.dto.google.api.books.Offer> getOffers() {
        return this.offers;
    }

    public void setOffers(ArrayList<com.example.MyBookShopApp.data.dto.google.api.books.Offer> offers) {
        this.offers = offers;
    }

    ArrayList<com.example.MyBookShopApp.data.dto.google.api.books.Offer> offers;
}
