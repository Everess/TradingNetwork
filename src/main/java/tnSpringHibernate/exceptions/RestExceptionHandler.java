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
    protected ResponseEntity<ModelException> handlerEntityNotFound(HttpServletResponse statusCode) throws IOException {
        /**
         * Add new object ModelException with parameters
         */
        ModelException me = new ModelException("Shops not found", HttpStatus.NOT_FOUND, statusCode.getStatus(), EntityNotFoundException.class);

        /**
         * Create ObjectMapper for write json in file
         */
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.writeValue(new File("/home/matvey/IdeaProjects/tnSpringHibernate/src/main/java/tnSpringHibernate/response.json"), me);

        /**
         * Return json response in page
         */
        return new ResponseEntity<>(me, HttpStatus.NOT_FOUND);
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
    private static class ModelException {

        /**
         * Error message
         */
        private String message;

        /**
         * Http status(example: NOT_FOUND)
         */
        private HttpStatus httpStatus;

        /**
         * Response status code
         */
        private int statusCode;

        /**
         * Info about exception class
         */
        private Class exception;

        /**
         * Default constructor
         */
        public ModelException() {

        }

        public ModelException(String message, HttpStatus httpStatus, int statusCode, Class exception) {
            this.message = message;
            this.httpStatus = httpStatus;
            this.statusCode = statusCode;
            this.exception = exception;
        }

        /* Getters */
        public String getMessage() {
            return message;
        }

        public HttpStatus getHttpStatus() {
            return httpStatus;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public Class getException() {
            return exception;
        }

        /* Setters */

        public void setMessage(String message, HttpStatus httpStatus, int statusCode, Class exception) {
            this.message = message;
            this.httpStatus = httpStatus;
            this.statusCode = statusCode;
            this.exception = exception;
        }

        @Override
        public String toString() {
            return "ModelException{" +
                    "message='" + message + '\'' +
                    ", httpStatus=" + httpStatus +
                    ", statusCode=" + statusCode +
                    ", exception=" + exception +
                    '}';
        }

    }

}
