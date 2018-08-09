package Composite;

/**
 * @Author luoch
 * @Date 2018-08-09 10:57
 * @Desc
 */
public class Client {
    public static void main(String [] args){
        Leaf leaf = new Leaf();
        Leaf2 leaf2 = new Leaf2();
        Composite composite = new Composite();
        composite.add(leaf);
        composite.add(leaf2);
        composite.operation();
    }
}
