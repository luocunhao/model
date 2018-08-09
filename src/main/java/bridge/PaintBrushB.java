package bridge;

/**
 * @Author luoch
 * @Date 2018-08-09 09:43
 * @Desc B型号画笔
 */
public class PaintBrushB extends PaintBrush {
    public PaintBrushB(String name) {
        this.name = name;
    }
    void draw() {
        System.out.println(name + ":"+color.setColor());
    }
}
