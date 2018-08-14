package command;

/**
 * @Author luoch
 * @Date 2018-08-14 09:55
 * @Desc 具体命令类
 */
public class ConcreteCommand implements Command {
    private Reciver reciver;
    public ConcreteCommand(Reciver reciver){
        this.reciver = reciver;
    }
    public void excute() {
        reciver.action();
    }
}
