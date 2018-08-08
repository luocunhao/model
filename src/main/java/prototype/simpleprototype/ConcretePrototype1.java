package prototype.simpleprototype;

/**
 * @Author luoch
 * @Date 2018-08-08 15:47
 * @Desc 简单原型模式:具体原型角色
 */
public class ConcretePrototype1 implements Prototype {
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
