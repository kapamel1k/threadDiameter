import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        System.out.println("Привет ヽ(・∀・)ﾉ");
        System.out.println("Я покажу Вам допуски на диамеры трапецеидальной резьбы. \nА так же смогу посчитать сверла для измерения.");
        System.out.println("Введите наружный диаметр резьбы:");
        Scanner scanner = new Scanner(System.in);
        String D1 = scanner.next();
        System.out.println("Введите шаг резьбы:");
        String P1 = scanner.next();
        System.out.println("Выберите класс точности:");
        System.out.println("1 - 6c");
        System.out.println("2 - 6g");
        System.out.println("3 - 7e");
        System.out.println("4 - 7g");
        System.out.println("5 - 8c");
        System.out.println("6 - 8e");
        System.out.println("7 - 9c");
        int command = scanner.nextInt();
        double P = Double.parseDouble(P1.replace(",",".")); //замена запятой на точку
        double D = Double.parseDouble(D1.replace(",",".")); //замена запятой на точку



    }
}
