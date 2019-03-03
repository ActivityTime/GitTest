package top.actim.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import top.actim.mapper.UsersMapper;
import top.actim.pojo.User;
import top.actim.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	@Resource
	private UsersMapper usersMapper;
	@Override
	public List<User> show() {
		return usersMapper.selAll();
	}

}
