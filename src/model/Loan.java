package model;

import java.time.LocalDate;

public class Loan {
    private int number;
    private LocalDate borrowTime = LocalDate.now();
    private LocalDate term = LocalDate.now().plusDays(1);

    private Student student = new Student();
    private Book book = new Book();

    public Loan(){

    }

    public Loan(int number,  Student student, Book book) {
        this.number = number;
        this.student = student;
        this.book = book;
    }

    public Loan(int number, LocalDate borrowTime, LocalDate term, Student student, Book book) {
        this.number = number;
        this.borrowTime = borrowTime;
        this.term = term;
        this.student = student;
        this.book = book;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getBorrowTime() {
        return this.borrowTime;
    }

    public void setBorrowTime(LocalDate borrowTime) {
        this.borrowTime = borrowTime;
    }

    public LocalDate getTerm() {
        return this.term;
    }

    public void setTerm(LocalDate term) {
        this.term = term;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "{" +
            " number='" + getNumber() + "'" +
            ", borrowTime='" + getBorrowTime() + "'" +
            ", term='" + getTerm() + "'" +
            ", student='" + student.toString()+ "'" +
            ", book='" + book.toString() + "'" +
            "}";
    }

}
