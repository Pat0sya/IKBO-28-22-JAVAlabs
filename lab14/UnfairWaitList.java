package mirea.javalabs.lab14;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        if (content.remove(element)) {
            super.add(element);
        }
    }
}
