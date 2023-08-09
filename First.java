class First {
    public static void main(String args[]) {
        // Square Pattern
        // int n = 4;
        // for(int i=1;i<=n;i++) {
        //     for(int j=1;j<=n;j++) {
        //         System.out.print("*");
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        // Hollow Square Pattern
        // int n = 4;
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<n;j++) {
        //         if(i==0 || i==(n-1)) {
        //             System.out.print("* ");
        //         } else if (j==0 || j==(n-1)) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // Inverted Pyramid
        // int n = 5;
        // for(int i=n;i>0;i--) {
        //     for(int j=i;j>0;j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // Half Pyramid
        // int n = 5;
        // for(int i=1;i<=n;i++) {
        //     for(int j=n-i;j>0;j--) {
        //         System.out.print("  ");
        //     }
        //     for(int j=i;j>0;j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // Half Pyramid Using Numbers
        // int n=5;
        // for(int i=1;i<=n;i++) {
        //     for(int j=i;j>0;j--) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        // Floyd's Triangle
        // int n=5;
        // int count = 1;
        // for(int i=1;i<=n;i++) {
        //     for(int j=i;j>0;j--) {
        //         System.out.print((count++)+" ");
        //     }
        //     System.out.println();
        // }
        // Butterfly Pattern
        // int n=4;
        // for(int i=1;i<=n;i++) {
        //     for(int j=i;j>0;j--) {
        //         System.out.print("* ");
        //     }
        //     for (int j=2*(n-i);j>0;j--){
        //         System.out.print("  ");
        //     }
        //     for(int j=i;j>0;j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--) {
        //     for(int j=i;j>0;j--) {
        //         System.out.print("* ");
        //     }
        //     for (int j=2*(n-i);j>0;j--){
        //         System.out.print("  ");
        //     }
        //     for(int j=i;j>0;j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // Inverted no. Pyramid
        // int n=5;
        // for(int i=n;i>=1;i--) {
        //     for(int j=1;j<=i;j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // 0-1 Pattern
        // int n=5;
        // for(int i=1;i<=n;i++) {
        //     for(int j=1;j<=i;j++) {
        //         if((i+j)%2==0) {
        //             System.out.print(1+" ");
        //         } else {
        //             System.out.print(0+" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // Rhombus Pattern
        // int n = 5;
        // for (int i=1;i<=n;i++) {
        //     for(int j=n-i;j>0;j--) {
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=n;j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // Number Pattern
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=n-i;j>0;j--) {
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+"   ");
        //     }
        //     System.out.println();
        // }
        // H Type Pattren
        // int n=4;
        // if (n%2!=0) {
        //     for(int i=1;i<=n;i++) {
        //         for(int j=1;j<=n;j++) {
        //             if(j==1 || j==n || i==(n+1)/2) {
        //                 System.out.print("* ");
        //             } else {
        //                 System.out.print("  ");
        //             }
        //         }
        //         System.out.println();
        //     }
        // } else {
        //     for(int i=1;i<=n+1;i++) {
        //         for(int j=1;j<=n;j++) {
        //             if(i==((n+2)/2) && j!=1 && j!=n) {
        //                 System.out.print("* ");
        //             } else if(i==((n+2)/2) && j==1 && j==n){
        //                 System.out.print("  ");
        //             } else if((j==1 || j==n) && i!=3) {
        //                 System.out.print("* ");
        //             } else {
        //                 System.out.print("  ");
        //             }
        //         }
        //         System.out.println();
        //     }
        // }
        // A Style Pattern
        // int n = 5;
        // for (int i=0;i<n;i++) {
        //     for(int j=0;j<=(n-1)/2;j++) {
        //         if ((i==0 && j!=0 && j!=((n-1)/2)) || i==(n-1)/2) {
        //             System.out.print("* ");
        //         } else if((j==0 || j==((n-1)/2)) && i!=0) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // D Style Pattern
        // int n=11;
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<n;j++) {
        //         if((i==0 && j<(n-1)/2) || j==0 || (j==(n-1)/2 && (i>0 && i<(n-1))) || (i==(n-1) && j<(n-1)/2)) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // I Style Pattern
        // int n = 7;
        // for(int i = 0;i<n;i++) {
        //     for(int j=0;j<n;j++) {
        //         if(i==0 || i==(n-1) || j==(n-1)/2) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // X Type Pattern
        // int n=19;
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<n;j++) {
        //         if(i==j || i+j==(n-1) || j==0 || j==(n-1) || i==0 || i==(n-1) || i+j==(n-1)/2 || i==j+(n-1)/2 || i+j==((n-1)/2)+n-1 || j-i==(n-1)/2) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // Hollow Diamond inscribed in recatngle
        // int n=21;
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<n;j++) {
        //         if((i+j<=(n-1)/2 && i+j>=0) || (i-j>=(n-1)/2 && i-j<=(n-1)) || (j-i>=(n-1)/2 && j-i<=(n-1)) || (i+j>=(n-1)+(n-1)/2 && i+j<=2*(n-1))) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // Time Capsule Pattern
        // int n=21;
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<n;j++) {
        //         if((i+j<=(n-1)/2 && i+j>=0) || (i-j==(n-1)/2) || (j-i==(n-1)/2) || (i+j>=(n-1)+(n-1)/2 && i+j<=2*(n-1))) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // DIL Special Pattern
        // int n=11;
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<n;j++) {
        //         if(i-j==5 || i+j==15 || (i+j==5 && i>2) || (j-i==5 && i>2) || (i==j && i>=3 && i<=5) || (i+j==10 && i>=3 && i<=5) || (i-j<=5 && i>j && i+j>=5 && i+j<=15) || (i+j<=15 && i+j>=10 && j-i<=5 && i-j<=1)) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        if(0) {
            System.out.println("OK");
        }
    }
};