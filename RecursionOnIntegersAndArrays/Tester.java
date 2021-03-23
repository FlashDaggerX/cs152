/**
 * @author (Kyle Guarco)
 * @version (July 6, 2020)
 */
public class Tester
{
    public static void main(String[] args)
    {
        Recursion rec = new Recursion();
        
        System.out.println("Recursive sum of reciprocals (1-7): " + rec.sumTermsRec(7));
        
        String[] words = "I am doing a project for CS152".split(" ");
        
        System.out.println("\nPrinting words (and their lengths) in order: ");
        rec.printWordsRec(words, words.length - 1);
        
        System.out.println("\nThe same thing as above, but in reverse: ");
        rec.printWordsReverseRec(words, words.length - 1);
    }
}
