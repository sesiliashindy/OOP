public class Person {
    private String firstName;
    private String lastName;
    private int tahunLahir;
    private int tanggalLahir;
    private int tahunSekarang;
    private String bulanLahir;
    private String tempatKelahiran;
    private String domisili;

    public void setBulanLahir(String bulanLahir) {
        this.bulanLahir = bulanLahir;
    }
    
    public void setTahunSekarang(int tahunSekarang) {
        this.tahunSekarang = tahunSekarang;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }
    
    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public void setTempatKelahiran(String tempatKelahiran) {
        this.tempatKelahiran = tempatKelahiran;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
   
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDomisili() {
        return domisili;
    }
    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public void getFullName(){
        System.out.println("Nama Lengkap");
        System.out.println(this.firstName+ " " + this.lastName);
    }

    public void getTTL(){
        System.out.println("Tempat,tanggal lahir");
        System.out.println(tempatKelahiran+ "," + tanggalLahir+" "+bulanLahir+" "+tahunLahir);
        System.out.println("Umur: "+(tahunSekarang-tahunLahir+" "+"tahun"));
    }

}
