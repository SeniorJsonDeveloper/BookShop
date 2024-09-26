package com.example.MyBookShopApp.data.dto.google.api.books;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Epub {
    @JsonProperty("isAvailable")
    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    boolean isAvailable;
}
