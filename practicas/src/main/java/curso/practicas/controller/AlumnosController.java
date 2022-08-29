package curso.practicas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import curso.practicas.model.Alumno;
import curso.practicas.service.AlumnoService;
import curso.practicas.utils.ResponseController;
import curso.practicas.utils.ResponseObject;

@RestController
@RequestMapping("/alumno")
public class AlumnosController extends ResponseController{
    
    @Autowired
    AlumnoService service;

    @GetMapping(value="/getAll")
    public ResponseObject getAll(){
        try {
            return setResponse(service.getAll(), 200, "");
        } catch (Exception e) {
            return setResponse(null, 203, e.getMessage());
        }
    }
        
    @GetMapping(value="/getById/{id}")
    public ResponseObject getById(@PathVariable int id){
        try {
            return setResponse(service.getById(id), 200, "");
        } catch (Exception e) {
            return setResponse(null, 203, e.getMessage());
        }
    }
        
    @PostMapping(value="/save")
    public ResponseObject save(@RequestBody Alumno alumno){
        try {
            return setResponse(service.save(alumno), 200, "");
        } catch (Exception e) {
            return setResponse(null, 203, e.getMessage());
        }
    }

    @PutMapping(value="/update")
    public ResponseObject update(@RequestBody Alumno alumno){
        try {
            return setResponse(service.update(alumno), 200, "");
        } catch (Exception e) {
            return setResponse(null, 203, e.getMessage());
        }
    }

    @DeleteMapping(value="/delete/{id}")
    public ResponseObject delete(@PathVariable int id){
        try {
            return setResponse(service.delete(id), 200, "");
        } catch (Exception e) {
            return setResponse(null, 203, e.getMessage());
        }
    }
}
