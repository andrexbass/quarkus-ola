# API Quarkus - Hello World e Soma Aleatória

Esta é uma API REST desenvolvida com Quarkus 3.16.4 e Java 17 que fornece duas rotas principais.

## Funcionalidades

### 1. Rota Hello World
- **Endpoint**: `GET /api/hello`
- **Descrição**: Retorna uma mensagem de "Hello World"
- **Resposta**:
```json
{
  "message": "Hello World",
  "status": "success"
}
```

### 2. Rota Soma Aleatória
- **Endpoint**: `GET /api/soma`
- **Descrição**: Gera dois números aleatórios entre 1 e 100 e calcula a soma
- **Resposta**:
```json
{
  "numero1": 37,
  "numero2": 13,
  "soma": 50,
  "operacao": "37 + 13 = 50"
}
```

## Tecnologias Utilizadas

- **Quarkus 3.16.4**: Framework Java nativo para Kubernetes
- **Java 17**: Versão LTS do Java
- **Maven 3.9.9**: Gerenciador de dependências
- **RESTEasy Reactive**: Para endpoints REST
- **Jackson**: Para serialização JSON

## Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven 3.8.6 ou superior

### Executando em modo desenvolvimento
```bash
./mvnw compile quarkus:dev
```

### Executando os testes
```bash
./mvnw test
```

### Compilando para produção
```bash
./mvnw package
java -jar target/quarkus-app/quarkus-run.jar
```

## Configuração

A aplicação está configurada para:
- Executar na porta 8080
- Aceitar conexões de qualquer origem (CORS habilitado)
- Escutar em todas as interfaces de rede (0.0.0.0)

## Estrutura do Projeto

```
quarkus-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/
│   │   │       └── ApiResource.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/example/
│               └── ApiResourceTest.java
├── pom.xml
└── README.md
```

## Testando a API

Após iniciar a aplicação, você pode testar os endpoints:

1. **Hello World**: http://localhost:8080/api/hello
2. **Soma Aleatória**: http://localhost:8080/api/soma

## Características do Quarkus

- **Inicialização rápida**: A aplicação inicia em poucos segundos
- **Live Coding**: Alterações no código são refletidas automaticamente em modo dev
- **Baixo consumo de memória**: Otimizado para containers e cloud
- **Compilação nativa**: Suporte para GraalVM (opcional)

