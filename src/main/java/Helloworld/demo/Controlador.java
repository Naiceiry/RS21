package Helloworld.demo;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class Controlador {


    @RequestMapping(value="/addHouse", method = RequestMethod.POST, consumes = "application/json" )
    public House addHouse(@RequestBody House house){
        System.out.println("Post Realizado");
        return house;
    }

    @GetMapping("/GetHouse/{ID}")
    public String ConsultHouse(@PathVariable("ID") String id) { /*para manejar variables de plantilla en la asignación de URI de solicitud y establecerlas como parámetros de método*/
        return "House con ID: " +id+ " encontrada";
    }
    /*El método PUT es idempotente en HTTP lo que significa que producirá el mismo resultado si se ejecuta varias veces
El método POST no es idempotente, ya que si se ejecuta varias veces está creando varios elementos
se utiliza para actualizar(reemplazar) una entidad existente
Usted debe utilizar POST para crear nuevos recursos y PUT para actualizar los recursos existentes
Utilice PUT cuando conozca el «id» del objeto, p. Orden, Libro, Empleado
Utilice POST cuando necesite que el servidor controle la generación de URL de sus recursos
Ejemplos:
PUT/items/1/update
POST/items/create*/

    @PutMapping("/put/house")
//Set<Map.Entry<K,V>>: El tipo de datos devuelto, así que utilícelo para recibir la colección de objetos devueltos.
        public String putHouse(@RequestParam Map<String, String> idhouse) {
        return "ID house is: " + idhouse.entrySet();
    }


    /* @RequestParam para extraer parámetros de consulta, parámetros de formulario e incluso archivos de la solicitud.*/

}
