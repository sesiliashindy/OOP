public class Pendidikan {
    private static String sd;
    private static String smp;
    private static String sma;
    private static String kampus;
    
    public static void setSd(String sd) {
        Pendidikan.sd = sd;
    }

    public static void setSmp(String smp) {
        Pendidikan.smp = smp;
    }

    public static void setSma(String sma) {
        Pendidikan.sma = sma;
    }

    public static void setKampus(String kampus) {
        Pendidikan.kampus = kampus;
    }
    
    public static void getPendidikan(){
        System.out.println("Riwayat Pendidikan");
        System.out.println(sd);
        System.out.println(smp);
        System.out.println(sma);
        System.out.println(kampus);
    }

}
