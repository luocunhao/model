package state;

/**
 * @Author luoch
 * @Date 2018-08-15 15:46
 * @Desc 具体状态类
 */
public class ConcreteStateA implements State {
    public void handler(String sampleParam) {
        System.out.println("ConcreteStateA handler" + sampleParam);
    }
}
