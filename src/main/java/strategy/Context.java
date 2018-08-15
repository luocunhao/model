package strategy;

/**
 * @Author luoch
 * @Date 2018-08-15 16:09
 * @Desc 环境角色类
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void operation(){
        strategy.operation();
    }
}
