package EveryDay;

public class Apples5187 {
    public static void main(String[] args) {
        System.out.println(minimumPerimeter(1000000000));
    }

    public static long minimumPerimeter(long neededApples) {
        if(neededApples== 0){
            return 0;
        }
        for (long i = 1;; i++) {
            if (2 * i * (i + 1) * (2 * i + 1) >= neededApples) {
                return 8 * i;
            }
        }
    }
}
