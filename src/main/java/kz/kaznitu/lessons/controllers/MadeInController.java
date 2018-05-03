package kz.kaznitu.lessons.controllers;

import kz.kaznitu.lessons.models.MadeIn;
import kz.kaznitu.lessons.repositories.MadeInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MadeInController {

    @Autowired
    MadeInRepository madeInRepository;

    @RequestMapping(value = "/madeIns", method = RequestMethod.GET)
    public String madeInList(Model model) {
        model.addAttribute("madeIns", madeInRepository.findAll());
        model.addAttribute("madeIn", new MadeIn());
        return "madeIns";
    }

    @RequestMapping(value = "/savemadeIn", method = RequestMethod.POST)
    public String saveMadeIn(@ModelAttribute MadeIn madeIn) {
        madeInRepository.save(madeIn);
        return "redirect:/madeIns";
    }
}
