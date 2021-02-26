import java.util.HashSet;
import java.util.Iterator;

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
        if (getWidth() >= book.getPages() && getForm() == book.getForm()){
            int prev = shelf.size();
            shelf.add(book);   
            if (shelf.size() > prev ) {
                setWidth(width - book.pages);
                
            }
        }
        
    }
    
    public void removeBook(Books book){
        int prev = shelf.size();
        shelf.remove(book);
        if(prev > shelf.size()){
            setWidth(width + book.pages);
        }
    }
    public void showColor(){
        for (Books book: shelf){
            System.out.println(book.getColor());
        }
    }

    public int getWidth() {
        return width;
    }
    public HashSet<Books> getShelf() {
        return shelf;
    }
    public Form getForm(){
        return form;
    }
    
}
