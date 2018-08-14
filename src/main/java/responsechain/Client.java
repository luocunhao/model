package responsechain;

/**
 * @Author luoch
 * @Date 2018-08-14 09:41
 * @Desc
 */
public class Client {
    public static void main(String args[]){
        Handler handler1 = new Handler("handler1");
        Handler handler2 = new Handler("handler2");
        Handler handler3 = new Handler("handler3");
        handler1.setAbstractHandler(handler3);
        handler1.setAbstractHandler(handler2);
        handler1.handler("handlerObj");
    }
}
