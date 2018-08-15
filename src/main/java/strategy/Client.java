package strategy;

/**
 * @Author luoch
 * @Date 2018-08-15 16:15
 * @Desc
 */
public class Client {
    public static void main(String args []){
        Strategy strategy = new StrategyA();
        Context context = new Context(strategy);
        context.operation();
    }
}
