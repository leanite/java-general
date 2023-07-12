package optionals;

import java.util.List;
import java.util.Optional;

public class FakeService {

    private List<Book> books;

    public FakeService() {
        this.books = List.of(
                new Book(1, "My Book", 1990),
                new Book(2, "My Book 2", 1990),
                new Book(3, "My Book 3 ", 1990),
                new Book(4, "My Book 4", 1990)
        );
    }

    public Optional<Book> findById(int id) {
        for (Book book : this.books) {
            if (id == book.id()) return Optional.of(book);
        }

        return Optional.empty();
    }

    public void printTitleOfId(int id) {
        this.findById(id).ifPresentOrElse(
                book -> {
                    System.out.println(book);
                },
                () -> {
                    System.out.println("Book not found");
                }
        );
    }
}
