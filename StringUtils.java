// StringUtils

class StringUtils{
  String value;

  StringUtils(String value) {
    this.value = value;
  }

  static boolean containsChar(String value, char c) {
    for (int i = 0; i < value.length(); i++) {
      char ch = value.charAt(i);
      if(ch == c){
        return true;
      }
    }
    return false;
  }

  static String reverse(String value) {
    String reversedString = "";

    for (int i = value.length()-1; i >= 0 ; i--) {
      char ch = value.charAt(i);
      reversedString += ch;
    }

    return reversedString;
  }

  static String replaceAll(String value, char target, char replacer) {
    String resultantString = "";

    for (int i = 0; i < value.length(); i++) {
      char ch = value.charAt(i);
      if (ch == target) {
        resultantString += replacer;
      } else {
        resultantString += ch;
      }
    }
    
    return resultantString;
  }

}