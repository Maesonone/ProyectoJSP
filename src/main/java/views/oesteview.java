package views;
import java.sql.SQLException;
import java.util.ArrayList;

import connectionpool.ConnectionPool;
import users.LoggedUser;

public class oesteview{
    LoggedUser user = null;

    public oesteview(LoggedUser user){
        this.user = user;
    }

    String url = "jdbc:mysql://localhost:3306/trabajojsp";
        String usuario = "ivan";
        String clave = "123456";

        ConnectionPool pool = new ConnectionPool(url, usuario, clave);
        tablas gservice = new tablas(pool.getConnection());
        @Override
        public String toString() {
            try {
                ArrayList<equipos> a = gservice.requestAll("oeste", "record");
                StringBuilder contenidoTabla = new StringBuilder();
                for (equipos equipo : a) {
                    contenidoTabla.append("<tr class=\"fila-tabla\">")
                                .append("<td>").append(equipo.getEntrenador()).append("</td>")
                                .append("<td>").append(equipo.getNombre()).append("</td>")
                                .append("<td>").append(equipo.getRecord()).append("</td>")
                                .append("<td><a href=\"modificar.jsp?id="+equipo.getid()+"&tabla=oeste\" class=\"btn btn-secondary\">Modificar</a> <a href=\"eliminar.jsp?id="+equipo.getid()+"&tabla=oeste\" class=\"btn btn-secondary\">Eliminar</a></td>")
                                .append("</tr>");
                }

                return String.format((new HeaderView(user))+
                                    "<div class=\"container\">" +
                                    "  <table class=\"table table-striped table-bordered\">" +
                                    "    <thead class=\"thead-dark\">" +
                                    "      <tr>" +
                                    "        <th scope=\"col\">Entrenador</th>" +
                                    "        <th scope=\"col\">Nombre</th>" +
                                    "        <th scope=\"col\">Récord</th>" +
                                    "        <th scope=\"col\">Acción</th>" +
                                    "      </tr>" +
                                    "    </thead>" +
                                    "    <tbody>%s</tbody>" +
                                    "  </table>" +
                                    "</div>" +
                                    "<div class=\"container\">" + 
                                    "   <a href=\"crear.jsp?tabla=oeste\" class=\"btn btn-primary\">Crear</a>"+ 
                                    "</div>" +
                                    "<style>" + // Estilos CSS para la tabla
                                    ".fila-tabla:hover {" + // Estilos aplicados cuando el cursor pasa sobre la fila
                                    "  cursor: pointer; /* Cambiar el cursor a una mano */" +
                                    "  background-color: #f5f5f5; /* Cambiar el color de fondo */" +
                                    "}" +
                                    "</style>", contenidoTabla.toString());

            } catch (SQLException e) {
            }     
            return null;
        }
    }
