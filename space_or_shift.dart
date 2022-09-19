/*

Question (Codewars)

Some new cashiers started to work at your restaurant.

They are good at taking orders, but they don't know how to capitalize words, or use a space bar!

All the orders they create look something like this:

"milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"

The kitchen staff are threatening to quit, because of how difficult it is to read the orders.

Their preference is to get the orders as a nice clean string with spaces and capitals like so:

"Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke"

The kitchen staff expect the items to be in the same order as they appear in the menu.

The menu items are fairly simple, there is no overlap in the names of the items:


*/




String getOrder(String input) {
  
  List menu=['burger', "fries", "chicken", "pizza" , 
             "sandwich", "onionrings", 
             "milkshake" ,"coke"];
  List items=[];
  
   String word = '';
  String out='';
  for(int i=0;i<input.length;i++){
     word+=input[i];
   
   
    if(menu.contains(word)){
  
    out+='$word ';
      items.add(word);

     
      
      word='';
      
    }
    
   
    
  }
  

  
  
  Map sortt={
    1:"Burger",
    2:"Fries",
    3:"Chicken",
    4:"Pizza",
    5:"Sandwich",
    6:"Onionrings",
    7:"Milkshake",
    8:"Coke",
    
  };
  
  String s='';
  for(int i=0;i<8;i++){
    
    for(int j=0;j<items.length;j++){
     if(sortt[i+1].toString().toLowerCase()==items[j].toString().toLowerCase()){
       
       s+='${items[j].toString()[0].toUpperCase()+items[j].toString().substring(1)} ';
      
       
     } 
      
    }    
    
  }
  

 
   return s.trim();
  
}