package entities.abstracts;

public abstract class Users {

    private String ad;
    private String soyAd;
    private String id;

    public Users() {
    }

    public Users(String ad, String soyAd, String id) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", id='" + id + '\'';
    }
}
