public class StringManipulator {
  public String trimAndConcat(String str1, String str2) {
    String newString = str1.trim() + str2.trim();
    return newString;
  }

  public Integer getIndexOrNull(String str, char c) {
    Integer index = str.indexOf(c);
    if (index == -1) return null;
    return index;
  }

  public Integer getIndexOrNull(String str, String subStr) {
    Integer index = str.indexOf(subStr);
    if (index == -1) return null;
    return index;
  }

  public String concatSubstring(String str1, int int1, int int2, String str2) {
    String newString = str1.substring(int1, int2);
    return newString + str2;
  }
}