package fr.tetemh.learn;

public class Question1 {
    public static void main(String[] args) {
        int a = 1, b = 0, n = 5;
        while (a <= n)
            b += a++;
        System.out.println(a + ", " + b);
    }
}
