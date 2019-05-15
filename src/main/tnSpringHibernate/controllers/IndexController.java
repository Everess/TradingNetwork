package tnSpringHibernate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tnSpringHibernate.models.Shop;
import tnSpringHibernate.services.ShopService;

import java.util.List;

/**
 * Implement the ability to accept http requests and return json
 */
@RestController
/**
 * Adding a prefix at controller level to other request mapping at the method level
 */
@RequestMapping(value = "/")
public class IndexController {

    /**
     * Connect to service from Shop
     */
    @Autowired
    private ShopService shopService;

    /**
     * Method allows get index page
     * @return index.jsp
     */
    @GetMapping
    public String getIndex() {
        return "index";
    }

    /**
     * Method allows get all shops and display at index page
     * @return
     */
    @GetMapping(value = "/shops")
    public List<Shop> getAllShops() {
        List<Shop> shops = shopService.findAll();

        return shops;
    }

}
