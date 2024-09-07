package cv;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;

public class craearCV {

    public  void si(String filePath){
        // Crear un nuevo documento de Word
        XWPFDocument document = new XWPFDocument();

        // Método auxiliar para agregar párrafos al documento
        addParagraph(document, "Edad: 30 Años");
        addParagraph(document, "Dirección: Col. Villa Regina, Calle Villa Verenice 150, Pesquería, Nuevo León.");
        addParagraph(document, "Tel: (+52) 846-899-1975.");
        addParagraph(document, "E-mail: dlcgetzemani@Gmail.com");

        // Agregar un espacio grande, no se me ocurrio de otra forma, disculpe.
        addParagraph(document, "\n\n\n\n\n\n\n\n\n\n");

        center(document, "Perfil Profesional");
        addParagraph(document, "Ingeniero en Sistemas Computacionales con más de 5 años de experiencia en Quality Assurance (QA), tanto en pruebas manuales como automatizadas. He trabajado en procesos de pruebas y la implementación de soluciones para garantizar la calidad del software, con un enfoque en resultados.");
      

        center(document, "Formación Académica");
        addParagraph(document, "Ingeniería en Sistemas Computacionales\nInstituto Tecnológico Superior de Pánuco | 2012 - 2017");
        addParagraph(document, "Técnico en Informática.\nCentro de Bachillerato Tecnológico Industrial y de Servicios N° 55 | 2009 - 2012");

        center(document, "Habilidades Técnicas");
        addParagraph(document, "●Pruebas de Software: QA manual, QA automatizado, Selenium, Appium, Postman");
        addParagraph(document, "●Bases de Datos: MySQL, SQL Server.");
        addParagraph(document, "●ERP: Implementación y soporte en sistemas ERP (SIRE)");
        addParagraph(document, "●Herramientas de Gestión: Jira, Trello");

        center(document, "Experiencia Profesional");
        addParagraph(document, "OneCard, San Pedro, Nuevo León\nIngeniero QA Manual y Automatizado | Octubre 2021 - Presente");
        addParagraph(document, "●Implementé frameworks de pruebas automatizadas (Selenium, Appium, POM no pom.xml).");
        addParagraph(document, "●Ejecución de pruebas manuales y automatizadas para aplicaciones web y móviles (Android/iOS).");
        addParagraph(document, "●Desarrollé casos de prueba detallados basados en requerimientos de usuario para asegurar la cobertura de escenarios críticos.");
        addParagraph(document, "●Participé en la integración de APIs utilizando Postman para pruebas.");
        addParagraph(document, "●Colaboré con equipos de desarrollo para resolver defectos y asegurar la calidad del producto final.");
        addParagraph(document, "●Conocimientos de fintech.");
        
        addParagraph(document, "DataSystem, Monterrey, Nuevo León\nIngeniero QA Manual Tester | Octubre 2020 - Septiembre 2021");
        addParagraph(document, "●Realicé pruebas manuales en entornos de E-Commerce y aplicaciones móviles, asegurando la calidad de los entregables..");
        addParagraph(document, "●Ejecución de pruebas manuales web y móviles (Android/iOS).");
        addParagraph(document, "●Apoyé la automatización de procesos de despliegue en Jenkins.");
        
        addParagraph(document, "BATRA BUSINESS APPLICATION TRAINING SA DE CV, Pesquería, Nuevo León\nIngeniero Junior | Agosto 2020 - Octubre 2020");
        addParagraph(document, "●Configuré equipos y software para KIA Motors & Hyundai, apoyando la operatividad de los sistemas.");
        addParagraph(document, "●Gestioné inventarios y mantuve relaciones con proveedores para asegurar la continuidad operativa");
        
        
        addParagraph(document, "Banco Famsa, Monterrey, Nuevo León\nCoordinador de Pruebas Manuales | Septiembre 2019 - Agosto 2020");
        addParagraph(document, "●Coordinacion de ciclos de prueba, documentacion incidentes y seguimiento.");
        addParagraph(document, "●Ejecución de pruebas manuales web y móviles (Android/iOS).");
        addParagraph(document, "●Trabajé con proveedores de software para asegurar que las soluciones entregadas cumplían con los requisitos del banco.");
       
        addParagraph(document, "Sistemas Integrador de Recursos Empresariales (SIRE), Xalapa, Veracruz\nAnalista de Requerimientos y QA Manual | Julio 2017 - Julio 2019");
        addParagraph(document, "●Implementación del sistema y capacitación usuarios en el uso del ERP SIRE, además de documentar interfaces de usuario.");
        addParagraph(document, "●Ejecución de pruebas de escritorio.");
        addParagraph(document, "●Proporciona soporte técnico.");


        // Guardar el documento en un archivo
        try (FileOutputStream out = new FileOutputStream(filePath)) {
            document.write(out);
            System.out.println("Si, le compaprto mi CV, esta en raíz del proyecto:" + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Cerrar el documento
        try {
            document.close();
        } catch (IOException e) {
        	 System.err.println("Algo paso al cerrar el documento: " + e.getMessage() + " Una disculpa");
            e.printStackTrace();
        }
    }
    /**
     * Método auxiliar para agregar párrafos al documento.
     * JavaDoc o.u
     *
     * @param document El documento de Word donde se agregará el párrafo.
     * @param text     El texto del párrafo.
     */
    private void addParagraph(XWPFDocument document, String text) {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(text);
    }
    private void center(XWPFDocument document, String text) {
        XWPFParagraph titleParagraph = document.createParagraph();
        titleParagraph.setAlignment(ParagraphAlignment.CENTER);
        
        XWPFRun run = titleParagraph.createRun();
        run.setText(text);
        run.setBold(true);
        run.setFontSize(20);
    }
}