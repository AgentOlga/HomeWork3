public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        int age = 27;
        if (age >= 18) {

            System.out.println("Если возраст человека равен 18 лет, то он совершеннолетний. ");
        }
        int age1 = 17;
        if (age1 < 18) {
            System.out.println("Если возраст человека меньше 18 лет, то он не достиг совершеннолетия. ");
        }
    }

    public static void task2() {
        int temperature = 1;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + ", нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
        public static void task3() {
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф. ");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно. " );
        }
    }
        public static void task4() {
        int age = 45;
        boolean canGotToKindergarten = age > 2 && age < 6 ;
        boolean canGotToSchool = age > 7 && age < 18 ;
        boolean canGotToUniversity = age > 18 && age < 24 ;
        boolean canGotToWork = age > 24 ;
        if (canGotToKindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить  в детский сад. ");
        }
        if (canGotToSchool) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (canGotToUniversity) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else {

            System.out.println("Если возраст человека " + age + ", то ему пора ходить на работу.");
        }

    }
        static public void task5() {
            int age= 15;
            boolean adult = true ;
                if ( age < 5 ) {
                    System.out.println("Если возраст ребенка равен " +  age + ", то ему нельзя кататься на аттракционе.");
                }
                if ( age > 5 && age < 14 && adult  ) {
                    System.out.println("Если возраст ребенка равен  " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
                } else {
                    System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
                }
    }
        static public void task6() {
        int capacityOneWagon = 100 ;
        int seatPlace = 7 ;
        int standingPlace = capacityOneWagon - seatPlace ;
        if ( seatPlace <= 60 && capacityOneWagon <= 102 ) {
            System.out.println("В вагоне " + standingPlace + " стоячих мест  и " + seatPlace + " сидячих мест.");
        } else {
            System.out.println("Вагон уже полностью забит.");
        }
    }

    static public void task7() {
        int one = 1;
        int two = 2;
        int three = 3;
        int result;
        if ( one > two ) {
            result = one;
        } else {
            result = two;
        }

        if ( result < three ) {
            result = three;
        }
        System.out.println("Наибольшее число это " +  result);
    }

}








