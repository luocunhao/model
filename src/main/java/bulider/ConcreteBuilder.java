package bulider;

/**
 * @Author luoch
 * @Date 2018-08-08 16:51
 * @Desc
 */
public class ConcreteBuilder implements Builder{
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    public void buildBasic() {
        product.setBasic("打好基础");
    }

    public void buildWalls() {
        product.setWall("砌墙");
    }

    public void roofed() {
        product.setRoofed("封顶大吉");
    }

    public Product buildProduct() {
        return product;
    }
}
