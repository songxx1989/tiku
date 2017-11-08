package net.huatech.tiku.dao;

import net.huatech.tiku.bean.QuestionBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends CrudRepository<QuestionBean, Integer> {
}
