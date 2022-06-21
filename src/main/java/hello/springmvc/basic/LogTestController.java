package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j //자동으로 추가해줌 - private final Logger log = LoggerFactory.getLogger(getClass());
@RestController
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {

        String name = "Spring";

        /*
        +로 문자열 조합 안하는 이유 : 연산이 일어나면서 불필요한 resource를 사용하게 됨.
        실제로 출력이 되지 않는 로그레벨이여도 문자열 연산은 일어난다.
         */

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info( "info log={}", name);
        log.warn( "warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
