package flyweight;

/**
 * @Author luoch
 * @Date 2018-08-10 09:52
 * @Desc
 */
public class ConcreteFlyweight implements Flywight {
    //内蕴状态作为构造函数参数传入
    private Character intrinsicState = null;

    public ConcreteFlyweight(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void operation(String state) {
        // TODO Auto-generated method stub
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
    }
}
