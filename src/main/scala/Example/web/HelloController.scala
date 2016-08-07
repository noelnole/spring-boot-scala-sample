package Example.web

import Example.Service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

/**
  * @author Noel Rodriguez
  */

@RestController
class HelloController @Autowired() (private val helloService : HelloService){


  @RequestMapping(value = Array("/hello"),method = Array(RequestMethod.GET))
  def hello(): String = {
    helloService.hello();
  }

}
