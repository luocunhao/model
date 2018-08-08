package prototype.simpleprototype;

/**
 * @Author luoch
 * @Date 2018-08-08 15:52
 * @Desc 简单模型模式
 */
public class Client {
    private Prototype prototype;
    public Client(Prototype prototype){
        this.prototype = prototype;
    }
    public Prototype operation(Prototype example){
        Prototype copyProtoType = (Prototype) prototype.clone();
        return copyProtoType;
    }
}
