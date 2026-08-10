Sistema de Gestão Acadêmica - Projeto Educacional (SENAC)

Este repositório contém uma aplicação Java desenvolvida exclusivamente para fins educacionais, projetada como material de apoio e prática para os alunos do SENAC.

O objetivo principal deste projeto é apresentar uma arquitetura de software robusta, organizada e aderente aos padrões de mercado, servindo de referência para a escrita de código limpo (Clean Code), separação de responsabilidades e reutilização de componentes.
🛑 Guia de Contribuição e Diretrizes de Arquitetura

    Orientação Importante:
    Este projeto foi feito com fins educacionais. Sempre que você for alterar alguma coisa, aja como um desenvolvedor sênior.

Para manter a qualidade e o nível profissional da codebase, siga rigorosamente as diretrizes abaixo:

    Mentalidade de Código Limpo (Clean Code): Escreva nomes de variáveis, métodos e classes autoexplicativos. Aplique os princípios SOLID e evite acoplamentos desnecessários.

    Tratamento de Exceções: Nunca deixe blocos catch vazios. Utilize exceções customizadas para erros de negócio e garanta que as mensagens sejam claras.

    Testabilidade: Mantenha os métodos com responsabilidade única para facilitar a escrita de testes unitários e de integração.

    Documentação e Commits: Documente regras de negócio complexas via Javadoc e utilize mensagens de commit claras e padronizadas (ex.: feat:, fix:, refactor:).

🏛️ Padrão de Arquitetura (Layered MVC Extended)

O projeto adota o padrão MVC (Model-View-Controller) estendido em camadas bem definidas. Cada classe possui um papel único na aplicação, garantindo o desacoplamento entre a interface, a regra de negócio e o acesso aos dados.

src/main/java/br/com/senac/app/
│
├── controller/         <-- Camada de Entrada / Endpoints / Handlers
├── component/          <-- Componentes Utilitários e Auxiliares
├── service/            <-- Interfaces com Contratos de Negócio
│   └── impl/           <-- Implementações Concretas dos Serviços
├── repository/         <-- Interface de Acesso a Dados / Persistência
└── model/              <-- Entidades de Domínio e DTOs

Detalhamento das Camadas
1. Controller (controller/)

Ponto de entrada da aplicação. Responsável por receber as requisições (HTTP ou entrada de usuário via CLI), validar as entradas básicas e delegar a execução da regra de negócio para a camada de serviço. Não deve conter regras de negócio.
2. Component (component/)

Classes utilitárias e auxiliares reutilizáveis gerenciadas pelo contêiner da aplicação. Exemplos de uso: mapeadores de objetos (mapeamento DTO/Entidade), validadores customizados, leitores de arquivos ou geradores de relatórios.
3. Service Interface (service/)

Interface Java que define o contrato de negócio. Ela especifica o que a aplicação faz sem expor como faz. Permite a inversão de dependência e facilita a criação de mocks para testes unitários.
4. Service Implementation (service/impl/)

Implementação concreta da interface de serviço (ServiceImpl). É onde reside toda a regra de negócio da aplicação. Responsável por orquestrar as validações de domínio, chamar utilitários da camada component e persistir dados via repository.
5. Repository (repository/)

Camada responsável pela comunicação com o banco de dados ou fonte de dados persistente. Isola completamente as consultas SQL/JPQL ou operações CRUD do restante da aplicação.