/*
 * The program generates and stores the next term from the lookAndSay sequence
 * The next term on this sequence is obtained by reading out loud the last term 
 * and by grouping the repeating digits
 * eg:  1,      one one; 
 *      11,     two ones;
 *      21,     one two and one one;
 *      1211,   one one one two and two ones
 *      111221, three ones two twos and one one
 */

package lookandsay;

import java.util.Vector;

public class LookAndSay {
    //Define number of iterations for the sequence
    static final int N = 5;

    public static void main(String[] args) {
        //Instantiate sequence class
        Sequence sq1 = new Sequence();
        
        //Create string variables initial term, auxiliary and nth term
        String a1 = "1";
        String aux;
        String an = a1;
        
        //Use a loop to iterate the sequence
        for(int i=0; i<N; i++) {
            //Calculate nth term from previous term
            aux = sq1.nextTerm(an);
            
            an = aux;
            
            //Print nth term
            System.out.println(an);
        }
    }
    
}

