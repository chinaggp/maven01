package cn.ggp.domain;

import java.util.Date;

public class Items {
    private Integer id;
    private String name;
    private Double price;
    private String pic;
    private Date createtime;
    private String detail;
    private int sex;
    private String sexStr;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getSexStr() {
       /* if (sex==1){
            sexStr = "男";
        }
        if (sex==0){
            sexStr = "女";
        }*/
        return sexStr;
    }

    public void setSexStr() {
        if (sex==1){
            this.sexStr = "男";
        }
        if (sex==0){
            this.sexStr = "女";
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
