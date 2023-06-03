package com.restapi.restapi.Repository;

import org.springframework.data.repository.CrudRepository;

import com.restapi.restapi.Entities.Book;

public interface bookrepository extends CrudRepository<Book,Integer> {
  /*    
    private static List<bookentity> list=new ArrayList<>();
	
	
	static {
		
		list.add(new bookentity(01, "ramayan", "valmiki"));
		list.add(new bookentity(02, "abc", "xyz"));
		list.add(new bookentity(03, "ddd", "sss"));
		
	}
	
	//get all data
	
	public List<bookentity> getAllBooks(){
		return list;
	}
	
	//get  books by id
	
	public bookentity getById(int id) {
		
		bookentity book=null;
		
		try {
			book=list.stream().filter(e->e.getBookid()==id).findFirst().get();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		return book;
	}
	
	//inserting data
	public bookentity insertbook(bookentity b) {
		list.add(b);
		return b;
	}
	
	//deleting data
	public void deletebook(int bid) {
		
		list=list.stream().filter(book ->book.getBookid()!=bid).collect(Collectors.toList());
	
		
	}

	//updating data
	
	public void updatebook(bookentity book, int bid) {

		list.stream().map(b->{
			if(b.getBookid()==bid) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
		
	} */
}
