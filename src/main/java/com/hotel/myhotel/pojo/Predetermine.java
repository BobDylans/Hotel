package com.hotel.myhotel.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * predetermine
 * @author 
 */
@Data
public class Predetermine implements Serializable {
    /**
     * 预定ID
     */
    private Integer id;

    /**
     * 房间ID
     */
    private Integer roomid;

    /**
     * 预定对象ID
     */
    private Integer predeterminetargetid;

    /**
     * 旅客ID
     */
    private Integer passengerid;

    /**
     * 支付方式 ID
     */
    private Integer paywayid;

    /**
     * 预定状态ID
     */
    private Integer predeterminestateid;

    /**
     * 抵达时间
     */
    private Date arrivetime;

    /**
     * 押金
     */
    private BigDecimal deposit;

    /**
     * 预定天数
     */
    private String predetermineday;

    /**
     * 到时提示
     */
    private Integer remind;

    private static final long serialVersionUID = 1L;
}