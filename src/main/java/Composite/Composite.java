package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author luoch
 * @Date 2018-08-09 10:55
 * @Desc 组合模式容器对象
 */
public class Composite extends Component{
    private List<Component> list = new ArrayList<Component>();
    public void add(Component c) {
        list.add(c);
    }

    public void remove(Component c) {
        list.remove(c);
    }

    public Component getChild(int i) {
        return list.get(i);
    }

    public void operation() {
        for(Component c:list){
            c.operation();
        }
    }
}
