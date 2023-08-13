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
        Fan f1 = new Fan();
        f1.Starting();
        f1.Stopping();
        Fan f2 = new Fan();
        f2.Starting();
        f2.Rotating();
        Fan f3 = new Fan();
        f3.Starting();
        f3.Rotating();
        f3.BlowingAir();
        f3.Stopping();

        System.out.println(f1);
        System.out.println(f3);
        System.out.println(f2);

        System.err.println("You rocked in JAVA MAN !!");
    }
}