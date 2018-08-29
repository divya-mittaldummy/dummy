package com.adapterPattern;

public class XPayToPayDAdapter implements PayD{

    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;

    private final XPay xPay;

    XPayToPayDAdapter(XPay xPay){
        this.xPay = xPay;
        setProp();
    }

    private void setProp(){
        setCardOwnerName(this.xPay.getCustomerName());
        setCustCardNo(this.xPay.getCreditCardNo());
        setCardExpMonthDate(this.xPay.getCardExpMonth()+"/"+this.xPay.getCardExpYear());
        setCVVNo(this.xPay.getCardCVVNo().intValue());
        setTotalAmount(this.xPay.getAmount());
    }

    @Override
    public String getCustCardNo() {
        return null;
    }

    @Override
    public String getCardOwnerName() {
        return null;
    }

    @Override
    public String getCardExpMonthDate() {
        return null;
    }

    @Override
    public Integer getCVVNo() {
        return null;
    }

    @Override
    public Double getTotalAmount() {
        return null;
    }

    @Override
    public void setCustCardNo(String custCardNo) {

    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {

    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {

    }

    @Override
    public void setCVVNo(Integer cVVNo) {

    }

    @Override
    public void setTotalAmount(Double totalAmount) {

    }
}
