package wrapper;

/**
 * @Author luoch
 * @Date 2018-08-09 15:24
 * @Desc
 */
public class Client {
    public static void main(String [] args){
        Decorator decorator = new DecoratorA(new DecoratorB(new ConcreteComponentA()));
        decorator.sampleOperation();
    }
}
