<h1 align="center">Fault Injection Simulator</h1>

<h2>O que é o Amazon Fault Injection Simulator?</h2>

AWS Fault Injection Simulator(AWS FIS) é um serviço gerenciado que permite que você realize experimentos de injeção de falhas em suas cargas de trabalho. 

A injeção de falhas é baseada nos princípios da engenharia do caos. Esses experimentos estressam um aplicativo ao criar eventos disruptivos para que você possa observar como seu aplicativo responde. Em seguida, você pode usar essas informações para melhorar o desempenho e a resiliência de seus aplicativos para que eles se comportem conforme o esperado.

Para usar FIS, você configura e executa experimentos que ajudam a criar as condições reais necessárias para descobrir problemas de aplicativos que poderiam ser difíceis de encontrar de outra forma. 

AWS FIS fornece modelos que geram interrupções e os controles e barreiras de que você precisa para executar experimentos na produção, como reverter ou interromper automaticamente o experimento se condições específicas forem atendidas.

<h2>Ações</h2>

Uma ação é uma atividade que é executada em um recurso durante um experimento. AWS FIS fornece um conjunto de ações pré-configuradas com base no tipo de AWS recurso. Cada ação é executada por uma duração especificada durante um experimento ou até que você o interrompa. As ações podem ser executadas sequencialmente ou simultaneamente (em paralelo).

<h2>Destinos</h2>

Um alvo é um ou mais recursos nos quais AWS FIS executa uma ação durante um experimento. Você pode escolher recursos específicos ou selecionar um grupo de recursos com base em critérios específicos, como tags ou estado.

<h2>Condições de parada</h2>

AWS FIS fornece os controles e as barreiras de que você precisa para executar experimentos com segurança em suas cargas de trabalho. Uma condição de parada é um mecanismo para interromper um experimento se ele atingir um limite que você define como um CloudWatch alarme da Amazon. Se uma condição de parada for acionada enquanto o experimento estiver em execução, AWS FIS interrompe o experimento.