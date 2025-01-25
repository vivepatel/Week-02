package singleinheritance.librarymanagement;

// created the child class Author
class Author extends Book {
    protected String authorName;
    protected String Bio;
    //created the constructor for Author
    public Author(String tittle, int prodcutionYear,String authorName,String Bio) {
        super(tittle, prodcutionYear);
        this.authorName=authorName;
        this.Bio=Bio;

    }
    // override the displayDatails
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" The Author Name is "+ authorName +" The Bio is :" +Bio);
    }
}
