public class Main {
    public static void main(String[] args){

        Shelf shelf1 = new Shelf(3000, Form.POETRY);
        Shelf shelf2 = new Shelf(3000, Form.DRAMA);
        Shelf shelf3 = new Shelf(15000, Form.PROSE);

        Books book1 = new Books(Form.DRAMA, 200, "blue");
        Books book2 = new Books(Form.POETRY, 555, "yellow");
        Books book3 = new Books(Form.PROSE, 658, "pink");

        
        System.out.println(book1.getForm()); //teistele ka

        System.out.println(shelf1.getWidth());
        shelf1.addBook(book1);
        System.out.println(shelf1.getWidth());
        System.out.println(shelf1.getShelf());
    }
    
}
