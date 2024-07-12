Este proyecto es un Foro desarrollado utilizando Spring Framework y otras tecnologías relacionadas. Proporciona una plataforma donde los usuarios pueden registrarse, iniciar sesión, crear publicaciones, comentar en publicaciones y más.

Características
Registro de Usuarios: Permite a los usuarios registrarse proporcionando su nombre, apellido, correo electrónico y contraseña.

Inicio de Sesión: Los usuarios registrados pueden iniciar sesión utilizando su correo electrónico y contraseña.

Publicaciones: Los usuarios pueden crear nuevas publicaciones en diferentes categorías.

Comentarios: Los usuarios pueden comentar en las publicaciones existentes.

Gestión de Perfiles: Los usuarios pueden actualizar su información de perfil y cambiar sus contraseñas.

Tecnologías Utilizadas
Spring Boot: Utilizado para la configuración y manejo del backend de la aplicación.

Spring Security: Proporciona autenticación y autorización para proteger las rutas y recursos del sistema.

Spring Data JPA: Facilita la integración con la capa de persistencia de datos.

Thymeleaf: Motor de plantillas utilizado para renderizar las vistas del lado del servidor.

MySQL: Base de datos relacional utilizada para almacenar datos de usuarios, publicaciones y comentarios.

Requisitos Previos
Java 8 o superior instalado.

MySQL Server instalado y configurado.

Configuración del Proyecto
Clonar el Repositorio

bash
Copy code
git clone https://github.com/tu-usuario/foro-spring.git
cd foro-spring
Configuración de la Base de Datos

Crea una base de datos MySQL llamada foro_db.

Configura las credenciales de acceso a la base de datos en application.properties:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/foro_db?useSSL=false
spring.datasource.username=tu-usuario
spring.datasource.password=tu-contraseña
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
Compilar y Ejecutar

Puedes compilar y ejecutar la aplicación utilizando Maven:

bash
Copy code
mvn spring-boot:run
La aplicación estará disponible en http://localhost:8080.

Acceder al Foro

Abre tu navegador web y navega a http://localhost:8080 para acceder al foro.

Uso de la Aplicación
Registro e Inicio de Sesión: Regístrate como nuevo usuario o inicia sesión si ya tienes una cuenta.

Crear Publicaciones: Después de iniciar sesión, puedes crear nuevas publicaciones seleccionando la opción correspondiente.

Comentar en Publicaciones: Accede a una publicación y escribe tus comentarios.

Actualizar Perfil: Desde la sección de perfil, puedes actualizar tu información personal y cambiar tu contraseña.