## API reativa de gerenciamento de heróis com Spring WebFlux

#### Projeto desenvolvido durante o Bootcamp Inter Java Developer - Digital Innovation One 💻 📚

Nesse projeto foi construido um CRUD para administrar os dados de heróis da Marvel, incluindo o nome do herói, universo, 
local de origem e se sua identidade é secreta.

⚙️Foram utilizados para o desenvolvimento da API:
- Banco de dados Amazon DynamoDb local;
- Spring WebFlux;
- WebTestClient para testes unitários;

👣 Passo a passo:
- Criação da classe DynamoConfig com a configuração para conexão com o DynamoDB local;
- Criação da classe HeroesTable para possibilitar a criação da tabela de heróis no banco de dados usando o Java;
- Implementação da classe de serviço com métodos findAll, findById, save, update e delete utilizando a interface CrudRepository<T,ID>;
- Definição dos endpoints da API na camada controller para lidar com as requisições de usuário;
- Desenvolvimento de testes unitários para todos os métodos da camada controller com Junit a partir do recurso WebTestClient;

🔗 Links muito úteis que encontrei durante o desenvolvimento da API:
- Java e DynamoDB --> https://docs.aws.amazon.com/pt_br/amazondynamodb/latest/developerguide/GettingStarted.Java.html
- Spring WebFlux Tutorial --> https://howtodoinjava.com/spring-webflux/spring-webflux-tutorial/
- REST API: Java Spring Boot & AWS DynamoDB --> https://medium.com/@kaikeventura/api-rest-com-spring-boot-e-aws-dynamodb-5e79ecb80b62
- Spring – @WebFluxTest with WebTestClient --> https://howtodoinjava.com/spring-webflux/webfluxtest-with-webtestclient/
- MARVEL CHARACTERS - https://www.marvel.com/characters
