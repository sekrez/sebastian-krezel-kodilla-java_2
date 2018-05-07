package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
public void testInvoiceDaoSave(){
    //Given
    Product egg = new Product("Egg");
    Product butter = new Product("Butter");
    Product milk = new Product("Milk");
    Product cheese = new Product("Cheese");

    Item item01 = new Item(cheese, new BigDecimal(120.00),4);
    Item item02 = new Item(butter, new BigDecimal(55.00),2);



    Invoice invoice01 = new Invoice("FV 01/05/2018");
    invoice01.getItems().add(item01);
    invoice01.getItems().add(item02);

    //When
    invoiceDao.save(invoice01);
    //int invoiceId = invoice01.getId();

    //Then
    //Assert.assertNotEquals(0,invoiceId);

    //CleanUp
}
}
