package lookandsay;

import java.util.Vector;

public class Sequence {
    
    //Generate next term on the sequence
    public String nextTerm (String num) {
        //Right pad number
        num += "A";
        
        String result = "";
        
        int absFreq=1;
        
        //Go through number except for the last padded position
        for(int i=0; i<num.length()-1; i++){
            
            //If the next digit is different from the previous
            if(num.charAt(i) != num.charAt(i+1)) {
                //Add digit and number of repetitions
                result += (absFreq +""+ num.charAt(i));
                //Reset number of repetitions
                absFreq=1;
                
            //If the next and previous digits are the same    
            }   else    {
                //Increase the number of repetitions
                absFreq++;
            }
        }
        
        return result;
    }
}
