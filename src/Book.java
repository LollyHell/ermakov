public class Book {
    // название и автор
    public String title;
    Author author;

    public Book(String title){
        this((String) null, title);
    }
    public Book(String author, String title) {
        if (author != null){
            this.author = new Author(author);
        }
        this.title = title;
    }

    public Book(Author author, String title) {
        this.author = author;
        this.title = title;
        if (author != null){
            author.book[author.size] = this;
            author.size++;
        }
    }


    @Override
    public String toString() {
        if (title == null) return "книга потеряна";
        Author a = author;
        if (author == null){
            author = new Author("Неизвестный автор");
        }
        return "Книга автора " + author + ": " + title;
    }
}
