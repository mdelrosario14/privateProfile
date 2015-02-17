package pp.core.model;

/**
 * Main model of the Private Profile.
 * @author Mardolfh
 *
 */
public class Profile {
    private String lastName;
    private String firstName;
    private String middleName;

    public String getLastName() {
        return this.lastName;
    }
    public String getFirstName() {
		return this.firstName;
    }
    public String getMiddleName() {
        	return this.middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
