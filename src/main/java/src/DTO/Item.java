package src.DTO;

;

public class Item {
    public Item() {
    }

    private String NAME;
    private static final String TYPE = "HERBAL";
    private String info = "очень полезен, полезен для";
    private String UrlImage;
    private int price;
    private ItemType itemType;

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

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemTpe) {
        this.itemType = itemTpe;
    }
}
