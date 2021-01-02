import java.util.*;

public class MakeStars{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while(n.hasNext()){
      Scanner line = new Scanner(n.nextLine());
      while(line.hasNext()){
        String s = line.next();
        String temp = "";
        for(int i = 0; i < s.length(); i ++){
          temp += "*";
        }
        System.out.print(temp + " ");
      }
      System.out.println();
    }
  }
}
