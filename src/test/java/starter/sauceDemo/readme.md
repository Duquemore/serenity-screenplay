# Requisitos para ejecutar las pruebas automatizadas

### Requisitos del Sistema
- **Versión de Java**: Se necesita Java 17 o superior.
- **Maven**: Para gestionar las dependencias y ejecutar las pruebas.
- **Navegadores soportados**: Chrome.

### Configuración de Propiedades:
- **Versión de la aplicación**: 1.0.0
- **Entorno**: Carrera QA

### Ejecución de las Pruebas:
- Las pruebas se pueden ejecutar con el comando `mvn clean verify`.
- El reporte se genera automáticamente en la carpeta `target/site/serenity`.

### Información adicional:
- Las pruebas están automatizadas usando Serenity BDD.
- Los resultados incluyen la versión de aplicación y el entorno.
