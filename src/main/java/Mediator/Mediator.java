package Mediator;

/**
 * @Author luoch
 * @Date 2018-08-14 16:51
 * @Desc
 */
public class Mediator extends AbstractMediator {
    public Mediator(AbstractColleague A, AbstractColleague B) {
        super(A, B);
    }

    public void AaffectB() {
        int number = A.getNumber();
        B.setNumber(number*100);
    }

    public void BaffectA() {
        int number = B.getNumber();
        A.setNumber(number/100);
    }
}
