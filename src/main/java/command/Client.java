package command;

/**
 * @Author luoch
 * @Date 2018-08-14 10:19
 * @Desc
 */
public class Client {
    public static void main(String[] args) {
        Reciver reciver = new Reciver();
        Command command = new ConcreteCommand(reciver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
