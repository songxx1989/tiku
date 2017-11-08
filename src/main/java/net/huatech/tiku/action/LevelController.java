package net.huatech.tiku.action;

import net.huatech.tiku.bean.LevelBean;
import net.huatech.tiku.dao.LevelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LevelController {
    @Autowired
    private LevelDao levelDao;

    @GetMapping("/level")
    public List<LevelBean> levelList() {
        return (List<LevelBean>) levelDao.findAll();
    }

    @PostMapping("/level")
    public LevelBean addLevel(LevelBean levelBean) {
        return levelDao.save(levelBean);
    }

    @DeleteMapping("/level/{id}")
    public int delLevel(@PathVariable int id) {
        if (levelDao.exists(id)) {
            levelDao.delete(id);
        }
        return id;
    }
}
