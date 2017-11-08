package net.huatech.tiku.action;

import net.huatech.tiku.bean.CategoryBean;
import net.huatech.tiku.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/category")
    public List<CategoryBean> categoryList() {
        return (List<CategoryBean>) categoryDao.findAll();
    }

    @PostMapping("/category")
    public CategoryBean addCategory(CategoryBean categoryBean) {
        return categoryDao.save(categoryBean);
    }

    @DeleteMapping("/category/{id}")
    public int delCategory(@PathVariable int id) {
        if (categoryDao.exists(id)) {
            categoryDao.delete(id);
        }
        return id;
    }
}
