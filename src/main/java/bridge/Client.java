package bridge;

/**
 * @Author luoch
 * @Date 2018-08-09 09:55
 * @Desc
 */
public class Client {
    public static void main(String [] args){
        PaintBrush paintBrush = new PaintBrushA("A型号画笔");
        Color color = new RedColor();
        paintBrush.addcolor(color);
        paintBrush.draw();

        PaintBrush paintBrush1 = new PaintBrushB("B型号画笔");
        //Color color1 = new BlackColor();
        paintBrush1.addcolor(color);
        paintBrush1.draw();
    }
}
