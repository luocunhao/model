package prototype.registeprototype;

/**
 * @Author luoch
 * @Date 2018-08-08 16:05
 * @Desc 登记形式原型模式
 */
public interface Prototype {
    Prototype clone();
    String getName();
    void setName(String name);
}
