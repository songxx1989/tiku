package net.huatech.tiku.dao;


import net.huatech.tiku.bean.LevelBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelDao extends CrudRepository<LevelBean, Integer> {
}
