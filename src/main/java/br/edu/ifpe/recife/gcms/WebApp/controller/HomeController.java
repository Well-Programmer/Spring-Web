package br.edu.ifpe.recife.gcms.WebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    public final String mensagem = "Aqui está nossa chance de fazer o mundo um lugar melhor!";

    @RequestMapping("/welry")
    public @ResponseBody String greeting(){
        return mensagem;
    }
}
