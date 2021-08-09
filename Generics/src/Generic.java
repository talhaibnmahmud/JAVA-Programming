class Generic<T> {
    private T obj;

    Generic(T obj) {
        this.obj = obj;
    }

    T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type of T is: "+ obj.getClass().getName());
    }
}

class GenericClassTest {
    public static void main(String[] args) {
        Generic<Integer> iObj;

        iObj = new Generic<>(88);

        iObj.showType();
        int v = iObj.getObj();

        System.out.println("Value: "+ v);

        Generic<String> strObj = new Generic<>("This is a Generics Test");
        strObj.showType();

        String str = strObj.getObj();

        System.out.println("Value: "+ str);
    }
}