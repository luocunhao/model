package prototype.simpleprototype;

/**
 * @Author luoch
 * @Date 2018-08-08 15:58
 * @Desc
 */
public class main {
    public static void main(String[] args){
        Prototype prototype2 = new ConcretePrototype2();
        Client client = new Client(prototype2);
        Prototype copyprototype = client.operation(prototype2);
    }
}
