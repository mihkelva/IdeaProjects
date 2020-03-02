package ee.mihkel;

public class Meetod3 {
    public static void main(String[] args) {
        print(10, "Tere");
        print(15, "Tervist");
        print(6, "Tervitus");
        print(5);
        print(1,"Tere hommikust", true);
        print(1);
        print(2, "Tsau", false);
    }

    // ol
    static void print(int mituKorda, String lause, boolean suuredTähed){
        for (int i = 0; i < mituKorda; i++) {
            if(suuredTähed){
                System.out.println(lause.toUpperCase());
            } else {
                System.out.println(lause);
            }
        }
    }

    static void print(int mituKorda){
        for (int i = 0; i < mituKorda; i++) {
            System.out.println();
        }
    }

    static void print(int mituKorda, String sõna){
        for (int i = 0; i < mituKorda; i++) {
            System.out.println(sõna);
        }
    }

}
