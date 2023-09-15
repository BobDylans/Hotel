package com.hotel.myhotel.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * commodity
 * @author 
 */
@Data
public class Commodity implements Serializable {
    /**
     * 商品ID
     */
    private Integer id;

    /**
     * 商品类别ID
     */
    private Integer commoditytypeid;

    /**
     * 计量单位ID
     */
    private Integer uomid;

    /**
     * 商品名称
     */
    private String commodityname;

    /**
     * 销售价格
     */
    private BigDecimal saleprice;

    private static final long serialVersionUID = 1L;
}