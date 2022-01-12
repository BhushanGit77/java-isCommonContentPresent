import java.util.*;


class Main {
  public static void main(String[] args) {

    char [] arr1 = {'a','b','c','x'};
    char [] arr2 = {'p','q','r','z'};

    Main mn = new Main();
    boolean isPresent = mn.isCommonitemPresent(arr1, arr2);
    System.out.println(isPresent);
  }

  boolean isCommonitemPresent(char[] arr1, char[] arr2) {

    HashSet<Character> hs = new HashSet<Character>();
    for(char c : arr1) {
      hs.add(c);
    }

    for(char c : arr2) {
      if(hs.contains(c)) {
        return true;
      }
    }
    return false;
  }
}