package com.pb.controller;

import javax.annotation.Resource;

import com.pb.services.applicationTable.TableService;
import com.pb.services.book.BookService;
import com.pb.services.bookShelf.BookShelfService;
import com.pb.services.bookstore.BookStoreService;
import com.pb.services.template.TemplateService;
import com.pb.services.userRelated.InstitutionService;
import com.pb.services.userRelated.UserService;
import com.pb.services.projectRelated.ProjectService;
import com.pb.services.bookLendHistory.BookLendHistoryService;

public class BaseController {

    @Resource
    public InstitutionService institutionService;
    @Resource
    public TableService tableService;
    @Resource
    public TemplateService templateService;
    @Resource
    public ProjectService projectService;
    @Resource
    public UserService userService; 
    @Resource
    public BookShelfService bookShelfService;
    @Resource
    public BookService bookService;
    @Resource
    public BookStoreService bookStoreService;
    @Resource
    public BookLendHistoryService bookLendHistoryService;
  
}
