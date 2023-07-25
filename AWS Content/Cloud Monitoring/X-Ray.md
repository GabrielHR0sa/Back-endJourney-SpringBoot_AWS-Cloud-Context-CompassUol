<h1 align="center">Amazon X-Ray</h1>

<h2>O que é o AWS X-Ray?</h2>

É um serviço que coleta dados sobre solicitações que seu aplicativo atende e fornece ferramentas que você pode usar para visualizar, filtre e obter informações sobre esses dados para identificar problemas e oportunidades de otimização. Para qualquer solicitação rastreada para a aplicação, é possível ver informações detalhadas não apenas sobre a solicitação e a resposta, mas também sobre chamadas que a aplicação faz para APIs da Web, bancos de dados da de downstreamAWS.

AWS X-Ray recebe rastros do seu aplicativo, além dos serviços que seu aplicativo usa que já estão integrados ao X-Ray. 

A instrumentação de seu aplicativo envolve o envio de dados de rastreamento para solicitações recebidas e enviadas e outros eventos dentro de seu aplicativo, junto com metadados sobre cada solicitação. 

Muitos cenários de instrumentação exigem apenas alterações de configuração. Por exemplo, você pode instrumentar todas as solicitações HTTP recebidas e chamadas posteriores aos serviços que seu aplicativo Java faz.

Os serviços integrados ao X-Ray podem adicionar cabeçalhos de rastreamento às solicitações recebidas, enviar dados de rastreamento ao X-Ray ou executar o daemon do X-Ray. Por exemplo,AWS Lambda pode enviar dados de rastreamento sobre solicitações para suas funções do Lambda e executar o daemon X-Ray em trabalhadores para simplificar o uso do SDK do X-Ray.



