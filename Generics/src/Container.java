public class Container<T> {
    private static final int MAX_LENGTH = 10;

    private T[] items;
    private int currentIndex = 0;

    private Container() {
        items = (T[]) new Object[MAX_LENGTH];
    }

    private void addItem(T item) {
        if(currentIndex < MAX_LENGTH) {
            items[currentIndex++] = item;
        }
        else {
            System.out.println("Container is full");
        }
    }

    T getItem(int index) {
        if(index > MAX_LENGTH) {
            throw new IllegalArgumentException("Index can not be larger than MAX");
        }
        return items[index];
    }

    private void printAll() {
        for(int i = 0; i < currentIndex; i++) {
            System.out.print(items[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Container<Integer> container = new Container<>();
        container.addItem(1);
        container.addItem(2);

        container.printAll();

        Container<String> stringContainer = new Container<>();
//        Container<Object> objectContainer = stringContainer;

        /*String string = new String();
        Object object = string;*/

        /*Object object = new Object();
        String string = object;*/
    }
}
