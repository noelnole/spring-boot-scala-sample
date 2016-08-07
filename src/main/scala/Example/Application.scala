package Example

import Example.Service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.{CommandLineRunner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
  * @author Noel Rodriguez
  */

@SpringBootApplication
class Application
  object Hello extends App{
    SpringApplication.run(classOf[Application]);
  }