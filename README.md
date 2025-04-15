# Conversor de Temperatura em Spring Boot

Este é um microserviço desenvolvido com **Spring Boot**, que realiza a conversão entre diferentes escalas de temperatura.  
O projeto também inclui suporte a **Spring Boot Actuator** e **Eureka Client**, permitindo monitoramento e registro de serviço em um ambiente distribuído.

---

## 🔧 Tecnologias Utilizadas

- Java 11+  
- Spring Boot  
  - Spring Web Starter  
  - Spring Boot Actuator  
  - Eureka Client  

---

## 🔥 Endpoints de Conversão

As conversões podem ser realizadas acessando as seguintes URLs:

| Conversão        | URL de Exemplo                                               |
|------------------|--------------------------------------------------------------|
| Celsius → Fahrenheit | [http://localhost:9001/temperatura/converter/ctof/10](http://localhost:9001/temperatura/converter/ctof/10) |
| Kelvin → Fahrenheit  | [http://localhost:9001/temperatura/converter/ktof/10](http://localhost:9001/temperatura/converter/ktof/10) |
| Fahrenheit → Celsius | [http://localhost:9001/temperatura/converter/ftoc/10](http://localhost:9001/temperatura/converter/ftoc/10) |
| Fahrenheit → Kelvin  | [http://localhost:9001/temperatura/converter/ftok/10](http://localhost:9001/temperatura/converter/ftok/10) |
| Kelvin → Celsius     | [http://localhost:9001/temperatura/converter/ktoc/10](http://localhost:9001/temperatura/converter/ktoc/10) |
| Kelvin → Fahrenheit  | [http://localhost:9001/temperatura/converter/ktof/10](http://localhost:9001/temperatura/converter/ktof/10) |

---

## ⚙️ Endpoints de Monitoramento (Spring Boot Actuator)

O projeto expõe endpoints do **Spring Boot Actuator** para facilitar o monitoramento da aplicação.

### Exemplos de endpoints disponíveis:

- [`/temperatura/actuator`](http://localhost:9001/temperatura/actuator) – Lista todos os endpoints disponíveis
- [`/temperatura/actuator/health`](http://localhost:9001/temperatura/actuator/health) – Verifica o estado de saúde da aplicação
- [`/temperatura/actuator/info`](http://localhost:9001/temperatura/actuator/info) – Informações da aplicação
- [`/temperatura/actuator/metrics`](http://localhost:9001/temperatura/actuator/metrics) – Métricas de desempenho

### Requisitos para funcionar:

- Dependência no `pom.xml`:
  ```xml
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
  </dependency>
