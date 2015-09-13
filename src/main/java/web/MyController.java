package web;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
	
	@RequestMapping("/")
	String index() {
		return "Hello World!";
	}
        @RequestMapping("/area")
        double area(double radius) {
            return radius * radius * Math.PI;
        }
        @RequestMapping("/vat/{price}")
        double vat(@PathVariable double price) {
            return price * 7/100;
        }
        @RequestMapping("/zipcode/{Text}")
        int zipcode(@PathVariable String Text){
            String [] input = {"เมืองนนทบุรี","บางบัวทอง","ปากเกร็ด","บางกรวย","บางใหญ่","ไทรน้อย"}; 
            int [] number = {11000,11110,11120,11130,11140,11150};
            int i = 0;
            int Result = 0;
        while(i < input.length ){
            if (input[i].equals(Text)) {
                Result = number[i];
            }
            i = i + 1;
        }
            return Result; 
        }
        @RequestMapping("/car-tax/{cc}/{seat}")
        double calculate(@PathVariable int cc, @PathVariable int seat) {
            return cc * 0.75 + seat * 70;
}
        @RequestMapping("/soulmate/{name1}/{name2} ")
        boolean solomate(@PathVariable String name1,@PathVariable String name2){
            if (name1.length() != name2.length()) {
                return false;
            }
           return true;
        }
}

