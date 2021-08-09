public abstract class Animal {
    private int legs;
    Animal(int legs) {
        this.legs = legs;
    }

    void sleep() {
        String name = getClass().getSimpleName();
        System.out.println(name + " Sleeping ... Don't disturb!");
    }

    public abstract String getDiets();
}

class Lion extends Animal {
    Lion(int legs) {
        super(legs);
    }

    @Override
    public String getDiets() {
        return "Meat";
    }
}

class Tiger extends Animal {
    Tiger(int legs) {
        super(legs);
    }

    @Override
    public String getDiets() {
        return "Meat";
    }
}

class Deer extends Animal {
    Deer(int legs) {
        super(legs);
    }

    @Override
    public String getDiets() {
        return "Grass";
    }
}

class MiniZoo {
    private Animal[] animals;

    MiniZoo(Animal[] animals) {
        this.animals = animals;
    }

    void PutThenOnSleep() {
        for(Animal animal : animals) {
            animal.sleep();
        }
    }

    void printDietsOfAllAnimal() {
        for(Animal animal : animals) {
            String diets = animal.getDiets();
            String name = animal.getClass().getSimpleName();
            System.out.println(name + " eats " + diets + ".");
        }
    }
}

class MiniZooDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Tiger(4);
        animals[1] = new Lion(4);
        animals[2] = new Deer(4);

        MiniZoo miniZoo = new MiniZoo(animals);
        miniZoo.PutThenOnSleep();
        miniZoo.printDietsOfAllAnimal();
    }
}
