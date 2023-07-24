<h1 align="center">Elastic Container Registry</h1>

<h2>O que é o Amazon Elastic Container Registry?</h2>

É um serviço de registro de imagem de contêiner, seguro, escalável e confiável, gerenciado pela AWS. 

O Amazon ECR oferece suporte a repositórios privados com permissões baseadas em recursos usando o AWS IAM. Isso é para que usuários ou instâncias do Amazon EC2 especificados possam acessar seus repositórios e imagens de contêiner. É possível usar a CLI preferida para enviar, extrair e gerenciar imagens do Docker, imagens da Open Container Initiative (OCI)e artefatos compatíveis com OCI.

<h2>Componentes do Amazon ECR</h2>

O Amazon ECR tem os seguintes componentes:

<h3>Registro</h3>

Um registro privado do Amazon ECR é fornecido para cada conta da AWS. Você pode criar repositórios de imagens em seu registro e armazenar imagens neles.

<h3>Token de autorização</h3>

O cliente do Docker precisa ser autenticado para os registros do Amazon ECR como um usuário da AWS para poder enviar e extrair imagens.

<h3>Repositório</h3>

Um repositório do Amazon ECR contém suas imagens do Docker, imagens da Open Container Initiative (OCI) e artefatos compatíveis com OCI.

<h3>Política de repositório</h3>

Você pode controlar o acesso aos repositórios e às imagens contidas neles com as políticas de repositório.

<h3>Imagem</h3>

É possível enviar e extrair imagens de contêiner dos seus repositórios. Você pode usar essas imagens localmente no seu sistema de desenvolvimento ou nas definições de tarefas do Amazon ECS e especificações de pod do Amazon EKS.
<hr>

<h2>Preços</h2>

Com o Amazon ECR, você paga apenas pela quantidade de dados armazenada em seus repositórios e pela transferência de dados nos envios e extrações de imagens.