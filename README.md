# 📱 Arquitectura Técnica: Puramente (Android)

Este repositorio contiene la estructura técnica y el ecosistema de activos que conforman la aplicación Android **Puramente**, la plataforma líder en bienestar y meditación diseñada para cultivar la calma y el hábito diario en el mundo hispanohablante.

## 🎯 Objetivo del Sistema

Documentar y organizar la arquitectura de la aplicación para asegurar su escalabilidad y el mantenimiento de sus funcionalidades principales:

* **Arquitectura Híbrida**: Implementación robusta sobre **React Native** integrada con componentes nativos de Android para un rendimiento óptimo.
* **Experiencia de Usuario (UX)**: Gestión de un flujo de personalización basado en intereses y objetivos específicos de salud mental.
* **Sincronización de Contenido**: Entrega eficiente de sesiones de audio y seguimiento de progreso en tiempo real.

---

## 📂 Estructura del Proyecto

La aplicación se organiza en dos pilares fundamentales que gestionan la lógica y la interfaz:

### 1. Lógica de Aplicación y Activos (`/resources`)

Gestiona la configuración del sistema y la capa de lógica en JavaScript.

* **`AndroidManifest.xml`**: Define la jerarquía de componentes, permisos de sistema y servicios de reproducción.
* **`assets/index.android.bundle`**: El núcleo de la lógica de negocio desarrollado en React Native, que controla la navegación y el flujo de pantallas.
* **`res/layout`**: Definiciones de interfaz para componentes nativos, incluyendo el **Widget de Frase Diaria** para la pantalla de inicio.

### 2. Componentes Nativos (`/sources`)

Contiene los módulos en Java/Kotlin que interactúan directamente con el hardware y servicios del dispositivo.

* **Módulos de Autenticación**: Integración segura con Firebase, Google, Facebook y Amazon.
* **Servicios de Multimedia**: Controladores nativos para asegurar que la meditación continúe de forma fluida con la pantalla apagada o en segundo plano.

---

## 🚀 Funcionalidades Core Identificadas

* **Asistente de Bienestar Personalizado**: Sistema de diagnóstico inicial que segmenta al usuario según sus necesidades de sueño, estrés o enfoque, creando una ruta de aprendizaje única.
* **Sistema de Notificaciones y Hábitos**: Uso de alarmas exactas y recordatorios programados para fomentar la constancia en la práctica de meditación.
* **Widget Dinámico**: Extensión visual para la pantalla principal que ofrece frases motivacionales y acceso rápido a la aplicación.
* **Gestión de Suscripciones**: Integración con **RevenueCat** para el manejo transparente de planes Premium y acceso a contenido exclusivo.

## 🛠 Stack Tecnológico y Servicios

* **Framework**: React Native (Android Nativo como puente).
* **Análisis y Métricas**: **Amplitude** para el seguimiento del comportamiento del usuario y optimización de flujos.
* **Soporte al Usuario**: Centro de ayuda y comunicación en vivo a través de **Intercom**.
* **Infraestructura**: **Firebase** para notificaciones push y autenticación de cuentas.

---

*Última actualización: Febrero 2026*
