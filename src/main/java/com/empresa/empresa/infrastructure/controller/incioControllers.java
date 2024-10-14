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
        return "login"; 
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





    @GetMapping("/Visulizarinsumos")
    public String Visulizarinsumos(Model model){
        return "Visulizarinsumos";
    }
    @GetMapping("/VisualizarInsumosProveedores")
    public String VisualizarInsumosProveedores(Model model){
        return "VisualizarInsumosProveedores";
    }
    @GetMapping("/Caso11")
    public String Caso11(Model model){
        return "Caso11";
    }
    @GetMapping("/Caso12")
    public String Caso12(Model model){
        return "Caso12";
    }
    @GetMapping("/Caso13")
    public String Caso13(Model model){
        return "Caso13";
    }
    @GetMapping("/Caso14")
    public String Caso14(Model model){
        return "Caso14";
    }
    @GetMapping("/Caso15")
    public String Caso15(Model model){
        return "Caso15";
    }
    @GetMapping("/Caso16")
    public String Caso16(Model model){
        return "Caso16";
    }
    @GetMapping("/Caso17")
    public String Caso17(Model model){
        return "Caso17";
    }
    @GetMapping("/Caso18")
    public String Caso18(Model model){
        return "Caso18";
    }
    @GetMapping("/Caso19")
    public String Caso19(Model model){
        return "Caso19";
    }
    @GetMapping("/Caso20")
    public String Caso20(Model model){
        return "Caso20";
    }
    @GetMapping("/Caso21")
    public String Caso21(Model model){
        return "Caso21";
    }
    
}

