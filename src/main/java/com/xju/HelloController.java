package com.xju;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 等同于 @Controller 加上 @ResponseBody
 */
@RestController
public class HelloController {
    
    /**
     * 访问 /hello 或者 /hi 任何一个地址，都会返回同样的结果
     * @GetMapping 等用于 @RequestMapping(method = RequestMethod.GET)
     */
    @GetMapping(value = {"/hello","/hi"})
    public String say() {
        return "How are you?";
    }
}