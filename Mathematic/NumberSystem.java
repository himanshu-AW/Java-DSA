public class NumberSystem {

    static long decimalToBinary(long num) {
        long bNum = 0;
        long p = 1;
        while (num != 0) {
            bNum += (num % 2) * p;
            num /= 2;
            p *= 10;
        }
        return bNum;
    }

    static long binaryToDecimal(long num) {
        long dNum = 0;
        long p = 1;
        while (num != 0) {
            dNum += (num % 10) * p;
            num /= 10;
            p *= 2;
        }
        return dNum;
    }

    static long decimalToOctal(long num) {
        long oNum = 0;
        long p = 1;
        while (num != 0) {
            oNum += (num % 8) * p;
            num /= 8;
            p *= 10;
        }
        return oNum;
    }

    static long octalToDecimal(long num) {
        long dNum = 0;
        long p = 1;
        while (num != 0) {
            dNum += (num % 10) * p;
            num /= 10;
            p *= 8;
        }
        return dNum;
    }

    static String decimaToHex(int num){
        String hexAlp[] = {"A","B","C","D","E","F"};
        String ans="";
        int rem;
        int p=1;
        while(num!=0){
            rem = num%16;
            if(rem>9){
                ans += hexAlp[10-rem];
            }else{
                ans+= Integer.toString(rem*p);
            }
            num/=16;
            p*=10;
        }
        return ans;
    }
    public static void main(String[] args) {

        long n = 23;
        long ans;
        System.out.println();

        ans = decimalToBinary(n); // 10111
        System.out.println("Decimal Number : " + n + "  =>  Binary Number : " + ans);
        System.out.println("Binary Number : " + ans + "  =>  Decimal Number : " + binaryToDecimal(ans)); // 23

        ans = decimalToOctal(ans); // 27
        System.out.println("Decimal Number : " + n + "  =>  Octal Number : " + ans);
        System.out.println("Octal Number : " + ans + "  =>  Decimal Number : " + octalToDecimal(ans)); // 23
        
        // System.out.println("Decimal Number : " + 23 + "  =>  Hex Number : " + decimaToHex(23));

        System.out.println();

    }
}
