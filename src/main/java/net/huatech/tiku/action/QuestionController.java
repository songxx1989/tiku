package net.huatech.tiku.action;

import net.huatech.tiku.bean.QuestionBean;
import net.huatech.tiku.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    private QuestionDao questionDao;

    @GetMapping("/ques")
    public List<QuestionBean> questionList() {
        return (List<QuestionBean>) questionDao.findAll();
    }

    @PostMapping("/ques")
    public QuestionBean addQuestion(QuestionBean questionBean) {
        return questionDao.save(questionBean);
    }

    @DeleteMapping("/ques/{id}")
    public int delQuestion(@PathVariable int id) {
        if (questionDao.exists(id)) {
            questionDao.delete(id);
        }
        return id;
    }

    @GetMapping("/ques/{id}")
    public QuestionBean question(@PathVariable int id) {
        return questionDao.findOne(id);
    }
}
