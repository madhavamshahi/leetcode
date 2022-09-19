/*
Question


Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.

Your task is to write a function maskify, which changes all but the last four characters into '#'.

Examples
"4556364607935616" --> "############5616"
     "64607935616" -->      "#######5616"
               "1" -->                "1"
                "" -->                 ""

// "What was the name of your first pet?"

"Skippy" --> "##ippy"

"Nananananananananananananananana Batman!"
-->
"####################################man!"


*/




public class Maskify {
    public static String maskify(String str) {
      
      if(str.length()==1){
        return str;
      }
      if(str=="")
        return "";
      String h="";
      for(int i=0;i<str.length();i++){
        if(i<=str.length()-5){
          
          h+="#";
        }else{
          h+=str.charAt(i);
        }
      }
      
       
      return h;