package test.Iterator.demo1; 

import Iterator.demo1.Book;
import Iterator.demo1.BookShelf;
import Iterator.demo1.Iterator;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* BookShelfIterator Tester. 
* 
* @author <Authors name> 
* @since <pre>6月 11, 2022</pre> 
* @version 1.0 
*/ 
public class BookShelfIteratorTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: hasNext() 
* 
*/ 
@Test
public void testHasNext() throws Exception { 
//TODO: Test goes here...
    System.out.println("第一次用");
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("abc"));
    bookShelf.appendBook(new Book("bcd"));
    bookShelf.appendBook(new Book("cde"));
    bookShelf.appendBook(new Book("def"));

    Iterator iterator = bookShelf.iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next().toString());
    }


} 

/** 
* 
* Method: next() 
* 
*/ 
@Test
public void testNext() throws Exception { 
//TODO: Test goes here... 
} 


} 
