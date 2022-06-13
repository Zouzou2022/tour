package Iterator.demo2;


public class BookShelfIterator implements Iterator{
    private int index = 0;
    private BookShelf bookShelf;
    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }
}
