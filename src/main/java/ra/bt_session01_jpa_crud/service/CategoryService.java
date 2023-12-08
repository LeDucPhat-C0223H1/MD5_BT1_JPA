package ra.bt_session01_jpa_crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.bt_session01_jpa_crud.dao.CategoryDao;
import ra.bt_session01_jpa_crud.dto.request.CategoryRequest;
import ra.bt_session01_jpa_crud.model.Category;

import java.util.Date;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    public List<Category> findAll() {
        return categoryDao.findAll();
    }


    public Category findById(Long id) {
        return categoryDao.findById(id);
    }


    public void save(CategoryRequest categoryRequest) {
        categoryDao.save(
                new Category(categoryRequest.getName(), categoryRequest.getDescription(), new Date(), new Date()));
    }


    public void update(Category categoryEdit) {
        categoryEdit.setModifiedAt(new Date());
        categoryDao.save(categoryEdit);
    }


    public void delete(Long id) {
        categoryDao.delete(id);
    }
}
