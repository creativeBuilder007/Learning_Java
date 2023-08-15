class Pattern {
    public static void main(String[] args) {
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
        // int n=11;
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<n;j++) {
        //         if(i<=5 && i+j>=5 && j-i<=5) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // 3 - Reverse Number Triangle Pattern
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        // for(int i=0;i<n;i++) {
        //     for(int j=i;j>0;j--) {
        //         System.out.print(" ");
        //     }
        //     for(int j=i+1;j<=n;j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // 4 - Mirror Image Triangle Pattern
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        // for(int i=0;i<n;i++) {
        //     for(int j=i;j>0;j--) {
        //         System.out.print(" ");
        //     }
        //     for(int j=i+1;j<=n;j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }    
        // for(int i=n-2;i>=0;i--) {
        //     for(int j=i;j>0;j--) {
        //         System.out.print(" ");
        //     }
        //     for(int j=i+1;j<=n;j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();    
       // }
       // TRICOLOR PATTERN
       final String Orange = "\033[38;5;202m";
       final String ANSI_RESET = "\u001B[0m";
       final String Green = "\033[38;5;46m";
       int m=7;
       int l = 37;
       for(int i=0;i<m;i++) {
        for(int j=0;j<l;j++) {
            System.out.print(Orange +"* "+ ANSI_RESET);
        }
        System.out.println();
       }
       int n=11;
       int r = (n-1)/2;
       for(int i=0;i<=2*r;i++) {
        for(int j=0;j<=2*r;j++) {
            System.out.print("  ");            
        }
        System.out.print("  ");
        for(int j=0;j<=2*r;j++) {
            double dist = Math.sqrt((i-r)*(i-r)+(j-r)*(j-r));
            if(dist> r-0.5 && dist< r+0.5 || i==(n-1)/2 || j==(n-1)/2 || (i==j && dist<r+0.5) || (i+j==(n-1) && dist<r+0.5)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }            
        }
        System.out.println();
       }
       int b=7;
       int d = 37;
       for(int i=0;i<b;i++) {
        for(int j=0;j<d;j++) {
            System.out.print(Green +"* "+ ANSI_RESET);
        }
        System.out.println();
       }

    }
}