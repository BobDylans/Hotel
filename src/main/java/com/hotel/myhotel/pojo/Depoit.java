package com.hotel.myhotel.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * depoit
 * @author 
 */
@Data
public class Depoit implements Serializable {
    private Integer id;

    /**
     * 住宿登记ID
     */
    private Integer stayregisterid;

    /**
     * 支付方式ID
     */
    private Integer paywayid;

    /**
     * 登记时间
     */
    private Date registertime;

    /**
     * 押金
     */
    private BigDecimal deposit;

    private static final long serialVersionUID = 1L;
}