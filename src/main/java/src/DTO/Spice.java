package src.DTO;

public class Spice {
    public Spice() {
    }
    private String NAME;
    private static final String TYPE = "SPICE";
    private String info = "очень полезен, полезен для";
    private String UrlImage;
    private int price;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public static String getTYPE() {
        return TYPE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(String urlImage) {
        UrlImage = urlImage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
