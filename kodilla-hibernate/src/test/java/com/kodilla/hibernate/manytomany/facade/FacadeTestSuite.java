package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


    @RunWith(SpringRunner.class)
    @SpringBootTest
    public class FacadeTestSuite {

        @Autowired
        private Facade facade;
        @Autowired
        private EmployeeDao employeeDao;
        @Autowired
        private CompanyDao companyDao;

        @Test
        public void testFindEmployeeByPartOfName() {
            //Given
            Employee johnSmith = new Employee("John", "Smith");
            Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
            Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

            //When
            employeeDao.save(johnSmith);
            int johnSmithId = johnSmith.getId();
            employeeDao.save(stephanieClarckson);
            int stephanieClarcksonId = stephanieClarckson.getId();
            employeeDao.save(lindaKovalsky);
            int lindaKovalskyId = lindaKovalsky.getId();

            List<Employee> employees = facade.findEmployeeByPartOfName("lind");

            //Then
            Assert.assertEquals(1, employees.size());

            //Cleanup
            employeeDao.deleteById(johnSmithId);
            employeeDao.deleteById(stephanieClarcksonId);
            employeeDao.deleteById(lindaKovalskyId);
        }

        @Test
        public void testFindCompanyByPartOfName() {
            //Given
            Company sidly = new Company("Sidly");
            Company restaurant = new Company("Restaurant");
            Company mechanic = new Company("mechanic");

            //When
            companyDao.save(sidly);
            int sidlyId = sidly.getId();
            companyDao.save(restaurant);
            int restaurantId = restaurant.getId();
            companyDao.save(mechanic);
            int mechanicId = mechanic.getId();

            List<Company> companies = facade.findCompanyByByPartOfName("si");

            //Then
            Assert.assertEquals(2, companies.size());

        }
    }

