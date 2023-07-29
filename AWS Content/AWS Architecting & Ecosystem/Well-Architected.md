<h1 align="center">Well - Architected Framework</h1>

O AWS Well-Architected Framework ajuda a entender os prós e os contras das decisões que você toma ao criar sistemas na AWS. 

O uso do Framework ajuda você a aprender as práticas recomendadas de arquitetura para projetar e operar workloads confiáveis, seguras, eficientes, econômicas e sustentáveis na Nuvem AWS. Ele fornece uma maneira de você avaliar consistentemente suas arquiteturas em relação às práticas recomendadas e identificar áreas de melhoria.

<h2>Pillar 1 - Operational Excellence</h2>

Inclue a capacidade de rodar e monitorar os sistemas para entregar um valor de negócios e continuar provendo melhoraras nos processos e procedimentos de suporte.

Princípios de Design:

    Execute operações como código - Infraestrutura como código

    Anotar documentação - Automatize a criação de documentação anotada após cada compilação

    Faça mudanças frequentes, pequenas e reversíveis - Para que, em caso de alguma falha, você possa revertê-la.

    Refine os procedimentos de operações com frequência - e certifique-se de que os membros da equipe estejam familiarizados com eles

    Antecipar a falha

    Aprenda com todas as falhas operacionais

<li>Prepare

    AWS CloudFormation
    AWS Config

<li>Operate

    AWS CloudFormation 
    AWS Config
    AWS CloudTrail
    Amazon CloudWatch
    AWS X-Ray

<li>Evolve

    AWS CloudFormation
    AWS CodeBuild
    AWS CodeCommit
    AWS CodeDeploy
    AWS CodePipeline

<h2>Pillar 2 - Security</h2>

Inclue a habilidade de proteger as informações, sistemas e ativos, ao mesmo tempo em que agrega valor comercial por meio de avaliações de risco e estratégias de mitigação.

Principios de Design:

    Implemente uma base de identidade forte - Centralize o gerenciamento de privilégios e reduza (ou mesmo elimine) a dependência de credenciais de longo prazo - Princípio do menor privilégio - IAM.

    Habilite a rastreabilidade - Integre logs e métricas com sistemas para responder e agir automaticamente.

    Aplique segurança em todas as camadas - como rede de borda, VPC, sub-rede, balanceador de carga, cada instância, sistema operacional e aplicativo

    Automatize as práticas recomendadas de segurança.

    Proteja os dados em trânsito e em repouso - Criptografia, tokenização e controle de acesso

    Mantenha as pessoas longe dos dados - Reduza ou elimine a necessidade de acesso direto ou processamento manual de dados

<li>Identity and Acess Management

    IAM
    AWS-STS
    MFA Token
    AWS Organizations

<li>Detective Controls

    AWS Config
    AWS CloutTrail
    Amazon CloudWatch

<li>Data Protection

    KMS
    S3
    Elastic Load Balancing (ELB)
    Amazon EBS
    Amazon RDS

<li>Incident Response

    IAM
    AWS CloudFormation
    Amazon CloudWatch Events

<h2>Pillar 3 - Reliability</h2>

Capacidade de um sistema de se recuperar de interrupções de infra-estrutura ou serviço, adquirir dinamicamente recursos de computação para atender à demanda e mitigar interrupções, como configurações incorretas ou problemas transitórios de rede

Princípios de Design:

    Procedimentos de recuperação de teste - Use a automação para simular diferentes falhas ou para recriar cenários que levaram a falhas antes

    Automaticamente para aumentar a disponibilidade agregada do sistema - Distribua solicitações em vários recursos menores para garantir que eles não compartilhem um ponto comum de falha

    Pare de adivinhar a capacidade - Mantenha o nível ideal para satisfazer a demanda sem super ou subprovisionamento - Use o Auto Scaling

    Gerenciar mudanças na automação - Use a automação para fazer mudanças na infraestrutura

<li>Foundations

    IAM
    Amazon VPC
    Service Limits
    AWS Trusted Advisor

<li>Change Management

    AWS Auto Scaling
    Amazon CloudWatch
    AWS CloudTrail
    AWS Config

<li>Failure Management

    Backups
    AWS CloudFormation
    Amazon S3
    Amazon S3 Glacier
    Amazon Route 53

<h2>Pillar 4 - Performance Efficiency</h2>

Inclui a capacidade de usar recursos de computação com eficiência para atender aos requisitos do sistema e manter essa eficiência à medida que a demanda muda e as tecnologias evoluem.

Princípios de design:

    Democratize as tecnologias avançadas - As tecnologias avançadas tornam-se serviços e, portanto, você pode se concentrar mais no desenvolvimento de produtos.

    Torne-se global em minutos - Implantação fácil em várias regiões.

    Use arquiteturas sem servidor - Evite a carga de gerenciamento de servidores

    Experimente com mais frequência - Fácil de realizar testes comparativos

    Simpatia mecânica - Esteja ciente de todos os serviços da AWS

<li>Selection

    AWS Auto Scaling
    AWS  Lambda
    Amazon Elastic Block Store (EBS)
    Amazon Simple Storage Service (S3)
    Amazon RDS

<li>Review

    AWS CloudFormation

<li>Monitoring

    Amazon CloudWatch
    AWS Lambda

<li>Tradeoffs

    Amazon RDS
    Amazon ElastiCache
    AWS Snowball
    Amazon CloudFront

<h2>Pillar 5 - Cost Optimization</h2>

Inclui a capacidade de executar sistemas para agregar valor comercial ao menor preço

Princípios de design:

    Adote um modo de consumo - Pague apenas pelo que usar

    Meça a eficiência geral - Use o CloudWatch

    Pare de gastar dinheiro com operações de data center - a AWS faz a parte de infraestrutura e permite que o cliente se concentre nos projetos da organização

    Analise e atribua gastos - Identificação precisa do uso e dos custos do sistema, ajuda a medir o retorno sobre o investimento (ROI) - Certifique-se de usar tags

    Use serviços gerenciados e de nível de aplicativo para reduzir o custo de propriedade - Como os serviços gerenciados operam em escala de nuvem, eles podem oferecer um custo menor por transação ou serviço.

<li>Expenditure Awareness

    AWS Budgets
    AWS Cost and Usage Report
    AWS Cost Explorer
    Reserved Instance Reporting

<li>Cost-Effective Resources

    Spot Instance
    Reserved Instance
    Amazon S3 Glacier

<li>Matching supply and demand

    AWS Auto Scaling
    AWS Lambda

<li>Optimizing Over Time

    AWS Trusted Advisor
    AWS Cost and Usage Report

<h2>Pillar 6 - Sustainability</h2>

O pilar de sustentabilidade se concentra em minimizar os impactos ambientais da execução de cargas de trabalho na nuvem.

Princípios de design:

    Entenda seu impacto - estabeleça indicadores de desempenho, avalie melhorias.

    Estabeleça metas de sustentabilidade - Defina metas de longo prazo para cada carga de trabalho, modele o retorno sobre o investimento (ROI)

    Maximize a utilização - Dimensione corretamente cada carga de trabalho para maximizar a eficiência energética do hardware subjacente e minimizar os recursos ociosos.

    Antecipe e adote novas ofertas de hardware e software mais eficientes - e projete para ter flexibilidade para adotar novas tecnologias ao longo do tempo.

    Use serviços gerenciados - Serviços compartilhados reduzem a quantidade de infraestrutura; Os serviços gerenciados ajudam a automatizar as práticas recomendadas de sustentabilidade, como mover dados acessados ​​com pouca frequência para armazenamento frio e ajustar a capacidade de computação.

    Reduza o impacto downstream de suas cargas de trabalho na nuvem - Reduza a quantidade de energia ou recursos necessários para usar seus serviços e reduza a necessidade de seus clientes atualizarem seus dispositivos.

<li>EC2 Auto Scaling, Serverless Offering (Lamda, Fargate)


<li>Cost Explorer, AWS Graviton 2, EC2 T instances, @Spot Instances



<li>EFS-IA, Amazon S3 Glacier, EBS Cold HDD volumes



<li>S3 Lifecycle Configurations, S3 Intelligent Tiering



<li> Amazon Data Lifecycle Manager



<li>Read local, Write Global: RDS Replicas, Aurora Global DB ,DynamoDB Global Table, CloudFront