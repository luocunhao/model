package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author luoch
 * @Date 2018-08-15 09:52
 * @Desc 抽象主题角色类
 */
public abstract class AbstractSubject {
    protected List<AbstractObserver> list = new ArrayList<AbstractObserver>();
    public void addObserver(AbstractObserver ao){
        list.add(ao);
    }
    public void removeObserver(AbstractObserver ao){
        list.remove(ao);
    }
    public abstract void notifyObserver();
}
