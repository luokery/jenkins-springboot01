package org.demo.jenkins.springboot01.mapper.user;



import org.apache.ibatis.annotations.Mapper;
import org.demo.jenkins.springboot01.model.user.UserEntity;

/**
 * 用户表
 * @author 
 */
@Mapper
public interface UserMapper {
    
	/**
	 * 保持用户
	 * @param user
	 * @return
	 */
    int save(UserEntity user);
}
