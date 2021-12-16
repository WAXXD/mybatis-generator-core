package com.waxxd.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Date: 2021-12-16 17:44:01.
 * Table: data_needs.
 */
@Data
@Accessors(chain = true)
public class DataNeeds implements Serializable {
    /**
     *   Desc: 主键
     *   Column: id
     */
    private Long id;

    /**
     *   Desc: 需求类型
     *   Column: needs_type
     */
    private String needsType;

    /**
     *   Desc: 需求内容
     *   Column: needs_content
     */
    private String needsContent;

    /**
     *   Desc: 
     *   Column: creator
     */
    private String creator;

    /**
     *   Desc: 
     *   Column: create_time
     */
    private Date createTime;

    /**
     *   Desc: 
     *   Column: needs_status
     */
    private String needsStatus;

    /**
     *   Desc: 
     *   Column: current_operator
     */
    private String currentOperator;

    private static final long serialVersionUID = 1L;
}