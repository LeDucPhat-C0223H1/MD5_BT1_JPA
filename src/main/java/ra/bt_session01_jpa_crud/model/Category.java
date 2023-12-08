package ra.bt_session01_jpa_crud.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Categories")
public class Category {
    @Id
    @Column(name = "cat_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private boolean status;
    //--------------------

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "created_at")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "modified_at")
    private Date modifiedAt;

    public Category() {
    }

    // constructor thêm mới
    public Category(String name, String description, Date createdAt, Date modifiedAt) {
        this.name = name;
        this.description = description;
        this.status = true;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    // constructor full tham số
    public Category(Long id, String name, String description, boolean status, Date createdAt, Date modifiedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
