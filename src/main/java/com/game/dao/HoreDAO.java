package com.game.dao;

import java.util.List;

import com.dao.core.MyBatisRepository;
import com.game.bean.UserHore;


@MyBatisRepository
public interface HoreDAO {

	public List<UserHore> queryAll();
}
