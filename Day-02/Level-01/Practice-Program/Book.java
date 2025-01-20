public class Book {
    // declaring the Variable's Private
    private String title;
    private String author;
    private Double price;
    // constructed the default Constructor Book()
    public Book()
    {
        this.title="Reality";
        this.author="Vivek";
        this.price=500.0;
    }
    // Constructed the Parameterized Constructor Book()
    // and passing the tittle author and price
    public Book(String title,String author,double price)
    {
        this.title=title;
        this.author=author;
        this.price = price;

    }
    // created the display function

    public void Display(){
        System.out.println("The Tittle of the Book is : "+title);
        System.out.println("The Author of the Book is : "+author);
        System.out.println("The Price  of the Book is :"+price);
    }
    // made the setter and getter method for title
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getTitle(String title)
    {
        return title;
    }
    // made the setter and getter method for author
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public String getAuthor(String author)
    {
        return author;
    }
    // made the setter and getter method for price
    public void setPrice(Double price)
    {
        this.price=price;

    }
    public Double getPrice(Double price)
    {
        return price;
    }



    public static void main(String[] args) {
        System.out.println("This is Default Constructor");
        //creating the default Constructor
        Book book1= new Book();
        //calling the display method for book1 object
        book1.Display();
        System.out.println("This is Parameterized Constructor");
        //created the Parameterized Constructor
        Book book2= new Book( "Larger than  life" ,  "Satyam Kumar Mishra" , 500.0);
        // calling the display method with book2 object
        book2.Display();
    }
}