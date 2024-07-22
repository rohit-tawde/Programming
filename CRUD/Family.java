class Family {

    // String name;
    float f;
    double d;
    long l;

    public void printFF() {

        f=10.9F;
        d=22.22;
        l=12747l;

        System.out.println(f);
        System.out.println(d);
        System.out.println(l);

    }
    public static void main(String[] ats) {

        Family ref = new Family();

        System.out.println(ref.f);
        System.out.println(ref.d);
        System.out.println(ref.l);

        ref.printFF();
        

    }
}