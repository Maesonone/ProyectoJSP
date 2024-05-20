package views;

import users.LoggedUser;

public class Perfilview {
    LoggedUser user = null;
    public Perfilview(LoggedUser user){
        this.user = user;
    }

    @Override
    public String toString() {
        return String.format((new HeaderView(user))+
        "<div class=\"card\">" +
        "<div class=\"card-header\">" +
          "Perfil" +
        "</div>" +
        "<div class=\"card-body\">" +
          "<form action=\"ActualizaPerfil.jsp\" method=\"POST\">" +
            "<div class=\"mb-3\">" +
              "<label for=\"nombre\" class=\"form-label\">Nombre:</label>" +
              "<input type=\"text\" class=\"form-control\" id=\"actnombre\" name=\"actname\" value=\""+user.getName()+"\">" +
            "</div>" +
            "<div class=\"mb-3\">" +
              "<label for=\"surname\" class=\"form-label\">Apellidos:</label>" +
              "<input type=\"text\" class=\"form-control\" id=\"actsurname\" name=\"actsurname\" value=\""+user.getSurname()+"\">" +
            "</div>" +
            "<div class=\"mb-3\">" +
              "<label for=\"email\" class=\"form-label\">Correo electrónico:</label>" +
              "<input type=\"email\" class=\"form-control\" id=\"actemail\" name=\"actemail\" value=\""+user.getEmail()+"\">" +
            "</div>" +
            "<div class=\"mb-3\">" +
              "<label for=\"username\" class=\"form-label\">Username:</label>" +
              "<input type=\"text\" class=\"form-control\" id=\"actusername\" name=\"actusername\" value=\""+user.getUsername()+"\">" +
            "</div>" +
            "<button type=\"submit\" class=\"btn btn-primary\">Guardar cambios</button>" +
          "</form>" +
        "</div>" +
      "</div>"
      );
    }
}
