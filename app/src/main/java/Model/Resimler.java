package Model;

public class Resimler {

    private int id ;
    private String marka;
    private String fiyat;
    private String resim;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    @Override
    public String toString() {
        return "Resimler{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", fiyat='" + fiyat + '\'' +
                ", resim='" + resim + '\'' +
                '}';
    }
}
