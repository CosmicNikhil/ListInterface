package may72024;

import java.lang.*;
import java.util.Arrays;

//Human lang:String->"ashwani"
//java : String --> class
//string is  an object that represents the sequence of char
//eg:"Genie","Ashwani"

//in java , String represents by String class which is available in java.lang package

//Note:
//String objects are immutable by default

//How to create string objects:-

/*
1)by String Literal
2)by new keyword
3)by converting char array into String
*/

/*
1)by String Literal
String literal in java is created by using double quotes
String res = "Genie";
Note:- String literal is always created in SCP(String constant pool)

in jvm there is a special area known as string constant pool made by literals(ex;"hlo","raj")

String s = "hello";
String s1 = "hello";

String s2 = "Raj";

     -----------
     | "Hlo"   | <-----------s,s1
     |  "Raj   |<----------------s2
     |_________|


             ------heap--------
             |                |
             |    scp         |
             |  |    |        |
             |  | ---|        |
             |-----------------




 */

/*
2)by new keyword
heap>scp
String s - new String("Raj");
jvm will create a two object in heap and scp

to save memory it creates one in scp & heap;
garbage collector:
*)"destroys non reference items in heap"  ------>
*)"does not destroys non reference items in scp" ----> vardaan

             ------heap--------
             |    Raj         |  <------------- s(only points to heap)
             |    scp   ^poki^|
             |  |  Raj|       |
             |  | ----|       |
             |-----------------

             ^*^ ---> wasted!!
*/

/*
3) By converting char array to String
  char[] arr = {'n','i','k','h','i','l'};

       String s = new String(arr);
       System.out.println(s);
*/


public class stringDemo {
    public static void main(String[] args) {

        String s1 = "Genie Ashwani";
         char[] arr = s1.toCharArray();
        System.out.println("to char array:"+Arrays.toString(arr));

        String s11 = "tinku";
        System.out.println("char at:"+s11.charAt(2));

        String n1  = "hello";
        String n2 = "hi";

        System.out.println(n1.compareTo(n2));
        
    }
}
