class Pattern {
    public static void main(String args[]) {
        // 1 - Pallindrome Pattern
        // int n = 4;
        // for (int i=1;i<=n;i++) {
        //     for(int j=n-i;j>0;j--) {
        //         System.out.print("  ");
        //     }
        //     for(int j=i;j>0;j--) {
        //         System.out.print(j+" ");
        //     }
        //     for(int j=2;j<=i;j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // 2 - Triangle Pattern
        int n=11;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i<=5 && i+j>=5 && j-i<=5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}