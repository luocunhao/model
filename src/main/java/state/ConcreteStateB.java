package state;

/**
 * @Author luoch
 * @Date 2018-08-15 15:47
 * @Desc
 */
public class ConcreteStateB implements  State {
    public void handler(String sampleParam) {
        System.out.println("ConcreteStateB handler" + sampleParam);
    }
}
