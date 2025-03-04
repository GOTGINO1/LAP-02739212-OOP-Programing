abstract class Book {
    protected String titleName;
    protected String author;

    public Book(String title) {
        this.titleName = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitleName() {
        return titleName;
    }

    public String getAuthor() {
        return author;
    }

    public abstract double discountAmount();

    public abstract void displayInfo();
}