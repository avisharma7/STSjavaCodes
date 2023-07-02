import java.util.*;
 class myclass{
    Queue<Character> queue;
    Stack<Character>stack;
    myclass(){
        this.queue= new LinkedList<Character>();
        this.stack= new Stack<Character>();
    }
    
    void pushCharacter(char ch){
        this.stack.push(ch);
    }

    void enqueueCharacter(char ch){
        this.queue.add(ch);
    }

    char popCharacter(){
        return this.stack.pop();
    }
    char dequeueCharacter(){
        return this.queue.remove();
    }
}
public class palindrome {
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        String str= sc.next();

        //str to charArray
        char [] s= str.toCharArray();

        myclass p = new myclass();

        //pushing 
        
        for(char ch:s){
            p.pushCharacter(ch);
            p.enqueueCharacter(ch);
        }

        //popping or dequeue

       boolean ispalindrome= true;
       for(int i=0;i<s.length/2;i++){
        if(p.popCharacter()!= p.dequeueCharacter()){
            ispalindrome= false;
        }

       }
       if(ispalindrome){
        System.out.println("palindrome");
       }
       else{
        System.out.println("not palindrome");
       }

    }
}
