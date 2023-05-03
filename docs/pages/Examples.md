[Voltar para a página inicial](../../README.md)

<img src="../images/java_image.png " width=250>

# **Exemplos**

### Materiais criados para estudos JPA e a implementação Hibernate com Java.

</br>
<hr>

#### ***Desenvolvido em***

- Linguagem: Java
- Versão: 11+

#### **Descrição**

*Este repositório é referente ao estudo de Generics. Utilizei de um dominio referente a usuários.*

</br>

#### **Links**

*Esta seção descreve os arquivos de estudos criados para o aprendizado Generics.*

| Recurso                                                   | Nível         | Descrição                                                                                       | Link                                                                                                  |
|-----------------------------------------------------------|---------------|-------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| ***entrypoint/EntryPoint.java***                          | Intermediario | Interface contratual para definir os metodos padrões para EntryPoints.                          | [Link](../../src/main/java/br/com/diegocordeiro/entrypoint/EntryPoint.java)                           |
| ***entrypoint/implementation/AddressEntryPoint.java***    | Intermediario | EntryPoint de Endereço utilizado para chamar as regras de negocíos necessárias (Business).      | [Link](../../src/main/java/br/com/diegocordeiro/entrypoint/implementation/AddressEntryPoint.java)     |
| ***entrypoint/implementation/RoleEntryPoint.java***       | Intermediario | EntryPoint de Role utilizado para chamar as regras de negocíos necessárias (Business).          | [Link](../../src/main/java/br/com/diegocordeiro/entrypoint/implementation/RoleEntryPoint.java)        |
| ***entrypoint/implementation/UserEntryPoint.java***       | Intermediario | EntryPoint de User utilizado para chamar as regras de negocíos necessárias (Business).          | [Link](../../src/main/java/br/com/diegocordeiro/entrypoint/implementation/UserEntryPoint.java)        |
| ***business/Business.java***                              | Intermediario | Interface contratual para definir os metodos padrões para Business.                             | [Link](../../src/main/java/br/com/diegocordeiro/business/Business.java)                               |
| ***business/implementation/FindAddressByIdBusiness.java*** | Intermediario | Business de Endereço utilizado para chamar a classe de acesso à dados necessária (DAO).         | [Link](../../src/main/java/br/com/diegocordeiro/business/implementation/FindAddressByIdBusiness.java) |
| ***business/implementation/FindAddressByUser.java***      | Intermediario | Business de Endereço utilizado para chamar a classe de acesso à dados necessária (DAO).         | [Link](../../src/main/java/br/com/diegocordeiro/business/implementation/FindAddressByUser.java)       |
| ***business/implementation/PutAddressBusiness.java***     | Intermediario | Business de Endereço utilizado para chamar a classe de acesso à dados necessária (DAO).         | [Link](../../src/main/java/br/com/diegocordeiro/business/implementation/PutAddressBusiness.java)      |
| ***business/implementation/PutRoleBusiness.java***        | Intermediario | Business de Papel do Usuário utilizado para chamar a classe de acesso à dados necessária (DAO). | [Link](../../src/main/java/br/com/diegocordeiro/business/implementation/PutRoleBusiness.java)         |
| ***business/implementation/FindUserByIdBusiness.java***   | Intermediario | Business de Usuário utilizado para chamar a classe de acesso à dados necessária (DAO).          | [Link](../../src/main/java/br/com/diegocordeiro/business/implementation/FindUserByIdBusiness.java)    |
| ***business/implementation/PutUserBusiness.java***        | Intermediario | Business de Usuário utilizado para chamar a classe de acesso à dados necessária (DAO).          | [Link](../../src/main/java/br/com/diegocordeiro/business/implementation/PutUserBusiness.java)         |
| ***dao/DAO.java***                                        | Intermediario | Classe abstrata que define os metodos padrões para DAO.                                         | [Link](../../src/main/java/br/com/diegocordeiro/dao/DAO.java)                                         |
| ***dao/implementation/AddressDAO.java***                  | Intermediario | DAO de Endereço utilizado para chamar a base de dados necessária (DAO).                         | [Link](../../src/main/java/br/com/diegocordeiro/dao/implementation/AddressDAO.java)                   |
| ***dao/implementation/AddressByUserDAO.java***            | Intermediario | DAO de Endereço utilizado para chamar a base de dados necessária (DAO).                         | [Link](../../src/main/java/br/com/diegocordeiro/dao/implementation/AddressDAO.java)                   |
| ***dao/implementation/RoleDAO.java***                     | Intermediario | DAO de Papel de Usuário utilizado para chamar a base de dados necessária (DAO).                 | [Link](../../src/main/java/br/com/diegocordeiro/dao/implementation/RoleDAO.java)                      |
| ***dao/implementation/UserDAO.java***                     | Intermediario | DAO de Usuário utilizado para chamar a base de dados necessária (DAO).                          | [Link](../../src/main/java/br/com/diegocordeiro/dao/implementation/UserDAO.java)                      |
| ***configuration/PersistenceUnit.java***                  | Intermediario | Enum que contém o nome da unidade de persistência declarada no arquivo persistence.xml          | [Link](../../src/main/java/br/com/diegocordeiro/configuration/PersistenceUnit.java)                   |
| ***model/Address.java***                                  | Intermediario | Modelo de Entidade referente à Endereço.                                                        | [Link](../../src/main/java/br/com/diegocordeiro/model/Address.java)                                   |
| ***model/AddressByUser.java***                            | Intermediario | Modelo referente à pesquisa customizada de Endereço de Usuário.                                 | [Link](../../src/main/java/br/com/diegocordeiro/model/AddressByUser.java)                             |
| ***model/User.java***                                     | Intermediario | Modelo referente à Usuário.                                                                     | [Link](../../src/main/java/br/com/diegocordeiro/model/User.java)                                      |
| ***model/JuridicUser.java***                              | Intermediario | Modelo referente à Usuário Juridico.                                                            | [Link](../../src/main/java/br/com/diegocordeiro/model/JuridicUser.java)                               |
| ***model/PersonalUser.java***                             | Intermediario | Modelo referente à Usuário Fisico.                                                              | [Link](../../src/main/java/br/com/diegocordeiro/model/PersonalUser.java)                              |
| ***model/Role.java***                                     | Intermediario | Modelo referente à Papel do Usuário na aplicação.                                               | [Link](../../src/main/java/br/com/diegocordeiro/model/Role.java)                                      |
| ***model/Level.java***                                    | Intermediario | Enum referente ao nível de Papel do Usuário na aplicação.                                       | [Link](../../src/main/java/br/com/diegocordeiro/model/Level.java)                                     |
| ***Application.java***                                    | Intermediario | Executa a chamadas aos EntryPoints desejados.                                                   | [Link](../../src/main/java/br/com/diegocordeiro/Application.java)                                     |

</br>
<hr>

#### **Sobre**

*Esta seção possuí o Link abaixo que vos leva para o descritivo do autor do repositório.*

[Link](./Author.md)

#### **Redes sociais**

*Se estiver com alguma dúvida, se sinta a vontade para me chamar em alguma das redes sociais.*

[![Instagram Badge](https://img.shields.io/badge/-instagram-red?style=for-the-badge&logo=instagram&logoColor=white&link=https://github.com/DiegoJCordeiro)](https://www.instagram.com/developr.mano/) [![Linkedin Badge](https://img.shields.io/badge/-Linkedin-blue?style=for-the-badge&logo=Linkedin&logoColor=white&link=https://github.com/DiegoJCordeiro)](https://www.linkedin.com/in/diego-cordeiro-552948229/) [![Youtube Badge](https://img.shields.io/badge/-Youtube-red?style=for-the-badge&logo=Youtube&logoColor=white&link=https://github.com/DiegoJCordeiro)](https://www.youtube.com/@manodev5540) [![Medium Badge](https://img.shields.io/badge/-Medium-black?style=for-the-badge&logo=Medium&logoColor=white&link=https://github.com/DiegoJCordeiro)](https://medium.com/@diegocordeiro.contatos) 