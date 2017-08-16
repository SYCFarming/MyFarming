package pojo;

public class Farrmstore {
    private Integer storeid;

    private String storename;

    private String storeimage;

    private Integer storestatues;

    private Integer countid;

    private String storeinfo;

    private String storeadress;

    private Integer storerscore;

    private Integer storeretain;

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename == null ? null : storename.trim();
    }

    public String getStoreimage() {
        return storeimage;
    }

    public void setStoreimage(String storeimage) {
        this.storeimage = storeimage == null ? null : storeimage.trim();
    }

    public Integer getStorestatues() {
        return storestatues;
    }

    public void setStorestatues(Integer storestatues) {
        this.storestatues = storestatues;
    }

    public Integer getCountid() {
        return countid;
    }

    public void setCountid(Integer countid) {
        this.countid = countid;
    }

    public String getStoreinfo() {
        return storeinfo;
    }

    public void setStoreinfo(String storeinfo) {
        this.storeinfo = storeinfo == null ? null : storeinfo.trim();
    }

    public String getStoreadress() {
        return storeadress;
    }

    public void setStoreadress(String storeadress) {
        this.storeadress = storeadress == null ? null : storeadress.trim();
    }

    public Integer getStorerscore() {
        return storerscore;
    }

    public void setStorerscore(Integer storerscore) {
        this.storerscore = storerscore;
    }

    public Integer getStoreretain() {
        return storeretain;
    }

    public void setStoreretain(Integer storeretain) {
        this.storeretain = storeretain;
    }
}