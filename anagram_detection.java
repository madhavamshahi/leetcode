/*

Question (Codewars)


An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).

Note: anagrams are case insensitive

Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.

Examples
"foefet" is an anagram of "toffee"

"Buckethead" is an anagram of "DeathCubeK"


*/



public class Kata {
  public static boolean isAnagram(String test, String original) {
    
    
  if(test.length()!=original.length()){
    return false;
  }
    
    test.toLowerCase();
    
    original.toLowerCase();
    
    int ar[]=new int[test.length()];
    int ar2[]=new int[test.length()];
    
    for(int i=0;i<test.length();i++){
      int c=0;
      for(int j=0;j<test.length();j++){
        if(test.charAt(i)==test.charAt(j)&&i!=j){
         c++;
        }
      }
      
      ar[i]=c;
    }
    
    
    for(int i=0;i<test.length();i++){
      int c=0;
      for(int j=0;j<test.length();j++){
        if(original.charAt(i)==original.charAt(j)&&i!=j){
         c++;
        }
      }
      ar2[i]=c;
    }
    
    for(int i=0;i<ar2.length;i++){
      int h=0;
    for(int j=0;j<ar2.length;j++){
      
      if(ar2[i]==ar[j]&&i!=j){
        h++;
      }
      
    }
      if(h==0){
        return false;
      }
      
    }
    
     return true;
    
  }
}