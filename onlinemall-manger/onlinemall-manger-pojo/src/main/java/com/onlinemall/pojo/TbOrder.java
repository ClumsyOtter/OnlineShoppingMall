package com.onlinemall.pojo;

import java.util.Date;

public class TbOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.order_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.payment
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String payment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.payment_type
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Integer paymentType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.post_fee
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String postFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.status
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.create_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.update_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.payment_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Date paymentTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.consign_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Date consignTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.end_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.close_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Date closeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.shipping_name
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String shippingName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.shipping_code
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String shippingCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.user_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.buyer_message
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String buyerMessage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.buyer_nick
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private String buyerNick;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.buyer_rate
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    private Integer buyerRate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.order_id
     *
     * @return the value of tb_order.order_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.order_id
     *
     * @param orderId the value for tb_order.order_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.payment
     *
     * @return the value of tb_order.payment
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.payment
     *
     * @param payment the value for tb_order.payment
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.payment_type
     *
     * @return the value of tb_order.payment_type
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.payment_type
     *
     * @param paymentType the value for tb_order.payment_type
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.post_fee
     *
     * @return the value of tb_order.post_fee
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getPostFee() {
        return postFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.post_fee
     *
     * @param postFee the value for tb_order.post_fee
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setPostFee(String postFee) {
        this.postFee = postFee == null ? null : postFee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.status
     *
     * @return the value of tb_order.status
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.status
     *
     * @param status the value for tb_order.status
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.create_time
     *
     * @return the value of tb_order.create_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.create_time
     *
     * @param createTime the value for tb_order.create_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.update_time
     *
     * @return the value of tb_order.update_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.update_time
     *
     * @param updateTime the value for tb_order.update_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.payment_time
     *
     * @return the value of tb_order.payment_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.payment_time
     *
     * @param paymentTime the value for tb_order.payment_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.consign_time
     *
     * @return the value of tb_order.consign_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Date getConsignTime() {
        return consignTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.consign_time
     *
     * @param consignTime the value for tb_order.consign_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.end_time
     *
     * @return the value of tb_order.end_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.end_time
     *
     * @param endTime the value for tb_order.end_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.close_time
     *
     * @return the value of tb_order.close_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.close_time
     *
     * @param closeTime the value for tb_order.close_time
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.shipping_name
     *
     * @return the value of tb_order.shipping_name
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.shipping_name
     *
     * @param shippingName the value for tb_order.shipping_name
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.shipping_code
     *
     * @return the value of tb_order.shipping_code
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.shipping_code
     *
     * @param shippingCode the value for tb_order.shipping_code
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.user_id
     *
     * @return the value of tb_order.user_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.user_id
     *
     * @param userId the value for tb_order.user_id
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.buyer_message
     *
     * @return the value of tb_order.buyer_message
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.buyer_message
     *
     * @param buyerMessage the value for tb_order.buyer_message
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.buyer_nick
     *
     * @return the value of tb_order.buyer_nick
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.buyer_nick
     *
     * @param buyerNick the value for tb_order.buyer_nick
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.buyer_rate
     *
     * @return the value of tb_order.buyer_rate
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public Integer getBuyerRate() {
        return buyerRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.buyer_rate
     *
     * @param buyerRate the value for tb_order.buyer_rate
     *
     * @mbggenerated Mon Feb 27 20:12:18 CST 2017
     */
    public void setBuyerRate(Integer buyerRate) {
        this.buyerRate = buyerRate;
    }
}