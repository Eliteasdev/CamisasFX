# 🖥️CamisasFX

Este proyecto es una práctica sobre cómo utilizar la herramienta de Unit Testing JUnit en su versión 5.9, la aplicación
es un software que calcula el descuento se aplicará según sea el número de productos que se va comprar. Teniendo
únicamente tres productos los cuales son todos camisas.

__Interfaz de la aplicación:__

![](https://github.com/Eliteasdev/CamisasFX/blob/main/public/UI.png?raw=true)

__Testing realizado:__

![](https://github.com/Eliteasdev/CamisasFX/blob/main/public/Testing.png?raw=true)
__Nota:__ A la hora de realizar el testing con la librería de JUnit 5.9 el IDE lanzaba un error por incompatibilidad con
el empaquetador, una solución temporal que encontré es eliminar el archivo __“module-info.java”__ del proyecto. Una vez
terminadas las pruebas se debe restablecer dicho archivo para que la compilación se realice satisfactoriamente.

## 📓Comenzando

Puedes clonar el repositorio con el siguiente comando:

~~~git
git clone https://github.com/Eliteasdev/CamisasFX.git
~~~

Una vez clonado el repositorio abre el archivo __“build.gradle”__ que se encuentra en la raíz del proyecto, hecho esto
debes sincronizar el proyecto. Hecho esto se descargarán las librerías necesarias para poder modificarlo.

### Estructura del proyecto

~~~js
CamisasFX
│   README.md
|   .gitignore
|   build.gradle
|   gradlew
|   gradle.bat
|   settings.gradle
│   📁️.gradle    
│   📁️.idea
│   📁️build
│   📁️public
└───📁️public [Archivos para Readme en Github]
|
└───📁️src
|   │   📁️main
|   │   📁️test
~~~

### 🛠️Pre-requisitos

* [Intellij idea community](https://www.jetbrains.com/idea/)
* [JDK 11](https://jdk.java.net/archive/)
