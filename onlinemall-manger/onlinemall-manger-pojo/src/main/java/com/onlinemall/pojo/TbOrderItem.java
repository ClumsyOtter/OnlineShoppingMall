package com.onlinemall.pojo;

public class TbOrderItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.item_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.order_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.num
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.title
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.price
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Long price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.total_fee
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Long totalFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.pic_path
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String picPath;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.id
     *
     * @return the value of tb_order_item.id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.id
     *
     * @param id the value for tb_order_item.id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.item_id
     *
     * @return the value of tb_order_item.item_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.item_id
     *
     * @param itemId the value for tb_order_item.item_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.order_id
     *
     * @return the value of tb_order_item.order_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.order_id
     *
     * @param orderId the value for tb_order_item.order_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.num
     *
     * @return the value of tb_order_item.num
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.num
     *
     * @param num the value for tb_order_item.num
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.title
     *
     * @return the value of tb_order_item.title
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.title
     *
     * @param title the value for tb_order_item.title
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.price
     *
     * @return the value of tb_order_item.price
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.price
     *
     * @param price the value for tb_order_item.price
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.total_fee
     *
     * @return the value of tb_order_item.total_fee
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Long getTotalFee() {
        return totalFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.total_fee
     *
     * @param totalFee the value for tb_order_item.total_fee
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.pic_path
     *
     * @return the value of tb_order_item.pic_path
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.pic_path
     *
     * @param picPath the value for tb_order_item.pic_path
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }
}