package com.hotel.myhotel.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * loginlog
 * @author 
 */
@Data
public class Loginlog implements Serializable {
    private Integer id;

    private String loginname;

    private String logintime;

    private String exittime;

    private static final long serialVersionUID = 1L;
}