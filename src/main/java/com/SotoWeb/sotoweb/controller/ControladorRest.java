package com.SotoWeb.sotoweb.controller;

import com.SotoWeb.sotoweb.entity.Employee;
import com.SotoWeb.sotoweb.entity.Enterprise;
import com.SotoWeb.sotoweb.entity.Profile;
import com.SotoWeb.sotoweb.entity.Transaction;
import com.SotoWeb.sotoweb.Enum.Enum_RoleName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class ControladorRest {


    @GetMapping("/employee")
    public String generarEmployee(){
        Employee miEmployee = new Employee(2L,"sotomark2021@gmail.com", new Profile(), Enum_RoleName.Admin, new Enterprise(), new ArrayList<Transaction>(),new Date(),new Date());
        return miEmployee.toString();
    }

    public String generarEnterprise(){
        Enterprise miEnterprise = new Enterprise(4L,"jdsotoca","01020304","3002345876","Calle 5 Nro. 5 - 5", new ArrayList<Employee>(),new ArrayList<Transaction>(),new Date(),new Date());
        return miEnterprise.toString();
    }
    @GetMapping("/profile")
    public String generarProfile() {
        Profile miProfile = new Profile(1L,"imagen.jpg","3165035117",new Employee(), new Date(),new Date());
        return miProfile.toString();
    }

    @GetMapping("/transaction")
    public String generarTransaction(){
        Transaction miTransaction = new Transaction(3L,"Pago Nomina", 1350000, new Employee(), new Enterprise(), new Date(), new Date());
        return miTransaction.toString();
    }

}
