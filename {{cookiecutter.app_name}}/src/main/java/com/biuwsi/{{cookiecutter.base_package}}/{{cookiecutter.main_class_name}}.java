package com.biuwsi.{{cookiecutter.base_package.replace('/', '.')}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.main_class_name}} {

    public static void main(String[] args) {
        SpringApplication.run({{cookiecutter.main_class_name}}.class, args);
    }

}