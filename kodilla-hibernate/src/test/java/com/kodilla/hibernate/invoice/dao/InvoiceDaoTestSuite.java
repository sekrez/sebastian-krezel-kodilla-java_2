package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product01 = new Product("Cheese");
        Product product02 = new Product("Butter");
        Product product03 = new Product("Bread");
        Product product04 = new Product("Eggs");

        Item item01 = new Item(product01, new BigDecimal(30), 5);
        Item item02 = new Item(product02, new BigDecimal(120), 2);
        Item item03 = new Item(product03, new BigDecimal(8), 3);
        Item item04 = new Item(product04, new BigDecimal(1), 5);
        Item item05 = new Item(product02, new BigDecimal(5), 3);

        Invoice invoice1 = new Invoice("F1 05/05/2018");


        product01.getProductToItems().add(item01);
        product02.getProductToItems().add(item02);
        product03.getProductToItems().add(item03);
        product04.getProductToItems().add(item04);

        //When
        invoiceDao.save(invoice1);

        //Then
        //Do nothing

        //Clean UP
//        try {
//            invoiceDao.delete(invoice1);
//        } catch (Exception e) {
        // do nothing
//        }
    }
}
