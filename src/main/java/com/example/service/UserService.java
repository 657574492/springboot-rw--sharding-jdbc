package com.example.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	// 使用读的数据源
	public List<User> findUser() {
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		return userMapper.selectList(queryWrapper);
	}

	public User queryById(Long id) {
		return userMapper.queryById(id);
	}

	public Boolean insert(Long id){
		User user = new User();
		 id = IdWorker.getId();
		user.setId(id);
		user.setName(id.toString());
		return  userMapper.insert(user) > 0;
	}
}
