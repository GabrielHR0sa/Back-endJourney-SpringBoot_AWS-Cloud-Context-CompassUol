<h1 align="center">Resumo do conteúdo do curso Cloud Practitioner Essentials</h1>

<h2>Computação em Nuvem</h2>

    Acesso a serviços sob demanda
    Evita investimentos iniciais
    Provisiona recursos conforme a necessidade
    Pague por uso

Implantação:

    Nuvem -> Tudo na nuvem
    Local -> Private Cloud
    Híbrida -> Parte em nuvem AWS e parte no datacenter local

<h2>EC2</h2>

    Capacidade segura e dimensionada
    Instâncias de servidores são iniciadas em minutos
    Pague por uso

`Tipos de instâncias EC2:`

<li>Uso Geral: Equilibra os recursos, adequado para ampla variedade de workloads (Suficiente para o básico).</li><br>

<li>Otimizada para computação: Processamento para alta performance. Ideal para uso intenso de computação (mais CPU).</li><br>

<li>Otimizada para memória: Alta performance para uso intenso de memória. Adequado para bancos de dados de alta performance.</li><br>

<li>Computação acelerada: Uso acelerado de hardware. Ideal para alto processamento gráfico.</li><br>

<li>Otimizada para armazenamento: Oferece baixa latência e operações com alto IOPS (entrada e saída). Adequado para acelerar a taxa de comunicação.</li><br>

`Definição de preço EC2:`

On Demand: Cobrado por uso. Ideal para workloads irregulares de curto prazo.

Reservada: Contrato de reserva de 1 ou 3 anos. Requer compromisso, oferece desconto de faturamento sobre preços sob demanda.

Spot: Oferece economias sobre preços sob demanda. Ideal para workloads com horários flexíveis de início e término.

Compute Savings Plan: Contrato com consumo por hora, compromisso de 1 ou 3 anos. Consumo de CPU e memória.

`Computação dedicada EC2:`

Dedicated Instance: Executada em uma VPC em hardware para um único cliente. Custo mais alto comparado com instâncias padrões EC2.

Dedicated Host: Um servidor físico para um único cliente. Opção mais cara do EC2. Ideal para Licenciamento.

`EC2 Auto Scaling:`

    Dimensionar o uso sob demanda

Auto Scaling Group -> escala as instâncias de forma horizontal, para aumentar ou diminuir.

`Elastic Load Balancing (ELB):`

    Balanceia a carga, distribui o tráfego entre as instâncias de forma igual.
    Escala automaticamente

<h2>Serviços de mensagens AWS</h2>

    Aplicação Monolítica            Aplicação Microsserviços

        Comp1 Comp2                     Comp1 ------- Comp2
        Comp3 Comp4                       |              |
                                        Comp3 ------- Comp4

`Amazon Simple Notification Service (SNS):`

    Publica mensagens em tópicos.
    Os componentes que assinaram o tópico recebem uma cópia da mensagem.
    EX: Assinantes do tópico cupons recebem cupons de descontos.
    Somente o assinante daquele tópico recebe a cópia da mensagem.

`Amazon Simple Queue Service (SQS):`

    Envia, armazena e recebe mensagens dos componentes de software.
    Guarda mensagens na fila, 1 deposita e outro pega a mensagem.
    Comunicação assíncrona.

<h2>Serviços Serverless</h2>

    Gerencia os servidores automaticamente, gerencia a infraestrutura.

 `AWS Lambda:`

    Execute o código sem provisionar ou gerenciar servidores.
    Pague por call ou duração.
    Programação orientada a eventos.

<h2>Serviços de Contâiners</h2>

`Container:`

    Virtualiza componentes no nível do sistema operacional.
    Guarda os componentes necessários para o funcionamento da aplicação.

`Serviços de orquestração de contâineres:`

    ECS e EKS

<li>Elastic Contâiner Service (ECS): Executa aplicações em contâiners</li><br>
<li>Elastic Kubernets Service (EKS): Executa e escala aplicações do Kubernets</li><br>

`Fargate:`

    Executa containers serverless com o Amazon ECS ou o EKS.
    Pague somente pelos recursos utilizados.

<h2>Infraestrutura global e confiabilidade</h2>

`Regiões > Availability Zones > Edge Locations`

Critérios de seleção de região:

    - Conformidade com governança de dados e requisitos legais.
    - Proximidade com os clientes.
    - Serviços disponíveis em uma região.
    - Preços.

`CloudFront:`

Entrega o conteúdo em pontos de presença (Edge Locations) utilizando conteúdo em cache.

`Outposts:`

Hardware

Estende a infraestrutura e os serviços da AWS para seu datacenter local.

    - Console de Gerenciamento.
    - Interface de linhas de comando (AWS CLI).
    - Kits de desenvolvimento de software (SDKS).

<h2>Redes</h2>

`VPC` Permite executar recursos AWS em uma rede virtual definida por você.

`Subnet` É uma seção em uma VPC na qual você pode colocar grupos de recursos isolados. Pode ser pública (recebe tráfego da internet) ou privada.

`Internet Gateway` Chamadas da internet passam por ele, para acesso a internet.

`Virtual Private Gateway` Específico para links privados.

`Direct Connect`Link direto, alta velocidade, não passa pela internet.

<h2>Listas de controle de acesso (ACL) à rede e grupos de segurança</h2>

`ACL`

    Lista de controle de acesso a rede.
    É um firewall virtual para sub-rede.
    A padrão permite todo tráfego de entrada e saída.
    Você pode configurar, onde nega todo o tráfego.

`Security Groups`

    Firewall virtual para instâncias EC2.
    Nega todo o tráfego de entrada, permite tráfego de saída.

<h2>Interação com rede global</h2>

`DNS = Domain Name System`

`Route 53`

    Direciona usuários finais a aplicação da internet.
    Conecta solicitações de usuários à infraestrutura na AWS e fora dela.
    Gerencia registros DNS para nomes de domínio.


             ---> Amazon CloudFront ---> App Load Balancer ---> Auto Scaling Group
    Cliente    
             ---> Amazon Route 53

<h2>Armazenamento e banco de dados</h2>

Solução de armazeamentos

`Armazenamento em bloco:`

    Arquivos são separados iguais em (blocos) dados.
    É usado para aplicações executadas em instâncias EC2.

`Armazenamento de Instâncias:`

    Quando há encerramento da instância, seu volume é apagado.
    Utilizado em área de SWAP, Conteúdo temporário.

`Volume EBS (Elastic Block Store):`

    Acessado pela rede AWS, plugado na rede.
    Mesmo desligado o volume se mantem.
    Ciclo de vida do volume é independente da instância.
    EC2 e EBS precisam estar na mesma AZ.
    Snapshots são backups do volume.
    Snapshots não se tiram sozinhas, não são automaticas.

`Armazenamento de objeto:`

    Monolíto.
    Cada objeto consiste em dados, metadados e uma chave.

`S3:`

    Recursos serverless.
    Armazena recursos em buckets.
    Capacidade virtual ilimitada.
    Autoescalado.
    Replica objetos em 3 AZs diferentes.

`S3 Standard:`

    Projetados para dados acessados frequentemente.
    Armazena dados em no mínimo 3 AZs.

`S3 Standard IA (Infrequent Access):`

    Ideal para acessos com pouca frequência.
    Preço de armazenamento menor, preço de recuperação maior.

`S3 One Zone IA (Infrequent Access):`

    Armazena em uma única AZ.
    Armazenamento mais barato.
    Ideal para backups secundários.

`S3 Intelligent-Tiering:`

    Ideal para padrão de acesso dinâmico ou desconhecidos.
    Exige uma pequena taxa de automação e monitoramento por objeto.

`S3 Glacier:`

    Armazenamento de baixo custo.
    Guarda objetos e os recupera dentro de minutos ou horas.

`S3 Glacier Deep Archive:`

    Mais barato.
    Melhor para guardar por mais tempo.

`Elastic Fyle System (EFS):`

    Armazena dados em um sistema de arquivos escalável.
    Fornece dados para várias instâncias EC2 simultânemante.
    Armazena dados em várias AZs.
    Distribuído em várias ASz.

`Amazon FXs` Específico para Windows.

<h2>Bancos de Dados</h2>

    Banco de dados Relacional
    Banco de dados Não relacional (NoSQL)

`Relacional`

    Dados armazenados de forma que se relacionem.
    Utiliza a línguagem de consulta SQL.

    RDS - Relational Database Service
        - opera um banco relacional
        - automatiza tarefas administrativas demoradas
        - armazena e transmite dados de forma segura
        - restaura o backup
        - criptografia incorporada
    
    Mecanismos de banco de dados do Amazon RDS
        Amazon Aurora, PostgreSQL, MySQL, MariaDB, Oracle Database, Microsoft SQL Server.
    
    Amazon Aurora
        - armazena dados em um banco de dados relacional
        - reduz os custos eliminando operações desnecessárias
        - replica seis cópias de dados em 3 AZs
        - MySQL ou PostgreSQL
        
`Não Relacional`

    Usa estruturas diferentes de linhas e colunas para organizar dados.
    Dados são organizados em itens (chaves) e cada item tem um atributo (valores)

    Amazon DynamoDB
        - banco de dados de chave-valor serverless
        - dimensionado automaticamente para se ajustar e manter uma performance consistente
        - projetado para atender 10 trilhões de solicitações
        
`AWS Database Migration Service (DMS)`

    Migrar bancos de dados relacionais, ou não relacionais para a nuvem.

    Banco de origem ---> AWS DMS ---> Amazon Aurora (banco destino)

<h2>Serviços adicionais de banco de dados</h2>

`Redshift` Consulta e analiza dados em data warehouse.

`Amazon DocumentDB` Cargas de trabalho do MongoDB em um serviço debanco de dados de documentos.

`Amazon Neptune` Executa aplicações que usam conjuntos de dados altamente conectados.

`Amazon QLDB` Revisa o histórico completo das alterações nos dados da sua aplicação.

`Amazon Managed Blockchain` Executa um banco de dados de registros descentralizados.

`Amazon ElastiCache` Adiciona camadas de armazenamentos em cache para melhorar os tempos de leitura do banco de dados.

`Amazon DynamoDB Accelerator` Melhora os tempos de resposta do DynamoDB de um dígito de milissegundos para microssegundos.

<h2>Segurança</h2>

    Shared Responsibility model

`Cliente:`

    Sistema operacional da instância.
    Aplicações.
    Grupos de segurança.
    Segurança na nuvem.

`AWS:`

    Segurança da nuvem.
    Hardware.
    Infraestruturas de:
        Software
        Rede
        Virtualização

<h2>IAM - Identity Access Management </h2>

    Criar e gerenciar acessos aos recursos.
    Boas práticas: Não utilizar a conta Root.
    Designar uma conta IAM como admin.

`Conta Root` Pode trocar os planos de suporte.

`Políticas do IAM` Documento que concede ou nega permissões. Concede o mínimo de privilégio. Um documento JSON.

`IAM Groups` 

    grupos de usuários.
    possue política do grupo.
    lei do mínimo privilégio.
    deny sempre prevalece.

`IAM Functions`

    identidade para assumir acesso temporário a um conjunto de permissões.
    ao assumir uma nova função, perde-se os privilégios e a antiga função.

`MFA` uma camada de segurança, autenticação por multifator.

<h2>AWS Organizations</h2>

    Ajuda no gerênciamento de várias contas.
    Use as políticas de controle de serviço (SCPs) para controlar centralmente as permissões para as contas em sua organização.

                        Conta Raiz
                      /     |      \
                 Conta 1  Conta 2  Conta 3

<h2>Conformidade</h2>

`Artifact` Oferece acesso sob demanda a relatórios de segurança e conformidade e a conformidade e a contratos online selecionados.

`Complience Center` Contém recursos que ajudam a conhecer mais sobre a nuvem.

<h2>Segurança de Aplicações</h2>

`WAF (Web Application Firewall)` Ajuda a proteger suas aplicações web e APIs contra exploração de vulnerabilidades web mais comuns.

`Shield` Oferece proteção contra ataques distribuídos de negação de serviço (DDOS)

`Amazon Inspector` Avaliações de segurança automatizados em suas aplicações.

`AWS KMS (Key Managemet Service)` Executa operações criptografadas por meio do uso de chaves criptografadas.

`Amazon Guard Duty` Fornece detecções inteligentes de ameaças para serviços e produtos da AWS. Somente reporta as ameaças.

<h2>Monitoramento e análise</h2>

`CloudWatch:`

    Monitora sua infraestrutura e recursos no local e da AWS em tempo real.
    Acessa todas as suas métricas em um único local.
    Configura alertas e ações automáticas.

`Cloud Trail:`

    Monitora e rastreia atividades do usuário e solicitações de API em toda a infraestrutura da AWS.
    Filtrar logs gerados por chamadas de API.
    Oque aconteceu? Quem executou? Quando? e Como?

`Trusted Advisor:`

    Recebe orientações em tempo real para melhorar o ambiente da AWS.
    Compara sua infraestrutura com as práticas recomendadas.
    Avalia e orienta as mudanças para alinhar com as boas práticas.

<h2>Precificação e suporte</h2>

    Categoria Free Tier
        Sempre gratuito
        12 meses grátis
        Testes

`Conceitos de precificação:`
    
    Pagamento conforme o uso
    Pague menos ao fazer reserva
    Pague menos com descontos baseados em volumes

`Pricing Calculator:` Calculadora de preços, estima os custos.

`AWS Budgets:` Pode ser utilizada para definir limites para o uso e os custos do serviço da AWS.

`AWS Cost Explorer:` Ferramenta visual dos custos dos serviços, para entender e gerenciar seus custos da AWS.

<h2>Suporte</h2>

`Suporte Básico`

    Artigos técnicos, documentação e comunidade de suporte.
    AWS Personal Health Dashboard.
    Seleção limitada de verificação do Trusted Advisor.

`Plano Developer`

    Orientação sobre práticas recomendadas.
    Ferramentas de diagnóstico do cliente.
    Suporte à arquitetura básica.

`Plano Business`

    Orientação sobre casos de uso.
    Todas as verificações do AWS Trusted Advisor.
    Suporte ilimitado para software de terceiros.

`Plano Enterprise`

    Orientação sobre arquitetura de aplicações.
    Gerenciamento de aventoos de infraestrutura.
    Gerente técnico da conta (TAM).

<h2>Marketplace</h2>

    Catálogo Digital que fornece soluções de software de terceiros.

<h2>Migração</h2>

6 estratégias de migração

    Redefinir a hospedagem
    Redefinir a plataforma
    Refatorar/Rearquitetar
    Recomprar
    ---------------
    Reter
    Retirar/Aposentar

`Família Snow`

    Snow Cone:
        - caixinha
        - suporta 8TB de armazenamento
        - chega por Sedex e vai por Sedex

    Snow Ball:
        - otimizado para armazenamento
        - caixote
        - 80TB de armazenamento
        - Snow Ball Edge otimizado para computação

    Snow Mobile:
        - transfere até 100PB de dados
        - caminhão, move grandes quantidades de dados

<h2>Inovação com a AWS</h2>

Impulsionar a inovação na nuvem envolve articular claramente as seguintes condições:

    Estado atual
    Estado desejado
    Problemas que você está tentando resolver

`Caminhos de inovação`

    Aplicação Serverless
    Inteligência artificial (IA)
    Machine Learning (ML)

<h2>AWS Well-Architected Framework</h2>

Baseia-se em 6 pilares:

    Excelência Operacional
    Segurança 
    Confiabilidade
    Eficiência de performance
    Otimização de custos
    Sustentabilidade 