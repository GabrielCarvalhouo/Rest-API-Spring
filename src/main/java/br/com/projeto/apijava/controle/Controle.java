package br.com.projeto.apijava.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {

    @GetMapping("")
    public String mensagem(){
        return "Hello World";
    }

    @GetMapping("/bvindas")
    public String boasVindas(){
        return "Seja bem vindo!";
    }

    @GetMapping("/bvindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo! " + nome;
    }
}
