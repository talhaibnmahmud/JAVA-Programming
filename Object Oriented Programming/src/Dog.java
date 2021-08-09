public class Dog {
    public void getType() {
        System.out.println("Normal Dog");
    }
}

class DeshiDog extends Dog {
    @Override
    public void getType() {
        System.out.println("Deshi Dog");
    }
}

class BideshiDog extends Dog {
    @Override
    public void getType() {
        System.out.println("Bideshi Dog");
    }

    String getName() {
        return "Poodle";
    }
}

class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new DeshiDog();
        Dog dog3 = new BideshiDog();

        dog1.getType();
        dog2.getType();
        dog3.getType();

//        BideshiDog bideshiDog = (BideshiDog) dog3;
//        System.out.println(bideshiDog.getName());

        System.out.println((((BideshiDog) dog3).getName()));

        if(dog3 instanceof BideshiDog) {
            BideshiDog bideshiDog = (BideshiDog) dog3;
            System.out.println(bideshiDog.getName());
        }
    }
}