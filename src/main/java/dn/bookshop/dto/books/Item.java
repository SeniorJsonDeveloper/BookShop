package dn.bookshop.dto.books;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


public class Item {
    @JsonProperty("kind")
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    String kind;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;

    @JsonProperty("etag")
    public String getEtag() {
        return this.etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    String etag;

    @JsonProperty("selfLink")
    public String getSelfLink() {
        return this.selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    String selfLink;

    @JsonProperty("volumeInfo")
    public dn.bookshop.dto.books.VolumeInfo getVolumeInfo() {
        return this.volumeInfo;
    }

    public void setVolumeInfo(dn.bookshop.dto.books.VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    dn.bookshop.dto.books.VolumeInfo volumeInfo;

    @JsonProperty("saleInfo")
    public SaleInfo getSaleInfo() {
        return this.saleInfo;
    }

    public void setSaleInfo(dn.bookshop.dto.books.SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    dn.bookshop.dto.books.SaleInfo saleInfo;

    @JsonProperty("accessInfo")
    public dn.bookshop.dto.books.AccessInfo getAccessInfo() {
        return this.accessInfo;
    }

    public void setAccessInfo(dn.bookshop.dto.books.AccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    dn.bookshop.dto.books.AccessInfo accessInfo;

    @JsonProperty("searchInfo")
    public dn.bookshop.dto.books.SearchInfo getSearchInfo() {
        return this.searchInfo;
    }

    public void setSearchInfo(dn.bookshop.dto.books.SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

    dn.bookshop.dto.books.SearchInfo searchInfo;
}
