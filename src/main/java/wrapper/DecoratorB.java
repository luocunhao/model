package wrapper;

/**
 * @Author luoch
 * @Date 2018-08-09 16:00
 * @Desc
 */
public class DecoratorB extends Decorator {
    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        decoratorBOperation();
    }
    public void decoratorBOperation(){
        System.out.println("DecoratorB sampleOperation");
    }
}
