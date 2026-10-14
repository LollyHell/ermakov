public class Author {
    public String name;
    int size = 0;
    public Book []book;

    public Author(String name){
        if (name == null) this.name = "Автор не указан";
        else this.name = name;
        this.book = new Book[10];
        this.size = 0;
    }

    @Override
    public String toString() {
        if (name == null) name = "Автор не указан";
        return this.name;
    }
}
//ходить из автора в бук и наоборот
// дз до 1.5
