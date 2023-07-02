//using iterator and linkedlist
import java.util.*;
public class a16 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        LinkedList<String> ll= new LinkedList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s= sc.next();
            ll.add(s);
        }
        Iterator<String>it= ll.iterator();
        while(!it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
