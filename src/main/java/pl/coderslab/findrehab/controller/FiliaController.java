package pl.coderslab.findrehab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.findrehab.entity.Filia;
import pl.coderslab.findrehab.service.FiliaService;

import java.util.Collection;

@Controller
public class FiliaController {
    private FiliaService filiaService;

    public FiliaController(FiliaService filiaService) {
        this.filiaService = filiaService;
    }



    @GetMapping("/search")
    public String searchFiliaForm(){
                return "search";
    }

    @GetMapping("/search/city")
    @ResponseBody
    public String showAllFiliaByCity(@RequestParam String city){
        return filiaService.finAllByCityUsingQuery(city).toString();

    }

    @ModelAttribute("filias")
    Collection<Filia> findAllCities () {
        return filiaService.findAll();
    }
}
