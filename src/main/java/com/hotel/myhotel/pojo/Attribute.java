package com.hotel.myhotel.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * attribute
 * @author 
 */
@Data
public class Attribute implements Serializable {
    /**
     * 属性ID
     */
    private Integer id;

    /**
     * 属性名称
     */
    private String attributename;

    private static final long serialVersionUID = 1L;
}