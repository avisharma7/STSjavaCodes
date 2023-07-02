//non common elements
import java.util.*;
public class noncommon {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        HashSet<Integer>a= new HashSet<Integer>();
        HashSet<Integer> b= new HashSet<Integer>();
        for(int i=0;i<5;i++){
            a.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
            b.add(sc.nextInt());
        }
        HashSet<Integer> union= new HashSet<Integer>(a);
        union.addAll(b);

        HashSet<Integer>intersection= new HashSet<>(union);
        intersection.retainAll(b);

        HashSet<Integer>result= new HashSet<>(union);
        result.removeAll(intersection);

        System.out.println(result);


    }
}
