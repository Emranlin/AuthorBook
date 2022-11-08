import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Chyngyz Aitmatov", 80, 'M');
        Author author1 = new Author("Poulo Koelhcho", 78, 'M');
        Author author2 = new Author("Fethullah Gulen", 83, 'M');
        Author author3 = new Author("Ray Bredbarry", 46, 'M');
        Author author4 = new Author("Ruta Kavashima", 62, 'F');

        System.out.println("Author: " + author.getName());
        System.out.println("Email: " + author.getAge());
        author.setAge(80);
        System.out.println("Gender: " + author.getGender());
        System.out.println("Author info: " + author.toString());

        System.out.println("Author: " + author1.getName());
        System.out.println("Email: " + author1.getAge());
        author1.setAge(78);
        System.out.println("Gender: " + author1.getGender());
        System.out.println("Author info: " + author1.toString());

        System.out.println("Author: " + author2.getName());
        System.out.println("Email: " + author2.getAge());
        author2.setAge(83);
        System.out.println("Gender: " + author2.getGender());
        System.out.println("Author info: " + author2.toString());

        System.out.println("Author: " + author3.getName());
        System.out.println("Email: " + author3.getAge());
        author3.setAge(46);
        System.out.println("Gender: " + author3.getGender());
        System.out.println("Author info: " + author3.toString());

        System.out.println("Author: " + author4.getName());
        System.out.println("Email: " + author4.getAge());
        author4.setAge(62);
        System.out.println("Gender: " + author4.getGender());
        System.out.println("Author info: " + author4.toString());


        Book book = new Book("Ak Keme", author, 450, 1000);
        Book book1 = new Book("Alchemist", author1, 250, 1500);
        Book book2 = new Book("Prizma", author2, 380, 1000);
        Book book3 = new Book("451 Farenheit", author3, 250, 5000);
        Book book4 = new Book("Brain", author4, 200, 500);

        Author[] authors = {author, author1, author2, author3, author4};
        Book[] books = {book, book1, book2, book3, book4};
        Book[] books1 = {book, book1, book2, book3, book4};

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Select your options:1 Find by price,2 Find by author.");
        while (true) {
            int sell = scanner.nextInt();
            if (sell == 1) findExpensiveBook(books);
            System.out.println("Enter your author name");
            if (sell == 2) findByAuthor(authors, books1, scanner.nextLine());
            if (sell == 3) System.out.println("That's wrong!");

        }
    }

        public static void findExpensiveBook (Book[]books){
            int max = books[0].getPrice();
            int min = books[0].getPrice();
            for (int i = 0; i < books.length; i++) {
                max = Math.max(max, books[0].getPrice());
                min = Math.min(min, books[0].getPrice());
            }
            System.out.println("Expensive book is " + max);
            System.out.println("Cheap book is " + min);

        }


        public static void findByAuthor (Author[]authors, Book[]books,String name){
            for (Author author : authors) {
                if (Objects.equals(author.getName(), name)) {
                    author.getInfo();
                    System.out.println();

                }
            }
            for (Book book : books) {
                for (Author author : authors)
                    if (Objects.equals(author.getName(),name) && Objects.equals(book.getName(), author.getName())) {
                        book.getInfo();
                        System.out.println();
                    }
            }
        }

    }
