import java.lang.reflect.Type;

public class SinglyLinkedList {
    private long size;

    private Node<Type> head;
    private Node<Type> tail;

    /*public void addFirst(Type value) {
        addFirst(new Node<>(value));
    }

    public void addLast(Type value) {
        addLast(new Node<>(value));
    }*/

    private class Node<Type> {
        private Type value;
        private Node<Type> next;

        public Node(Type value) {
            this.value = value;
        }

        public Type getValue() {
            return value;
        }

        public void setValue(Type value) {
            this.value = value;
        }

        public Node<Type> getNext() {
            return next;
        }

        public void setNext(Node<Type> next) {
            this.next = next;
        }
    }
}
