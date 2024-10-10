package Ex2_ModifyArguments;

import java.util.ArrayList;

public class GenericArray {

    public static <T> void printArgumentsList(ArrayList<T> arraylist){
        for(T element : arraylist){
            System.out.println(element);
        }
    }
}
