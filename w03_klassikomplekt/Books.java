public class Books {
    
    Form form;
    int pages;
    String color;

    public Books(Form form, int pages, String color){
        this.pages = pages;
        this.color = color;
        this.form = form;
    }

    public Form getForm(){  //get - parameetrite kättesaamiseks, teha teistele ka
        return form; 
    }
    
    public String getColor() {
        return color;
    }

    public int getPages() {
        return pages;
    }
}
