import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Book {

    //complete
    private final String title;
    private final String author;
    private final String genre;
    private final String publisher;
    private final int amountOfPages;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public Book(String title, String author, String genre, String publisher, int amountOfPages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.amountOfPages = amountOfPages;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Fake Book","Fake Author","Fake Genre","Fake Publisher", 250);
        importCsvData("H:\\Downloads\\CSC8011_practicals_2021-main\\CSC8011_practicals_2021-main\\intermediate\\practical-2\\src\\books.csv");
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", amountOfPages=" + amountOfPages +
                '}';
    }

    public static void importCsvData(String path){
        String csvFile = path;
        String line;
        String csvSplitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            // read each line of the file
            while ((line = br.readLine()) != null) {
                // split csv data by ","
                String[] fields = line.split(csvSplitBy);
                // fill each fields
                String title = fields[0];
                String author = fields[1];
                String genre = fields[2];
                String publisher = fields[3];
                Integer amountOfPages = Integer.parseInt(fields[4]);
                // init new book entity
                Book b1 = new Book(title,author,genre,publisher, amountOfPages);
                System.out.println(b1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}