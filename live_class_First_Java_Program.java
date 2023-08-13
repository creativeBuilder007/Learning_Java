class Fan {
    String brand;
    String color;
    int no_of_blades;
    int price;

    void Starting() {
        System.out.println("Fan is Starting");
    }
    void Rotating() {
        System.out.print("Fan is Rotating ");
    }
    void BlowingAir() {
        System.out.printf("Fan is Blowing Air ");
    }
    void Stopping() {
        System.out.println("Fan is Stopping");
    }

    public static void main(String[] args) {
        // if(args.length!=3) {
        //     System.out.println("Three arguments required");
        // } else {
        //     System.out.println("You have entered three arguments you can proceed!");
        //     System.out.println("Company Name : " + args[0] +
        //                         "Company City : "+args[1]+
        //                         "Company Country :  "+args[2]);
        // }
        String a = args[2];
        System.out.println(a);
        
    }
}