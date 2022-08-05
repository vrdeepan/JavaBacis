public class Typecasting {
    public static void main(String[] args) {
        //Widening casting
        int myint1 = 10;
        System.out.println(myint1); //Automatic casting: int to double
        double myDouble1 = myint1;
        System.out.println(myDouble1);
        //Narrow Casting
        double mydouble2 = 12.78d;
        System.out.println(mydouble2);
        int myint2 = (int) mydouble2; // Manual casting: double to int
        System.out.println(myint2);
    }    
}
