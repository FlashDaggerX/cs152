/**
 * @author (Kyle Guarco)
 * @version (July 6, 2020)
 */
public class Recursion
{
    // PRECONDITION n is positive integer. Method sumTerms returns sum of terms that are
    // reciprocal values of first n integers, with  alternating signs.     
    // For example, sumTerms(7) returns  the following:  1/1 – 1/2  + 1/3 – 1/4  + 1/5 -1/6 + 1/7.
    // Terms with an odd denominator have positive sign, and terms with even denominator negative sign.   
    public double sumTermsRec(int n)
    {
        if (n <= 1)
            return 1d;
        
        double num = (n % 2 == 0) ?
                -Math.pow(n, -1) :
                Math.pow(n, -1);
        
        return sumTermsRec(n - 1) + num;
    }
    
    // PRECONDITION n is non-negative integer denoting the number of occupied positions in array. 
    // Method "printsWordsRec" prints each String element in the array "words" together with its 
    // string length in the same order as they appear in the array.
    public void printWordsRec(String[] words, int n)
    {
        if (n < 0)  
            return;
        
        printWordsRec(words, n - 1);
            
        String str = words[n];
        System.out.println(str + " " + str.length());
    }
    
    // PRECONDITION n is non-negative integer denoting the number of occupied positions in the
    // array "words". Method "printsWordsReverseRec" prints each String element in the array
    // words together with its length. Elements are printed in reverse order than they appear in
    // the array words.
    public void printWordsReverseRec(String[] words, int n)
    {
        if (n < 0)
            return;
        
        String str = words[n];
        System.out.println(str + " " + str.length());
        
        printWordsReverseRec(words, n - 1);
    }
}
