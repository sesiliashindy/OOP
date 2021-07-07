import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setFirstName("Sesilia Shindy");
        person.setLastName("Pandin");
        
        person.setTempatKelahiran("Dili");
        person.setTanggalLahir(14);
        person.setBulanLahir("Juni");
        person.setTahunLahir(1998);
        
        person.setDomisili("Makassar");

        Pendidikan.setSd("SD Katolik Santo Aloysius Makassar");
        Pendidikan.setSmp("SMPN 33 Makassar");
        Pendidikan.setSma("SMA Frater Kumala Makassar");
        Pendidikan.setKampus("Universitas Hasanuddin");
           
        System.out.println("Pilihan:\n1.Profil\n2.Pendidikan\n3.Exit");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan pilihan: ");
        int number = input.nextInt();
        
        while(true){
            switch (number) {
                case 1:
                    person.getFullName();
                    person.getTTL();
                    System.out.println("Domisili: "+person.getDomisili());
                    break;
                case 2:
                    Pendidikan.getPendidikan();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Number");
                    break;
            }
            System.out.println("Apakah anda ingin menginput ulang (Y/N)? ");
            String n = input.next();
            if (n=="Y") {
                
            } else if (n=="N"){
                System.exit(0);
            } else {
                System.exit(0);
            }
        }
    }
}
