package Mediator;

/**
 * @Author luoch
 * @Date 2018-08-14 16:41
 * @Desc
 */
public class ColleagueA extends AbstractColleague {
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.AaffectB();
    }
}
