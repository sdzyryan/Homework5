public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 1; // 0 — iOS, 1 — Android
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2020;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        else if (clientOS==1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 100;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является вискосоным.");
        }
        }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 26;
        int deliveryTime = 1;

        if (deliveryDistance > 25 && deliveryDistance <= 60) {
            deliveryTime++;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime++;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }

    }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
    }
    }
}