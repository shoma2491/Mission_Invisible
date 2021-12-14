package springboot_t7.mission_invisible.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * UserMapper
 */
@Mapper
public interface UserMapper {

    @Select("SELECT USERID FROM USER WHERE USERNAME = #{username};")
    User selectByUserName(String username);
}