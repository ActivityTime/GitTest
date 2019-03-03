package top.actim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import top.actim.pojo.User;

public interface UsersMapper {
	@Select("select * from user")
	List<User> selAll();
}
