package flyweight;

/**
 * @Author luoch
 * @Date 2018-08-09 16:52
 * @Desc 享元模式
 */
public class Client {
    public static void main(String args[]) {
        FlyweightFactory factory = new FlyweightFactory();
        Flywight fly = factory.factory(new Character('a'));
        fly.operation("first call");
        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");
        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");

    }
}
