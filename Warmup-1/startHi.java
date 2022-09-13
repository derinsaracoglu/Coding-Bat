/* 
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false */

public boolean startHi(String str) {
  if(str.length() < 2){
    return false;
  }
  
  String firstTwo = str.substring(0,2);
  
  if(firstTwo.equals("hi")){
    return true;
  }else{
    return false;
  }

}
