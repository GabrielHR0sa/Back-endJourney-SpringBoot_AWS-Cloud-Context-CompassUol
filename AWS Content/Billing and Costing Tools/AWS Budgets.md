<h1 align="center">Monitoring against costs plans - AWS Budgets</h1>

É possível usar o AWS Budgets para rastrear e executar ações relativas ao uso e aos custos. Você pode usar o AWS Budgets para monitorar suas métricas agregadas de utilização e cobertura para suas Instâncias Reservadas (RIs) ou Savings Plans.

É possível usar o AWS Budgets para permitir o rastreamento de simple-to-complex custos e uso. Alguns dos exemplos incluem:

<li>Definir um orçamento de custo mensal com um valor de destino fixo para rastrear todos os custos associados à sua conta. Você pode optar por ser alertado para gastos reais (depois de acumular) e previstos (antes de acumular).</li><br>

<li>Definir um orçamento de custo mensal com um valor de destino variável, com cada mês subsequente aumentando a meta de orçamento em 5%. Em seguida, você pode configurar suas notificações para 80 por cento do valor orçado e aplicar uma ação. Por exemplo, você pode aplicar automaticamente uma política personalizada do IAM que negue a capacidade de provisionamento de recursos adicionais em uma conta.</li><br>

<li>Definir um orçamento de uso mensal com um valor de uso fixo e notificações previstas para ajudar a garantir que você esteja dentro dos limites do serviço para um serviço específico. Você também pode ter certeza de estar em uma oferta de Nível gratuito da AWS.</li><br>

<li>Definir um orçamento de utilização diária ou cobertura para rastrear sua RI ou Savings Plans. Você pode optar por ser notificado por e-mail e tópicos do Amazon SNS quando sua utilização cair abaixo de 80% em um determinado dia.</li><br>

As informações do Orçamentos da AWS são atualizadas até três vezes por dia. Normalmente, as atualizações ocorrem entre 8 a 12 horas depois da atualização anterior. O Budgets pode rastrear seus custos não combinados, custos amortizados e combinados. O Budgets pode incluir ou excluir encargos como descontos, reembolsos, taxas de suporte e impostos.

Você pode criar os seguintes tipos de orçamentos:

<li>Orçamentos de custos – Planeje o quanto você quer gastar em um serviço.</li><br>

<li>Orçamentos de uso – Planeje o quanto você deseja usar de um ou mais serviços.</li><br>

<li>Orçamentos de utilização de RI – Defina um limite de utilização e receba alertas quando o uso de RI estiver abaixo deste limite. Isso permite que você veja se suas RIs não estão sendo utilizadas ou estão subutilizadas.</li><br>

<li>Orçamentos de cobertura de RI – Defina um limite de cobertura e receba alertas quando o número de horas de instância cobertas pelas RIs estiver abaixo deste limite. Isso permite visualizar quanto do seu uso de instâncias é coberto por uma reserva.</li><br>

<li>Orçamentos de utilização dos Savings Plans – Defina um limite de utilização e receba alertas quando o uso dos Savings Plans estiver abaixo do limite. Isso permite ver se os Savings Plans não estão sendo utilizados ou estão sendo subutilizados.</li><br>

<li>Orçamentos de cobertura dos Savings Plans – Defina um limite de cobertura e receba alertas quando o uso elegível dos coberto pelos Savings Plans estiver abaixo do limite. Isso permite visualizar quanto do uso de instâncias está coberto pelos Savings Plans.</li><br>