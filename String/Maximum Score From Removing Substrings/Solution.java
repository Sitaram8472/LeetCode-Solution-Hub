public class Solution {
  public int maximumGain(String s, int x, int y) {

    if (x > y) {
      return getmax(s, x, "ab", y, "ba");
    } else {
      return getmax(s, y, "ba", x, "ab");
    }

  }

  private int getmax(String s, int x, String first, int y, String second) {
    int score = 0;
    StringBuilder sb = new StringBuilder();

    for (char ch : s.toCharArray()) {
      sb.append(ch);
      int n = sb.length();
      if (n >= 2 && sb.substring(n - 2, n).equals(first)) {
        sb.delete(sb.length() - 2, sb.length());
        score += x;
      }
    }

    StringBuilder sb2 = new StringBuilder();

    for (char ch : sb.toString().toCharArray()) {
      sb2.append(ch);
      int n = sb2.length();
      if (n >= 2 && sb2.substring(n - 2, n).equals(second)) {
        sb2.delete(sb2.length() - 2, sb2.length());
        score += y;
      }
    }

    return score;

  }

}
