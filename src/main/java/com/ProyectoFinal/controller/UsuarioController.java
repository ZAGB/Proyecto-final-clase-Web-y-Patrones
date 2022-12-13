
package com.ProyectoFinal.controller;



import com.ProyectoFinal.Service.UsuarioService;
import com.ProyectoFinal.domain.Usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/usuario/loginUsuario")
    public String Ingresar(Model model){
        log.info("Estamos usando arquitectura MVC");
        
        var usuarios =usuarioService.getUsuarios();
        model.addAttribute("usuarios", usuarios);
  
    return "/usuario/loginUsuario";
    } 
    
    @GetMapping("/usuario/InfUsuario")
    public String PerfilUsuario(Model model){
        log.info("Estamos usando arquitectura MVC");
        
        var usuarios =usuarioService.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        
    return "/usuario/InfUsuario";
    } 
    
    @GetMapping("/usuario/Retroalimentacion")
    public String RegistrarOModificar(Usuario usuario){
        log.info("Estamos usando arquitectura MVC");
      var usuarios =usuarioService.getUsuarios();
    return "/usuario/Retroalimentacion";
    } 
 
    
    @PostMapping("/usuario/guardarInfo")
    public String guardarUsuario(Usuario usuario){
        log.info("Estamos guardando");
        usuarioService.save(usuario);
    return "redirect:/usuario/Retroalimentacion";
    } 
    
}
