<h1 align="center">AWS Batch</h1>

<h2>O que é o AWS Batch?</h2>

O AWS Batch ajuda a executar workloads de computação em lote na Nuvem AWS. A computação em Batch é uma forma comum de desenvolvedores, cientistas e engenheiros acessarem grandes quantidades de recursos computacionais.

AWS Batch elimina o trabalho pesado indiferenciado de configurar e gerenciar a infraestrutura necessária, semelhante ao software tradicional de computação em lote.

Esse serviço pode fornecer recursos com eficiência em resposta a trabalhos enviados para eliminar restrições de capacidade, reduzir os custos de computação e entregar resultados rapidamente.

Como um serviço totalmente gerenciado, o AWS Batch provisiona automaticamente os recursos computacionais e otimiza a distribuição da carga de trabalho com base na quantidade e na escala das cargas de trabalho. 

Com o AWS Batch, não há necessidade de instalar ou gerenciar software de computação em lote, para que você possa concentrar seu tempo na análise de resultados e na solução de problemas.

<h2>Componentes do AWS Batch</h2>

AWS Batch simplifica a execução de uma região. Você pode criar ambientes computacionais do AWS Batch em uma VPC nova ou existente. Depois que um ambiente computacional estiver ativo e associado a uma fila de trabalho, você poderá fazer as definições de trabalho que especificam quais imagens de contêineres do Docker executarão seus trabalhos. As imagens de contêiner são armazenadas em registros de contêiner e extraídas deles, que podem existir dentro ou fora de sua infraestrutura da AWS.

<h2>Trabalhos</h2>

Uma unidade de trabalho (como um script de shell, um executável do Linux ou uma imagem de contêiner do Docker) que você envia para o AWS Batch. Ele tem um nome e é executado como um aplicativo em contêineresAWS Fargate ou recursos do Amazon EC2 em seu ambiente computacional, usando parâmetros que você especifica em uma definição de tarefa.

Os trabalhos podem fazer referência a outros trabalhos por nome ou por ID e podem ser dependentes da conclusão de outros trabalhos.

