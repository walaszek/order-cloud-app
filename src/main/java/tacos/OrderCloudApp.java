package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // <1>
public class OrderCloudApp {

  public static void main(String[] args) {
    SpringApplication.run(OrderCloudApp.class, args); // <2>
  }

}
