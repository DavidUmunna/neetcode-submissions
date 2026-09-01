class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded=new StringBuilder(); 

        for(String s:strs){
            encoded.append(s.length());
            encoded.append('#');
            encoded.append(s);
        }
        return encoded.toString();


    }

    public List<String> decode(String str) {
        ArrayList<String> decoded=new ArrayList<>();
        int i=0;
        int n=str.length();

        while(i<n){
            int len=0;

            while(str.charAt(i)!='#'){
                len=len*10+(str.charAt(i)-'0');
                i++;
            }

            i++;

            String temp=str.substring(i,i+len);
            decoded.add(temp);
            i+=len;
        }

        return new ArrayList<>(decoded);

    }
}
