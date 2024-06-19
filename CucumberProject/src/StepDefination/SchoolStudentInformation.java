package StepDefination;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SchoolStudentInformation {

	@Given("take student details from there parents")
	public void take_student_details_from_there_parents() {
	   System.out.println("take student details");
	}
	@When("now enter the student details one by one")
	public void now_enter_the_student_details_one_by_one(DataTable dataTable) {
	   List<List<String>> studentlist=dataTable.asLists(String.class);
	   for(List<String> e : studentlist) {
		   System.out.println(e);
	   }
	}
	@When("now enter the student details one by one with column")
	public void now_enter_the_student_details_one_by_one_with_column(DataTable dataTable) {
		List<Map<String, String>> userdata=dataTable.asMaps(String.class, String.class);
		for(Map<String, String> m :userdata) {
			System.out.println(m.get("name"));
			System.out.println(m.get("class"));
			System.out.println(m.get("age"));
			System.out.println(m.get("roll no"));
			System.out.println(m.get("phonenumber"));
		}
	}
	@Then("filled student details successfully")
	public void filled_student_details_successfully() {
	    System.out.println("student details successfully entered");
	}
}
//https://www.youtube.com/watch?v=7teAbPGyq2I&list=PLFGoYjJG_fqpObjigKg4bunu6_Ki7Ppn-&index=14