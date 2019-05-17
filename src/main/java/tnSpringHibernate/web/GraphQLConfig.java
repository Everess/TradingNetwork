package tnSpringHibernate.web;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import tnSpringHibernate.models.Shop;
import tnSpringHibernate.services.ShopService;

public class GraphQLConfig {

    @Autowired
    private ShopService shopService;

    @Bean
    public GraphQLQueryResolver queryResolver() {
        return new GraphQLQueryResolver() {
            public Shop shop(int idShop) {
                return shopService.findByIdShop(idShop);
            }
        };
    }

}
