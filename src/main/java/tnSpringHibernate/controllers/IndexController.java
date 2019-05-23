package tnSpringHibernate.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tnSpringHibernate.exceptions.EntityNotFoundException;
import tnSpringHibernate.exceptions.EntityWasFoundException;
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
    private Shop shop;

    /**
     * Method allows get index page
     * @return index.jsp
     */
    @GetMapping
    public String getIndex() {
        return "index";
    }

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
    public List<Shop> getAllShops() throws EntityNotFoundException, EntityWasFoundException, IOException {
        List<Shop> shops = shopService.findAllShops();

        /* Test сondition*/
        if(shops != null) {
            throw new EntityNotFoundException();
        } else {
            toJSON(shops);
            return shops;
            //throw new EntityWasFoundException();
        }
    }

    // fetch('/shops').then(response => response.json().then(console.log))

    /**
     * TODO: Put in view jsp
     * @param ex
     * @return
     */
    /*@ExceptionHandler(ErrorField.class)
    public ModelAndView handleBadFileNameException(Exception ex) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("error", ex.getMessage());
        return modelAndView;
    }*/

    /**
     * Convert object from JSON, serialize Shops
     * @throws IOException
     */
    public static void toJSON(List<Shop> shops) throws IOException {
        /* Convert object to JSON and save in file*/
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(SerializationFeature.INDENT_OUTPUT, true); // Increases readability, increases json file size
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY); // Ignore empty inputs
        mapper.writerFor(new TypeReference<List
                <Shop>>() {
        }).writeValue(new File("/home/matvey/IdeaProjects/tnSpringHibernate/src/main/java/tnSpringHibernate/shops.json"), shops);

        /* Convert object to JSON and display at console */
        ObjectWriter ow = new ObjectMapper().writerFor(new TypeReference<List
                <Shop>>() {
        }).withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(shops);

        System.out.println("json created! \n" + json);
    }

    /**
     * Convert JSON to Object, deserialize Shops
     * @throws IOException
     */
    public static void toObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Shop shop = mapper.readValue(new File("/home/matvey/IdeaProjects/tnSpringHibernate/src/main/java/tnSpringHibernate/shops.json"), Shop.class);
    }

}
