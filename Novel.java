public class Novel extends Book implements BookOperations{
    private String genre;

    public Novel(String title, String author, int year, String genre){
        super(title, author, year);
        this.genre = genre;
    }

    @Override
    public void borrowBook(){
        setBorrowed(true);
        System.out.println(getClass().getName()+" : "+getTitle()+" borrowed successfully.");
    }
    
    @Override
    public void returnBook(){
        if (isBorrowed()==true) {
            setBorrowed(false);
            System.out.println(getClass().getName()+" : "+getTitle()+" returned succesfully.");
        }else {
            setBorrowed(false);
            System.out.println(getClass().getName()+"\t : "+getTitle()+" is not borrowed.");     
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre\t\t: "+getGenre());
        System.err.println(" ");
    }
}
