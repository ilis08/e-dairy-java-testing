package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public abstract class User {

    /**
     * Default constructor
     */
    public User(String fname, String lname, String pass, String mail) {
    	firstName = fname;
    	lastName = lname;
    	password = pass;
    	email = mail;
    }


    private String email;
    private String firstName;
    private String lastName;
    private String password;

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return email;
    }

    /**
     * @param pass 
     * @return
     */
    public void setEmail(String email) {
        // TODO implement here
    	this.email = email;
    }

    /**
     * @return
     */
    public String getFirstName() {
        // TODO implement here
        return firstName;
    }

    /**
     * @param fname 
     * @return
     */
    public void setFirstName(String fname) {
        // TODO implement here
    	this.firstName = fname;
    }

    /**
     * @return
     */
    public String getLastName() {
        // TODO implement here
        return lastName;
    }

    /**
     * @param lname 
     * @return
     */
    public void setLastName(String lname) {
        // TODO implement here
    	this.lastName = lname;
    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return password;
    }

    /**
     * @param pass 
     * @return
     */
    public void setPassword(String pass) {
        // TODO implement here
    	this.password = pass;
    }

}