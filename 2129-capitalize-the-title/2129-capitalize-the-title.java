class Solution {
    public String capitalizeTitle(String title) {
        String r="";
        String a[]= title.split(" ");
        for(int i=0; i<a.length; i++)
        {
            a[i]=a[i].toLowerCase();
            if(a[i].length()<=2){
            r+=a[i].toLowerCase()+" ";
            continue;
            }
            else 
            {
                a[i]=a[i].substring(0,1).toUpperCase()+a[i].substring(1);
                r+=a[i]+" ";
            }
        }
        return r.trim();
    }
}