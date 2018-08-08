package bulider;

/**
 * @Author luoch
 * @Date 2018-08-08 16:50
 * @Desc
 */
public interface Builder {
    /**
     * 打基础
     */
    void  buildBasic();

    /**
     * 砌墙
     */
    void  buildWalls();

    /**
     * 封顶
     */
    void  roofed();

    /**
     * 造房子
     * @return
     */
    Product buildProduct();
}
