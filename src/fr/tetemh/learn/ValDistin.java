package fr.tetemh.learn;

public class ValDistin {
    public static void main(String[] args) {
        int val1 = (int) (Math.random() * 2);
        int val2 = (int) (Math.random() * 2);

        if(val1 == val2){
            System.out.println("2 foix les meme");
        }else{
            System.out.println("pas les meme");
        }
        System.out.println(val1 + " / " + val2);
    }
}
