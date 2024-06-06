import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.mockito.Mockito;

import java.util.Collections;


public class SignUpSteps {

    private UserService userService;
    private UserRepository userRepository;
    private User user;
    private String result;

    @Given("User is on sign up page")
    public void userIsOnSignUpPage() {
        userRepository = Mockito.mock(UserRepository.class);
        userService = new UserService(userRepository);
        user = new User();
    }

    @When("User fills in Username")
    public void userFillsInUsername() {
        user.setName("John");
    }

    @And("User fills in Email")
    public void userFillsInEmail() {
        user.setEmail("john@example.fr");
    }

    @And("User fills in Password")
    public void userFillsInPassword() {
        user.setPassword("password");
    }

    @And("User presses Sign up")
    public void userPressesSignUp() {
        Mockito.when(userRepository.findByName(user.getName())).thenReturn(Collections.emptyList());
        result = userService.register(user);
    }

    @Then("User should receive a confirmation email")
    public void userShouldReceiveAConfirmationEmail() {
        assert result.equals("Vous êtes enregistré " + user);
    }

    @When("User fills in Username with an existing username")
    public void userFillsInUsernameWithAnExistingUsername() {
        user.setName("John");
    }

    @Then("User should receive an error message")
    public void userShouldReceiveAnErrorMessage() {
        assert result.equals("Un utilisateur déjà existant !");
    }
}
