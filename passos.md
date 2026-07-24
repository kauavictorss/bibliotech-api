# Próximos Passos — IDs Fortemente Tipados

## Contexto da decisão

Trocar `UUID` solto por uma classe própria (ex: `LivroId`, `UsuarioId`, 
`EmprestimoId`) é um padrão real de DDD (Domain-Driven Design), chamado 
de **Value Object**. O ganho é que o compilador passa a impedir erros 
como passar um `UsuarioId` onde se esperava um `LivroId` — coisa que com 
`UUID` puro não é possível prevenir, porque ambos são o mesmo tipo.

## Passo 1 — Criar as classes de ID

Para cada entidade, crie uma classe imutável que encapsula apenas o UUID.

**Decisão técnica a tomar:** usar `class` tradicional (com `equals`/
`hashCode` implementados manualmente) ou `record` (Java 17 já suporta, 
e gera `equals`/`hashCode`/`toString` automaticamente). Para um Value 
Object simples como esse, `record` costuma ser a escolha mais moderna 
e mais enxuta.

Estrutura esperada por classe:
- Um único atributo: o `UUID` interno
- Um método estático (ou construtor) para gerar um novo ID
- `equals` e `hashCode` corretos (se usar `record`, já vem pronto)

Sugestão de local: pacote novo, ex. `model.vo` ou `model.id` — separar 
esses Value Objects das entidades principais.

## Passo 2 — Substituir o tipo nos modelos

Trocar `private UUID id;` por `private LivroId id;` (e equivalentes em 
`Usuario` e `Emprestimo`). Atualizar os construtores para gerar o novo 
tipo, não mais o `UUID` direto.

## Passo 3 — Atualizar referências cruzadas

Como `Emprestimo` referencia `Livro` e `Usuario` inteiros (não pelo ID), 
isso não muda diretamente — mas vale revisar se, no futuro, você vai 
querer que `Emprestimo` guarde `LivroId`/`UsuarioId` em vez do objeto 
completo (é outra decisão de design válida, mas não obrigatória agora).

## Passo 4 — Ajustar o Lombok

Se as classes de ID forem `record`, elas já são imutáveis por natureza — 
não precisam (nem aceitam) `@Setter`. Isso resolve, de forma estrutural, 
a discussão anterior sobre `id` não poder ser alterado depois de criado: 
em vez de "lembrar de não colocar setter", o próprio tipo garante isso.

## Ponto de atenção para a Fase 3 (Spring/JPA)

Quando chegar em persistência, IDs fortemente tipados exigem configuração 
extra no JPA (não funciona "de graça" como `UUID` puro) — geralmente via 
`@Embeddable` ou um `AttributeConverter`. Isso é resolvido na hora, não 
precisa se preocupar agora, mas é bom já saber que essa etapa vai existir 
mais à frente.

## Depois disso

Com os IDs tipados no lugar, o próximo passo continua sendo o que já 
estava planejado: **Fase 2 — comportamento e regras de negócio** 
(métodos nas entidades, exceções customizadas, classe orquestradora de 
empréstimo).
