package jsonModel;

import java.util.List;

public class Book {
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<BookList> getBookList() {
        return bookList;
    }

    public void setBookList(List<BookList> bookList) {
        this.bookList = bookList;
    }

    private boolean success;
    private List<BookList> bookList;

}
