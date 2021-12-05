import java.util.*;
public class Diametr {
    static double sredii(double D, double P){
        return D - (P / 2);
    }
    static double vutrennii(double D, double P){
        return D-((P / 2) + raschetVnutrennego(P))*2;
    }
    static double raschetVnutrennego(double value){
        double coeff = 0;
        if (value == 1.5)
            coeff = 0.15;
        if (value >= 2 && value <= 5)
            coeff = 0.25;
        if (value >= 6 && value <= 13)
            coeff = 0.5;
        if (value >= 14 && value <= 40)
            coeff = 1;
        return coeff;
    }

//
//    public static void main(String[] args) {
//        System.out.println("Введите диаметр резьбы");
//        Scanner scanner = new Scanner(System.in);
//        String diameter = scanner.next();
//        double D = Double.parseDouble(diameter.replace(",", "."));
//        System.out.println("Введите шаг");
//        String pinch = scanner.next();
//        double P = Double.parseDouble(pinch.replace(",", "."));
//
//        double sredniiDiametr = D - (P / 2);
//        double vnutrennii = (P / 2) + raschetVnutrennego(P);
//        System.out.println("Наружный диаметр резьбы равен " + D);
//        System.out.println("Средний диаметр резьбы равен " + sredniiDiametr);
//        System.out.println("Внутренний диаметр резьбы равен" + (D - (vnutrennii * 2)));
//    }

}


