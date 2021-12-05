import java.util.Scanner;
public class threadDiameter {
    public static void main(String[] args) {
        System.out.println("Привет, это расчет резьбы по сверлам!\nЯ посчитаю тебе сверло и скажу размер!\nИ не только!.");
        while (true) {
            System.out.println("Что ты хочешь сделать:");
            System.out.println("1 - Посчитать размер по сверлам.");
            System.out.println("2 - Узнать допуски на резьбу и размер по сверлам.");
            System.out.println("0 - Выход  ( ＾▽＾)っ✂╰⋃╯");
            Scanner scanner = new Scanner(System.in);

            String command1 = scanner.next();
            double command = Double.parseDouble(command1.replace(",",".")); //замена запятой на точку
            if (command == 1) {
                System.out.println("Введи шаг резьбы: ");
                String threadPitch = scanner.next();
                System.out.println("Введи средний диаметр резьбы: ");
                String averageDiameter = scanner.next();
                double D = Double.parseDouble(averageDiameter.replace(",", "."));
                double P = Double.parseDouble(threadPitch.replace(",", "."));

                new calculation(P,D);


            } else if (command == 2) {
                new tryClass();

            } else if (command == 0) {
                System.out.println("Пока! (´• ω •) ♡");
                break;

            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}
