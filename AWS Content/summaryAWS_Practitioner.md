<h1 align="center">Módulo 1</h1>

<p align="center">Introdução à Amazon Web Services</p>

`Modelo cliente servidor`

    cliente: faz uma solicitação

    servidor: atende a solicitação do cliente

`O que é computação em nuvem`

    acesse serviço sob demanda

    evite grandes investimentos

    provisionar recursos conforme necessidade

    pague pelo uso

`Modelos de implantação`

Em nuvem: 

    executamos tudo na nuvem

    migramos tudo para nuvem

    projetamos e construimos novos apps na nuvem

Local:

    Temos uma sala para nossos recursos, servidor

    Utilizamos ferramentas de virtualização

Híbrida:

    Utiliza-se os dois lados, parte on premisses e na cloud

    migrações, recursos divididos

`+ de 200 serviços de nuvem`

`Benefícios da computação em nuvem`

    Despesas variáveis, saimos de despesas iniciais para variáveis

    pagamos somente pelo uso.

    Saimos do CAPEX para o modelo OPEX

    Otimização de custos

    Mais tempo para focar em desenvolvimento

    Capacidade, paramos de adivinhar as necessidades e dimencionamos oque precisamos

    Economias de escala

    Rapidez na criação de recursos, minutos entre obter os recursos.

    Global em minutos, implantação rápida.

`Categorias de serviços`

    Computação

    Rede e entrega de conteúdo

    Armazenamento

    Banco de dados

    Segurança e conformidade

    Gerenciamento e governaça

<hr>

<h1 align="center">Módulo 2</h1>

<p align="center">Computação na nuvem</p>

`EC2` Elastic Compute Cloud

    capacidade computacional segura e redimencionavel

    instâncias

    pague pelo uso

    execute  a instância -> conecte-se a instância -> use a instância.

`Tipos de instâncias`

    Uso Geral

    Otimizada para computação

    Otimizada para memória

    Otimizada para armazenamento

`Definição de preços`

    Sob demanda: ideal para cargas de trabalho irregulares e de curto prazo

    Spot: ideal para cargas de trabalho com horários de inicio e termino flexiveis. Oferece economia em relação sob demanda. (90%)

    Reservado: Requer compromisso de 1 ou 3 anos. Fornece desconto em relação ao preço sob demanda.

    Computing savings plan: trocar modelo, exige compromisso de 1 ou 3 anos. 

    Instância dedicada: Executa em uma VPC em hardware para um único cliente. Custo mais alto em comparação com instâncias padrão do EC2.

    Host dedicado: Um servidor físico para um único cliente. Opção mais cara.

`Auto Scaling`

    Escalonamento para demandas, altas ou baixas, dimensiona a capacidade conforme necessidade.

    Escala Horizontal

`ELB` Elastic Load Balancer

    Distribui automáticamente a demanda de tráfego.

    fornece um unico ponto de contato

`SNS` Simple Notification Service

    Mensagens publicadas em tópicos

    assinantes recebem as mensagens publicadas no tópico

`SQS` Simple Queue Service

    envia, armazena e recebe mensagens entre os componentes

    enfileira as mensagens sem que  o serviço esteja disponível

<h2>Serverless</h2>

S3, DynamoDB, Lambda

`Lambda`

    executa codigo sem provisionar ou gerenciar servidores

    pague pelo tempo de execução

    configure outros serviços para executálo automáticamente

<h2>Containers</h2>

`ECS` Elastic Container Service

    Executa e escala aplicações em containers

    Usa chamadas de API simples para controlar aplicações habilitadas para Docker

`EKS` Elastic Kubernets System 

    Executa e escala aplicações do kubernets

    Atualiza rapidamente aplicações com novos recursos

`Fargate`

    Executar containers sem servidor com o Amazon ECS ou EKS

    pague pelos recursos utilizados

<hr>

<h1 align="center">Módulo 3</h1>

<p align="center">Infraestrutura Global e Confiabilidade</p>

    Regiões > Availability Zone (AZ)

    Azs conectadas com baixa latência.

    Região é composta por 1 ou mais AZ

    Az contém 1 ou mais data centers

    32 Regiões, 102 AZs, 450 Edge Locations

    35 zonas locais, 254 paises atendidos, 115 locais do direct connect

`Selecione uma região`

    Conformidade com a governança de dados e requisistos legais

    Proximidade com seus clientes

    Precificação

    Serviços disponíveis na região

    Boas práticas: Colocar a aplicação em mais de  uma AZ

`Cloud Front`

    Fornecer o conteúdo de forma mais rápida, em outra região

    Fazer cache em edge locations para entrega do conteúdo

`Outposts`

    Estenda a infraestrutura da AWS para diferentes locais, incluindo seu data center, se conecta a região mais próxima.

`Interação com os serviços da AWS`

    Console de gerenciamento

    CLI - interface de comando da AWS

    Kits de desenvolvimento de Software (SDK)

<hr>

<h1 align="center">Módulo 4</h1>

<p align="center">Redes</p>

`VPC` Virtual Private Cloud

    Permite criar recursos em uma rede virtual definida por você

    Seção isolada dentro da AWS para trabalhar

    Cargas de trabalho públicas e privada

`Sub-rede`

    Seção em VPC na qual pode colocar grupos de recursos isolados

    pode ser pública ou privada

    Publica pode ser acessada pelo ambiente externo, privada não deixa exposta.

`Internet Gateway`

    Porta de entrada principal pela internet

    Utilizada para conexão entre internet e sua rede publica

`Gateway privado virtual`

    Porta de entrada para o data center corporativo, utiliza a internet

`Direct Connect`

    Conexão direta com o Data center e a nuvem, não utiliza a internet, conexão dedicada com a AWS.

`ACLS` Listas de controle de acesso

    confirma se pode ser autorizada a entrada

    é um firewall a nivel de sub-rede

    permite todo trafego de entrada e saida

    quando configurada, nega todo o tráfego de entrada e saída

    metodo de filtragem de pacote sem  estado (stateless)

    não se recorda das decisões para tal pacote, verifica tanto na entrada quanto na saída.

`Security Groups`

    firewall a nivel de instância

    nega todo tráfego de entrada e permite todo tráfego de saída

    metodo de filtragem com estado (statefull)

    se recorda das decições para tal pacote, verifica na entrada mas não na saída.

`DNS` Domain Name System 

    permite a conexão entre o cliente e a companhia

`Route 53`

    roteia usuários para aplicativos da internet

    conecta solicitações à infraestrutura da AWS

    registra os dominios, os DNS

<hr>

<h1 align="center">Módulo 5</h1>

<p align="center">Armazenamento e banco de dados</p>

`Armazenamento em bloco`

    arquivos são separados em partes de tamanho igual (blocos de dados)

    é usado para aplicativos executados em instâncias do EC2.

`Armazenamento de instância`

    Uma instância de EC2 está em execução, quando interrompido ou encerrado os dados armazenados são excluidos.

`EBS`

    Quando encerrados os dados não são perdidos, o volume de dados se mantem quando a instância é interrompida ou encerrda.

    pode ser feitos snapshots dos volumes

`Armazenamento de objetos`

    cada objeto consiste em dados, metadados e chave

`S3` Simple Store Service

    Armazena em buckets

    define o acesso aos objetos

`S3 Standard`

    projetado para dados com acesso frequente

    Armazenados em 3 AZs

`S3 Standard Infrequent Access`

    ideal para dados acessados com pouca freqûencia

    preço de armazenamento mais baixo e preço de recuperação mais alto

`S3 One Zone IA`

    Armazena dados em uma unica AZ

    preço de armazenamento mais baixo

`S3 Intelligent Tiering`

    ideal para padrões desconhecidos

    monitora cada objeto

`S3 Glacier Instance Retrieval`

    armazenamento de baixo custo para armazenamento de  dados

    recuperação de milisegundos

`S3 Glacier Flexible Retrieval`

    classe de armazenamento de objeto de menor custo

    recuperação de minutos ou horas

`S3 Glacier Deep Archive`

    classe de armazenamento de objeto de menor custo

    recuperação dentro de 12 hrs

`Armazenamento de arquivos`

    varios cliente podem acessar dados armazenados em pastas de arquivos compartilhados

`EFS` Elastic File System

    armazena dados em um sistema de arquivos escalonável

    fornece milhares de instâncias do EC2 simultaneamente

    Armazendar dados em varias AZs por padrão

    EFS - Linux

    FSX - Windowns

<h2>Banco de Dados</h2>

`Relacionais`

Organizam os dados em tabelas com linhas e colunas, seguindo esquemas predefinidos. As relações entre as tabelas são estabelecidas por meio de chaves primárias e estrangeiras, garantindo integridade e consistência.

    tabelas, se relacionam com outros dados

    usa-se a linguagem SQL para consultas

`RDS` Relational Database Service

    Serviço relacional gerenciado pela AWS

    Suporta uma variedade de mecanismos de banco de dados relacionais como MySQL, PostgreSQL, Oracle, Microsoft SQL Server e MariaDB

    Gerencia automáticamente tarefas de manutenção como backups regulares, aplicações de patches e atualizações do mecanismo do banco de dados

    Permite escalabilidade vertical (aumentar a capacidade dos recursos) e horizontal (adicionar read replicas)

    Oferece backups automáticos com retenção configurável

    Oferece implantação em várias zonas de disponíbilidade.

`Aurora`

    Banco de dados relacional  da AWS, replica em varias AZs

    Compatível com MySQL e PostgreSQL

    Oferece desempenho 5x maior em MySQL e 3x maior em PostgreSQL

    Pode criar até 15 réplicas para leitura

    Armazena dados em blocos de 10 GB

    Possui um mecanismo de recuperação de falhas rápida

    Realiza backups automáticos

    Pode ser escalado verticalmente (aumentando seu poder computacional) e horizontalmente (adicionando read replicas)



`Não relacionais`

Os bancos de dados não relacionais (NoSQL) não seguem o modelo tabular. Podem ser baseados em diferentes modelos de dados, como documentos, chave valor, coluna ou grafo. Isso permite uma flexibilidade maior na modelagem de dados.

    Relacionamento chave e valor

`DynamoDB`

    Serverless

    Chave valor

    Banco de dados NoSQL que suporta modelos de dados flexíveis

    Escala horizontalmente de forma automática

    Otimizado para fornecer de forma atomática

    Otimizado para fornecer baixa latência de leitura e gravação

    Oferece backups automáticos com retenção de até 35 dias

    Suporta KMS, também permite criptografia SSL/TLS

    Pague somente pelo armazenamento e pelos recursos que utiliza gravação e leitura

<h2>Outros serviços de banco de dados</h2>

`DMS` Database Migration Service

    Se conecta a origem e migra para o destino

    Facilita a migração de dados de um banco para outro

    Suporta migrações de diferentes bancos

    Fornece métricas e logs que permitem monitorar o progresso da migração ou replicação

`Athena`

    Permite consulta interativa, executa consultas SQL em dados armazenados em S3

    Suas consultas são divididas em tarefas menores

    Permite consultas em formatos variádos, como CSV, JSON, Parquet, Avro, ORC e outros

    Pague somente pelas consultas que executa

    Pode ser integrada com ferramentas de visualização, Tableau, Amazon Quicksight

`Redshift`

    É um serviço de data warehouse, projetado para analize de dados de grande escala e consultas complexas

    Usa arquitetura colunar, os dados são armazenados em colunas

    Permite aumentar ou diminuir a capacidade de armazenamento e computação de acordo com as necessidades

    Oferece backups automáticos e a capacidade de criar snapshots manuais

`DocumentDB`

    executar cargas de trabalho do MongoDB

    Oferece a capacidade de escalar verticalmente

    Cria automaticamente rélicas em varias AZs

    Oferece backups automatizados e a capacidade de criar snapshots manuais

`Neptune`

    Otimizado para o armazendamento e consulta de dados em formato de grafo

    Projetado para armazenar, consultar e processar dados

    Útil para modelar relacionamentos complexos e consultas de redes interconectadas

    Suporta as línguagens Gremlin e SPARQL

    Oferece replicação e failover automáticos para garantir alta disponibilidade e recuperação de falhas

    Oferece backups automáticos e a capacidade de criar snapshots manuais

`EMR` Elastic Map Reduce

    Serviço Big Data

    Facilita a criação e o gerenciamento de clusters de processamento de dados distribuídos

    Projetado para executar processamento de dados em larga escala

    Haddop, Spark, Hive, Hbase

    Pode ser integrado com outros serviços como IAM, S3, CloudWatch

`Amazon QLDB`

    Revise um histórico completo de alterações nos dados do aplicativo

`Amazon Managed Block chain`

    Serviço que facilita a criação, implantação e gerenciamento de redes de blockchain

    Suporta os frameworks de blockchain Hyperledger Fabric e Ethereum

`ElastiCache`

    Permite que você crie e gerencie caches em memória

    Suporta mecanismos de cache em memória Redis e Memcached

    Permite a escalabilidade horizontal, adicionando ou removendo nós de cache conforme o necessário

    Oferece recursos de backups automáticos e manuais

`DynamoDB Accelerator` DAX

    melhora os tempos de resposta do DynamoDB

`Glue`

    Serviço ETL (Extração, Transformação e Carga)

    Oferece um catálogo de metadados unificado que rastreia e organiza os dados em diferentes fontes

    Dimensiona automaticamente os recursos de processamentos e na quantidade de dados processados

    Suporta grandes volumes de dados, tornando-o adequado para data lakes

`QuickSight`

    Permite criar visualizações interativas e painéis de controle para análise de dados

    Oferece uma grnade variedade de tipos de visualizações, como gráficos, tabelas, mapas e muito mais.

    Suporta conexões a várias fontes de dados, Redshift, RDS, S3, Salesforce

    Permite a criação de paíneis de controle personalizados

<hr>

<h1 align="center">Módulo 6</h1>

<p align="center">Segurança</p>


<h2>Modelo de responsábilidade compartilhada</h2>

A AWS opera, gerencia e controla os componentes do sistema operacional do host e a camada de virtualização, até a segurança física das instalações em que o serviço opera.

O cliente assume a gestão e a responsabilidade pelo sistema operacional convidado (inclusive atualizações e patches de segurança), por outros softwares e aplicativvos associados e pela configuração do firewall do grupo de segurança fornecido pela AWS

`Responsábilidade da AWS` Security OF the cloud

AWS é responsável por proteger a infraestrutura que executa todos os serviços oferecidos na nuvem AWS. Essa infraestrutura é composta por hardware, software, redes e instalações que executam os serviços de nuvem.

    É responsável pela infraestrutura física dos data centers

    Fornece a rede global que permite a conectividade entre os serviços, data centers e regiões

    Gerencia serviços como RDS, S3, incluindo patches de segurança e manutenção básica.

`Responsábilidade do Cliente` Security IN the cloud

Será determinada pelos serviços de nuvem selecionados por ele.

Os clientes são responsáveis por gerenciar os dados deles (o que inclui opções de criptografia), classificando os ativos e usando as ferramentas de IAM para aplicar as permissões apropriadas

    É responsável por proteger os dados e controlar o acesso a eles, incluindo criptografia e gerenciamento de chaves

    Deve configrar e gerenciar as permissões de acessos

    Precisa configurar firewalls, grupos de segurança

    É responsável pelo sistema operacional e quaisquer patches ou atualizações

    Manter a segurança das aplicações e dos dados.

`Controles herdados`

    Controles que um cliente herda completamente da AWS

    Controles físicos e ambientais

`Controle compartilhados`

A AWS disponíbiliza os requisitos de infraestrutura e o cliente deve disponibilizar sua própria implementação de controles dentro do uso de serviços.

Gerenciamento de patches: AWS é responsável pela aplicação de patches e pelas correções de falhas na infraestrutura, mas os clientes são responsáveis pela aplicação do mesmo.

Gerenciamento de configuração: AWs mantem a configuração dos dispositivos de infraestrutura, mas o cliente é resposável pela configuração de seus próprios bancos de dados, aplicativos e sistemas operacionais convidados.

Conhecimentos e treinamentos: AWS treina seus funcionários, mas o cliente deve treinar seus próprios.

`Específicos do cliente`

Proteção ou zona de segurança de serviços e comunicação, que pode exigir que o cliente roteie dados para ambientes de segurança específicos.

------------

`IAM` Identity Access Management

    Gerenciamento de contas e usuários

    configurar usuário, política, grupo, função e MFA

`root account` usuário raiz

    Boas práticas: cirar um usuário IAM para não utilizar a conta root, um usuário IAM com permissões de admin.

`Usuário IAM`

    identidade que representa uma pessoa ou aplicativo que interage com serviços e recursos da AWS

    criar usuários individuais para cada usuário no IAM, não compartilhar acessos.

`Políticas IAM`

    Documento que concede e nega permissões para os usuários, Documento em JSON

    seguir o princípio do privilégio mínimo.

`Grupos IAM`

    coleção de usuários

    agrupar usuários para a mesma função, facilita o gerenciamento

    membros herdam políticas atribuídas ao grupo

`Funções IAM` (Role)

    identidade temporária para acesso as permissões

    ao iniciar outra função, perde-se a função anterior

`MFA` Multifactor Authentication

    autenticação de multifator, fornece uma camada extra de camada de proteção

`AWS Organizatios`

    Ajuda a consolidar varias contas AWS em um local central

    Usa SCPs para controlar centralmente as permissões para as contas em sua organização.

    uma conta raiz, que gerencia as demais contas abaixo

`Artifact`

    fornece acesso sob demanda a relatórios de segurança e conformidade e contratos online selecionados

    repositório de documentação de segurança e conformidade.

`WAF` Web application firewall camada 7

    ajuda a proteger seus aplicativos web e apis contra explorações comuns da Web

    bloqueia tráfego malicioso

    pode-se customizar as regras e utilizar regras gerenciadas

`Shield`

    protege contra ataques DDOS

    integre o Shield Advanced e outros serviços

    Escreva regras personalizadas de ACL com o WAF para mitigar ataques DDOS complexos

`Inspector`

    executa avaliações de seguranã automatizadas em seus aplicativos

    conduza automaticamente avaliações de segurança de aplicativos

    identificar vulnerabilidades de segurança e desvios das práticas recomendadas

    Receber recomendações sobre como corrigir problemas de segurança

`KMS` Key managament Service

    ajuda na parte de criptografia

    ajuda os clientes a executar operações de criptografia por meio do usop de chaves criptografádas

    pode escolher niveis específicos de controle de acesso que você precisar para suas chaves

`GuardDuty`

    Fornece detecção inteligente de ameaças para produtos e serviços da AWS

    Analiza continuamente a atividade da rede e da conta

    Detecta ameaças de forma inteligente

    Revise as descobertas detalhadas e tome medidas

    Somente avisa sobre os erros

<hr>

<h1 align="center">Módulo 7</h1>

<p align="center">Monitoramento e Análize</p>

`CloudWatch`

    Fornece métricas paramonitoramento de infraestrutura em tempo real

    acessar as métricas de um unico local

    configurar metricas e alertas em resposta a determinadas ações

`CloudTrail`

    Guarda as ações efetuadas pela conta da AWS.

    quem, onde, quando e como?

    acompanhe as atividades dos usuários

    detecte automaticamente atividades incomuns da conta

`Trusted Advisor`

    Consultor que observa e faz recomendações de melhoria

    Receba orientações em tempo real de melhorias

    compara sua infraestrutura com as melhores práticas

    Otimização de custo, performance, segurança, tolerância de flahas e limites de serviço

    Quanto maior o nível de suporte, maior o numero de verificações que serão possíveis de realizar.

<hr>

<h1 align="center">Módulo 8</h1>

<p align="center">Precificação e suporte</p>

`Categorias de nível gratuíto`

    Sempre gratuitos

    12 meses gratuitos

    Testes

`Conceitos de precificação`

    Pague conforme o uso

    Pague menos ao reservar

    Pague menos com descontos baseados em volume

`Pricing Calculator`

    Calculadora de preços da AWS, estimativa do valor dos serviços

`Consolidated Billing`

    Receba somente uma fatura para todas as contas da AWS em sua organização

    revisar os encargos

`Budgets`

    é uma ferramenta que você pode usar para definir limites para o uso e os custos do serviço da AWS

    Cadastrar limites

`Cost Explorer`

    Explorador de custos da conta ao passar do tempo, tanto para frente quanto para trás.

    Pode fazer previsões para entender os gastos da conta

    Entender os gastos da conta

`Planos de suporte`

    Suporte básico está incluido para todos os clientes AWS e oferece:

    Atendimento ao cliente e comunidades: acesso ao atendimento ao cliente, documentação, whitepapers e ao re:Post 24 horas por dia 7 dias por semana

    AWS Trusted Advisor: acesso às principais verificações e orientações para provisionar seus recursos de acordo com as práticas recomendadas para aumentar a performance e aprimorar a segurança.

    AWS Personal Health Dashboard: uma vizualização personalizada da integridade dos serviços da AWS e envio de alertas quando seus recursos forem afetados.

`Developer`

    Direcionado para desenvolvedores individuais ou pequenas equipes que estão começando a usar os serviços da AWS.

    Preço mais baixo em comparação com os outros planos

    Oferece acesso ao fórum de suporte, também inclui o acesso a recursos de documentação, tutoriais e guias de autoatendimento.

    Oferece acesso ao Trusted Advisor

    Oferece acesso ao Personal Health Dashboard

    Oferece suporte a incidentes operacionais, pode-se entrar em contato para reporte de problemas críticos.

    O suporte técnico por email está disponível 24 horas por dia 7 dias por semana

`Business`

    Para atender às necessidades de suporte de empresas e organizações que precisam de um nível mais abrangente de assistência técnica.

    Oferece suporte técnico por telefone e email 24 horas por dia e 7 dias por semana

    Inclui tempos de resposta mais rápidos para incidentes críticos

    Tem acesso a um Gestor de casos técnico (TAM)

    Oferece acesso ao Trusted Advisor, acesso a todas as verificações

    Oferece acesso ao Personal Health Dashboard

    Recebe orientações sobre as melhores práticas para arquitetar suas evoluções

    Inclui créditos para treinamento online

    A AWS auxilia na coordenação e colaboração com fornecedores terceirizados, se necessário.

    Oferece acesso ao fórum de suporte da AWS

`Enterprise On-Ramp`

    Oferece acesso ao TAM Gerente técnico de contas

`Enterprise`

    O plano mais abrângente, indicado para empresas que precisam de suporte técnico altamente especializado e personalizado.

    O suporte técnico está disponível 24 horas por dia, 7 dias por semana

    Inclui um Gestor de Casos Técnico dedicado (TAM)

    Oferece tempos de resposta extremamente rápidos para incidentes críticos

    Oferece acesso a uma equipe especializada que pode ajudar na otimização de recursos.

    Especialistas podem revisar seu código e oferecer sujestões de otimização, eficiência e segurança

    Inclui créditos para treinamento online

    Oferece acesso ao Trusted Advisor, acesso a todas as verificações

    Oferece acesso ao Personal Health Dashboard

`Gravidade do Caso / Tempos de resposta`

    Orientações gerais: menos de 24 horas
    Sistema afetado: menos de 12 horas
    Sistema de produção afetado: menos de 4 horas
    Sistema de produção inativo: menos de 1 hora
    Sistema essêncial aos negócios ou à missão inativo: menos de 15 minutos

`Marketplace`

    Catálogo digital que fornece soluções de software de terceiros que estão executando na AWS

    Descubra milhares de produtos de software que são executados na AWS

    Acesse informações detalhadas e avaliações para cada solução

    Explore soluções de software por setor e caso de uso

`Categorias do AWS Marketplace`

    Aplicações de negócios
    Dados e Analíticos
    DevOps
    Infraestrutura Software
    Internet das coisas (IOT)
    Machine Learning (ML)
    Migração
    Segurança

<hr>

<h1 align="center">Módulo 9</h1>

<p align="center">Migração e Inovação</p>

`Cloud Adoption Framework` CAF

    Fornece consultoria a uma empresa para permitir uma migração rápida e suave para a AWS

    organiza a orientação em seis áreas de foco, chamadas de perspectivas

    Perspectivas: negócios, pessoas, governança, plataforma, segurança e operações

`Estratégias para migração`

    Aplicações a serem migradas -> fase de descoberta

    Realocar

    Redefinir a hospedagem

    Redefinir a plataforma

    Refatorar/Rearquitetar

    Recomprar

--------------

    Reter

    Retirar

`Família Snow`

    Migração offline

`SnowCone`

    Dispositivo pequeno, robusto e seguro para transferência de dados e computação de borda

    Até 8 TB de dados

`SnowBall`

    SnowBall Edge otimizado para armazenamento

    SnowBall Edge otimizado para computação

    Até 80 TB de dados

`SnowMobile`

    Serviço de transferência de dados na escala de exabytes para mover grandes quantidades de dados para a AWS

    Até 100 PB de dados

`Caminhos de inovação`

    Aplicações serverless

    Inteligência Artificial (IA)

    Machine Learning (ML)

`Well-Architected Framework`

    Ajuda a entender como projetar e operar sistemas confiáveis, seguros, eficiêntes e econômicos na nuvem

    baseia-se em 6 pilares

    Excelência Operacional
    Segurança
    Confiabilidade
    Eficiência de Performance
    Otimização de Custos
    Sustentabilidade

`Operational Excellence` Excelência Operacional

    Executar operações como código

    Anotar documentação

    Prever falhas

    Refinar procedimentos operacionais com frequência

    Fazer alterações frequentes, pequenas e reversíveis

`Security` Segurança

    Automatizar as práticas recomendadas de segurança

    Aplicar segurança em todas as camadas

    Proteger dados em trânsito e em repouso

`Reliability` Confiabilidade

    Recuperar-se de falhas de infraestrutura ou serviços

    Adquirir dinamicamente recursos de computação para atender à demanda

    Mitigar interrupções, como configurações inválidas e problemas de rede temporários

`Performance Efficiency` Eficiência de Performance

    Experimentar com mais frequência

    Usar arquiteturas serverless

    Obtenha alcance global em minutos

`Costs Optimization` Otimização de custos

    Adotar um modelo de consumo

    Analisar e atribuir despesas

    Usar serviços gerenciados para reduzir o custo de propriedade

`Sustainabillity` Sustentabilidade

    Entenda seu impacto - estabeleça indicadores de desempenho

    Estabeleça metas de sustentabilidade

    Maximize a utilização - dimensione corretamente cada carga

    Use serviços gerenciados

    Reduza o impacto downstream de suas cargas de trabalho na nuvem