package listener;

/**
 * @Author luoch
 * @Date 2018-08-15 15:17
 * @Desc
 */
public class Client {
    public static void main(String args[]) {
        EventSource eventSource = new EventSource();
        eventSource.addLitener(new Listener() {
            public void handlerEvent(Event e) {
                e.operation();
            }
        });
        eventSource.notifyListener();
    }
}
