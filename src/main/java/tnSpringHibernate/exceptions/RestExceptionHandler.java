package tnSpringHibernate.exceptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;


@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * The method generates and saves to the file a response for the user by EntityNotFoundException
     * @param statusCode
     * @return response to page
     * @throws IOException
     */
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> handlerEntityNotFound(HttpServletResponse statusCode) throws IOException {
        /**
         * Add new object ModelException with parameters
         */
        ModelException me = new ModelException("Shops not found", EntityNotFoundException.class);

        /**
         * Create ObjectMapper for write json in file
         */
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.writeValue(new File("/home/matvey/IdeaProjects/tnSpringHibernate/src/main/java/tnSpringHibernate/response.json"), me);

        ModelResponse modelResponse = new ModelResponse();

        /**
         * Return json response in page
         */
        return modelResponse.responseEntity(HttpStatus.OK, "Not success",null, me);
    }

    /**
     * Test exception method
     */
    /*@ExceptionHandler(EntityWasFoundException.class)
    protected ResponseEntity<ModelException> handlerEntityWasFound() {
        return new ResponseEntity<>(new ModelException("Shops was found", HttpStatus.OK, EntityWasFoundException.class), HttpStatus.OK);
    }*/

    /**
     * Class describe custom exception model
     */
    public static class ModelException {

        /**
         * Error message
         */
        private String exceptionMessage;

        /**
         * Info about exception class
         */
        private Class exceptionName;

        /**
         * Default constructor
         */
        public ModelException() {

        }

        public ModelException(String exceptionMessage, Class exceptionName) {
            this.exceptionMessage = exceptionMessage;
            this.exceptionName = exceptionName;
        }

        /* Getters / Setters */

        public String getExceptionMessage() {
            return exceptionMessage;
        }

        public void setExceptionMessage(String exceptionMessage) {
            this.exceptionMessage = exceptionMessage;
        }

        public Class getExceptionName() {
            return exceptionName;
        }

        public void setExceptionName(Class exceptionName) {
            this.exceptionName = exceptionName;
        }

        @Override
        public String toString() {
            return "ModelException{" +
                    "exceptionMessage='" + exceptionMessage + '\'' +
                    ", exceptionName=" + exceptionName +
                    '}';
        }
    }

}
