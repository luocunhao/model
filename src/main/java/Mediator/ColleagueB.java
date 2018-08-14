package Mediator;

/**
 * @Author luoch
 * @Date 2018-08-14 16:45
 * @Desc
 */
public class ColleagueB extends AbstractColleague {
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}
