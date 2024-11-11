class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int l=0,r=0;

        Arrays.sort(g);
        Arrays.sort(s);

        while(l<n&&r<m){
            if(g[l]<=s[r]){
                r=r+1;
            }
            l=l+1;
        }
       
 
    return r;

    }
}