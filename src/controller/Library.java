package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import exception.SameMSVException;
import model.Loan;
import model.Student;
import model.Book;

public class Library {
    private ArrayList<Loan>  loans= new ArrayList<>(); 
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();


    
    public void addStudent(Student s) throws SameMSVException{
        for (Student student : students) {
            if(student.getMSV()==s.getMSV()){
                throw new SameMSVException("Same MSV Exception");
            }
        }
        s.setNumber(students.size()+1);
        students.add(s);
    }
    public void addBook(Book b) {
        
        b.setNumber(books.size()+1);
        books.add(b);
    }
    // public void addNewLoan( LocalDate l, LocalDate n, Student s, Book b){
    //     Loan loan = new Loan(loans.size(), l, n, s, b);
    //     loans.add(loan);
    // }
    public void addNewLoan(int s, int b) {
        Loan loan = new Loan(loans.size()+1,students.get(s),books.get(b));
        loans.add(loan);
    }
    public void addNewLoan( LocalDate n,int s, int b){
        Loan loan = new Loan(loans.size()+1 ,LocalDate.now() ,n ,students.get(s) ,books.get(b));
        loans.add(loan);
    }

    public String outputString(int index) {
        return "{" +
            " loans='" + index + " " + loans.get(index).toString() + "'" +
            "}";
    }

    public void displayLoan(int index) {
        System.out.println(outputString(index));
        
    }
    public void displayAllLoan(){
        for (Loan loan : loans) {
            System.out.println(loan.toString());
        }
    }
    public void displayALLStudents(){
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
