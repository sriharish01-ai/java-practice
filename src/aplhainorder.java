import java.util.*;
public class aplhainorder {
    public static void main(String[] args){

        char ch='A';
        int count=0;
        while(ch<='Z'){
            System.out.print(ch);
            ch++;
            count++;
            if(count%4==0){
                System.out.println(" ");
            }

        }

    }

}
