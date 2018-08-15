package state;

/**
 * @Author luoch
 * @Date 2018-08-15 15:42
 * @Desc 状态模式 环境角色类
 */
public class Context {
    State state;

    public void setState(State state) {
        this.state = state;
    }
    public void request(String sampleParam){
        state.handler(sampleParam);
    }
}
