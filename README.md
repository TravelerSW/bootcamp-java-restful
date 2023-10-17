# bootcamp-java-restful
 Projeto Java com o objetivo de criar uma API RESTful do zero, utilzando o Java 17, Spring Boot 3, Spring Data JPA, OpenAPI E Railway.

 ## Diagrama de Classes

 ```mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - features: Feature[]
    - card: Card
    - news: News[]
  }

  class Account {
    - number: String
    - agency: String
    - balance: Float
    - limit: Float
  }

  class Feature {
    - String: icon
    - String: description
  }

  class Card {
    - String: number
    - number: limit
  }

  class News {
    - String: icon
    - String: description
  }

  User --> Account
  User --> Feature
  User --> Card
  User --> News
```
