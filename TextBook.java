public class TextBook extends Book implements BookOperations{
    private String subject;

    public TextBook(String title, String Author, int year, String subject){
        super(title, Author, year);
        this.subject = subject;
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
            System.out.println(getClass().getName()+" : "+getTitle()+" is not borrowed.");     
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject\t\t: "+getSubject());
        System.err.println(" ");
    }
}
