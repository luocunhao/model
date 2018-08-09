package wrapper;

/**
 * @Author luoch
 * @Date 2018-08-09 14:54
 * @Desc 装饰角色 继承自抽象构件 被具体装饰者继承
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }

    public void sampleOperation() {
        component.sampleOperation();
    }
}
