package Composite;

/**
 * @Author luoch
 * @Date 2018-08-09 10:53
 * @Desc 组合模式叶子构件
 */
public class Leaf extends Component{
    public void add(Component c) {
        System.out.println("Leaf 无法 add");
    }

    public void remove(Component c) {
        System.out.println("Leaf 无法 remove");
    }

    public Component getChild(int i) {
        System.out.println("Leaf 无法 getChild");
        return null;
    }

    public void operation() {
        System.out.println("Leaf operation");
    }
}
