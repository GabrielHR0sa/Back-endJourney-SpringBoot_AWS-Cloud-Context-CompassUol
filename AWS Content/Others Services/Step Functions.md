<h1 align="center">Step Functions</h1>

É um serviço de orquestração sem servidor que permite a integração com AWS Lambdafunções e outras Serviços da AWS para criar aplicativos essenciais para os negócios. Por meio do console gráfico do Step Functions, você vê o fluxo de trabalho do seu aplicativo como uma série de etapas orientadas por eventos.

Em Step Functions, um fluxo de trabalho é chamado de máquina de estado, que é uma série de etapas orientadas por eventos. Cada etapa em um fluxo de trabalho é chamada de estado. Um Tarefa estado representa uma unidade de trabalho que outro serviço, como Lambda. Um estado de tarefa pode chamar qualquer API service (Serviço da AWS).

Com os controles integrados do Step Functions, você examina o estado de cada etapa em seu fluxo de trabalho para garantir que seu aplicativo seja executado na ordem e conforme o esperado. 

Dependendo do seu caso de uso, você pode fazer com que o Step Functions chame AWS serviços, como o Lambda, para realizar tarefas. Você pode criar fluxos de trabalho que processam e publicam modelos de aprendizado de máquina. 

Você pode ter AWS serviços de controle do Step Functions AWS Glue, como criar fluxos de trabalho de extração, transformação e carregamento (ETL). Você também pode criar fluxos de trabalho automatizados e de longa duração para aplicativos que exigem interação humana.