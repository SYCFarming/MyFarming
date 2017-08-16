package pojo;

public class Farmcount {
    private Integer countid;

    private String countname;

    private Long counttel;

    private String countemail;

    private String countpwd;

    private Integer counttype;

    private Integer countscore;

    private String countimage;

    private String countidcard;

    private String countsex;

    private Integer countretain;

    public Integer getCountid() {
        return countid;
    }

    public void setCountid(Integer countid) {
        this.countid = countid;
    }

    public String getCountname() {
        return countname;
    }

    public void setCountname(String countname) {
        this.countname = countname == null ? null : countname.trim();
    }

    public Long getCounttel() {
        return counttel;
    }

    public void setCounttel(Long counttel) {
        this.counttel = counttel;
    }

    public String getCountemail() {
        return countemail;
    }

    public void setCountemail(String countemail) {
        this.countemail = countemail == null ? null : countemail.trim();
    }

    public String getCountpwd() {
        return countpwd;
    }

    public void setCountpwd(String countpwd) {
        this.countpwd = countpwd == null ? null : countpwd.trim();
    }

    public Integer getCounttype() {
        return counttype;
    }

    public void setCounttype(Integer counttype) {
        this.counttype = counttype;
    }

    public Integer getCountscore() {
        return countscore;
    }

    public void setCountscore(Integer countscore) {
        this.countscore = countscore;
    }

    public String getCountimage() {
        return countimage;
    }

    public void setCountimage(String countimage) {
        this.countimage = countimage == null ? null : countimage.trim();
    }

    public String getCountidcard() {
        return countidcard;
    }

    public void setCountidcard(String countidcard) {
        this.countidcard = countidcard == null ? null : countidcard.trim();
    }

    public String getCountsex() {
        return countsex;
    }

    public void setCountsex(String countsex) {
        this.countsex = countsex == null ? null : countsex.trim();
    }

    public Integer getCountretain() {
        return countretain;
    }

    public void setCountretain(Integer countretain) {
        this.countretain = countretain;
    }
}