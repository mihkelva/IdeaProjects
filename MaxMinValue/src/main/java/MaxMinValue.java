public class MaxMinValue {
    // main + tab
    public static void main(String[] args) {
        // loome numbrite massiivi:
        int[] numbers = new int[] {16, -4, -10, 22, -2, 21, -6};

//        int max = numbers[0];
        int max = Integer.MIN_VALUE;

        boolean kasPaarituArvOnOlemas = false;
        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            // % on jäägi otsimiseks - numbers[i] tähendab elementi, % jäägi otsimist, arv millega jääki otsime
            // hüüumärk tähendab eitust. Sobib ka variant, kus avame sulud ja kirjutame !=
            if(numbers[i]>max && !(numbers[i] % 2 == 0)){
                max = numbers[i];
                kasPaarituArvOnOlemas = true;
            }
            position++;
        }

        if(kasPaarituArvOnOlemas){
            System.out.printf("Suurim paaritu number on %d ja selle positsioon on nr %d %n", max, position);
        } else {
            System.out.println("Paarituid arve ei ole");
        }
    }
}
