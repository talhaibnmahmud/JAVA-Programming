import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.Collections;

public class NameSort implements Comparable<NameSort>{
    private String firstName;
    private String lastName;

    NameSort(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {return firstName;}
    String getLastName() {return lastName;}

    @Override
    public int compareTo(NameSort nameSort) {
        int len1 = this.firstName.length();
        int len2 = this.lastName.length();
        int limit = Math.min(len1, len2);
        char[] v1 = this.firstName.toCharArray();
        char[] v2 = this.lastName.toCharArray();
        int k = 0;

        while (k < limit) {
            char c1 = v1[k];
            char c2 = v2[k];

            if(c1 != c2) {
                return c1 - c2;
            }
            k++;
        }

        return len1 - len2;
    }
}

class PersonExample {
    public static void main(String[] args) {
        List<NameSort> nameSorts = new ArrayList<>();

        nameSorts.add(new NameSort("James", "Gosling"));
        nameSorts.add(new NameSort("Gavin",  "King"));
        nameSorts.add(new NameSort("Rod", "Johnson"));
        nameSorts.add(new NameSort("Craig", "Johnson"));

//        Collections.sort(nameSorts);
//        Update
        nameSorts.sort((Comparator.comparing(NameSort::getFirstName)));
//        Collections.sort(nameSorts, new LastNameComparator());

        //Anonymous Class
        /*Collections.sort(nameSorts, new Comparator<NameSort>() {
            @Override
            public int compare(NameSort o1, NameSort o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });*/

//        Lambda Expression
//        Collections.sort(nameSorts, ((o1, o2) -> o1.getLastName().compareTo(o2.getLastName())));

//        Modern version
//        nameSorts.sort((Comparator.comparing(NameSort::getLastName)));
        for(NameSort nameSort : nameSorts) {
            System.out.println(nameSort.getFirstName() + " " + nameSort.getLastName());
        }
    }
}

/*
class LastNameComparator implements Comparator<NameSort> {
    @Override
    public int compare(NameSort o1, NameSort o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}*/