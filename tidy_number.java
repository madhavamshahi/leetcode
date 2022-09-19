/*
Question
A Tidy number is a number whose digits are in non-decreasing order.


*/



bool tidyNumber(int n) {
  int pr=0;
  int ne;
  while(n>0){
    pr=(n%10);
    if(ne!=null)
    if(ne<pr){
      return false;
    }
    ne=pr;
    n=(n/10).floor();
    }
  
  return true;
}