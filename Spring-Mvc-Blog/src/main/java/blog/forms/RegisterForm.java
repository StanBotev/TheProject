
package blog.forms;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.validator.routines.EmailValidator;

public class RegisterForm {
    @NotNull
    @Size(min=2, max=30, message = "Username size should be in the range [2...30]")
    private String username;

    @NotNull
    @AssertFalse (message = "Please provide first name and last name")
    public boolean areThereTwoNames() {
        String[] names = fullName.split(" ");
        if (names.length < 2) {
            return false;
        }
        return true;
    }
    private String fullName;

    @NotNull
    @AssertFalse (message = "Please provide a valid email address")
    public boolean isValidEmail() {
        boolean valid = EmailValidator.getInstance().isValid(email);
        if (valid == true) {
            return true;
        }
        return false;
    }
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
