package quick.pager.pay.common.client.request;


import java.math.BigDecimal;

/**
 * 统一收单交易退款
 */
public class AlipayRefundRequest extends BaseAlipayRequest {
    private static final long serialVersionUID = -6539436686685998422L;
    /**
     * 订单支付时传入的商户订单号,不能和 trade_no同时为空。
     */
    private String outTradeNo;
    /**
     * 支付宝交易号，和商户订单号不能同时为空
     */
    private String tradeNo;
    /**
     * 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
     */
    private BigDecimal refundAmount;
    /**
     * 订单退款币种信息，非外币交易，不能传入退款币种信息
     */
    private String refundCurrency;
    /**
     * 退款的原因说明
     */
    private String refundReason;
    /**
     * 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传
     */
    private String outRequestNo;
    /**
     * 商户的操作员编号
     */
    private String operatorId;
    /**
     * 商户的门店编号
     */
    private String storeId;
    /**
     * 商户的终端编号
     */
    private String terminalId;


    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundCurrency() {
        return refundCurrency;
    }

    public void setRefundCurrency(String refundCurrency) {
        this.refundCurrency = refundCurrency;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getOutRequestNo() {
        return outRequestNo;
    }

    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }
}