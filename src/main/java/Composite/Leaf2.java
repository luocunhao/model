package Composite;

/**
 * @Author luoch
 * @Date 2018-08-09 11:01
 * @Desc
 */
public class Leaf2 extends Component{
    public void add(Component c) {
        System.out.println("Leaf2 无法 add");
    }

    public void remove(Component c) {
        System.out.println("Leaf2 无法 remove");
    }

    public Component getChild(int i) {
        System.out.println("Leaf2 无法 getChild");
        return null;
    }

    public void operation() {
        System.out.println("Leaf2 operation");
    }
}
