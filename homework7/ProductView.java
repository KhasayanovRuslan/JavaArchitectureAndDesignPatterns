package MVC;

public class ProductView {
    public void printProductDetails(Long id, String title, String category) {
        System.out.println("Product details: ");
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
    }
}
