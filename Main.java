import java.util.*;


class Main {
  public static void main(String[] args) {

    char [] arr1 = {'a','b','p','x'};
    char [] arr2 = {'z','q','r','z'};

    Main mn = new Main();
    boolean isPresent = mn.isCommonitemPresent(arr1, arr2);
    System.out.println(isPresent);
  }

  boolean isCommonitemPresent(char[] arr1, char[] arr2) {
    HashSet<Character> hs = gethashSet(arr1);

    for(char c : arr2) {
      if(hs.contains(c)) {
        return true;
      }
    }
    return false;
  }

  private HashSet<Character> gethashSet(char[] arr1) {
    HashSet<Character> hs = new HashSet<Character>();
    for(char c : arr1) {
      hs.add(c);
    }
    return hs;
  }

}