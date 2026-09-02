class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return false;
        }
        String stripped=s.replace(" ","").replaceAll("[^a-zA-Z0-9 ]", "");
        String reversed=new StringBuilder(stripped).reverse().toString();
        if(stripped.toLowerCase().equals(reversed.toLowerCase())){
            return true;
        }
        return false;
    }
}
