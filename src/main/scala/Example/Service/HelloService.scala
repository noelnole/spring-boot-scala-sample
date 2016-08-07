package Example.Service

import org.springframework.stereotype.Service

/**
  * @author Noel Rodriguez
  */

@Service(value = "helloService")
class HelloService {

  def hello(): String = {
    "Helloooooooo"
  }
}
