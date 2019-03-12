package service.impl;

import dao.UserMapper;
import entity.User;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper mapper;

    /**
     * id删除
     */
    public boolean delete(int id) {
        return mapper.delete(id);
    }
    /**
     * 查询User的全部数据
     */
    public List<User> findAll() {
        List<User> findAllList = mapper.findAll();
        return findAllList;
    }
    /**
     * id查询对应数据
     */
    public User findById(int id) {
        User user = mapper.findById(id);
        return user;
    }
    /**
     * 新增数据
     */
    public void save(User user) {
        mapper.save(user);
    }
    /**
     *id修改对应数据
     */
    public boolean update(User user) {
        return mapper.update(user);
    }
}
