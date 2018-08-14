package iterator;

/**
 * @Author luoch
 * @Date 2018-08-14 15:32
 * @Desc
 */
public class ConcreteAggregate extends Aggregate {
    private Object[] objArray = null;
    public ConcreteAggregate(Object[] objArray){
        this.objArray = objArray;
    }
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    public Object getElement(int index){

        if(index < objArray.length){
            return objArray[index];
        }else{
            return null;
        }
    }
    public int size(){
        return objArray.length;
    }

}
