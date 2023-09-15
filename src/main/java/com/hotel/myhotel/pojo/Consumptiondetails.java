package com.hotel.myhotel.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * consumptiondetails
 * @author 
 */
@Data
public class Consumptiondetails implements Serializable {
    /**
     * 消费明细ID
     */
    private Integer id;

    /**
     * 住宿登记ID
     */
    private Integer stayregisterid;

    /**
     * 商品ID
     */
    private Integer commodityid;

    /**
     * 消费数量
     */
    private String consumptionnumber;

    /**
     * 消费金额
     */
    private BigDecimal consumptionmoney;

    /**
     * 消费时间
     */
    private Date consumptiontime;

    private static final long serialVersionUID = 1L;
}