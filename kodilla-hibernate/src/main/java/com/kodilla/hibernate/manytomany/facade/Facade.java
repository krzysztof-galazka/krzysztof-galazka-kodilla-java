package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    public List<Company> findCompanyByByPartOfName(String name){
        return companyDao.retrieveCompanyByPartOfName("%" + name + "%");
    }

    public List<Employee> findEmployeeByPartOfName(String name){
           return employeeDao.findEmployeeByPartOfName( "%" + name + "%");
    }

}
