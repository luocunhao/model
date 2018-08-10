package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author luoch
 * @Date 2018-08-10 09:56
 * @Desc
 */
public class FlyweightFactory {
    private Map<Character,Flywight> files = new HashMap<Character, Flywight>();
    public Flywight factory(Character state){
        Flywight fly = files.get(state);
        if(fly==null){
            fly = new ConcreteFlyweight(state);
            files.put(state,fly);
        }
        return  fly;
    }
}
