public class TestBooks {
    public static void main(String[] args) {

        Newspaper news1 = new Newspaper("News-1", "29 มกราคม 2568");
        news1.setAuthor("NewsOne Company");
        news1.setPrice(15);
        news1.setPages(10);

        Newspaper news2 = new Newspaper("KU News", "30 มกราคม 2568");
        news2.setAuthor("KU Printing");
        news2.setPrice(10);
        news2.setPages(8);


        Cartoon cartoon1 = new Cartoon("Ninja Robot", 5);
        cartoon1.setAuthor("IT Company");
        cartoon1.setPrice(25);


        System.out.println("=== Newspaper Information ===");
        news1.displayInfo();
        news2.displayInfo();

        System.out.println("=== Cartoon Information ===");
        cartoon1.displayInfo();
    }
}