
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.entity.Product;
import org.example.repository.ProductRepository;
import org.example.service.ProductService;
import org.mockito.Mockito;
import org.junit.Assert;

import java.util.List;

public class SearchProductSteps {
    private ProductRepository productRepository;
    private ProductService productService;
    private Product product;
    private String result;

    @Given("User is on search bar")
    public void userIsOnSearchBar() {
    productRepository = Mockito.mock(ProductRepository.class);
    productService = new ProductService(productRepository);
    product = new Product();
    }

    @When("User fills in a name of a product")
    public void userFillsInANameOfAProduct() {
    Mockito.when(productRepository.findByName(product.getName())).thenReturn(List.of(product));
    result = productService.findByName(product.getName()).toString();

    }

    @Then("User should see a list of products that match the name")
    public void userShouldSeeAListOfProductsThatMatchTheName() {
    Assert.assertEquals(


    }
}
