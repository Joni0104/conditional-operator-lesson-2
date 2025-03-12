public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такого значения нет");
        }
        int clientAndroid = 1;
        if (clientAndroid == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientAndroid == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такого значения нет");
        }

        System.out.println("Задача №2");

        int clientOSDevice = 0;
        int clientDeviceYear = 2014;
        if (clientOSDevice == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOSDevice == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите стандартную версию приложения для iOS по ссылке");
        } else if (clientOSDevice == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Андройд по ссылке");
        } else {
            System.out.println("Установите стандартную версию приложения для Андройд по ссылке");
        }

        int clientAndroidDevice = 1;
        int clientDeviceYearSecond = 2016;
        if (clientAndroidDevice == 0 && clientDeviceYearSecond < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientAndroidDevice == 0 && clientDeviceYearSecond >= 2015) {
            System.out.println("Установите стандартную версию приложения для iOS по ссылке");
        } else if (clientAndroidDevice == 1 && clientDeviceYearSecond < 2015) {
            System.out.println("Установите облегченную версию приложения для Андройд по ссылке");
        } else {
            System.out.println("Установите стандартную версию приложения для Андройд по ссылке");
        }
        System.out.println("Задача №3");

        int year = 2028;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " Является высокостным");
        } else {
            System.out.println(year + " Не является высокостным");
        }

        System.out.println("Задача №4");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней доставки " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней доставки " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней доставки " + 3);
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача №5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месядца");
        }















    }
}
