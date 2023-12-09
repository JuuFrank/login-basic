package login.basic.Controller;



import login.basic.entities.Client;
import login.basic.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {


    @Autowired
    private ClienteService clientService;

    @GetMapping("/")
    public String getShowPage(){
        return "page_login";
    }

    @GetMapping("/register")
    public String getRegisterPage(){
        return "page_register";
    }

    @PostMapping("/register")
    public String register(@RequestParam String name, @RequestParam String correo, @RequestParam String password, Model model) {
        // Validar si el correo electrónico ya está registrado
        Client existingClient = clientService.findByCorreo(correo);
        if (existingClient != null) {
            model.addAttribute("error", "emailExists");
            return "page_register";
        }
        Client newClient = new Client();
        newClient.setName(name);
        newClient.setCorreo(correo);
        newClient.setPassword(password);
        clientService.saveClient(newClient);
        return "register_success";
    }


    @PostMapping("/login")
    public String login(@RequestParam String correo, @RequestParam String password, Model model) {
        // Lógica de inicio de sesión
        Client client = clientService.findByCorreo(correo);
        if (client != null && client.getPassword().equals(password)) {
            return "login_success"; // Cambia a la ruta deseada después de iniciar sesión correctamente
        } else {
            model.addAttribute("error", "Cuenta inexistente");
            return "page_login"; // Mantener al usuario en la página de inicio de sesión
        }
    }

    @GetMapping("/clients")
    public Iterable<Client> getAllUsers() {
        // Obtener todos los usuarios
        return clientService.getAllUsers();
    }

}
