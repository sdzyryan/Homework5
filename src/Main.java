public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 0; // 0 — iOS, 1 — Android
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
}