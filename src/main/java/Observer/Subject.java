package Observer;

/**
 * @Author luoch
 * @Date 2018-08-15 09:56
 * @Desc
 */
public class Subject extends AbstractSubject {
    public void notifyObserver() {
        for(AbstractObserver ao:list){
            ao.update();
        }
    }
}
