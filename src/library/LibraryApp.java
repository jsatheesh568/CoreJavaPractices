package CoreJavaPractices.src.library;

import CoreJavaPractices.src.library.book.BookRepository;
import CoreJavaPractices.src.library.book.Category;
import CoreJavaPractices.src.library.book.LibraryBook;
import CoreJavaPractices.src.library.members.FacultyMember;
import CoreJavaPractices.src.library.members.MemberService;
import CoreJavaPractices.src.library.members.StudentMember;
import CoreJavaPractices.src.library.transaction.TransactionService;

public class LibraryApp {
    public static void main(String[] args) {
        var bookRepo = new BookRepository();
        var transactionService = new TransactionService(bookRepo);
        var memberService = new MemberService();

        // Adding Books
        bookRepo.addBook(new LibraryBook("B1", "The Hobbit", Category.FICTION));
        bookRepo.addBook(new LibraryBook("B2", "Atomic Habits", Category.NON_FICTION));

        // Adding Members
        var student = new StudentMember("M1", "Alice");
        var faculty = new FacultyMember("M2", "Dr. Smith");

        memberService.addMember(student);
        memberService.addMember(faculty);

        // Borrowing Books
        transactionService.borrowBook("M1", "B1");
        transactionService.borrowBook("M2", "B2");

        // Display Borrowed Books
        System.out.println("\nBorrowed Books:");
        memberService.findMember("M1").ifPresent(m ->
                System.out.println(m.getName() + " borrowed: " + transactionService.getBorrowedBooks(m.getId())));

        memberService.findMember("M2").ifPresent(m ->
                System.out.println(m.getName() + " borrowed: " + transactionService.getBorrowedBooks(m.getId())));

        // Returning a Book
        transactionService.returnBook("M1", "B1");
    }
}
