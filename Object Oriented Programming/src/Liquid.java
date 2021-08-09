public class Liquid {
    public void swirl(boolean clockwise) {
        System.out.println("Swirling Liquid");
    }
}

class Coffee extends Liquid {
    @Override
    public void swirl(boolean clockwise) {
        System.out.println("Swirling Coffee");
    }
}

class Milk extends Liquid {
    @Override
    public void swirl(boolean clockwise) {
        System.out.println("Swirling Milk");
    }
}

class CoffeeCup {
    private Liquid innerLiquid;

    void addLiquid(Liquid liquid) {
        innerLiquid = liquid;

        //Swirl counterclockwise
        innerLiquid.swirl(false);
    }
}

class MainApp {
    public static void main(String[] args) {
        // Making a cup
        CoffeeCup myCup = new CoffeeCup();

        // Liquids
        Liquid genericLiquid = new Liquid();
        Coffee coffee = new Coffee();
        Milk milk = new Milk();

        //Swirling in the cup
        myCup.addLiquid(genericLiquid);
        myCup.addLiquid(coffee);
        myCup.addLiquid(milk);
    }
}
