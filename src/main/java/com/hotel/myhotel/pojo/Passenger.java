package com.hotel.myhotel.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * passenger
 * @author 
 */
@Data
public class Passenger implements Serializable {
    /**
     * 旅客ID
     */
    private Integer id;

    /**
     * 证件ID
     */
    private Integer papersid;

    /**
     * 文化程度ID
     */
    private Integer educationdegreeid;

    /**
     * 性别ID
     */
    private Integer genderid;

    /**
     * 旅客级别ID
     */
    private Integer passengerlevelid;

    /**
     * 民族ID
     */
    private Integer nationid;

    /**
     * 事由
     */
    private Integer thingreasonid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 证件号码
     */
    private String papersnumber;

    /**
     * 出生日期
     */
    private String birthdate;

    /**
     * 发证机关
     */
    private String licenceissuingauthorty;

    /**
     * 单位或住址
     */
    private String unitsoraddress;

    /**
     * 证件有效期
     */
    private String papersvalidity;

    /**
     * 职业
     */
    private String profession;

    /**
     * 从何处来
     */
    private String wherearefrom;

    /**
     * 到哪里去
     */
    private String wheretogo;

    /**
     * 联系电话
     */
    private String contactphonenumber;

    /**
     * 备注
     */
    private String remarks;

    private static final long serialVersionUID = 1L;
}