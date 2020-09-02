package Cohort3.com.Examples;

public class Sum {
    public static void main(String[] args) {


        getSum();
        System.out.printf("The sum is %d", getSum());
    }

    public static int getSum(){
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        return sum;
    }
}
