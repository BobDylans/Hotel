package com.hotel.myhotel.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * users
 * @author 
 */
@Data
public class Users implements Serializable {
    private String phone;
    private Integer id;

    private String username;

    private String password;

    private static final long serialVersionUID = 1L;
}