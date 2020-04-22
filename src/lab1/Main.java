package lab1;

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
       compute(100);
    }
    public static void stringExample(){
        String s="Java";
        s=s.concat(" Code");
        System.out.println(s);
    }

    private static void fuzzBuzz(int incercari){
        for(int i=1;i<=incercari;i++)
        {
            if(((i%3)==0)&&((i%5)==0))
                System.out.println("FizzBuzz");
            else if((i%3)==0)
                System.out.println("Fizz");
            else if((i%5)==0)
                System.out.println("Buzz");
            else
                System.out.println(i);

        }
    }


    private static void compute(int incercari)
    {
        for(int i=1;i<incercari;i++)
        {
            int n;
            n=10;
            int b;
            b=i;
            /*while(b!=0)
            {
                if(b%10==3)
                    System.out.print("Foo");
                b=b/n;
                n=n*10;

            }*/

                if ((i % 3) == 0)
                    System.out.println("SOTT");
                else if ((i % 5) == 0)
                    System.out.println("Bar");
                else if ((i % 7) == 0)
                    System.out.println("Qix");
                else
                    System.out.println("Foo");






         }

    }
}

