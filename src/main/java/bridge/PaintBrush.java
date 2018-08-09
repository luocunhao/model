package bridge;

/**
 * @Author luoch
 * @Date 2018-08-09 09:41
 * @Desc 桥接模式 画笔型号抽象类
 */
public abstract class PaintBrush {
    String name;
    Color color;
    public void addcolor(Color color) {
        this.color = color;
    }
    abstract void draw();
}
