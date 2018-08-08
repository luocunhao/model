package bulider;

/**
 * @Author luoch
 * @Date 2018-08-08 16:54
 * @Desc
 */
public class Director {
    public Product constructProduct(ConcreteBuilder concreteBuilder){
        concreteBuilder.buildBasic();
        concreteBuilder.buildWalls();
        concreteBuilder.roofed();
        return concreteBuilder.buildProduct();
    }
}
