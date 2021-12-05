import java.util.*;

public class tryClass {
    public tryClass(){
        System.out.println("Введите наружный диаметр резьбы:");
        Scanner scanner = new Scanner(System.in);
        String D1 = scanner.next();

        System.out.println("Введите шаг резьбы:");
        String P1 = scanner.next();
        System.out.println("Выберите класс точности:");
        System.out.println("1 - 6e");
        System.out.println("2 - 6g");
        System.out.println("3 - 7e");
        System.out.println("4 - 7g");
        System.out.println("5 - 8c");
        System.out.println("6 - 8e");
        System.out.println("7 - 9c");
        int command = scanner.nextInt();
        double P = Double.parseDouble(P1.replace(",",".")); //замена запятой на точку
        double D = Double.parseDouble(D1.replace(",",".")); //замена запятой на точку
        double esC = -(125+11*P); // верхнее отклонение
        double esE = -(50+11*P); // верхнее отклонение
        double esG = -(15+11*P); // верхнее отклонение
        double class7 = 1.25; //коэффициент
        double class8 = 1.6; //коэффициент
        double class9 = 2; //коэффициент
        double Td2 = 90 * (Math.pow(P, 0.4)) * (Math.pow(D, 0.1)); //средний диаметр
        double Td3_6e = 1.25 * Td2 + Math.abs(esE); //внутренний диаметр для 6c класса
        double Td3_6g = 1.25 * Td2 + Math.abs(esG); //внутренний диаметр для 6g класса
        double Td3_7e = 1.25 * (Td2 * class7) + Math.abs(esE); //внутренний диаметр для 7e класса
        double Td3_7g = 1.25 * (Td2 * class7) + Math.abs(esG); //внутренний диаметр для 7g класса
        double Td3_8c = 1.25 * (Td2 * class8) + Math.abs(esC); //внутренний диаметр для 8c класса
        double Td3_8e = 1.25 * (Td2 * class8) + Math.abs(esE); //внутренний диаметр для 8e класса
        double Td3_9c = 1.25 * (Td2 * class9) + Math.abs(esC); //внутренний диаметр для 9c класса
        if (command == 1) {
            double Td = (Math.round((180 * Math.cbrt(Math.pow(P, 2)) - 45 / Math.sqrt(P)) / 1.6) /1000.0) * (-1); //наружный диаметр
            System.out.println("Допуск на наружный диамер резьбы Tr" + D + "x" + P + " " + D  + Td);
            System.out.println("Допуск на средний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.srediiNar(D,P)  + (esE / 1000.0) + "/" + Math.round(Td2)/1000.0*(-1));
            System.out.println("Допуск на внутренний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.vutrenniiNar(D,P) + Math.round(Td3_6e)/1000.0 * (-1));

        }else if (command == 2) {
            double Td = (Math.round((180 * Math.cbrt(Math.pow(P, 2)) - 45 / Math.sqrt(P)) / 1.6) /1000.0) * (-1); //наружный диаметр
            System.out.println("Допуск на наружный диамер резьбы Tr" + D + "x" + P + " " + D + Td);
            System.out.println("Допуск на средний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.srediiNar(D,P)  + (esG / 1000.0) + "/" + Math.round(Math.abs(esG) + Td2)/1000.0*(-1));
            System.out.println("Допуск на внутренний диаметр  резьбы Tr" + D + "x" + P + " " + Diametr.vutrenniiNar(D,P)  + Math.round(Td3_6g)/1000.0 * (-1));

        }else if (command == 3) {
            double Td = (Math.round((180 * Math.cbrt(Math.pow(P, 2)) - 45 / Math.sqrt(P)) / 1.6) /1000.0) * (-1); //наружный диаметр
            System.out.println("Допуск на наружный диамер резьбы Tr" + D + "x" + P + " " + D + Td);
            System.out.println("Допуск на средний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.srediiNar(D,P) + (esE / 1000.0) + "/" + Math.round(Math.abs(esE) + (Td2 * 1.25))/1000.0 * (-1));
            System.out.println("Допуск на внутренний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.vutrenniiNar(D,P)  + Math.round(Td3_7e)/1000.0 * (-1));

        }else if (command == 4) {
            double Td = (Math.round((180 * Math.cbrt(Math.pow(P, 2)) - 45 / Math.sqrt(P)) / 1.6) /1000.0) * (-1); //наружный диаметр
            System.out.println("Допуск на наружный диамер резьбы Tr" + D + "x" + P + " " + D  + Td);
            System.out.println("Допуск на средний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.srediiNar(D,P)  + (esG / 1000.0) + "/" + Math.round(Math.abs(esG) + (Td2 * 1.25))/1000.0 * (-1));
            System.out.println("Допуск на внутренний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.vutrenniiNar(D,P)  + Math.round(Td3_7g)/1000.0 * (-1));

        }else if (command == 5) {
            double Td = (Math.round((180 * Math.cbrt(Math.pow(P, 2)) - 45 / Math.sqrt(P)) / 1.6) /1000.0) * (-1); //наружный диаметр
            System.out.println("Допуск на наружный диамер резьбы Tr" + D + "x" + P + " " + D  + Td);
            System.out.println("Допуск на средний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.srediiNar(D,P)  + (esC / 1000.0) + "/" + Math.round(Math.abs(esC) + (Td2 * 1.6))/1000.0 * (-1));
            System.out.println("Допуск на внутренний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.vutrenniiNar(D,P)  + Math.round(Td3_8c)/1000.0 * (-1));

        }else if (command == 6){
            double Td = (Math.round((180 * Math.cbrt(Math.pow(P, 2)) - 45 / Math.sqrt(P)) / 1.6) /1000.0) * (-1); //наружный диаметр
            System.out.println("Допуск на наружный диамер резьбы Tr" + D + "x" + P + " " + D  + Td);
            System.out.println("Допуск на средний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.srediiNar(D,P)  + (esE / 1000.0) + "/" + Math.round(Math.abs(esE) + (Td2 * 1.6))/1000.0 * (-1));
            System.out.println("Допуск на внутренний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.vutrenniiNar(D,P)  + Math.round(Td3_8e)/1000.0 * (-1));

        }else if (command == 7){
            double Td = (Math.round((180 * Math.cbrt(Math.pow(P, 2)) - 45 / Math.sqrt(P)) / 1.6) /1000.0) * (-1); //наружный диаметр
            System.out.println("Допуск на наружный диамер резьбы Tr" + D + "x" + P + " " + D  + Td);
            System.out.println("Допуск на средний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.srediiNar(D,P)  + (esC / 1000.0) + "/" + Math.round(Math.abs(esC) + (Td2 * 2))/1000.0 * (-1));
            System.out.println("Допуск на внутренний диаметр резьбы Tr" + D + "x" + P + " " + Diametr.vutrenniiNar(D,P)  + Math.round(Td3_9c)/1000.0 * (-1));

        }else {
            System.out.println("Не верная цифра, попробуй еще раз.");
        }
        System.out.println("Посчитать вам измерение по сверлам?");
        System.out.println("1 - Да.");
        System.out.println("2 - Нет.");
        int command2 = scanner.nextInt();
        if (command2 == 1){
            new calculation(P,Diametr.srediiNar(D,P));


        }
    }
}
