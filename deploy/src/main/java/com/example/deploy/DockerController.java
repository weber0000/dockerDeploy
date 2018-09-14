package com.example.deploy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weberliu
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/9/13 14:51
 */
@RestController
public class DockerController {

    @RequestMapping("/")
    public String index(){
        return "Hello Docker!";
    }
}
