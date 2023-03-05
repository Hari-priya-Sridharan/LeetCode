class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()==t.length()){
        int[] sCount = new int[26];
   int[] tCount = new int[26];
    for (int i = 0; i < s.length(); i++) {
      int sIndex = s.charAt(i) - 'a';
      int tIndex = t.charAt(i) - 'a';
      sCount[sIndex]++;
      tCount[tIndex]++;
    }
    
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    for (int i = 0; i < 26; i++) {
      for (int j = 0; j < sCount[i]; j++) {
        sb1.append((char)(i + 'a'));
      }
      for (int k = 0; k < tCount[i]; k++) {
        sb2.append((char)(i + 'a'));
      }
    }
    System.out.println(sb1.toString()+" "+sb2.toString());
    if(sb1.toString().equals(sb2.toString())){
        return true;
    }
    }
   
    return false;
  }
}
