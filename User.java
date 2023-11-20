import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthday;
    private ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String birthday) {
        this.name = name;
        this.birthday = LocalDate.parse(birthday);
    }

    public int age() {
        Period period = Period.between(this.birthday,
                LocalDate.now());
        int age = period.getYears(); // Extract the years from the Period
        return age;
    }

    // ?getters and setters
    public String getName() {
        return this.name;
    }

    public String getBirthday() {
        return this.birthday.toString();
    }

    public void borrow(Book book) {
        this.books.add(book);
    }

    public String borrowedBooks() {
        return this.books.toString();
    }
}
