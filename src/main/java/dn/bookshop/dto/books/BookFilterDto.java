package dn.bookshop.dto;

import dn.bookshop.entity.BookEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
public class BookFilterDto {

    private Integer offset;

    private List<BookEntity> books;

    public BookFilterDto(Integer offset, List<BookEntity> books) {
        this.offset = books.size();
        this.books = books;
    }

    public BookFilterDto(List<BookEntity> books) {
        this.books = books;
    }
}
