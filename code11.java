
/*import java.util.*;
class code11
{
public static void main(String[] args)
{
// Getting MIME encoder
Scanner sc=new Scanner(System.in);
//creating encoder object of class base64.Encoder using method getMimeEncoder 
Base64.Encoder encoder = Base64.getMimeEncoder();
String message = sc.next(); //input string 
String eStr = encoder.encodeToString(message.getBytes()); //conversion
System.out.println(eStr); //output
}
}
*/
//mime code
import java.util.*;
class code11{
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        String message = sc.next();
        Base64.Encoder encoder= Base64.getMimeEncoder();
        String estr= encoder.encodeToString(message.getBytes());
        System.out.println(estr);
    }
}
