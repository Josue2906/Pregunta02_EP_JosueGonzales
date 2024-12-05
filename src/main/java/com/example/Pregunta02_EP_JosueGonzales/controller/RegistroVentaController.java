package com.example.Pregunta02_EP_JosueGonzales.controller;

import com.example.Pregunta02_EP_JosueGonzales.model.RegistroVenta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroVentaController {
    @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("registroVenta", new RegistroVenta());
        return "registro";
    }

    @PostMapping("/registro")
    public String procesarFormulario(RegistroVenta registroVenta) {
        // Puedes guardar el objeto en una base de datos o realizar otras acciones.
        return "exito";
    }
}
