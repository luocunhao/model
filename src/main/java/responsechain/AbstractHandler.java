package responsechain;

/**
 * @Author luoch
 * @Date 2018-08-14 09:30
 * @Desc 责任链模式 抽象处理者角色
 */
public abstract class AbstractHandler {
    protected   String name;
    protected   AbstractHandler abstractHandler;

    public AbstractHandler(String name){
        this.name = name;
    }

    public void setAbstractHandler(AbstractHandler abstractHandler) {
        this.abstractHandler = abstractHandler;
    }

    public AbstractHandler getAbstractHandler() {
        return abstractHandler;
    }
    public abstract void handler(String handlerObj);
}
