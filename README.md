# Padrão Singleton

Este projeto foi realizado para uma atividade da disciplina DCC078 - Aspectos Avançados em Engenharia de Software, que aborda o padrão de projeto Singleton. Nele, temos uma implementação para os Parâmetros da Casa de Eventos, garantindo que exista apenas uma instância única responsável por armazenar informações globais, como o nome da casa de eventos e o organizador.

**Aluno**: Gabriel do Carmo Silva\
**Matrícula**: 202065030C

---
## 📁 Estrutura do Projeto

```text
singleton/
├── src/
│   ├── main
│   │   ├── java
|   |   |  ├── casadeeventos/     # (pacote com a classe Singleton Parametros e demais classes relacionadas)
│   ├── test
│   │   ├── java
|   |   |  ├── casadeeventos/     # (pacote com os testes da classe Singleton)
├── pom.xml
├── .gitignore                      
└── README.md
```

---
## 📦 Tecnologias / Ferramentas

Foi instalada a última versão do IntelliJ (disponível no [site da JetBrains](https://www.jetbrains.com/pt-br/idea/download/?section=windows)) e criado um novo projeto Java usando o Maven para esta atividade. 

---
## 🧱 Padrão Singleton no Projeto

Principais pontos da implementação:
**Classe Parametros**:
 - Possui um construtor privado, evitando que seja instanciada diretamente.
 - Possui um atributo estático instance que guarda a única instância criada da classe.
 - O método estático getInstance() retorna sempre a mesma instância, garantindo acesso global e controlado.
 - A classe contém os atributos nomeCasaEventos e organizador, que podem ser definidos e recuperados por meio de métodos getters e setters.

---
## 📄 Diagrama de classes
<img width="1057" height="368" alt="image" src="https://github.com/user-attachments/assets/9ba5f3d7-47e5-4724-bd26-ddf4ac002be5" />

