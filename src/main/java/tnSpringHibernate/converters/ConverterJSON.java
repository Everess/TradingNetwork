package tnSpringHibernate.converters;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import tnSpringHibernate.models.Shop;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ConverterJSON {

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
