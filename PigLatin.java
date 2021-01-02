public class PigLatin{
  public static void main(String[] args){
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("pie"));
    System.out.println(pigLatinSimple("david"));
    System.out.println(pigLatinSimple("aaron"));
  }

  public static String pigLatinSimple(String s){
    String[] vowels = new String[]{"a","e","i","o","u"};

    for(int i = 0; i < vowels.length; i++){
      if(s.substring(0,1).equals(vowels[i])){
        s+="hay";
        return s;
      }
    }

    return s.substring(1,s.length()) + s.substring(0,1) + "ay";
  }
}
