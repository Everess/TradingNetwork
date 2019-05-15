package tnSpringHibernate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Test controller
 */
@Controller
public class HelloController {

    /**
     * Test display of the message using the model
     * @param model
     * @return helloworld.jsp
     */
    @GetMapping(value = "/helloworld")
    public String print(Model model) {
        model.addAttribute("message", "Hello");

        return "helloworld";
    }

    /**
     * Test autowired for Delivery bean in application-context.xml
     */
    /*
    @Autowired
    private Delivery deliveryBean;*/

    /**
     * Test controller to display the test page.jsp
     * @param request
     * @param response
     * @return model
     * @throws Exception
     */
    /*@RequestMapping(value = "/")
    public ModelAndView hello1(HttpServletRequest request,
                               HttpServletResponse response) throws Exception {

        String msg = "Hello";
        return new ModelAndView("page", "msg", msg);

    }*/

}