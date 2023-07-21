<h1 align="center">O que é o Amazon EC2?</h1>

O Amazon Elastic Compute Cloud (Amazon EC2) oferece uma capacidade de computação escalável sob demanda na Nuvem Amazon Web Services (AWS). O uso do Amazon EC2 reduz os custos de hardware para que você possa desenvolver e implantar aplicações com mais rapidez. É possível usar o Amazon EC2 para executar quantos servidores virtuais forem necessários, configurar a segurança e as redes e gereciar o armazenamento. Você pode adicionar capacidade (aumentar a escala verticalmente) para lidar com tarefas de computação pesada, como processos mensais ou anuais ou picos no tráfego do site. Quando o uso diminui, você pode reduzir a capacidade (reduzir a escala verticalmente) de novo.

O diagrama a seguir mostra a arquitetura básica de uma instância do Amazon EC2 implantada em uma nuvem privada (VPC) da Amazon. Neste exemplo, a instância do EC2 está dentro de uma zona de disponibilidade na região. A instância do EC2 é protegida por um grupo de segurança, que é um firewall virtual que controla o tráfego de entrada e saída. Uma chave privada é armazenada no computador local, e uma chave privada é armazenada  na instância. Ambas as chaves são especificas como um par de chaves para provar a identidade do usuário. Nesse  cenário, a instância é apoiada por um volume do Amazon EBS. A VPC se comunica com a Internet usando um gateway da Internet.<hr>

<h2>Recursos do Amazon EC2</h2>

O Amazon EC2 fornece os seguintes recursos de alto nível:

<h3>Instâncias</h3>

As instâncias do Amazon EC2 (Elastic Compute Cloud) são unidades virtuais de computação na nuvem fornecidas pela Amazon Web Services (AWS). Elas são a base da infraestrutura de computação em nuvem da AWS e permitem que os usuários executem aplicativos e serviços em uma variedade de configurações e capacidades de computação.

Uma instância do EC2 é basicamente um servidor virtual que pode ser configurado e implantado rapidamente na nuvem da AWS. Cada instância é executada em um sistema operacional de sua escolha, como Amazon Linux, Windows Server, Ubuntu, entre outros. As instâncias do EC2 oferecem flexibilidade em termos de dimensionamento, segurança, configuração de rede e recursos computacionais.

Ao criar uma instância do EC2, você pode selecionar várias opções, como o tipo de instância, que determina a capacidade computacional e o desempenho, a quantidade de armazenamento, o sistema operacional, a região da AWS em que será implantada e outras configurações avançadas. As instâncias do EC2 podem ser iniciadas, interrompidas, reiniciadas e encerradas conforme necessário, o que permite ajustar a capacidade computacional de acordo com a demanda.

<h3>Imagens de máquina da Amazon (AMIs)</h3>

Uma imagem de máquina da Amazon (AMI) é uma imagem compatível e mantida pela AWS, que fornece as informações necessárias para iniciar uma instância. Especifique uma AMI ao iniciar uma instância. É possível iniciar várias instâncias em uma única AMI quando precisar de várias instâncias com a mesma configuração. É possível usar AMIs diferentes para iniciar instâncias quando precisar de instâncias com configurações diferentes.

Uma AMI inclui o seguinte:

<li>Uma ou mais snapshots do Amazon Elastic Block Store (Amazon EBS) ou, para AMIs com suporte de armazenamento de instâncias, um modelo para o volume raiz da instância (por exemplo, um sistema operacional, um servidor da aplicação e aplicações).</li><br>

<li>Permissões de execução que controlam quais contas da AWS podem usar a AMI para executar instâncias.</li><br>

<li>Um mapeamento de dispositivos de blocos que especifica os volumes a serem anexados à instância quando ela for executada.</li><br>

<h3>Tipos de Instâncias</h3>

No serviço Amazon Elastic Compute Cloud (EC2), existem vários tipos de instâncias disponíveis para atender a diferentes requisitos de computação. Cada tipo de instância oferece diferentes combinações de recursos de CPU, memória, armazenamento e capacidades de rede. Aqui estão alguns dos tipos de instâncias comumente utilizados no EC2:

Família de Uso Geral (General Purpose):
<li>t2: Projetadas para cargas de trabalho de uso geral, essas instâncias fornecem uma quantidade balanceada de recursos de CPU, memória e armazenamento.

Família de Otimização de Computação (Compute Optimized):
<li>c5: Oferecem um desempenho de computação escalável e são adequadas para cargas de trabalho que exigem alta capacidade de computação, como análises, simulações e servidores de jogos.

Família de Otimização de Memória (Memory Optimized):
<li>r5: Projetadas para cargas de trabalho que exigem uma grande quantidade de memória, como bancos de dados em memória, processamento de dados em lote e análises em tempo real.

Família de Otimização de Armazenamento (Storage Optimized):
<li>i3: São otimizadas para cargas de trabalho que exigem alta capacidade de armazenamento e desempenho de I/O, como bancos de dados NoSQL, data warehouses e caches em memória.

Família de Propósito Geral Balanceada (Burstable Performance):
<li>t3: São semelhantes às instâncias da família t2, mas oferecem desempenho melhorado e recursos adicionais.

Além dessas famílias, existem muitas outras instâncias especializadas disponíveis no EC2, como instâncias GPU (para processamento gráfico), instâncias FPGA (para aceleração de hardware personalizada) e instâncias de uso intensivo de armazenamento (para cargas de trabalho que requerem grande capacidade de armazenamento). Cada família de instâncias possui diferentes gerações e tamanhos específicos para atender às necessidades dos usuários. É importante revisar a documentação oficial da AWS para obter detalhes atualizados sobre os tipos de instâncias disponíveis, suas especificações e preços.

<h3>Pares de chaves</h3>

Proteja informações de login de suas instâncias. A AWS armazena a chave pública, e você armazena a chave privada em um lugar seguro.

<h3>Volumes de armazenamento de intâncias</h3>

Volumes de armazenamento para dados temporários que estão excluídos quando você interrompe, hiberna ou encerra sua instância.

<h3>Volumes do Amazon EBS</h3>

Volumes de armazenamento persistentes para seus dados usando o Amazon Elastic Block Store (Amazon EBS).

<h3>Regiões, zonas de disponibilidade, zonas locais, AWS, Outposts e zonas do Wavelength</h3>

Vários locais físicos para seus recursos, como instâncias e volumes do Amazon EBS.

<h3>Grupos de segurança</h3>

Um firewall virtual que permite especificar os protocolos, as portas e os intervalos de IP de origem que podem alcançar suas instâncias e os intervalos de IP de destino aos quais sua instâncias podem se conectar.

<h3>Endereços IP elásticos</h3>

Endereços Ipv4 estáticos para computação em nuvem dinâmica.

<h3>Tags</h3>

Metadados que você pode criar e atribuir aos recursos do Amazon EC2.


