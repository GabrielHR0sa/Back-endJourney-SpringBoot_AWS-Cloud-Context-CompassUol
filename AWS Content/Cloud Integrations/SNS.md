<h1 align="center">Amazon SNS</h1>

<p align="center">Amazon Simple Notification Service (SNS)</p>

<h2>Principais Conceitos</h2>

O Amazon SNS permite que aplicativos e usuários finais em dispositivos diferentes recebam notificações por meio de notificações por push móveis (Apple, Google e tablets Fire), HTTP/HTTPS, E-mail/E-mail-JSON, SMS, Amazon Simple Queue Service (SQS) ou funções do AWS Lambda.

O SNS permite enviar mensagens individuais ou distribuir mensagens para um grande número de destinatários inscritos em um único tópico.

<h2>Tópicos</h2>

Um tópico é um "ponto de acesso" que permite aos destinatários se inscrever dinamicamente para receber cópias idênticas da mesma notificação. Um tópico pode dar suporte a entregas para vários tipos de endpoints, por exemplo, é possível agrupar destinatários de iOS, Android e SMS.

<h2>Assinaturas</h2>

Para receber mensagens publicadas em um tópico, você precisa inscrever um endpoint no tópico em questão. Um endpoint é um aplicativo móvel, servidor da web, endereço de e-mail ou uma fila do Amazon SQS que pode receber mensagens de notificação do Amazon SNS.

Quando você inscrever um endpoint em um tópico e a inscrição for confirmada, o endpoint receberá todas as mensagens publicadas nesse tópico.

<h2>Publicação</h2>

Quando você publica em um tópico, o SNS entrega cópias adequadamente formatadas da sua mensagem para cada assinante desse tópico. 

Para notificações por push móvel, você pode publicar diretamente no endpoint ou inscrever o endpoint em um tópico.