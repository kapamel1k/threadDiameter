import java.util.*;
public class calculation {
    public calculation(double threadPitch1 ,double averageDiameter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи угол профиля резьбы: ");
        int angle = scanner.nextInt();
//        System.out.println("Введи шаг резьбы: ");
//        String threadPitch1 = scanner.next();
//        System.out.println("Введи средний диаметр резьбы: ");
//        int averageDiameter = scanner.nextInt();

//        double threadPitch = Double.parseDouble(threadPitch1.replace(",", "."));

        double valueDrill = threadPitch1 / (2 * Math.cos((angle * Math.PI / 180) / 2));   //Поиск диаметра сверла
        String drillResult = String.format("%.3f", valueDrill);    // Формат числа с 3 знаками после запятой

        double valueSizeBdrills = (averageDiameter + 4.8637 * valueDrill - 1.866 * threadPitch1);   // Поиск размера между сверлами
        String SizeBdrills = String.format("%.3f", valueSizeBdrills);

        System.out.println("Тебе нужно сверло диаметром: " + drillResult + "мм!");
        System.out.println("Размер по сверлам равен: " + SizeBdrills + "мм!");
        System.out.println("Я сомневаюсь, что у тебя есть сверло диаметром: " + drillResult + " ¯\\_(ツ)_/¯.");
        System.out.println("Напиши мне ближайшее сверло по диаметру, которое у тебя есть, а я посчитаю!");

        String drill1 = scanner.next();
        double drill = Double.parseDouble(drill1.replace(",", "."));

        double valueDrillSize = (averageDiameter + 4.8637 * drill - 1.866 * threadPitch1);   //Размер по имеющемуся сверлу
        String drillSize = String.format("%.3f", valueDrillSize);

        System.out.println("(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧  Размер по твоим сверлам " + drill + " = " + drillSize);
    }
}