package wrapper;

/**
 * @Author luoch
 * @Date 2018-08-09 14:56
 * @Desc 具体装饰角色 类比 加冰 加糖
 */
public class DecoratorA extends Decorator{
    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        decoratorAoperation();
    }
    public void decoratorAoperation(){
        System.out.println("DecoratorA sampleOperation");
    }
}
