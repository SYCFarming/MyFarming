package pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Farrmproevaluate {
    private Integer eid;

    private String einfo;

    private String etime;

    private Integer countid;

    private Integer proid;

    private Double proeval;

    private Double storeeval;

    private String defult;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEinfo() {
        return einfo;
    }

    public void setEinfo(String einfo) {
        this.einfo = einfo == null ? null : einfo.trim();
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    public Integer getCountid() {
        return countid;
    }

    public void setCountid(Integer countid) {
        this.countid = countid;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public Double getProeval() {
        return proeval;
    }

    public void setProeval(Double proeval) {
        this.proeval = proeval;
    }

    public Double getStoreeval() {
        return storeeval;
    }

    public void setStoreeval(Double storeeval) {
        this.storeeval = storeeval;
    }

    public String getDefult() {
        return defult;
    }

    public void setDefult(String defult) {
        this.defult = defult == null ? null : defult.trim();
    }
}