package com.dguan.test.pageHelper;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Di Guan on 8/4/2021 7:16 PM
 */
@Data
public class Page implements Serializable {

    private Integer currentPage;
    private Integer count;

}
