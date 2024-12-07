package com.klef.jfsd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController 
{

	@GetMapping("/welcome")
	@ResponseBody
    public String welcome(Model model) {
        return "Welcome to Spring MVC!"; 
    }

    @GetMapping("/test")
    public String renderTestPage() {
        return "test"; 
    }

    @GetMapping("/showInfo")
    public String showInfo(
        @RequestParam("id") int id,
        @RequestParam("name") String name,
        Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showinfo"; // Refers to /WEB-INF/views/showinfo.jsp
    }

    // Perform arithmetic operations among values passed to the URL and display the result
    @GetMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("result", sum);
        return "calculateSum"; // Corresponding JSP: calculateSum.jsp
    }

    // Display a JSP file with an Employee Form
    @GetMapping("/employeeForm")
    public String employeeForm() {
        return "employeeForm"; // Corresponding JSP: employeeForm.jsp
    }

    // Take two values from the URL and print the result using JSP
    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("sum", sum);
        return "addNumbers"; // Corresponding JSP: addNumbers.jsp
    }

    // Take two string values, combine them, and print using JSP
    @GetMapping("/combine")
    public String combineStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        String combined = str1 + " " + str2;
        model.addAttribute("combined", combined);
        return "combineStrings"; // Corresponding JSP: combineStrings.jsp
    }

    // Take two values via the URL, perform addition and multiplication, and print the results in JSP
    @GetMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int sum = num1 + num2;
        int product = num1 * num2;
        model.addAttribute("sum", sum);
        model.addAttribute("product", product);
        return "calculate"; // Corresponding JSP: calculate.jsp
    }
	
	
	
	
	
	
}
