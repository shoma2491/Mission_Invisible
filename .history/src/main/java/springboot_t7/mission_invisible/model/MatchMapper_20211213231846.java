package springboot_t7.mission_invisible.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import java.util.ArrayList;

@Mapper
public interface MatchMapper{

    /**
     * @param match
     */
    @Insert("INSERT INTO match (userId,turn,imgNum) VALUES (#{userId},#{turn},#{imgNum});")
}
