package net.huatech.tiku.dao;

import net.huatech.tiku.bean.CategoryBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends CrudRepository<CategoryBean, Integer> {
}
