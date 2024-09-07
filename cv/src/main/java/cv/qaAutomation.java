package cv;

public class qaAutomation {
    // Crear una instancia de WordWriter
    static craearCV aceptoElReto = new craearCV();
    
    // Definir la ruta del archivo de salida, lo dejo en raiz del proyecto para no arriesgar x permisos.
    static String filePath = "CV_GetzemaniDelAngel.docx";

    public static void main(String[] args) {
        String requisitos[] = {
            "Manejo de Postman",
            "Selenium",
            "Experiencia manejando Jmeter",
            "Cucumber",
            "Análisis y pruebas (manuales, funcionales, finales e integrales)",
            "Deseable conocimientos en Cypress"
        };

        String ofrecemos[] = {
            "Trabajo 100% remoto",
            "Sueldo negociable en entrevista",
            "Beneficios adicionales"
        };

        System.out.println("QA AUTOMATION (100% remoto)");
        System.out.println("Oferta para México");
        System.out.println("Requisitos:");
        
        for (String requisito : requisitos) {
            System.out.println("\t- " + requisito);
        }

        System.out.println("Ofrecemos:");
        for (String ofrece : ofrecemos) {
            System.out.println("\t- " + ofrece);
        }

        System.out.println("Si estás interesado puedes enviar tu CV al correo talent.acquisition@xid.xyz o al número 5579424904");
        System.out.println("¿Aceptas el reto?");
        
        // Llamar al método para escribir en el archivo Word
        try {
			aceptoElReto.si(filePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Ups, algo salio mal, jeje contactame para revisarlo :D");
			e.getMessage();
		}
    }

}