package command;

/**
 * @Author luoch
 * @Date 2018-08-14 10:02
 * @Desc 请求者角色
 */
public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command=command;
    }
    public  void action(){
        command.excute();
    }
}
