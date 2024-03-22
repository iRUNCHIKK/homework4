public class Main {
    public static void main(String[] args) {
        //task1
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }

        int age1 = 13;
        if (age1 < 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //task2
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }

        int temperature1 = 8;
        if (temperature1 >= 5) {
            System.out.println("На улице " + temperature1 + " градусов, можно идти без шапки");
        }

        //task3
        int speed = 45;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        int speed1 = 80;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф");
        }

        //task4
        int ageChildren = 6;
        if (ageChildren <= 6 && ageChildren >= 2) {
            System.out.println("Если возраст человека равен " + ageChildren + ", то ему нужно ходить в садик");
        }

        int agePupil = 15;
        if (agePupil <= 17 && agePupil >= 7) {
            System.out.println("Если возраст человека равен " + agePupil + ", то ему нужно ходить в школу");
        }

        int ageStudent = 21;
        if (ageStudent <= 24 && ageStudent >= 18) {
            System.out.println("Если возраст человека равен " + ageStudent + ", то ему нужно ходить в университет");
        }

        int agePeople = 28;
        if (agePeople > 24) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить на работу");
        }

        //task5
        int ageBaby = 2;
        if (ageBaby < 5) {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему нельзя кататься на аттракционе");
        }

        int ageBaby1 = 12;
        if (ageBaby1 >= 5 && ageBaby1 < 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby1 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }

        int ageBaby2 = 15;
        if (ageBaby2 >= 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //task6
        int carriageCapacity = 102;
        int seatsNumber = 60;
        int remainingSpace = carriageCapacity - seatsNumber;

        int peopleNumber1 = 98;
        if (peopleNumber1 > carriageCapacity){
            System.out.println("Если количество человек равно " + peopleNumber1 + ", то в вагоне не осталось свободных мест");
        }
        else {
            if (peopleNumber1 <= seatsNumber){
                System.out.println("Если количество человек равно " + peopleNumber1 + ", то в вагоне остались свободные сидячие места");
            }
            else {
                System.out.println("Если количество человек равно " + peopleNumber1 + ", то в вагоне остались свободные стоячие места");
            }
        }

        int peopleNumber2 = 40;
        if (peopleNumber2 > carriageCapacity){
            System.out.println("Если количество человек равно " + peopleNumber2 + ", то в вагоне не осталось свободных мест");
        }
        else {
            if (peopleNumber2 <= seatsNumber){
                System.out.println("Если количество человек равно " + peopleNumber2 + ", то в вагоне остались свободные сидячие места");
            }
            else {
                System.out.println("Если количество человек равно " + peopleNumber2 + ", то в вагоне остались свободные стоячие места");
            }
        }

        int peopleNumber3 = 103;
        if (peopleNumber3 > carriageCapacity){
            System.out.println("Если количество человек равно " + peopleNumber3 + ", то в вагоне не осталось свободных мест");
        }
        else {
            if (peopleNumber3 <= seatsNumber){
                System.out.println("Если количество человек равно " + peopleNumber3 + ", то в вагоне остались свободные сидячие места");
            }
            else {
                System.out.println("Если количество человек равно " + peopleNumber3 + ", то в вагоне остались свободные стоячие места");
            }
        }

        //task7
        int one = 11;
        int two = 0;
        int three = 1908;

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

        int one1 = -1;
        int two1 = 22;
        int three1 = 1;

        if (one1 > two1 && one1 > three1){
            System.out.println("Число " + one1 + " наибольшее");
        }
        else{
            if (two1 > three1){
                System.out.println("Число " + two1 + " наибольшее");
            }
            else{
                System.out.println("Число " + three1 + " наибольшее");
            }
        }

        int one2 = 627;
        int two2 = 33;
        int three2 = -900;

        if (one2 > two2 && one2 > three2){
            System.out.println("Число " + one2 + " наибольшее");
        }
        else{
            if (two2 > three2){
                System.out.println("Число " + two2 + " наибольшее");
            }
            else{
                System.out.println("Число " + three2 + " наибольшее");
            }
        }
    }
}