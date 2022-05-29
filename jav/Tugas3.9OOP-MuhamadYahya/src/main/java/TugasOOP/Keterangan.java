package TugasOOP;

public class Keterangan {
    public static void main(String[] args) {
        Sapi sapi = new Sapi();
        Ikan ikan = new Ikan();

        sapi.hewan = "Sapi";
        sapi.jenis = "Sapi Limosin";
        sapi.hidupdi = "Darat";
        sapi.bernafas = "Paru-paru";

        ikan.hewan = "Ikan";
        ikan.jenis = "Cupang Albino";
        ikan.hidupdi = "Air";
        ikan.bernafas = "Insang";

        System.out.println("==========================================MAKHLUK HIDUP=========================================");
        System.out.println("Nama hewan : " + sapi.hewan + " , Jenis : " + sapi.jenis + ", Hidup di : " + sapi.hidupdi + ", Bernafas menggunakan : " + sapi.bernafas);
        System.out.println("Nama hewan : " + ikan.hewan + " , Jenis : " + ikan.jenis +  ", Hidup di : " + ikan.hidupdi + ", Bernafas menggunakan : " + ikan.bernafas);
    }
}
