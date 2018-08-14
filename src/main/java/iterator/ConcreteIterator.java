package iterator;

/**
 * @Author luoch
 * @Date 2018-08-14 15:33
 * @Desc
 */
public class ConcreteIterator implements Iterator{
    private ConcreteAggregate agg;
    private int index = 0;
    private int size;
    public ConcreteIterator(ConcreteAggregate agg){
        this.agg = agg;
        this.size = agg.size();
    }
    public void first() {
        index = 0;
    }

    public void next() {
        if(index < size){
            index ++;
        }
    }

    public boolean isDone() {
        return (index>=size);
    }

    public Object currentItem() {
        return agg.getElement(index);
    }
}
