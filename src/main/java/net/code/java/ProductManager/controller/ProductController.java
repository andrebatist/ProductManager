package net.code.java.ProductManager.controller;

import net.code.java.ProductManager.model.Product;
import net.code.java.ProductManager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Product> products = service.listAll();
        model.addAttribute("listProducts", products);
        return "index";
    }


}
