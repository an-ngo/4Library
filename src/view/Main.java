package view;

import controller.Library;
import exception.SameMSVException;
import model.Book;
import model.Student;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Learn to learn");
        Book b2 = new Book("Im pro, you be too");

        Student s1 = new Student("Thai","c621h1_01","1/1/1998","C6");
        Student s2 = new Student("Xuan ANh","c621h1_02","1/2/1994","C6");
        Student s3 = new Student("Duc Lap","c621h1_03","1/3/1994","C6");

        Library library = new Library();
        library.addBook(b1);
        library.addBook(b2);

        try {
            library.addStudent(s1);
            library.addStudent(s2);
            library.addStudent(s3);
        } catch (SameMSVException e) {
            System.out.println(e.getMessage());//Show error: handle exception
        }
        library.addNewLoan(0, 0);
        library.displayLoan(0);
        library.displayALLStudents();
    }
}
