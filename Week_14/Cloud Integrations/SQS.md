<h1 align="center">Amazon SQS</h1>

O Amazon Simple Queue Service (Amazon SQS) é um web service que disponibiliza a você acesso a filas de mensagens que armazenam mensagens esperando processamento. Com o Amazon SQS, você pode criar rapidamente aplicações de enfileiramento de mensagens executáveis em qualquer computador.

O Amazon SQS oferece um serviço hospedado de enfileiramento confiável, seguro e altamente escalável para armazenar mensagens em trânsito entre computadores. Com o Amazon SQS, você pode movimentar dados entre componentes de aplicação diferentes e distribuídos, sem perder mensagens nem precisar que cada componente esteja sempre disponível. Você pode trocar dados confidenciais entre aplicações usando a SSE do Amazon SQS integrada ao AWS Key Management Service (KMS).

O Amazon SQS pode ajudar você a criar uma aplicação distribuída com componentes separados, trabalhando em conjunto com o Amazon Elastic Compute Cloud (Amazon EC2) e os outros web services de infraestrutura da AWS.

<h2>Tipos de Fila</h2>

O Amazon SQS oferece dois tipos de filas para requisitos de aplicações diferentes:

<h3>Filas padrão</h3>

As filas oferecidas pelo Amazon SQS são predefinidas como padrão. Uma fila padrão permite que você tenha uma quantidade praticamente ilimitada de transações por segundo. 

As filas padrão garantem a entrega de uma mensagem pelo menos uma vez. Entretanto, ocasionalmente (devido à arquitetura altamente distribuída de alta capacidade), mais de uma cópia de uma mensagem pode ser entregue fora de ordem. 

As filas padrão oferecem a melhor ordenação possível, o que garante a entrega das mensagens na mesma ordem em que foram enviadas.

<h3>Filas FIFO (First in First out)</h3>

A fila FIFO (primeiro a entrar, primeiro a sair) complementa a fila padrão. Os recursos mais importantes desse tipo de fila são a entrega FIFO e o processamento exatamente uma vez: a ordem em que as mensagens são enviadas e recebidas é preservada com rigor e uma mensagem é entregue uma vez e permanece disponível até que o cliente a processe e a exclua. 

Duplicatas não são inseridas na fila. As filas FIFO também são compatíveis com grupos de mensagens que permitem vários fluxos ordenados dentro de uma única fila.

As filas FIFO estão limitadas a 300 TPS (Transactions per second – Transações por segundo) por ação de API, mas têm os mesmos recursos das filas padrão.

 