package SetInterface;

import java.util.LinkedHashSet;

//Java LinkedHashSet Example: Book

class book
{
	int id;
	String bname,Author,publisher;
	int quantity;
	
	book(int id,String bname,String Author,String publisher,int quantity)
	{
		this.id=id;
		this.bname=bname;
		this.Author=Author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}
	
	
}

public class LinkedHashSetTest {

	public static void main(String[] args) 
	{
		LinkedHashSet<book> bok=new LinkedHashSet<book>();
		 
		//Adding//Creating to hash table  	
		bok.add(new book(101,"C","Denise riche","C foundation",10));
		bok.add(new book(101,"C++","bjarne stras","C++ foundation",5));
		bok.add(new book(101,"Java","James Goslin","sun sysytem",10));
		 
		//Traversing hash table 
		
		for(book b:bok)
		{
		System.out.println(b.bname+" "+b.Author+ " "+b.quantity);
		}
	}

}
