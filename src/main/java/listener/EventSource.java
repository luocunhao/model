package listener;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Author luoch
 * @Date 2018-08-15 15:06
 * @Desc 监听器模式 事件源对象
 */
public class EventSource {
    private Vector v = new Vector();
    public void addLitener(Listener l){
        v.addElement(l);
    }
    public void notifyListener(){
      Enumeration e = v.elements();
      while (e.hasMoreElements()){
          Listener l1 = (Listener) e.nextElement();
          l1.handlerEvent(new Event(this));
      }
    }
}
