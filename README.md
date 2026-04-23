<div align="center">
  <h1> Cadastro de Pessoas</h1>
  <p><i>Projeto de estudo focado em CRUD Web com Java, JPA/Hibernate e JSF</i></p>
</div>

<hr>

<h2>Status do Projeto</h2>
<p align="left">
  <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge" alt="Status">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white" alt="Hibernate">
</p>

<h2>📖 Sobre</h2>
<p>
  Este repositório foi criado para consolidar conhecimentos sobre o ecossistema Java EE. 
  A aplicação consiste num cadastro de pessoas onde é possível aplicar todas as operações de persistência (CRUD) 
  através de uma interface web dinâmica.
</p>

<h2>🛠️ Tecnologias e Ferramentas</h2>
<ul>
  <li><b>Linguagem:</b> Java</li>
  <li><b>Framework Web:</b> JSF (JavaServer Faces)</li>
  <li><b>ORM:</b> JPA / Hibernate</li>
  <li><b>Gestão de Dependências:</b> Maven</li>
  <li><b>Interface:</b> PrimeFaces (opcional/se usar) / XHTML</li>
</ul>

<h2>🚀 Funcionalidades Praticadas</h2>
<table>
  <tr>
    <td><b>Create</b></td>
    <td>Registo de novos utilizadores via formulário Web.</td>
  </tr>
  <tr>
    <td><b>Read</b></td>
    <td>Listagem em tempo real dos dados armazenados no banco.</td>
  </tr>
  <tr>
    <td><b>Update</b></td>
    <td>Edição de registos existentes com sincronização JPA.</td>
  </tr>
  <tr>
    <td><b>Delete</b></td>
    <td>Remoção lógica ou física de dados.</td>
  </tr>
</table>

<h2>📁 Estrutura Principal</h2>
<pre>
src/
 └── main/
      ├── java/ (Lógica, Beans e JPA Entities)
      ├── resources/META-INF/ (Configuração persistence.xml)
      └── webapp/ (Páginas .xhtml e WEB-INF)
</pre>
