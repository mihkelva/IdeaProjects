import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        int sisend = Integer.parseInt(scanner.nextLine());
        String sisendKaks = (scanner.nextLine()).toUpperCase();

        if(sisend == 2 && sisendKaks.equals("GONSIORI")){
            System.out.println(("Aadress on Gonsiori 2").toUpperCase());
        } else if (sisendKaks.equals("GONSIORI")){
            System.out.println("Aadress on Gonsiori tänaval");
        } else if (sisend > 10 || sisend <= 5){
            System.out.println("Aadress ei ole Gonsiori tänaval ja maja number on rohkem kui 10 või väiksem kui 5");
            if(sisendKaks.equals("ESTONIA")){
                System.out.println("Aadress on Estonia tänaval");
            }
        } else if (sisendKaks.equals("LAAGNA")){
            System.out.println("Aadress on Mustamäe tänaval");
        } else if (sisendKaks.equals("TONDI")){
            System.out.println("Aadress on Tondi tänaval");
        } else if (sisendKaks.equals("TELLISKIVI")){
            System.out.println("Aadress on Telliskivi tänaval");
        } else if (sisendKaks.equals("PEETRI")){
            System.out.println("Aadress on Peetri tänaval");
        } else if (sisendKaks.equals("LIIVALAIA")){
            System.out.println("Aadress on Liivalaia tänaval");
        } else if (sisendKaks.equals("TOOMPUIESTEE")){
            System.out.println("Aadress on Pärnu maantee");
        }
        else {
            System.out.println("Aadress ei ole Gonsiori 2");
        }
    }
}
