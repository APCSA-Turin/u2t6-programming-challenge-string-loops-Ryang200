package com.example.project;

public class StringLoops {

   public StringLoops() { }

   //WARM UP 
    // using a for loop remove all 'a' characters from input string
   public String removeA(String str) {
    String newStr = "";
    for (int i=0; i<str.length(); i++){
        char current = str.charAt(i);
        if (current != 'a') {
            newStr += current;
        }
    }
       return newStr;
   }


   // WARM UP
   // using a while loop remove all 'a' characters from input string
   public String removeA2(String str) {
    int i = 0;
    String newStr = "";
    while (i < str.length()) {
        char currentChar = str.charAt(i);
        if (currentChar != 'a') {
            newStr += currentChar;
        }
        i++;
    }
       return newStr;
   }


   //WARM UP 
   //Reverse a string by counting down from the end to the start
   public String reverseString(String str) {
    String reversed = "";
    for (int i = str.length() -1; i>=0; i--){
        char letter = str.charAt(i);
        reversed += letter;
    }
       return reversed;
   }


   //WARM UP
   //Reverse a string by counting up from the start to the end
   public String reverseString2(String str) {
    String reversed = "";
    for (int i = 0; i < str.length(); i++) {
        char letter = str.charAt(i);
        reversed = letter + reversed; // Prepend the character to the reversed string
    }
        return reversed;
    }


   // using a for loop
   public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
    return origStr.replace(searchChar, replaceChar);
   }

   // using a while loop
   public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
       return origStr.replace(searchChar, replaceChar);
   }

   public int countString(String searchString, String origString) {
    int count = 0;
    int lastIndex = 0;
    while ((lastIndex = origString.indexOf(searchString, lastIndex)) != -1) {
        count++;
        lastIndex += 1; 
    }
    return count;
   }

   public String removeString(String searchString, String origString) {
    String newStr = origString;
    for (int i =0; i<origString.length(); i++){
        newStr = newStr.replaceAll(searchString, "");
    }
       return newStr;
   }


   public void commaSeparated(int fromNum, int toNum) { //the tests will compare your printed output (not a returned string)
    String comma ="";
    if (fromNum > toNum){
        for (int i = fromNum; i >= toNum; i--) { 
            comma += i + ", ";
        }
    } else {
        for (int i =fromNum; i<=toNum; i++){
            comma += i + ", ";
        }
    }
       System.out.println(comma.substring(0,comma.length()-2));
   }



   public boolean isPalindrome(String myString) {
    String noSpaces = removeSpaces(myString);
    String reversedNoSpaces = reverseString(noSpaces);

    if ( noSpaces.equals(reversedNoSpaces) ) {
        return true;
    } else {
        return false;
    }
   }

    public String removeSpaces(String str) {
    String newString = "";
        for (int i=0; i<str.length(); i++) {
            char letter = str.charAt(i);
            if ( letter != ' ' ) {
                    newString += String.valueOf(letter);
            }
        }
    return newString;
    }

   public void multiPrint(String toPrint, int num) { //the tests will compare your printed output (not a returned string)
    if (num<=0) {
        System.out.println("[]");
        return;
    }
    String toPrints = "";
    for (int i = 0; i<num; i++){
        toPrints += toPrint + " ";
    }
       System.out.println("[" + toPrints.substring(0, toPrints.length()-1) + "]");
   }
}
