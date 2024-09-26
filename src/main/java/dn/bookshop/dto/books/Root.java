package dn.bookshop.dto.books;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root {
    @JsonProperty("kind")
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    String kind;

    @JsonProperty("totalItems")
    public double getTotalItems() {
        return this.totalItems;
    }

    public void setTotalItems(double totalItems) {
        this.totalItems = totalItems;
    }

    double totalItems;

    @JsonProperty("items")
    public ArrayList<dn.bookshop.dto.books.Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<dn.bookshop.dto.books.Item> items) {
        this.items = items;
    }

    ArrayList<dn.bookshop.dto.books.Item> items;
}
