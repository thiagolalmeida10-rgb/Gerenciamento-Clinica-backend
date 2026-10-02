# Gerenciamento Clínica — Deploy no Render

Seu projeto é Spring Boot + Maven. Estes arquivos deixam o projeto pronto para deploy usando Docker.

## Estrutura

Na raiz do projeto devem existir:
- Dockerfile
- render.yaml
- .dockerignore
- pom.xml
- mvnw
- mvnw.cmd
- .mvn/
- src/

## Java

O Dockerfile usa Java 17. Se seu pom.xml usar Java 21, troque 17 por 21 nas duas imagens do Dockerfile.

## Teste no IntelliJ

No terminal:

Windows:
.\mvnw.cmd clean package

Depois:

    .\mvnw.cmd spring-boot:run

## GitHub

Envie o projeto para um repositório GitHub e faça push dos arquivos acima.

## Render

No Render:
1. New
2. Web Service
3. Conecte o GitHub
4. Selecione o repositório
5. Runtime: Docker
6. Dockerfile: ./Dockerfile
7. Deploy

Também é possível usar o render.yaml como Blueprint.

## Banco de dados

Se o sistema usa banco local, não use localhost no Render. Para produção, use PostgreSQL e coloque as credenciais como Environment Variables no Render.

Nunca coloque senhas no GitHub.
