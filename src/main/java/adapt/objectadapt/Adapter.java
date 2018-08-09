package adapt.objectadapt;

/**
 * @Author luoch
 * @Date 2018-08-08 17:53
 * @Desc 对象适配器
 */
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    public void sampleOperation2() {

    }
}
