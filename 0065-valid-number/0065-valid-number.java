class Solution {
    public boolean isNumber(String s) {
        if(s.contains("D")| s.contains("inf")|s.contains("Infinity")|s.contains("NaN")|s.endsWith("f")) return (false);
        try{
            Float.parseFloat(s);
            return(true);
        }
        catch(Exception e){
        return (false);
        }
    }
}