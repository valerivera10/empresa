package com.empresa.empresa.infrastructure.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class incioControllers {

    @GetMapping("/home")
    public String home(Model model){
        return "home";
    }
    
    @GetMapping("/gestion")
    public String gestion(Model model){
        return "gestion";
    }
    @GetMapping("/users")
    public String users(Model model){
        return "users";
    }
   
    @GetMapping("/login")
    public String login() {
        return "login"; // Devuelve la vista login.html
    }

    @GetMapping("/servicioinsumo")
    public String servicioinsumo(Model model){
        return "servicioinsumo";
    }

    @GetMapping("/registrarcliente")
    public String registrarcliente(Model model){
        return "registrarcliente";
    }

    @GetMapping("/registrarempleado")
    public String registrarempleado(Model model){
        return "registrarempleado";
    }

    
    @GetMapping("/ordenesasignadas")
    public String ordenesasignadas(Model model){
        return "ordenesasignadas";
    }

    @GetMapping("/crearordenes")
    public String crearordenes(Model model){
        return "crearordenes";
    }
    @GetMapping("/visualizarcliente")
    public String visualizarcliente(Model model){
        return "visualizarcliente";
    }
}

