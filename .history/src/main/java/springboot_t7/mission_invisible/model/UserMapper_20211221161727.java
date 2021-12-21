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
    int selectByUserName(String username);

    @Select("SELECT USERID FROM USER WHERE ROLEID = #{roleId};")
    int selectUserIdByRoleId(int roleId);

    @Select("SELECT ROLEID FROM USER WHERE USERNAME = #{username};")    
    int selectRoleIdByUserName(String username);
}