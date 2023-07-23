<h1 align="center">Systems Manager</h1>

<h2>O que é o AWS Systems Manager?</h2>

É o hub de operações para AWS, e uma solução segura de gerenciamento completa para aplicações e recursos, e uma solução segura de gerenciamento completa para ambientes híbridos que permite operações seguras em escala.

<h2>Como o Systems Manager funciona?</h2>

O diagrama a seguir descreve como os recursos do Systems Manager executam ações em seus recursos. O diagrama não cobre todos os recursos. Cada interação enumerada é descrita antes do diagrama.

<h3>1 - Acessar o Systems Manager</h3>

use uma das opções disponíveis para acessar o Systems Manager.

<h3>2 - Escolher um recurso so Systems Manager</h3>

determine qual recurso pode ajudar você a executar a ação que deseja executar em seus recursos. O diagrama mostra apenas algumas das funcionalidades que os administradores eDevOps profissionais de TI usam para configurar e gerenciar aplicações e recursos.

<h3>3 - Verificação e processamentos</h3>

o Systems Manager verifica se seu usuário, grupo ou perfil tem as permissões requeridas do AWS Identity and Access Management (IAM) para executar a ação especificada. Se o destino da ação for um nó gerenciado, o Systems Manager Agent (SSM Agent) em execução no nó executará a ação. Para outros tipos de recursos, o Systems Manager executa a ação especificada ou se comunica com outros Serviços da AWS para executar a ação em nome do Systems Manager.

<h3>4 - Relatórios</h3>

o Systems Manager, o SSM Agent e outros Serviços da AWS que executaram uma ação em nome do status de relatório do Systems Manager. O Systems Manager pode enviar detalhes de status para outros Serviços da AWS, se configurado.

<h3>5 - Recursos de gerenciamento de operações do Systems Manager</h3>

se habilitados, os recursos de gerenciamento de operações do Systems Manager, como Explorer OpsCenter e o Incident Manager agregam dados de operações ou criam artefatos em resposta a eventos ou erros com seus recursos. Esses artefatos incluem itens de trabalho operacionais (OpsItems) e incidentes. Os recursos de gerenciamento de operações do Systems Manager fornecem informações operacionais sobre aplicações e recursos e soluções de correção automatizadas para ajudar a solucionar problemas.