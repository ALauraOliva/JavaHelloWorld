public class Book {
    public String title;
    public String autor;

    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }

    public String toString() {
        return String.format("%s by $s", this.title, this.autor);
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }
}
