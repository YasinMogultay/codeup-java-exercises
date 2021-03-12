import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3]; //Create an array that holds 3 Person objects
        people[0] = new Person("Yasin"); //Assign a new instance of the Person class to each element.
        people[1] = new Person("Justin");
        people[2] = new Person("Casey");


        //Iterate through the array and print out the name of each person in the array.
        for (int i = 0; i < people.length; i++){
            System.out.println(people[i].getName());
        }

        addPerson(people, new Person("Yasin"));
    }

    public static Person[] addPerson(Person[] people, Person[] person){
        Person[] newPerson = Arrays.copyOf(person, person.length + 1);
        return newPerson;
    }



}
