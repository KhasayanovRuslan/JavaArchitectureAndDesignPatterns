package MVC;

public class ProductController {
    private Product model;
    private ProductView view;

    public ProductController(Product model, ProductView view) {
        this.model = model;
        this.view = view;
    }

    public void setProductId(Long id) {
        model.setId(id);
    }

    public Long getProductId() {
        return model.getId();
    }

    public void setProductTitle(String title) {
        model.setTitle(title);
    }

    public String getProductTitle() {
        return model.getTitle();
    }

    public void setProductCategory(String category) {
        model.setCategory(category);
    }

    public String getProductCategory() {
        return model.getCategory();
    }

    public void updateView() {
        view.printProductDetails(model.getId(), model.getTitle(), model.getCategory());
    }
}
