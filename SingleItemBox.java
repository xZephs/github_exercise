/**
 * This class presents a box that can contain a single item.
 * @param <T> this decribes a type parameter
 * @author Minh Phan
 * @version 1.17
 */
public class SingleItemBox<T> {
    /**
     *item: the item.
     */
    private T item;

    /**
     * This constructor places an item into the box.
     * @param item the item
     */
    public SingleItemBox(T item){
        this.item = item;
    }

    /**
     * This method get the item from the box without removing it.
     * @return the item
     */
    public T getItem(){
        return this.item;
    }
}
