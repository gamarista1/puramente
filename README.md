# 📱 Análisis Técnico: Puramente (Android)

Este repositorio contiene los artefactos resultantes de la ingeniería inversa (descompilación) de la aplicación Android **Puramente**. 

**⚠️ Aviso Legal / Disclaimer:**
> Este repositorio tiene fines estrictamente **educativos y de investigación**. El código aquí alojado ha sido extraído mediante herramientas de descompilación y no representa el código fuente original propiedad de los desarrolladores. No se pretende infringir derechos de autor ni distribuir una versión modificada de la aplicación.

## 🎯 Objetivo del Proyecto
Analizar la arquitectura interna, el flujo de datos y la lógica de negocio de la aplicación para entender su funcionamiento, específicamente:
- Arquitectura híbrida (React Native + Android Nativo).
- Gestión de estados y navegación.
- Comunicaciones con API y servicios externos (Firebase, RevenueCat, etc.).

## 📂 Estructura del Repositorio

El contenido se divide en dos directorios principales generados por la herramienta de descompilación:

### 1. `/resources` (Recursos y Lógica JS)
Aquí se encuentra el "cerebro" de la aplicación y su interfaz.
* **`AndroidManifest.xml`**: El mapa de la app. Define permisos, actividades y servicios.
* **`assets/`**: Contiene el archivo `index.android.bundle` (donde reside toda la lógica de React Native minificada).
* **`res/`**: Recursos visuales, textos (`strings.xml`) y layouts.

### 2. `/sources` (Código Nativo)
Contiene el código Java/Kotlin que sirve de puente entre el teléfono y React Native.
* **Librerías externas**: SDKs de Facebook, Google, Adjust, etc.
* **Configuración del Build**: Archivos `BuildConfig` que revelan si la app estaba en modo debug o release.

## 🛠 Herramientas Utilizadas
* **Jadx / APKTool**: Para la descompilación de recursos y código fuente.
* **Visual Studio Code**: Para el análisis estático de archivos.
* **Git**: Control de versiones del análisis.

## 🚀 Puntos Clave Identificados (Hasta ahora)
* **Framework**: La app está construida sobre **React Native**.
* **Permisos Críticos**: Solicita acceso a `SCHEDULE_EXACT_ALARM` (para recordatorios de meditación) y `WAKE_LOCK`.
* **Servicios**: Integra RevenueCat para suscripciones y Intercom para soporte.

---
*Última actualización: Febrero 2026*
