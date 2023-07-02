//printing 2nd largest number

import java.util.*;
public class a15 {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        TreeSet<Integer>ts= new TreeSet<Integer>();
        for(int i=0;i<10;i++){

            ts.add(sc.nextInt());
        }

        ArrayList<Integer> list= new ArrayList<>(ts);
        if(list.size()>1){
System.out.println(list.get(list.size()-2));
        }
        else{
            System.out.println("-1");
        }

    }
}
