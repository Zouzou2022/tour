package Iterator.demo2;

public class Test {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("abc"));
        bookShelf.appendBook(new Book("bcd"));
        bookShelf.appendBook(new Book("cde"));
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        System.out.println("---------------------");
        bookShelf.appendBook(new Book("def"));
        Iterator iterator1 = bookShelf.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next().toString());
        }
    }
}