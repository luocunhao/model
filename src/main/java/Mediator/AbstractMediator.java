package Mediator;

/**
 * @Author luoch
 * @Date 2018-08-14 16:38
 * @Desc 抽象中介者类
 */
public abstract class AbstractMediator {
    protected AbstractColleague A;
    protected AbstractColleague B;
    public AbstractMediator(AbstractColleague A,AbstractColleague B){
        this.A = A;
        this.B = B;
    }
    public abstract void AaffectB();
    public abstract void BaffectA();
}
