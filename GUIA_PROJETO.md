# BiblioTech API

Sistema de gerenciamento de biblioteca desenvolvido como projeto de estudo,
com foco em prática deliberada de Programação Orientada a Objetos e evolução
progressiva de complexidade técnica.

## Intenção do projeto

Este projeto **não** nasce com o objetivo de ser um sistema completo desde
o início. A intenção é usar um domínio simples e conhecido (biblioteca:
livros, usuários e empréstimos) como pretexto para praticar conceitos
fundamentais de engenharia de software de forma incremental — cada fase
adiciona uma camada de complexidade sobre a anterior, sem pular etapas.

A motivação principal é reforçar fundamentos de POO que, com o uso
crescente de IA no dia a dia de desenvolvimento, correm o risco de ficar
enferrujados. Por isso, as primeiras fases são propositalmente feitas
**sem framework**, escritas e raciocinadas manualmente.

## Fases de implementação

### Fase 1 — POO pura
Modelagem do domínio (Livro, Usuário, Empréstimo) usando apenas Java puro,
sem persistência e sem framework. Foco em encapsulamento, composição,
responsabilidades de cada classe e regras de negócio básicas.

### Fase 2 — Exceções
Introdução de exceções customizadas para representar regras de negócio
violadas (ex: livro indisponível, usuário com pendências). Foco em
hierarquia de exceções, checked vs unchecked, e tratamento adequado de erros.

### Fase 3 — Spring Boot + Spring Data
Migração do domínio para uma aplicação Spring Boot 3 (Java 17), com
persistência via Spring Data JPA e banco relacional (MySQL/PostgreSQL).
Entidades passam a ser gerenciadas, e a camada de API REST é introduzida
(controllers, DTOs, tratamento global de exceções).

### Fase 4 — Security
Adição de autenticação e autorização (Spring Security), controlando acesso
a operações da API de acordo com o papel do usuário (ex: bibliotecário vs
usuário comum).

## Stack técnica

- Java 17
- Gradle
- Spring Boot 3
- MySQL / PostgreSQL
- Spring Data JPA
- Spring Security (fase 4)

## Status atual

🚧 Em desenvolvimento — Fase 1 (POO pura)