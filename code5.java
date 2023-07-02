//Swap the values in the LinkedList <String>
//Get Ten Strings from the user and put them in a LinkedList<String> object,
// and swap the position second string with fifth string.

import java.util.*;
public class code5 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        LinkedList<String>list= new LinkedList<String>();
        for(int i=0;i<10;i++){
            list.add(sc.next());
        }
        Collections.swap(list,1,4);
        for(String str: list){
            System.out.println(str);
        }
    }
}
