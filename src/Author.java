import java.util.Objects;
public class Author {
    private final String name;
    private final String surname;

    private Author(String name, String surname) {
        this name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Object.equals(name, author.name) && Object.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Object.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
} so