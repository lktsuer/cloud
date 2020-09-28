package com.lktsuer.cloud.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: djh
 * @date: 2020/9/25 12:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Student implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer stuId;
    private String stuName;
    private String stuPwd;
    private String stuSex;
    private String stuEmail;
    private Date stuBirth;
    private String dbSource;
}
