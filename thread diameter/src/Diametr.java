import java.util.*;
public class Diametr {
    static double srediiNar(double D, double P){  //расчет среднего диаметра наружной резьбы
        return D - (P / 2);
    }
    static double vutrenniiNar(double D, double P){  // расчет внутреннего диаметра наружной резьбы
        return D-((P / 2) + raschetVnutrennegoNar(P))*2;
    }
    static double raschetVnutrennegoNar(double value){ // расчет коэффициента для внутреннего диаметра в зависимости от шага "ac"
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
    static double vnutrenniiVn(double D, double P){   // расчет внутреннего диаметра внутренней резьбы
        return D - P;
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


