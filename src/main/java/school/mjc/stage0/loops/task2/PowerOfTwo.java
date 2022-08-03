package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int base = 2;
        int result = 1;
        int i = 1;

        if(power>=0) {
            System.out.println(i);
            while (i <= power) {
                result *= base;
                System.out.println(result);
                i++;
            }
        }else{
            System.out.println("too much power");
        }
    }
}
