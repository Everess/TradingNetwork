package tnSpringHibernate.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tnSpringHibernate.exceptions.EntityNotFoundException;
import tnSpringHibernate.exceptions.EntityWasFoundException;
import tnSpringHibernate.exceptions.ModelResponse;
import tnSpringHibernate.models.Shop;
import tnSpringHibernate.services.ShopService;

import java.io.File;
import java.io.IOException;
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
    @Autowired
    private ModelResponse modelResponse;

    /**
     * Method allows get index page
     * @return index.jsp
     */
    /*@GetMapping("/shops")
    public ResponseEntity<Object> getStatus() throws IOException {
        return modelResponse.responseEntity(HttpStatus.OK, getAllShops());
    }*/

    /**
     * Test method findByNameOfShop
     */
    /*@GetMapping("/shops")
    public Shop getShopByName(Shop shop) {
        Shop shops = shopService.findByNameOfShop("METRO");
        return shops;
    }*/

    /**
     * Method allows get all shops and display at index page
     * @return
     */
    @GetMapping(value = "/shops")
    //@ResponseStatus(value = HttpStatus.FOUND, reason = "Shops load success")
    public ResponseEntity<Object> getAllShops() throws IOException {
        return modelResponse.responseEntity(HttpStatus.OK, "Success", shopService.findAllShops(), null);

        /* Test сondition */
        /* if(shops == null) {
            throw new EntityNotFoundException();
        } else {
            toJSON(shops);
            return shops;
        } */
    }

    // fetch('/shops').then(response => response.json().then(console.log))

}
