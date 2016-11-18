package exercises.java.exercise5;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBook {

	@Test
	public void testFirstConstructor() {
		Author author = new Author("John","john@mail.com",'m');
		Book book = new Book("Book 21",author,12.32);
	}

	@Test
	public void testSecondConstructor() {
		Author author = new Author("John","john@mail.com",'m');
		Book book = new Book("Book 21",author,12.32,3);
	}

	@Test
	public void testGetName() {
		Author author = new Author("John","john@mail.com",'m');
		Book book = new Book("Book 21",author,12.32,3);
		assertEquals("Book 21",book.getName());
	}

	@Test
	public void testSetName() {
		Author author = new Author("John","john@mail.com",'m');
		Book book = new Book("Book 21",author,12.32,3);
		book.setName("Book 22");
		assertEquals("Book 22",book.getName());
	}

	@Test
	public void testGetAuthor() {
		Author author = new Author("John","john@mail.com",'m');
		Book book = new Book("Book 21",author,12.32,3);
		assertEquals("John",book.getAuthor().getName());
		assertEquals("john@mail.com",book.getAuthor().getEmail());
		assertEquals('m',book.getAuthor().getGender());
	}

	@Test
	public void testSetAuthor() {
		Author author = new Author("John","john@mail.com",'m');
		Book book = new Book("Book 21",author,12.32,3);
		book.setAuthor(new Author("Bob","bob@mail.com",'m'));
		assertEquals("Bob",book.getAuthor().getName());
		assertEquals("bob@mail.com",book.getAuthor().getEmail());
		assertEquals('m',book.getAuthor().getGender());
	}

	@Test
	public void testGetPrice() {
		Author author = new Author("John","john@mail.com",'m');
		Book book = new Book("Book 21",author,12.32,3);
		assertEquals(12.32,book.getPrice(),0);
	}

	@Test
	public void testSetPrice() {
		Author author = new Author("John","john@mail.com",'m');
		Book book = new Book("Book 21",author,12.32,3);
		book.setPrice(10.2);
		assertEquals(10.2,book.getPrice(),0);
	}

	@Test
	public void testGetQty() {
		Author author = new Author("John","john@mail.com",'m');
		Book book = new Book("Book 21",author,12.32,3);
		assertEquals(3,book.getQty());
	}

	@Test
	public void testSetQty() {
		Author author = new Author("John","john@mail.com",'m');
		Book book = new Book("Book 21",author,12.32,3);
		book.setQty(4);
		assertEquals(4,book.getQty());
	}

	@Test
	public void testToString() {
		Author author = new Author("John","john@mail.com",'m');
		Book book = new Book("Book 21",author,12.32,3);
		assertEquals("Book 21 by John",book.toString());
	}

}
