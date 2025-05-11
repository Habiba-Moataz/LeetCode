class Solution {
    public int reverse(int x) {
        long output =0;
        int moduls,process = Math.abs(x);
        int digits = (process == 0) ? 0 : (int) Math.log10(Math.abs(process));
        while (process >= 10){
            moduls = process%10 ;
            output += moduls* Math.pow(10, digits);
            process = process/10;
            digits--;
        }
            output += process;
        if (x<0){
             output = output*-1;
        }
        if ((output>=-2147483648) && ( output <= 2147483647) ){
            return (int)output;
        }
        else {
            return 0;
        }
    }
}
