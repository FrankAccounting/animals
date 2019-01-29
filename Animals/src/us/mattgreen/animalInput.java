package us.mattgreen;
import java.util.Scanner;
import java.util.ArrayList;

public class animalInput {
    private ArrayList<Talkable> moveList = new ArrayList<Talkable>();
    private Scanner keyboard = new Scanner(System.in); //ask in
    private String name;
    private Boolean good;


    private int number = Integer.MAX_VALUE; //This value will never change
    private int age = Integer.MAX_VALUE; //This value will never change

    InputTypeVerifier valid = new InputTypeVerifier();  //this creates the object that will be called

    public void prompt(ArrayList<Talkable> moveList) {  //define a function
        System.out.println("Dog Cat or Student");
        String input = keyboard.nextLine();

        switch (input) {   //eval
            case "Dog":   //if "dog"
                System.out.println("name?");
                name = keyboard.nextLine();
                System.out.println("Is the dog is good? True for good or False for bad");
                String good = keyboard.nextLine();
                this.good = Boolean.parseBoolean(good); //
                addDog(moveList);
                break;

            case "Cat":  // create cat object code
                System.out.println("name?");    // ask for a name
                name = keyboard.nextLine(); // a name, your cat can be a number or a False if yoo want.. Im not here to judge
                System.out.println("Enter a number: "); //prompt
                number = valid.Number();   // Run the method of valid with the function of number, this returns an int. '
                addStudent(moveList);   // add name and number to an object and add it to our list, Allow that list to be passed to main
                break; //break the switch


            case "Student":  // eval input
                System.out.println("name?"); // name
                name = keyboard.nextLine();   // set
                age = valid.Age();
                addStudent(moveList);
                break;
                /**
                while (age == Integer.MAX_VALUE) {

                    /**
                    String ageString = keyboard.nextLine();
                    try {
                        age = Integer.parseInt(ageString);
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
                     **/
                }
            }




    public void addStudent(ArrayList<Talkable> moveList) {
        name = getName();
        age = getAge();
        moveList.add(new Student(age, name));
    }

    public void addCat(ArrayList<Talkable> moveList) {
        name = getName();
        number = getNumber();
        moveList.add(new Cat(number, name));
    }

    public void addDog(ArrayList<Talkable> moveList) {
        name = getName();
        good = getGood(); //I loled... getgood

        moveList.add(new Dog(good, name));
    }

    public ArrayList<Talkable> getMoveList() {
        return moveList;
    }

    public void setMoveList(ArrayList<Talkable> moveList) {
        this.moveList = moveList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGood() {
        return good;
    }

    public void setGood(Boolean good) {
        this.good = good;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}