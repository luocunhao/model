package responsechain;

/**
 * @Author luoch
 * @Date 2018-08-14 09:33
 * @Desc 具体处理者
 */
public class Handler extends AbstractHandler {
    public Handler(String name) {
        super(name);
    }

    public void handler(String handlerObj) {
        AbstractHandler handler = getAbstractHandler();
        //如果有后继处理者则传给后面的 没有就自己处理
        if (handler != null) {
            handler.handler(handlerObj);
        } else {
            System.out.println(name + " success");
        }
    }
}
