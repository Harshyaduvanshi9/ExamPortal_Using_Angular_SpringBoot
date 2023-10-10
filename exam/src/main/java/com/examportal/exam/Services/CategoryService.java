package com.examportal.exam.Services;

import java.util.Set;

import com.examportal.exam.Model.Exams.Category;

public interface CategoryService {
    public Category addCategory(Category category);
    public Category updateCategory(Category category);
    public Set<Category> getCategories();
    public Category getCategory(Long categoryId);
    public void delete(Long categoryId);
    
}
