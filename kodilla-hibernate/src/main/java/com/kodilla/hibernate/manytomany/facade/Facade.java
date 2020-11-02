package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Facade {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    public List<Company> processFindCompanyByPartOfName(String name) {
        return companyDao.findCompanyByPartOfName("%" + name + "%");
    }

    public List<Employee> processFindEmployeeByPartOfName(String name) {
        return  employeeDao.findEmployeeByPartOfName("%" + name + "%");
    }
}
