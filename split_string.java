/*
Question


Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']



*/





public class StringSplit {
    public static String[] solution(String s) {
         
      if(s.length()%2!=0){
        s+="_";
      }
      String[] ss=new String[s.length()/2];
    String f="";
     int h=0;
      int c=0;
     
      for(int i=0;i<s.length();i++){
        f+=s.charAt(i);
        c++;
if(c==2){
ss[h++]=f;  
c=0;
f="";
  }  
        
      }
      System.out.print(s);
      System.out.print(ss);
      return ss;
    }
}