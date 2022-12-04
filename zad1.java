public class zad1 {
    public static boolean IsPalindrome(String napis)
    {
        String NaOdwrot = "";

        for(int i = napis.length()-1;i>=0;i--)
        {
            NaOdwrot = NaOdwrot + napis.charAt(i);
        }
        if (napis.equals(NaOdwrot))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
