import java.util.*;
public class PigLatin{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while(n.hasNext()){
      Scanner line = new Scanner(n.nextLine());
      while(line.hasNext()){
        String s = line.next();
        String temp = "";
        temp += pigLatinBest(s);
        System.out.print(temp + " ");
      }
      System.out.println();
  }
  }

  public static String pigLatinSimple(String s){
    String t = s.toLowerCase();
    String[] vowels = new String[]{"a","e","i","o","u"};

    for(int i = 0; i < vowels.length; i++){
      if(t.substring(0,1).equals(vowels[i])){
        return t + "hay";
      }
    }

    return t.substring(1,t.length()) + t.substring(0,1) + "ay";
  }

  public static String pigLatin(String s){
    String t = s.toLowerCase();
    String[] vowels = new String[]{"a","e","i","o","u"};
    String[] diagraphs = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String two = "";
    if(s.length()>1){
      two = t.substring(0,2);
    }
    else{
      two = t.substring(0,1);
    }

    for(int i = 0; i < diagraphs.length; i++){
      if(two.equals(diagraphs[i])){
        return t.substring(2,t.length()) + two + "ay";
      }
    }
    return pigLatinSimple(t);
  }

  public static String pigLatinBest(String s){
    String t = s.toLowerCase();
    String[] alphabets = new String[]{"a","b","c","d","e","f","g","h","i",
  "j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    String[] numbers = new String[]{"0","1","2","3","4","6","7","8","9"};
    boolean punc = false;
    boolean isLetter = false;
    boolean isNumber = false;
    int count = 0;
    for(String i : alphabets){
      if(i.equals(t.substring(0,1))){
        count++;
      }
    }
    if(count==0){
      return t;
    }
    //is letter
    for(int i = 0; i < alphabets.length;i++){
      if((t.substring(s.length()-1).equals(alphabets[i]))){
        isLetter = true;
      }
    }
    //is number
    for(int i = 0; i < numbers.length; i ++){
      if(((t.substring(s.length()-1).equals(numbers[i])))){
        isNumber = true;
      }
    }
    //if not is letter and not is number then is punc
    if(isLetter==false && isNumber==false){
      punc = true;
    }
    if(punc){
      return pigLatin(t.substring(0,t.length()-1)) + t.substring(t.length()-1);
    }
    return pigLatin(t);
  }

}
