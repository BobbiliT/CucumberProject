package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class usercarbooking {

	@Given("user try to select the car type {string} from application")
	public void user_try_to_select_the_car_type_from_application(String carname) {
		System.out.println("setp 1 :"+carname);
	}
	@When("user select car {string} and pick up point {string} and drop point {string}")
	public void user_select_car_and_pick_up_point_and_drop_point(String carname, String pick, String drop) {
			System.out.println("step 2 :"+carname+" "+pick+" "+drop);
	}
	@Then("driver starts the journey")
	public void driver_starts_the_journey() {
			System.out.println("step 3");
	}
	@Then("driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("step 4");
	}
	@Then("user pay the bill {int} rs")
	public void user_pay_the_bill_rs(Integer bill) {
		System.out.println("step 5 :"+bill);
	}
}
