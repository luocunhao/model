package bridge;

/**
 * @Author luoch
 * @Date 2018-08-09 09:43
 * @Desc A型号画笔
 */
public class PaintBrushA extends PaintBrush {
    public PaintBrushA(String name) {
        this.name = name;
    }
    void draw() {
        System.out.println(name + ":"+color.setColor());
    }
}
