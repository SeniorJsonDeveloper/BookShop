package com.example.MyBookShopApp.data.dto.google.api.books;

import com.fasterxml.jackson.annotation.JsonProperty;
import dn.bookshop.dto.books.ListPrice;

public class Offer {
        @JsonProperty("finskyOfferType")
        public int getFinskyOfferType() {
            return this.finskyOfferType;
        }

        public void setFinskyOfferType(int finskyOfferType) {
            this.finskyOfferType = finskyOfferType;
        }

        int finskyOfferType;

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
    }
