package iterator;

/**
 * @Author luoch
 * @Date 2018-08-14 15:26
 * @Desc 抽象迭代子角色类
 */
public interface Iterator {
    void first();
    void next();
    boolean isDone();
    Object currentItem();
}
