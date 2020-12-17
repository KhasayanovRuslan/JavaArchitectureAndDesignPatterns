package MVC;

public class Demo {
    public static void main(String[] args) {
        Product model = retrieveProductFromDatabase();
        ProductView view = new ProductView();
        ProductController controller = new ProductController(model, view);

        controller.updateView();

        controller.setProductTitle("Asus");
        
        System.out.println("nAfter updating, Product details are as follows");
        controller.updateView();
    }

    public static Product retrieveProductFromDatabase() {
        Product product = new Product();
        product.setId(1L);
        product.setTitle("Lenovo");
        product.setCategory("Ноутбуки");
        return product;
    }
}
