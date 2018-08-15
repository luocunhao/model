package listener;

/**
 * @Author luoch
 * @Date 2018-08-15 14:49
 * @Desc 监听器模式 事件对象
 */
public class Event {
    Object sourece;
    public Event(Object source){
        this.sourece = source;
    }
    public void operation(){
        System.out.println("callback");
    }
}
