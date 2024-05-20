package views;
import users.LoggedUser;

public class MainView{
    LoggedUser user = null;

    public MainView(LoggedUser user){
        this.user = user;
    }

    
        @Override
        public String toString() {
            return String.format(
            "<div class=\"container\">"+
            "<div class=\"row\">"+
              "<div class=\"col-md-6\">"+
                "<div class=\"row\">"+
                  "<div class=\"col-md-12 menu-item text-center\">"+
                    "<h3>ACB</h3>"+
                    "<p>Primera división española</p>"+
                    "<a href=\"acb.jsp\" class=\"btn btn-primary\">Ver más</a>"+
                  "</div>"+
                  "<div class=\"col-md-12 mb-4\"></div>"+
                  "<div class=\"col-md-12 menu-item text-center\">"+
                    "<h3>Conferencia Este</h3>"+
                    "<p>Conferencia Este de la NBA</p>"+
                    "<a href=\"este.jsp\" class=\"btn btn-primary\">Ver más</a>"+
                  "</div>"+
                "</div>"+
              "</div>"+
              "<div class=\"col-md-6\">"+
                "<div class=\"row\">"+
                  "<div class=\"col-md-12 menu-item text-center\">"+
                    "<h3>Conferencia Oeste</h3>"+
                    "<p>Conferencia Oeste de la NBA</p>"+
                    "<a href=\"oeste.jsp\" class=\"btn btn-primary\">Ver más</a>"+
                  "</div>"+
                  "<div class=\"col-md-12 mb-4\"></div>"+ 
                  "<div class=\"col-md-12 menu-item text-center\">"+
                    "<h3>Selecciones</h3>"+
                    "<p>Top 20 Selecciones a nivel mundial</p>"+
                    "<a href=\"selecciones.jsp\" class=\"btn btn-primary\">Ver más</a>"+
                  "</div>"+
                "</div>"+
              "</div>"+
            "</div>"+
          "</div>"+
        "</div>"                             
          );
        }
    }



