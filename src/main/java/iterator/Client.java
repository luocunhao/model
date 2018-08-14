package iterator;

/**
 * @Author luoch
 * @Date 2018-08-14 15:52
 * @Desc
 */
public class Client {
    public static void main(String[] args){
        Object[] objArray = {1,2,3,4};
        Aggregate agg = new ConcreteAggregate(objArray);
        Iterator iterator = agg.createIterator();
        while(!iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
