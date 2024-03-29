package com.example.demo3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;
import com.example.demo3.model.Themes;
import com.example.demo3.service.ThemeService;


@RestController
@CrossOrigin
public class ThemeController {

    @Autowired
    private ThemeService service;
    
    @PostMapping("/postTheme")
    public Themes postTheme(@RequestBody Themes theme)
    {
        return service.postTheme(theme);
    }
    @DeleteExchange("/deleteTheme/{name}")
    public void deleteTheme(@PathVariable String name)
    {
        service.deleteTheme(name);
    }
    @GetMapping("/getThemes")
    public List<Themes> getThemes()
    {
        return service.getThemes();
    }
    @PutMapping("/updateTheme")
    public Themes updateTheme(@RequestBody Themes theme)
    {
        return service.updateTheme(theme);
    }
}