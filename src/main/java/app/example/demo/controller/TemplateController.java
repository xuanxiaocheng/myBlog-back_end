package app.example.demo.controller;import lombok.Data;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;import org.springframework.boot.context.properties.ConfigurationProperties;import org.springframework.stereotype.Component;@RestController()public class TemplateController {    @Data    @Component    @ConfigurationProperties(prefix = "abc")    public class CoExample {        public String name;        public int age;    }    @RestController()    @RequestMapping("template")    public class MainController {        @Autowired        private CoExample example;        @GetMapping("/properties")        public CoExample properties() {            return example;        }    }}