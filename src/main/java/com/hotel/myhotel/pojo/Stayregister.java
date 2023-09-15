package com.hotel.myhotel.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * stayregister
 * @author 
 */
@Data
public class Stayregister implements Serializable {
    /**
     * 住宿登记ID
     */
    private Integer id;

    /**
     * 预定ID
     */
    private Integer predetermineid;

    /**
     * 出租方式ID
     */
    private Integer rentouttypeid;

    /**
     * 房间ID
     */
    private Integer roomid;

    /**
     * 结账方式ID
     */
    private Integer paywayid;

    /**
     * 结账单位ID
     */
    private Integer billunitid;

    /**
     * 旅客类别ID
     */
    private Integer passengertypeid;

    /**
     * 接待对象ID
     */
    private Integer receivetargetid;

    /**
     * 副ID
     */
    private Integer deputyid;

    /**
     * 结账否
     */
    private Integer isbillid;

    /**
     * 登记时间
     */
    private Date registertime;

    /**
     * 住店天数/小时
     */
    private String staynumber;

    /**
     * 总费用
     */
    private BigDecimal sumconst;

    /**
     * 换房次数
     */
    private String changingroomnumber;

    /**
     * 换房费
     */
    private BigDecimal changroommoney;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 结账时间
     */
    private Date paytime;

    /**
     * 换房时间
     */
    private Date changroomtime;

    /**
     * 提醒结账
     */
    private Integer remind;

    private static final long serialVersionUID = 1L;
}