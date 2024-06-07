import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.entity.User;
import org.example.exception.AlreadyExisteException;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class SignUpSteps {

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

    @Given("User is on sign up page")
    public void userIsOnSignUpPage() {
    }

    @When("User fills in Username")
    public void userFillsInUsername() {
        user.setId(1);
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
        Mockito.when(userRepository.findByName(user.getName())).thenReturn(new ArrayList<>());
        Mockito.when(userRepository.add(user)).thenReturn(user);
        result = userService.register(user);
    }

    @Then("User should receive a confirmation email")
    public void userShouldReceiveAConfirmationEmail() {
        assertEquals("Vous êtes enregistré " + user, result);
    }

    @When("User fills in Username with an existing username")
    public void userFillsInUsernameWithAnExistingUsername() {
    }

    @Then("User should receive an error message")
    public void userShouldReceiveAnErrorMessage() {
        List<User> usersList = new ArrayList<>();
        usersList.add(user);
        Mockito.when(userRepository.findByName(user.getUsername())).thenReturn(usersList);
        assertThrows(AlreadyExisteException.class, () -> userService.register(user));
    }
}
