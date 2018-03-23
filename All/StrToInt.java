
public class strToInt {
	public int myAtoi(String str) { 
		int index = 0; 
		double result = 0; 
        
        if (str == null || str.length() == 0)  
            return 0; 
         
        // remove whitespaces 
        str = str.trim();                 
         
        // positive or negative check 
        boolean isNegative = false;                 
        if (str.charAt(0) == '+' || str.charAt(0) == '-') 
            index ++; 
         
        if (str.charAt(0) == '-') 
            isNegative = true; 
         
     
        for (int i = index; i < str.length(); i++) { 
            if (str.charAt(i) < '0' || str.charAt(i) > '9' ) 
                break; 
             
            int number = (int)(str.charAt(i) - '0'); 
            result = result * 10 + number; 
        } 
         
        if (isNegative)  
            result = -result; 
         
         
        // handle out of the range cases 
        if (result > Integer.MAX_VALUE) { 
            return Integer.MAX_VALUE; 
        } 
        if (result < Integer.MIN_VALUE) { 
            return Integer.MIN_VALUE; 
        } 
         
        return (int) result;         
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
