package com.dguan.mybatis_plus.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Di Guan on 8/4/2021 7:16 PM
 */
@Data
public class PageHelper implements Serializable {

    private Integer currentPage;
    private Integer count;

}
