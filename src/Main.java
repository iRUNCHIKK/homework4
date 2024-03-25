public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Task 1");
        int agePeople = 11;
        if (agePeople >= 18) {
            System.out.println("Если возраст человека равен " + agePeople + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + agePeople + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //task2
        System.out.println("Task 2");
        int temperature = -8;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //task3
        System.out.println("Task 3");
        int speed = 45;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }

        //task4
        System.out.println("Task 4");
        int age = 18;
        if (age <= 6 && age >= 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в садик");
        }
        if (age <= 17 && age >= 7) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age <= 24 && age >= 18) {
            System.out.println("Если возраст человека равен " + age+ ", то ему нужно ходить в университет");
        }
        if (agePeople > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        //task5
        System.out.println("Task 5");
        int ageBaby = 6;
        if (ageBaby < 5) {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему нельзя кататься на аттракционе");
        }
        if (ageBaby >= 5 && ageBaby < 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageBaby >= 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //task6
        System.out.println("Task 6");
        int carriageCapacity = 102;
        int seatsNumber = 60;
        int remainingSpace = carriageCapacity - seatsNumber;

        int peopleNumber = 98;
        if (peopleNumber > carriageCapacity){
            System.out.println("Если количество человек равно " + peopleNumber + ", то в вагоне не осталось свободных мест");
        }
        else {
            if (peopleNumber <= seatsNumber){
                System.out.println("Если количество человек равно " + peopleNumber + ", то в вагоне остались свободные сидячие места");
            }
            else {
                System.out.println("Если количество человек равно " + peopleNumber + ", то в вагоне остались свободные стоячие места");
            }
        }

        //task7
        System.out.println("Task 7");
        int one = -10;
        int two = 1908;
        int three = 0;

        if (one > two && one > three){
            System.out.println("Число " + one + " наибольшее");
        }
        else{
            if (two > three){
                System.out.println("Число " + two + " наибольшее");
            }
            else{
                System.out.println("Число " + three + " наибольшее");
            }
        }
    }
}