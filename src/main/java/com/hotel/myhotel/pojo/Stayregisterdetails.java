package com.hotel.myhotel.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * stayregisterdetails
 * @author 
 */
@Data
public class Stayregisterdetails implements Serializable {
    /**
     * 住宿登记明细id
     */
    private Integer id;

    /**
     * 住宿登记id
     */
    private Integer stayregisterid;

    /**
     * 旅客id
     */
    private Integer passengerid;

    private static final long serialVersionUID = 1L;
}