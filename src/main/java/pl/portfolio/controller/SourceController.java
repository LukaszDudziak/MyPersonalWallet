package pl.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.portfolio.model.Source;
import pl.portfolio.repositories.SourceRepository;

@Controller
@RequestMapping("/source")
public class SourceController {

    @Autowired
    SourceRepository sourceRepository;

    @GetMapping("/addSource")
    public String addSource(Model model){
        model.addAttribute("source", new Source());
        return "sourceForm";
    }
    @PostMapping("/addSource")
    public String addSource(@ModelAttribute Source source){
        sourceRepository.save(source);
        return "sourceList";
    }
}
