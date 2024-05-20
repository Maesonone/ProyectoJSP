package views;

import users.LoggedUser;

public class HeaderView {
    LoggedUser user = null;

    public HeaderView(LoggedUser user){
        this.user = user;
    }

    @Override
    public String toString() {
        return String.format("<nav id=\"barra\" class=\"navbar navbar-expand-lg navbar-light bg-orange\">" +
        "<div class=\"container-fluid\">" +
          "<a class=\"navbar-brand\" style=\"color: #fff; font-weight: bold;\">B-Info</a>" +
          "<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">" +
            "<span class=\"navbar-toggler-icon\"></span>" +
          "</button>" +
          "<div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">" +
            "<ul class=\"navbar-nav\">" +
              "<li class=\"nav-item\">" +
                "<a class=\"nav-link active\" aria-current=\"page\" href=\"home.jsp\" style=\"color: #fff;\">Inicio</a>" +
              "</li>" +
              "<li class=\"nav-item\">" +
                "<a class=\"nav-link\" href=\"Perfil.jsp\" style=\"color: #fff;\">Perfil</a>" +
              "</li>" +
              "<li class=\"nav-item\">" +
                "<a class=\"nav-link\" href=\"logout.jsp\" style=\"color: #fff;\">Cerrar Sesión</a>" +
              "</li>" +
            "</ul>" +
          "</div>" +
        "</div>" +
      "</nav>"
      
      );
    }
}