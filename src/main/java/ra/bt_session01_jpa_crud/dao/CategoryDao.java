package ra.bt_session01_jpa_crud.dao;

import org.springframework.stereotype.Component;
import ra.bt_session01_jpa_crud.model.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class CategoryDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Category> findAll(){
        return entityManager.createQuery("select C from Category C", Category.class).getResultList();
    }

    public Category findById(Long id){
        return entityManager.find(Category.class, id);
    }

    @Transactional
    public void save (Category category){
        if (category.getId() == null) {
            //thêm mới
            entityManager.persist(category);
        }else {
            // cập nhật
            entityManager.merge(category);
        }
    }

    @Transactional
    public void delete(Long id) {
        entityManager.remove(findById(id));
    }
}
