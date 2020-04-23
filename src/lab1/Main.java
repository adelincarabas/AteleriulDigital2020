package lab1;
import lab1.ch2.ch2;
import lab1.ch3.ch3;
import lab1.ch4.ch4;

public class Main {
    private static int semester=2;
    private int instanceVar=3;
    public static void main(String[] args) {
    ControlFlow cf= new ControlFlow();
    System.out.println("result="+cf.addManyTimes());
    int nr =6;
   // cf.AutoBox(nr);
   // stringExample();
   //fuzzBuzz(100);
        ch2 c2= new ch2();
        int j;
        for(j=1;j<=100;j++)
        {
            System.out.println(c2.compute(j));
        }
        System.out.println("\n\n");

        ch3 c3=new ch3();
        int arr[]={3,2,-3,-2,3,0};
        System.out.println(c3.pairOfTwo(arr));


        ch4 c4= new ch4();
        int arr2[]={3,2,2,2,5,3};
        System.out.println(c4.pairOfThree(arr2));

    }







}

