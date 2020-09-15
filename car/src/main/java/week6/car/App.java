package week6.car;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
@EnableAutoConfiguration

public class App 
{
	private static ArrayList<Car> cars = new ArrayList<Car>();
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@RequestMapping(value = "/car", method=RequestMethod.POST)
	public ResponseEntity<List<Car>> add(@RequestBody Car car) {
		App.cars.add(car);
		return new ResponseEntity<List<Car>>(cars, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/car/{id}", method=RequestMethod.PATCH)
	public ResponseEntity<List<Car>> update(@PathVariable("id") int id ,@RequestBody Car car) {
		App.cars.set(id-1, car);
		return new ResponseEntity<List<Car>>(cars, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/car/{id}", method=RequestMethod.GET)
	public ResponseEntity<Car> get(@PathVariable("id") int id) {
		return new ResponseEntity<Car>(App.cars.get(id-1), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/car/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<List<Car>> delete(@PathVariable("id") int id) {
		App.cars.remove(id-1);
		return new ResponseEntity<List<Car>>(cars, HttpStatus.OK);
	}
}
