import java.util.*;
public class Lesson2{
    public static void main(String[]args){
        ArrayList<Integer> multiples = new ArrayList<Integer>();
        int m = 0;
        for(int i = 0; i<101; i++){
            multiples.add(m);
            m+=3;
        }
        System.out.println(multiples);

        for(int i = multiples.size()-1; i>= 0; i--){
            if((multiples.get(i)%2)==0){
                multiples.remove(i);
            }
        }
        System.out.println(multiples);
    }

}