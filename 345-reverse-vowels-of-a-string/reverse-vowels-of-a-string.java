class Solution {
    public String reverseVowels(String s) {
        char[]arr=s.toCharArray();
        
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char left=s.charAt(i);
            char right=s.charAt(j);
            if(!(left=='a'||left=='e'||left=='i'||left=='o'||left=='u'||left=='A'||left=='E'||left=='I'||left=='O'||left=='U')){
                i++;
            }
            else if(!(right=='a'||right=='e'||right=='i'||right=='o'||right=='u'||right=='A'||right=='E'||right=='I'||right=='O'||right=='U')){
                j--;
            }
            else{

                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    return new String(arr);
    }
}