class NamePrint10Times{
    static void printName10Times(int n){
        if(n==0) return;
        System.out.println("Hyy, Himanshu Chauhan");
        printName10Times(n-1);
    }
    public static void main(String[] args) {
        printName10Times(10);
    }
}