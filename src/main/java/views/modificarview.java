package views;

import users.LoggedUser;

public class modificarview {
    LoggedUser user = null;
    equipos equipo = null;
    String tabla;
    public modificarview(equipos equipo, LoggedUser user, String tabla){
        this.equipo = equipo;
        this.user = user;
        this.tabla = tabla;
    }

    @Override
    public String toString() {
        return String.format((new HeaderView(user))+
        "<div class=\"card\">" +
        "<div class=\"card-header\">" +
          "Modificación" +
        "</div>" +
        "<div class=\"card-body\">" +
          "<form action=\"doModification.jsp\" method=\"POST\">" +
            "<div class=\"mb-3\">" +
              "<label for=\"nombre\" class=\"form-label\">Nombre:</label>" +
              "<input type=\"text\" class=\"form-control\" id=\"actnombre\" name=\"actnombre\" value=\""+equipo.getNombre()+"\">" +
            "</div>" +
            "<div class=\"mb-3\">" +
              "<label for=\"entrenador\" class=\"form-label\">Entrenador:</label>" +
              "<input type=\"text\" class=\"form-control\" id=\"actentrenador\" name=\"actentrenador\" value=\""+equipo.getEntrenador()+"\">" +
            "</div>" +
            "<div class=\"mb-3\">" +
              "<label for=\"record\" class=\"form-label\">Récord:</label>" +
              "<input type=\"text\" class=\"form-control\" id=\"actrecord\" name=\"actrecord\" value=\""+equipo.getRecord()+"\">" +
            "</div>" +
            "<input type=\"hidden\" class=\"form-control\" id=\"actid\" name=\"actid\" value=\""+equipo.getid()+"\">" +
            "<input type=\"hidden\" class=\"form-control\" id=\"acttabla\" name=\"acttabla\" value=\""+tabla+"\">" +
            "<button type=\"submit\" class=\"btn btn-primary\">Guardar cambios</button>" +
          "</form>" +
        "</div>" +
      "</div>"
      );
    }
}
