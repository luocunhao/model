package bridge;

/**
 * @Author luoch
 * @Date 2018-08-09 09:44
 * @Desc 黑色
 */
public class BlackColor implements Color {
    public String setColor() {
        System.out.println("画笔设置为black");
        return "black";
    }
}
