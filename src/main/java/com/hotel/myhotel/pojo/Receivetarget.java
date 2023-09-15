package com.hotel.myhotel.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * receivetarget
 * @author 
 */
@Data
public class Receivetarget implements Serializable {
    /**
     * 接待对象ID
     */
    private Integer id;

    /**
     * 对象类别ID
     */
    private Integer targettypeid;

    /**
     * 负责人
     */
    private String principal;

    /**
     * 团队名称
     */
    private String teamname;

    /**
     * 团队编号
     */
    private String teamcode;

    /**
     * 登记时间
     */
    private Date registertime;

    /**
     * 联系电话
     */
    private String contactphonenumber;

    private static final long serialVersionUID = 1L;
}