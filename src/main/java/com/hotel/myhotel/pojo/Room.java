package com.hotel.myhotel.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * room
 * @author 
 */
@Data
public class Room implements Serializable {
    /**
     * 房间id
     */
    private Integer id;

    /**
     * 客房等级ID
     */
    private Integer guestroomlevelid;

    /**
     * 房态ID
     */
    private Integer roomstateid;

    /**
     * 房间号
     */
    private String roomnumber;

    /**
     * 床位数
     */
    private String roomamount;

    /**
     * 标准房价/天
     */
    private BigDecimal standardpriceday;

    /**
     * 标准房价/小时
     */
    private BigDecimal standardprice;

    /**
     * 时长限制（小时）
     */
    private String maxduration;

    /**
     * 首段时长（小时）
     */
    private String firstduration;

    /**
     * 首段价格
     */
    private BigDecimal firstprice;

    private static final long serialVersionUID = 1L;
}