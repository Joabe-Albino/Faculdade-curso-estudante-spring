# Sistema de Cadastro de Estudantes

API REST desenvolvida com Spring Boot para consulta de cursos e estudantes.

## Desenvolvedor
Nome: SEU NOME  
Matrícula: SUA MATRÍCULA

---

# Endpoints

## Informações do Sistema

GET
/api/sistema/info

Retorna informações da aplicação.

---

## Listar Cursos

GET
/api/cursos

Retorna lista de cursos disponíveis.

---

## Buscar Curso por ID

GET
/api/cursos/{id}

Exemplo:
/api/cursos/1

---

## Buscar Estudante por Matrícula

GET
/api/estudantes/{matricula}

Exemplo:
/api/estudantes/2024001

---

## Endpoint Criativo

Buscar estudantes por curso.

GET
/api/estudantes/curso/{nomeCurso}

Exemplo:
/api/estudantes/curso/Engenharia de Software

---

# Como executar

1 Clone o repositório
