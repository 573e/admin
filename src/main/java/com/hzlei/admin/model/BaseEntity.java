package com.hzlei.admin.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: BaseEntity
 * @Author hzlei
 * @Date 2019/12/7 21:51
 */
@Data
public abstract class BaseEntity<ID extends Serializable> implements Serializable {

    private static final long serialVersionUID = 8925514045582235838L;
    private ID id;
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date createTime = new Date();
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date updateTime = new Date();

}

