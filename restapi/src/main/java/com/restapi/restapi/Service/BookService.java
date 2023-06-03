package com.restapi.restapi.Service;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.restapi.restapi.Entities.Book;

@Component
public class BookService {
    public static List<Book> list=new ArrayList<>();

     static{
         // list.add(new Book(2, "Python", "nitin"));
          //list.add(new Book(3, "C#", "ROhit"));
         // list.add(new Book(4, "Android", "Yashpal"));
     }
     //getAll book 
     public List<Book> getAllBooks(){
        return list;     
     }
     
     //get by id one user
     public Book getbookbyid(int id){
        Book book=null;
       try {
         book=list.stream().filter(e->e.getId()==id).findFirst().get();
       } catch (Exception e) {
                e.printStackTrace();
       }
        return book;
     }

     //To add the new record in book 
     public Book addBook(Book b){
         list.add(b);
        return b;
     }

     //delete a record
     public void deleteBook(int bId){
        list=list.stream().filter(book->book.getId()!=bId).collect(Collectors.toList());
     }

     //update the record
     public void updateBook(Book book, int bid){
            list.stream().map(b->{
               if(b.getId()==book.getId()){
                  b.setTitle(book.getTitle());
                  b.setAuthor(book.getAuthor());     
               }
               return b;
            }).collect(Collectors.toList());

       
     }

}
