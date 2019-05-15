package tnSpringHibernate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import tnSpringHibernate.models.Shop;
import tnSpringHibernate.services.ShopService;

/**
 * Controller allows fill form for add new shop in database
 */
@Controller
/**
 * Adding a prefix at controller level to other request mapping at the method level
 */
@RequestMapping(value = "/form")
public class FormController {

    /**
     * Connect to service for Shop
     */
    @Autowired
    private ShopService shopService;

    /**
     * Method allows get form page
     * @return form.jsp
     */
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public String getIndex() {
        return "form";
    }

    /**
     * Method allows add new shops in database and display at form page
     * @return redirect from shops.jsp
     */
    @PostMapping(value = "/add")
    public String addShop(@RequestParam String nameOfShop,
                          @RequestParam Integer idSettlement) {
        Shop sh = new Shop(nameOfShop, idSettlement);
        shopService.saveShop(sh);

        return "redirect:/shops";
    }

}
