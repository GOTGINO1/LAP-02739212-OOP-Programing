class Cartoon extends Book {
    public int volumeNo;
    public double price;

    public Cartoon(String name, int volume) {
        super(name);
        this.volumeNo = volume;
    }

    public int getVolumeNo() {
        return volumeNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double discountAmount() {
        return price * 0.10;  // ส่วนลด 10%
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + titleName + " Volume: " + volumeNo);
        System.out.println("Price: " + price + " Baht");
        System.out.println("Discount: " + discountAmount() + " Baht");
        System.out.println();
    }
}