package views;

import java.sql.SQLException;

import users.LoggedUser;

public class crearview {
    LoggedUser user = null;
    String tabla;
    int id;
    public crearview(LoggedUser user, String tabla, tablas tabla_) throws SQLException{
        this.user = user;
        this.tabla = tabla;

        for (equipos e : tabla_.requestAll(tabla, null)) {
            this.id = e.getid()+1;
        }
    }

    @Override
    public String toString() {
        return String.format((new HeaderView(user))+
        "<div class=\"card\">" +
        "<div class=\"card-header\">" +
          "Modificación" +
        "</div>" +
        "<div class=\"card-body\">" +
          "<form action=\"doCreation.jsp\" method=\"POST\">" +
            "<div class=\"mb-3\">" +
              "<label for=\"nombre\" class=\"form-label\">Nombre:</label>" +
              "<input type=\"text\" class=\"form-control\" id=\"actnombre\" name=\"actnombre\" placeholder=\"Introduzca el nombre del equipo.\">" +
            "</div>" +
            "<div class=\"mb-3\">" +
              "<label for=\"entrenador\" class=\"form-label\">Entrenador:</label>" +
              "<input type=\"text\" class=\"form-control\" id=\"actentrenador\" name=\"actentrenador\" placeholder=\"Introduzca el entrenador del equipo.\">" +
            "</div>" +
            "<div class=\"mb-3\">" +
              "<label for=\"record\" class=\"form-label\">Récord:</label>" +
              "<input type=\"text\" class=\"form-control\" id=\"actrecord\" name=\"actrecord\" placeholder=\"Introduzca el record del equipo.\">" +
            "</div>" +
            "<input type=\"hidden\" class=\"form-control\" id=\"actid\" name=\"actid\" value=\""+id+"\">" +
            "<input type=\"hidden\" class=\"form-control\" id=\"acttabla\" name=\"acttabla\" value=\""+tabla+"\">" +
            "<button type=\"submit\" class=\"btn btn-primary\">Crear Equipo</button>" +
          "</form>" +
        "</div>" +
      "</div>"
      );
    }
}
