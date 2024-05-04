public class Main {
    public static void main(String[] args) {
        System.out.println("---- Book Information ----");
        
        TextBook Book1 = new TextBook("Analysis of Genes and Genomes", "Richard Reece", 2006, "Biology");
        Book1.displayInfo();
        
        Novel Book2 = new Novel("Frankenstein", "Mary Shelley", 1818, "Sci-fi, Horror");
        Book2.displayInfo();
        
        Magazine Book3  = new Magazine("The New Yorker", "Harold W. Ross", 1925, "Politics");
        Book3.displayInfo();
        
        System.out.println("---- Borrowing and Returning Books ----");
        Book1.borrowBook();
        Book3.borrowBook();
        Book1.returnBook();
        Book2.returnBook();
        
        System.out.println("\n---- Book Information ----");
        Book1.displayInfo();
        Book2.displayInfo();
        Book3.displayInfo();
    }
}
