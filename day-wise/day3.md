## 31/01

## Day 3: Strings & Conditionals













### Conditionals 

+ Conditionals in Java are used to make decisions based on certain conditions.
+ Set actions are executed only if your set conditionals are fulfilled.
+ Conditionals in Java include:
  * if else
  * while
  * do while


###  if else

The if...else statement executes a statement if a specified condition is truth.


Syntax

if(Boolean_expression) {
   // Executes when the Boolean expression is true
}else {
   // Executes when the Boolean expression is false
}


Here's a Sample code 

```
class Loop{
    public static void main(String[] args){
             
   float grossSalary=100000;

   if (grossSalary<20000){
      System.out.println("No Tax");

   }else if(grossSalary>=20000 && grossSalary<=40000){

      System.out.println("Tax is 10%");
   }else if (grossSalary<=70000) {
      System.out.println("Tax is 20%");
   }else {
      System.out.println("Tax is 30%");
   }
      
   }
      
 }
```




 








