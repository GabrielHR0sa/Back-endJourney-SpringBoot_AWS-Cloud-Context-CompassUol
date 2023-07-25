<h1 align="center">CloudWatch Alarms</h1>

Um alarme métrico observa uma única métrica do CloudWatch ou o resultado de uma expressão matemática baseada em métricas do CloudWatch. O alarme realiza uma ou mais ações com base no valor da métrica ou na expressão relativa a um limite em alguns períodos. A ação pode ser enviar uma notificação para um tópico do Amazon SNS, realizar uma ação do Amazon EC2 ou uma ação do Amazon EC2 Auto Scaling ou criar um incidente OpsItem ou no Systems Manager.

Um alarme composto inclui uma expressão de regra que leva em conta os estados de outros alarmes que você criou. O alarme composto entrará no estado ALARM somente se todas as condições da regra forem atendidas. Os alarmes especificados na expressão de regra de um alarme composto podem incluir alarmes de métrica e outros alarmes compostos.

Um alarme de métrica tem estes estados possíveis:

    OK: a métrica ou a expressão está dentro do limite definido.

    ALARM: a métrica ou a expressão está fora do limite definido.

    INSUFFICIENT_DATA: o alarme acabou de ser acionado, a métrica não está disponível ou não há dados suficientes para a métrica determinar o estado do alarme.