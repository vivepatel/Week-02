package singleinheritance.librarymanagement;

class Book
{
    protected String tittle;
    protected int prodcutionYear;
    // creating the constructor of Book
    public Book(String tittle, int prodcutionYear) {
        this.prodcutionYear=prodcutionYear;
        this.tittle=tittle;
    }
    // createing diplayDatails Function
    public void displayInfo()
    {
        System.out.print(" The Book Tittle is : "+tittle +" the  Production Year is:"+prodcutionYear);
    }

}
