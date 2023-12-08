package ra.bt_session01_jpa_crud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.bt_session01_jpa_crud.dao.CategoryDao;
import ra.bt_session01_jpa_crud.model.Category;
import ra.bt_session01_jpa_crud.service.CategoryService;

import java.util.List;


@Controller
@RequestMapping({"","/admin"})
public class AdminSidebarController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping({"","/dashboard"})
    public String index(Model model){
        model.addAttribute("view","dashboard");
        return "admin/index";
    }

    @RequestMapping("/category")
    public String catalog(Model model) {
        List<Category> categories = categoryService.findAll();
        model.addAttribute("view","category");
        model.addAttribute("categories", categories);
        return "admin/index";
    }

    @RequestMapping("/product")
    public String product(Model model){
        model.addAttribute("view","product");
        return "admin/index";
    }

    @RequestMapping("/user")
    public String user(Model model){
        model.addAttribute("view","user");
        return "admin/index";
    }
}
