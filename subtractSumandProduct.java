class subtractSumAndProduct {
    public int subtractProductAndSum(int n) {
        int prod=1;
        int sum=0;
        while(n!=0){
            int lastDigit= n% 10;
            sum = sum+ lastDigit;
            prod= prod* lastDigit;
            n=n/ 10;
        }

        return(prod-sum);

    }

    public static void main(String[] args) {
        subtractSumAndProduct obj = new subtractSumAndProduct();
        int num = 234;
        System.out.println("Result: " + obj.subtractProductAndSum(num));
    }
}
