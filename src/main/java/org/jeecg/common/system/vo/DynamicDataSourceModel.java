package org.jeecg.common.system.vo;

import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class DynamicDataSourceModel {

    public DynamicDataSourceModel() {

    }

    public DynamicDataSourceModel(Object dbSource) {
        if (dbSource != null) {
            BeanUtils.copyProperties(dbSource, this);
        }
    }

    /**
     * id
     */
    private String id;
    /**
     * 数据源编码
     */
    private String code;
    /**
     * 数据库类型
     */
    private String dbType;
    /**
     * 驱动类
     */
    private String dbDriver;
    /**
     * 数据源地址
     */
    private String dbUrl;
    /**
     * 数据库名称
     */
    private String dbName;
    /**
     * 用户名
     */
    private String dbUsername;
    /**
     * 密码
     */
    private String dbPassword;

}
