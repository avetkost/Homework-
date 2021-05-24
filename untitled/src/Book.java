public class Book {
    private String isbn,name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String isbn,String name,Author author,double price,int qty){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getISBN(){
        return isbn;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author.toString();
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public int getQty(){
        return qty;
    }
    public  void setQty(int newQty){
        this.qty = newQty;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String toString(){
        return "Book[isbn="+isbn+",name="+name+","+author.toString()+",price="+price+",qty="+qty+"]";
    }
}
