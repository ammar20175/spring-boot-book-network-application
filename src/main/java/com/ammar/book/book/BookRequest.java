package com.ammar.book.book;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record BookRequest(
        Integer id,

        @NotNull(message = "Title must not be null")
        @NotEmpty(message = "Title must not be empty")
        String title,

        @NotNull(message = "Author name must not be null")
        @NotEmpty(message = "Author name must not be empty")
        String authorName,

        @NotNull(message = "ISBN must not be null")
        @NotEmpty(message = "ISBN must not be empty")
        String isbn,

        @NotNull(message = "Synopsis must not be null")
        @NotEmpty(message = "Synopsis must not be empty")
        String synopsis,

        boolean shareable) {
}
