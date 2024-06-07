import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignInSteps {

    private UserService userService;
    private UserRepository userRepository;
    private User user;
    private String result;

    @Before
    public void setUp() {
        userRepository = Mockito.mock(UserRepository.class);
        userService = new UserService(userRepository);
        user = new User();
    }

    @Given("User is on the sign in page")
    public void userIsOnTheSignInPage() {

    }

    @When("User enters username and password")
    public void userEntersUsernameAndPassword() {
        user.setName("John");
        user.setPassword("password");
    }

    @When("User presses Sign in")
    public void userPressesSignIn() {
        List<User> users = new ArrayList<>();
        users.add(user);
        Mockito.when(userRepository.findByName(user.getName())).thenReturn(users);
        result = userService.connection(user);
    }

    @Then("User should be on the home page")
    public void userShouldBeOnTheHomePage() {
        assertEquals("Vous êtes connecté"+user, result);
    }

    @Then("User should see Invalid email or password")
    public void userShouldSeeInvalidEmailOrPassword() {
        assertEquals("Mot de passe incorrect !", result);
    }
}
