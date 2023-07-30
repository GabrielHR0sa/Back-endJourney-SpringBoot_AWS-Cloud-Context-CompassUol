<h1 align="center">Nat Gateway</h1>

Um Nat Gateway é um serviço gerenciado que atua como intermediário entre a sua VPC e a internet pública. Ele permite que instâncias em suas sub-redes privadas tenham acesso à internet para buscar atualizações, fazer downloads, enviar e receber dados, mas ao mesmo tempo, protege essas instâncias contra tráfego não solicitado originado da internet.

Quando uma instância em uma sub-rede privada precisa acessar a internet, ela envia seu tráfego através do Nat Gateway. O Nat Gateway então traduz o endereço IP da instância privada para seu próprio endereço IP público atribuído, permitindo que o tráfego saia da VPC e alcance a internet. As respostas da internet são enviadas de volta ao Nat Gateway, que traduz novamente o endereço IP público para o IP privado correto e encaminha o tráfego de volta à instância na sub-rede privada.

Além de permitir acesso à internet a partir de instâncias em sub-redes privadas, os Nat Gateways também ajudam a melhorar a segurança da sua VPC, pois atuam como uma barreira entre a internet e as instâncias privadas, tornando-as menos acessíveis para tráfego externo não autorizado.

Alguns pontos importantes sobre Nat Gateways:

<ol>

<li>Custo: Os Nat Gateways são serviços gerenciados e têm custo associado, que é baseado na quantidade de dados processados por hora. Portanto, é importante considerar o custo ao projetar sua arquitetura.</li><br>

<li>Disponibilidade e escalabilidade: Geralmente, os provedores de nuvem garantem alta disponibilidade dos Nat Gateways, distribuindo-os em várias zonas de disponibilidade para garantir a redundância. Eles também são altamente escaláveis, podendo lidar com grandes volumes de tráfego.</li><br>

<li>Elasticidade: A capacidade de um Nat Gateway é elástica, ou seja, ele se ajusta automaticamente para lidar com picos de tráfego sem intervenção manual.</li><br>

<li>EIP (Elastic IP): Um endereço IP público estático chamado Elastic IP é associado ao Nat Gateway. Esse endereço IP não muda, a menos que você o remova explicitamente.</li><br>

</ol>

Em resumo, os Nat Gateways são recursos essenciais quando se trabalha com VPCs em nuvem, pois eles permitem que suas instâncias privadas acessem a internet de forma segura e confiável, garantindo também que o tráfego indesejado seja bloqueado.

