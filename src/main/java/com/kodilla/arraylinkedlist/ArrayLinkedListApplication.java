package com.kodilla.arraylinkedlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class ArrayLinkedListApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArrayLinkedListApplication.class, args);

        ArrayList<Integer> gradesICT = new ArrayList<>();

        gradesICT.add(1);
        gradesICT.add(6);
        gradesICT.add(2);
        gradesICT.add(3);
        gradesICT.add(4);
        gradesICT.add(5);
        gradesICT.add(1);
        gradesICT.add(2);
        gradesICT.add(3);
        gradesICT.add(4);
        gradesICT.add(1);
        gradesICT.add(4);
        gradesICT.add(3);
        gradesICT.add(1);

        Collections.sort(gradesICT);


        double sum = 0;

        for(int i = 1; i<gradesICT.size()-1; i++){
            sum+=gradesICT.size();
        }

        double average = sum/gradesICT.size();

        System.out.println("Arithmetic average of ICT grades equals: " + average);

        Book book1 = new Book("In Search of Lost Time", 1913);
        Book book2 = new Book("Don Quixote", 1605);
        Book book3 = new Book("Ulysses", 1922);
        Book book4 = new Book("The Great Gatsby", 1925);
        Book book5 = new Book("Moby Dick", 1851);
        Book book6 = new Book("Hamlet", 1599);

        LinkedList<Book> greatestBooks = new LinkedList<>();

        greatestBooks.add(book1);
        greatestBooks.add(book2);
        greatestBooks.add(book3);
        greatestBooks.add(book4);
        greatestBooks.add(book5);
        greatestBooks.add(book6);

        for(Book book: greatestBooks){
            if (book.publishingYear<2000){
                System.out.println(book.title + " was published before 2000.");
            }
        }

    }

}
