import java.util.HashSet;

//shelf - muutuja, Shelf - klass

public class Shelf {
    HashSet<Books> shelf; 
    int width;
    Form form;
    
    public Shelf(int width, Form form){ //constructor
        shelf = new HashSet<>();
        this.width = width;
        this.form = form; 
    }

    public void setWidth(int newWidth){ //muudab väärtust
        this.width = newWidth;
    }
    
    public void addBook(Books book ){
        int prev = shelf.size();
        shelf.add(book);     
        if (shelf.size() > prev ){
            setWidth(width - book.pages);
        }
        
    }
    public int getWidth() {
        return width;
    }
    public HashSet<Books> getShelf() {
        return shelf;
    }
}
