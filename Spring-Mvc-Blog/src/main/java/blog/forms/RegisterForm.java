
package blog.forms;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.validator.routines.EmailValidator;
import org.hibernate.validator.constraints.Email;

public class RegisterForm {
    @NotNull
    @Size(min=2, max=30, message = "Username size should be in the range [2...30]")
    private String username;

    @NotNull
    @Size(min=2, max=30, message = "First name should be in the range [2...30]")
    private String firstName;

    @NotNull
    @Size(min=2, max=30, message = "Last name should be in the range [2...30]")
    private String lastName;

    @NotNull
    @Email (message = "Please provide a valid email address")
    @Size(min=1, max=50 , message = "Please provide a valid email address")
    private String email;

    @NotNull
    @Size(min=1, max=50 , message = "Input correct pass")
    private String password;

    @NotNull
    @AssertFalse (message = "Passwords do not match")
    public boolean doPasswordsMatch() {
        if (password != confirmPassword) {
            return false;
        }
        return true;
    }
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword (String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
