package com.lktsuer.cloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lktsuer.cloud.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: djh
 * @date: 2020/9/25 13:00
 */
@Mapper
@Repository
public interface StudentMapper extends BaseMapper<Student> {

}

