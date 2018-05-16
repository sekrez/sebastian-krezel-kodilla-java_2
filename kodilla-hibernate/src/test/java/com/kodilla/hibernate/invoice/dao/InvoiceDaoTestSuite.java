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
        Product cheese = new Product("Cheese");
        Product butter = new Product("Butter");
        Product bread = new Product("Bread");
        Product eggs = new Product("Eggs");

        Item item01 = new Item(cheese, new BigDecimal(30), 5);
        Item item02 = new Item(butter, new BigDecimal(120), 2);
        Item item03 = new Item(bread, new BigDecimal(8), 3);
        Item item04 = new Item(eggs, new BigDecimal(1), 5);
        Item item05 = new Item(eggs, new BigDecimal(5), 3);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item01);
        itemList.add(item02);
        itemList.add(item03);
        itemList.add(item04);
        itemList.add(item05);

        cheese.setItems(itemList);
        butter.setItems(itemList);
        bread.setItems(itemList);
        eggs.setItems(itemList);

        Invoice invoice = new Invoice("FV 07/05/2018");

        item01.setInvoice(invoice);
        item02.setInvoice(invoice);
        item03.setInvoice(invoice);
        item04.setInvoice(invoice);
        item05.setInvoice(invoice);


        //When
        invoiceDao.save(invoice);

        int invoiceID = invoice.getId();

        //Then
        Assert.assertNotEquals(0,invoiceID);

        //Clean UP
//        try {
//            invoiceDao.delete(invoice1);
//        } catch (Exception e) {
        // do nothing
//        }
    }
}
