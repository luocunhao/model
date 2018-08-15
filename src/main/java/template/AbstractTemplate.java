package template;

/**
 * @Author luoch
 * @Date 2018-08-15 16:29
 * @Desc 抽象模板角色类 类比 HttpServlet
 */
public abstract class AbstractTemplate {
    //模板方法
    public void templateMethod(){
        abstractMethod();
        hookMethod();
        concreteMethod();
    }
    //基本方法声明(由子类实现)
    protected abstract void abstractMethod();
    //基本方法(doGet doPost) 钩子方法 子类可选择的覆盖
    protected void hookMethod(){

    }
    //基本方法 子类不可更改
    private final void concreteMethod(){

    }
}
