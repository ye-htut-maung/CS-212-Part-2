package lab23;


public class Palindrome {


   public static void main(String[] args) {
      System.out.println(isPalindrome("noon"));
      System.out.println(isPalindrome("Madam I'm Adam"));
      System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
      System.out.println(isPalindrome("A Toyota"));
      System.out.println(isPalindrome("Not a palindrome"));
      System.out.println(isPalindrome("asdfghfdsa"));
   }

   public static boolean isPalindrome(String in) {
      if (in == null) {
         return false;
      }
      return isPalindromeHelper(in.toUpperCase());
   }

   private static boolean isPalindromeHelper(String in) {
      // Fill me in
      if (in.length() == 1 || in.length() == 0 || in == null) {
         return true;
      } 
      
      int first = 0;
      int last = in.length() - 1;
      
      char firstChar = in.charAt(first);
      char lastChar = in.charAt(last);
      
      if (!Character.isLetter(firstChar)) return isPalindromeHelper(in.substring(first + 1, last +1));
      if (!Character.isLetter(lastChar)) return isPalindromeHelper(in.substring(first, last));
      if (firstChar == lastChar) return isPalindromeHelper(in.substring(first + 1, last));
      
      return false;
      



   }
}
