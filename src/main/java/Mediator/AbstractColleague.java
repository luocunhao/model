package Mediator;

/**
 * @Author luoch
 * @Date 2018-08-14 16:40
 * @Desc 抽象同事类
 */
public abstract class AbstractColleague {
    protected int number;
    public int getNumber(){
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public abstract void setNumber(int number,AbstractMediator am);
}
