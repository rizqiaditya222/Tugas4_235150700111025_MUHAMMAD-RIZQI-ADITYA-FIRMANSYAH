public class Magazine extends Book implements BookOperations{
    private String category;

    public Magazine (String title, String author, int year, String category){
        super(title, author, year);
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category\t: "+getCategory());
        System.err.println(" ");
    }
}
