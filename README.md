# BiblioTech API

Sistema de gerenciamento de biblioteca desenvolvido como projeto de estudo,
com foco em prática deliberada de Programação Orientada a Objetos e evolução
progressiva de complexidade técnica.

## Sobre o projeto

Este projeto não nasce com o objetivo de ser um sistema completo desde o
início. A intenção é usar um domínio simples e conhecido — livros, usuários
e empréstimos — como pretexto para praticar conceitos fundamentais de
engenharia de software de forma incremental. Cada fase adiciona uma camada
de complexidade sobre a anterior, sem pular etapas.

A motivação principal é reforçar fundamentos de POO que, com o uso crescente
de IA no dia a dia de desenvolvimento, correm o risco de ficar enferrujados.
Por isso, as primeiras fases são feitas propositalmente **sem framework**,
com cada decisão de modelagem e cada linha de código pensadas manualmente.

## Fases do projeto

### Fase 1 — Modelagem (POO pura)
Definição das classes de domínio (`Livro`, `Usuario`, `Emprestimo`) em Java
puro, sem persistência e sem framework. Foco em encapsulamento, composição
e nas responsabilidades de cada classe.

### Fase 2 — Regras de negócio e exceções
Implementação da lógica de empréstimo e devolução, com exceções
customizadas para representar violações de regras (ex: livro indisponível,
usuário com limite de empréstimos atingido). Foco em hierarquia de
exceções e tratamento adequado de erros.

### Fase 3 — Spring Boot + Persistência
Migração do domínio para uma aplicação Spring Boot 3 (Java 17), com
persistência via Spring Data JPA e banco relacional (MySQL/PostgreSQL).
Introdução da camada de API REST (controllers, DTOs, tratamento global
de exceções).

### Fase 4 — Segurança
Adição de autenticação e autorização (Spring Security), controlando acesso
às operações da API de acordo com o papel do usuário.

## Stack técnica

- Java 17
- Gradle
- Spring Boot 3
- Spring Data JPA
- MySQL / PostgreSQL
- Spring Security (Fase 4)

## Status atual

🚧 Em desenvolvimento — Fase 1 (modelagem do domínio)