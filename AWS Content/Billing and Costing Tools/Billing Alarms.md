<h1 align="center">Monitoring against costs plans - Billing Alarms</h1>

Você pode monitorar suas cobranças estimadas usando a AmazonCloudWatch. Quando você habilita o monitoramento de estimativas de cobrança para sua conta da AWS, as estimativas de cobrança são calculadas e enviadas várias vezes por dia para o CloudWatch como dados de métrica.

Os dados de métrica de faturamento são armazenados na região Leste dos EUA (Norte da Virgínia) e representam cobranças mundiais. Esses dados incluem as estimativas de cobrança para cada serviço da AWS que você usa, além do total geral estimado de suas cobranças da AWS.

O alarme é acionado quando o faturamento da conta excede o limite especificado. Ele é acionado somente quando o faturamento atual excede o limite. Ele não usa projeções com base no seu uso até o momento no mês.

Se você criar um alerta de faturamento quando suas cobranças já tiverem excedido o limite, o alarme mudará para o estado ALARM imediatamente.

<h2>Habilitar alertas de faturamento</h2>

Para criar um alarme para suas estimativas de despesas, habilite alertas de faturamento para poder monitorar suas estimativas de despesas da AWS e criar um alarme usando dados de métrica de faturamento. Depois que habilitar alertas de faturamento, você não poderá desativar a coleta de dados, mas poderá excluir qualquer alarme de faturamento que tenha criado.

Depois que habilitar alertas de pagamento pela primeira vez, levará cerca de 15 minutos para que você possa visualizar dados de faturamento e definir alertas de pagamento.

<h3>Requisitos</h3>

<li>É necessário estar conectado usando as credenciais de usuário-raiz da conta ou como um usuário do IAM que tenha recebido permissão para visualizar as informações de faturamento.</li><br>

<li>Para contas de faturamento consolidado, os dados de faturamento para cada conta vinculada podem ser encontrados fazendo login como a conta de pagamento. Você pode visualizar dados de faturamento para o total de cobranças estimadas e cobranças estimadas por serviço para cada conta vinculada, além da conta consolidada.</li><br>

<li>Em uma conta de faturamento consolidado, as métricas da conta vinculada ao membro serão capturadas somente se a conta pagante habilitar a preferência Receber alertas de faturamento. Se você alterar qual é a conta de gerenciamento/pagante, será necessário habilitar os alertas de faturamento na nova conta de gerenciamento/pagante.</li><br>

<li>A conta não deve fazer parte da Rede de parceiros da Amazon (APN) porque as métricas de faturamento não são publicadas no CloudWatch para contas do APN.</li><br>