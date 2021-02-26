public class Main {
    public static void main(String[] args){

        Shelf shelf1 = new Shelf(1300, Form.POETRY);
        Shelf shelf2 = new Shelf(3000, Form.DRAMA);
        Shelf shelf3 = new Shelf(15000, Form.PROSE);

        Books book1 = new Books(Form.DRAMA, 200, "blue");
        Books book2 = new Books(Form.POETRY, 555, "yellow");
        Books book3 = new Books(Form.POETRY, 658, "pink");
        Books book4 = new Books(Form.PROSE, 420, "green");
        Books book5 = new Books(Form.DRAMA, 65, "red");
        Books book6 = new Books(Form.POETRY, 350, "orange");

        
        System.out.println(book1.getForm()); //teistele ka

        System.out.println(shelf1.getWidth());
        shelf1.addBook(book1);
        shelf1.addBook(book2);
        shelf1.addBook(book3);
        System.out.println(shelf1.getWidth());
        System.out.println(shelf1.getShelf());
        shelf1.showColor();

        shelf1.removeBook(book2);
        System.out.println(shelf1.getWidth());
        System.out.println(shelf1.getShelf());
        shelf1.showColor();
        
    }
    
}
