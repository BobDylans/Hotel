package com.hotel.myhotel.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * attributedetails
 * @author 
 */
@Data
public class Attributedetails implements Serializable {
    /**
     * 属性明细ID
     */
    private Integer id;

    /**
     * 属性ID
     */
    private Integer attributeid;

    /**
     * 属性明细名称
     */
    private String attributedetailsname;

    private static final long serialVersionUID = 1L;
}