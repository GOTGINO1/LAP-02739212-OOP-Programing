class Newspaper extends Book {
    public int pages;
    public double price;
    public String date;

    public Newspaper(String name, String date) {
        super(name);
        this.date = date;
    }
    public String getDate() {
        return date;
    }
    public double getPrice() {
        return price;
    }
    public int getPages() {
        return pages;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    @Override
    public double discountAmount() {
        return price * 0.05;  // ส่วนลด 5%
    }
    @Override
    public void displayInfo() {
        System.out.println("For Date: " + date);
        System.out.println("Name: " + titleName);
        System.out.println("Total Pages: " + pages);
        System.out.println("Price: " + price + " Baht");
        System.out.println("Discount: " + discountAmount() + " Baht");
        System.out.println();
    }
}