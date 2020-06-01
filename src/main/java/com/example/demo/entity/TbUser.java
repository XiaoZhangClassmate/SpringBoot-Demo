package com.example.demo.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户表(TbUser)实体类
 *
 * @author Helen
 * @since 2020-06-01 16:31:33
 */
@Data
public class TbUser implements Serializable {
    private static final long serialVersionUID = -45406702814612886L;
    
    private String id;
    /**
    * 创建时间
    */
    private Date createDate;
    /**
    * 更新时间
    */
    private Date updateDate;
    /**
    * 账号
    */
    private String userName;
    /**
    * 密码
    */
    private String passWord;

}