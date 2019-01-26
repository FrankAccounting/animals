package us.mattgreen;
import java.util.Scanner;
import java.util.ArrayList;

public class animalInput {
    ArrayList<Talkable> moveList = new ArrayList<Talkable>();
    Scanner keyboard = new Scanner(System.in); //ask in
    String input = keyboard.nextLine();  // what type


    String name;
    Integer age;
    Boolean good;
    Integer number;


    public void prompt(ArrayList<Talkable> moveList) {  //define a function
        System.out.println("Dog Cat or Person");
        input = keyboard.next();


        switch (input) {   //eval


            case "Dog":   //if "dog"
                System.out.println("name?");
                name = keyboard.nextLine();
                try {
                    this.name = String.format(name);
                } catch (Exception e) {
                    System.out.println("Not a string");
                }

                //this seems wrong

                System.out.println("Is the dog is good? True for good or False for bad");
                input = keyboard.next();

                String good = keyboard.nextLine();
                try {
                    this.good = Boolean.parseBoolean(good); //
                } catch (Exception e) {
                    System.out.println("Not a boolean");
                }

                addDog(moveList);
                break;


            case "Cat":  // eval input
                System.out.println("name?");
                name = keyboard.next();
                try {
                    this.name = String.format(name);

                } catch (Exception e) {
                    System.out.println("Not a string");
                }

                System.out.println("¿How many mice has this cat killed, 1,2,3,4,5." +
                        " enter an int?");
                input = keyboard.next();

                try {
                    int number = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("error not a number");
                    input = keyboard.next();
                }
                addCat(moveList);

                break;


            case "Student":  // eval input
                System.out.println("name?");
                name = keyboard.next();{
                try {
                    this.name = String.format(name);
                } catch (Exception e) {
                    System.out.println("Not a string");
                }


                System.out.println("¿Age?");
                try {
                    String age = keyboard.next();
                    this.age = Integer.parseInt(age);
                } catch (Exception e) {
                    System.out.println("Not a integer");
                }
                addStudent(moveList);
                break;
                }

        }
    }
    public void addStudent(ArrayList<Talkable> moveList) {
        name  = getName();
        age = getAge();
        moveList.add(new Student(age,name));
    }
    public void addCat(ArrayList<Talkable> moveList) {
        name  = getName();
        number = getNumber();
        moveList.add(new Cat(number,name));
    }
    public void addDog(ArrayList<Talkable> moveList) {
        name  = getName();
        good = getGood(); //I loled... getgood

        moveList.add(new Dog(good,name));
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

/*

            try
    {
        animal = keyboard.parseInt(animal);
    }
    catch(Exception notasting)
    {
        System.out.println("The following error occurred: " + e.getMessage());
    }
}
..*/
