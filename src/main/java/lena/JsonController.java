package lena;

import lena.bean.Info;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @RequestMapping("/info")
    public Info info() {
        Info info = new Info();
        info.setId(1003220931);
        info.setName("LeeBoo");
        return info;
    }
}
