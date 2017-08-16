package pojo;

import java.math.BigDecimal;

public class Farrmproducts {
    private Integer proid;

    private String proname;

    private String proinfo;

    private Double proprice;

    private Integer pronums;

    private Integer storeid;

    private Integer define;

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getProinfo() {
        return proinfo;
    }

    public void setProinfo(String proinfo) {
        this.proinfo = proinfo == null ? null : proinfo.trim();
    }

    public Double getProprice() {
        return proprice;
    }

    public void setProprice(Double proprice) {
        this.proprice = proprice;
    }

    public Integer getPronums() {
        return pronums;
    }

    public void setPronums(Integer pronums) {
        this.pronums = pronums;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public Integer getDefine() {
        return define;
    }

    public void setDefine(Integer define) {
        this.define = define;
    }
}