package lab1.ch2;

public class ch2 {
    public String compute(int ac){
        String s = "";

        if(ac%3==0)
        {
            s=s.concat("Foo");
        }
        if(ac%5==0)
        {
            s=s.concat("Bar");
        }
        if(ac%7==0)
        {
            s=s.concat("Qix");
        }

        int aux = ac;

        while(aux>0)
        {
            if(aux%3==0)
                s=s.concat("Foo");
            aux=aux/10;
        }
    aux = ac;
        while(aux>0)
        {
        if(aux%10==5)
            s=s.concat("Bar");
            aux=aux/10;
        }
        while(aux>0)
        {
          if(aux%10==7)
              s.concat("Qix");
          aux=aux/10;
        }

        if(s=="")
            s=Integer.toString(ac);


        return s;




    }
}
