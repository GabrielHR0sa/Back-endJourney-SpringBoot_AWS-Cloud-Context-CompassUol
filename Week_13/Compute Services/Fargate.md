<h1 align="center">Fargate</h1>

<h2>O que é o AWS Fargate?</h2>

O AWS Fargate é uma tecnologia que pode ser usada com o Amazon ECS para executar contêineres sem a necessidade de gerenciar servidores ou clusters de instâncias do Amazon EC2. 

Com o Fargate, não é mais necessário provisionar, configurar ou dimensionar os clusters de máquinas virtuais para executar contêineres. Isso elimina a necessidade de escolher tipos de servidor, decidir quando dimensionar clusters ou otimizar o agrupamento de clusters.

Ao executar suas tarefas e serviços do Amazon ECS com o tipo de inicialização do Fargate ou um provedor de capacidade do Fargate, empacote a aplicação em contêineres, especifique os requisitos de sistema operacional, CPU e memória, defina as políticas de rede e do IAM e inicie a aplicação. Cada tarefa do Fargate tem seu próprio limite de isolamento e não compartilha o kernel subjacente, os recursos de CPU, os recursos de memória nem a interface de rede elástica com outra tarefa.

<h2>Componentes</h2>

<h3>Clusters</h3>

Um cluster do Amazon ECS é um agrupamento lógico de tarefas ou serviços. Você pode usar clusters para isolar suas aplicações. Quando as tarefas são executadas no Fargate, os recursos de cluster também são gerenciados pelo Fargate.

<h3>Definição de tarefa</h3>

É um arquivo de texto que descreve um ou mais contêineres que formam sua aplicação.

    Ele é no formato JSON.

    É possível usá-lo para descrever até um máximo de dez contêineres. 

    A definição de tarefa funciona como um esquema da sua aplicação.

    Ela especifica os vários parâmetros da sua aplicação.

É possível usá-la para especificar parâmetros para o sistema operacional, os contêineres a serem usados, as portas a serem abertas para sua aplicação e os volumes de dados a serem usados com os contêineres na tarefa.

<h3>Tarefas</h3>

Uma tarefa é a instanciação de uma definição de tarefa dentro de um cluster. Depois de criar uma definição de tarefa para a aplicação no Amazon ECS, é possível especificar o número de tarefas que serão executadas no cluster. Você pode executar uma tarefa autônoma ou executar uma tarefa como parte de um serviço.

<h3>Serviços</h3>

Você pode usar um serviço do Amazon ECS para executar e manter simultaneamente o número desejado de tarefas em um cluster do Amazon ECS. 
<hr>

Há suporte para os seguintes sistemas operacionais:

    Amazon Linux 2
    Windows Server 2019 Full
    Windows Server 2019 Core
    Windows Server 2022 Full
    Windows Server 2022 Core