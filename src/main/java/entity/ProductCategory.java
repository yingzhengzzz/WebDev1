package entity;

import java.util.Date;

public class ProductCategory {

    private Long prodCateId;
    private Long shopID;
    private String prodCateName;
    private Integer priority;
    private Date createTime;

    public Long getProdCateId() {
        return prodCateId;
    }

    public void setProdCateId(Long prodCateId) {
        this.prodCateId = prodCateId;
    }

    public Long getShopID() {
        return shopID;
    }

    public void setShopID(Long shopID) {
        this.shopID = shopID;
    }

    public String getProdCateName() {
        return prodCateName;
    }

    public void setProdCateName(String prodCateName) {
        this.prodCateName = prodCateName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
