public class book {
    private String Author;
    private float Price;
    private String Title;
    private float ISBN;

    public book(String Author, float Price, String Title, float ISBN) {
        this.Author = Author;
        this.Price = Price;
        this.Title = Title;
        this.ISBN = ISBN;

    }

    public String getAuthor() {
        return Author;
    }

    public float getPrice() {
        return Price;
    }

    public String gettitle() {
        return Title;
    }

    public float getISBN() {
        return ISBN;

    }

    public void setAuthor(String Author) {
        this.Author = Author;

    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setISBN(float ISBN) {
        this.ISBN = ISBN;
    }

    public void print() {
        System.err.println("The name of the author is as :" + Author);
        System.out.println("The Title of the book is as: " + Title);
        System.err.println("The ISBN of book is as :" + ISBN);
        System.err.println("The Price of the Book is as :" + Price);
    }

    public static void main(String[] args) {
        book obj1 = new book("Ekrash Zahid", 120, "heroes", 210);
        obj1.print();
    }

}
