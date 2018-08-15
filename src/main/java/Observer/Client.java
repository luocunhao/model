package Observer;

/**
 * @Author luoch
 * @Date 2018-08-15 09:59
 * @Desc
 */
public class Client {
    public static void main(String [] args){
        AbstractSubject subject = new Subject();
        AbstractObserver observer = new Observer();
        subject.addObserver(observer);
        subject.notifyObserver();
    }
}
