package Composite;

/**
 * @Author luoch
 * @Date 2018-08-09 10:45
 * @Desc 组合模式 抽象构件
 */
public abstract class Component {
    public abstract  void add(Component c);
    public abstract  void remove(Component c);
    public abstract  Component getChild(int i);
    public abstract  void operation();
}
