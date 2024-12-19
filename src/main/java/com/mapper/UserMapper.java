package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    /**
     * 根据用户名和密码查询用户对象
     * @param username
     * @param password
     * @return
     */
    @Select("select * from tb_user where username = #{username} and password = #{password}")
    User select(@Param("username") String username, @Param("password")  String password);

    /**
     * 根据用户名查询用户对象
     * @param username
     * @return
     */
    @Select("select * from tb_user where username = #{username}")
    User selectByUsername(String username);

    /**
     * 添加用户
     * @param user
     */
    @Insert("insert into tb_user values(null,#{username},#{password},'0',null)")
    void add(User user);

    /**
     *查询在线用户
     */
    @Select("select * from tb_user where online = '1'")
    List<User> selectOnline();

    /**
     * 用户在线
     * @param username
     */
    @Update("UPDATE tb_user SET online = '1',dateTime=#{datetime} WHERE username=#{username}")
    void updateOnline(@Param("username") String username, @Param("datetime")  String datetime);

    /**
     * 用户下线
     * @param username
     */
    @Update("update tb_user set online='0' where username=#{username}")
    void updateOffline(@Param("username") String username);
    /**
     * 根据用户名查询用户对象
     *
     * @return
     */
    @Select("select * from tb_user1 where id='1'")
    User selectByUsername1();
    /**
     * 添加用户
     * @param user
     */
    @Insert("insert into tb_user1 values(1,#{username},#{password},'1',#{dateTime})")
    void add1(User user);
    /**
     * 删除数据
     */
    @Delete("delete from tb_user1 where id=1")
    void delete1(@Param("id") Integer id);
    /**
     * 查询tbuser1是否有数据
     */
    @Select("select * from tb_user1 where id=1")
    User select1(@Param("id") Integer id);
}
