import java.util.ArrayList;

public class Library{
    private ArrayList<Book> books;
    
    public Library(){
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book){
        this.books.add(book);        
    }

    public void removeBook(String ISBN){
        for(int i = 0; i < this.books.size(); i++){
            if(this.books.get(i).getISBN().equals(ISBN)){
                this.books.remove(i);
            }
        }
    }

    public Book[] searchBook(String title){
        ArrayList<Book> hits = new ArrayList<Book>();
        for(Book book : this.books){
            if(book.getTitle().equals(title)){
                hits.add(book);
            }
        }
        return hits.toArray(new Book[hits.size()]);
    }

    public Book[] displayBooks(){
        return this.books.toArray(new Book[this.books.size()]);
    }
}