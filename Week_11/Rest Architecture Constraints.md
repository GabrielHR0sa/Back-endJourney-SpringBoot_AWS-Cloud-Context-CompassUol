<h1 align="center">O que são Rest Architecture Constraints</h1>

As Rest Architecture Constraints, ou Restrições da Arquitetura REST, são um conjunto de diretrizes e princípios que definem as características e comportamentos esperados de uma aplicação ou sistema que segue a arquitetura REST (Representational State Transfer). Essas restrições foram estabelecidas por Roy Fielding em sua tese de doutorado, onde ele descreveu a arquitetura REST.

As restrições da arquitetura REST são as seguintes:

<ol>

<li>Cliente-Servidor (Client-Server): A arquitetura deve ser baseada no modelo cliente-servidor, onde o cliente e o servidor são componentes independentes que se comunicam através de uma interface bem definida. O cliente é responsável pela interação com o usuário, enquanto o servidor é responsável pelo processamento e armazenamento dos dados.</li><br>

<li>Stateless (Sem Estado): Cada solicitação feita pelo cliente para o servidor deve conter todas as informações necessárias para ser processada. O servidor não deve manter informações de estado sobre o cliente entre as solicitações. Isso permite que os componentes sejam independentes e escaláveis, já que qualquer servidor pode processar qualquer solicitação.</li><br>

<li>Cache: As respostas do servidor devem ser explicitamente marcadas como cacheáveis ou não-cacheáveis. Isso permite que os clientes armazenem em cache as respostas e reutilizem-nas quando apropriado, melhorando a eficiência e o desempenho da comunicação.</li><br>

<li>Interface Uniforme (Uniform Interface): A interface entre o cliente e o servidor deve ser uniforme, com um conjunto limitado de operações bem definidas. Isso inclui o uso de URIs (Uniform Resource Identifiers) para identificar recursos, métodos HTTP para indicar a ação a ser executada nos recursos, além do uso de hiperlinks para navegação entre recursos relacionados.</li><br>

<li>Sistema em Camadas (Layered System): A arquitetura permite que o sistema seja composto por camadas hierárquicas, onde cada camada fornece um conjunto de funcionalidades bem definidas. Isso promove a escalabilidade, a interoperabilidade e a flexibilidade, permitindo que cada camada seja modificada ou substituída sem afetar as outras camadas.</li><br>

<li>Code-On-Demand (Opcional): Essa restrição é opcional e permite que o servidor envie código executável para o cliente, como applets Java ou scripts JavaScript, estendendo as capacidades do cliente. Essa restrição é menos comum em APIs RESTful, onde o foco geralmente está na troca de representações de recursos.</li><br>

</ol>

Ao seguir essas restrições, uma aplicação ou sistema pode ser considerado aderente à arquitetura REST. Essas restrições foram estabelecidas para promover a interoperabilidade, a escalabilidade, a simplicidade e a robustez dos sistemas distribuídos na web.<hr>
