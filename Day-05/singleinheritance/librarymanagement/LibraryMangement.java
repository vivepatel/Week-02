package singleinheritance.librarymanagement;

// created the class LibraryMangement where we are calling the object of the above class
public class LibraryMangement {
    public static void main(String[] args) {
        // created the Constructor of Author
        Author author1= new Author("HoneyComb" ,2000," Vivek"," Its for the Class 10 Student ");
        author1.displayInfo();

    }
}