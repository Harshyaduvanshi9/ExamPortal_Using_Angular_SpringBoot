package com.examportal.exam.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examportal.exam.Model.Exams.Category;
import com.examportal.exam.Services.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    
    @PostMapping("/")
    public ResponseEntity<?> addCategory(@RequestBody Category category)
    {
     Category cat1=this.categoryService.addCategory(category);
     return  ResponseEntity.ok(cat1);
    }

    
    @GetMapping("/{categoryId}")
    public Category getCategory(@PathVariable("categoryId") Long categoryId)
    {

        return  this.categoryService.getCategory(categoryId);
    }

    
    @GetMapping("/")
    public ResponseEntity<?> getCategories()
    {
        return  ResponseEntity.ok(this.categoryService.getCategories());
    }


    @PutMapping("/")
    public  Category updateCategory(@RequestBody Category category)
    {
        return this.categoryService.updateCategory(category);
    }

    
    @DeleteMapping("/{catId}")
    public  void  DelteCategory(@PathVariable("catId") Long catId)
    {
        this.categoryService.delete(catId);
    }


}
