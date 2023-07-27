<h1 align="center">Pricing Models AWS</h1>

A AWs possue 4 modelos de preços:

<li>Pay as you go</li><br>

Pague pelo que você usa, permaneça ágil, responsivo, conheça demandas escaláveis.

<li>Save when you reserve</li><br>

Minimize os riscos, gerencie orçamentos de forma previsível, cumpra requisitos de longo prazo

As reservas estão disponíveis para EC2 Reserved Instances, DynamoDB Reserved Capacity, ElastiCache Reserved Nodes, RDS Reserved Instance, RedShift Reserved Nodes

<li>Pay less by using more</li><br>

Discontos baseados em volume

<li>Pay less as AWS grows</li><br>

<hr>

<h2>Free services & free tier in AWS</h2>

    IAM.
    VPC.
    Consolidated Billing.
    Elastic Beanstalk  ------
    CloudFormation           |-----> Você paga pelos recursos criados
    Auto Scaling Groups -----
    Free Tier: EC2 t2.micro instance for a year.

<h2>Compute Pricing EC2</h2>

    Cobrança em cima do que foi utilizado.
    Número de instâncias.
    Configuração da instância:
        Capacidade física
        Região
        Os e software
        Tipo de instância
        Tamanho da instância
    Tempo de uso e quantidade de dados processados no ELB.
    Monitoramento detalhado.

Instâncias sob demanda:

    Mínimo de 60s.
    Pague por segundo (Linux/Windows) ou por hora (outros).

Instâncias reservadas:

    Até 75% de desconto em comparação com a taxa horária sob demanda.
    Compromisso de 1 ou 3 anos.
    Tudo adiantado, parcialmente adiantado, sem adiantamento.

Instâncias spot:

    Até 90% de desconto em comparação com a taxa horária sob demanda.
    Lances para capacidade não utilizada.

Dedicated Host

    Sob demanda.
    Compromisso de reserva para 1 ou 3 anos.

Planos de poupança como alternativa para poupar na utilização sustentada

<h2>Compute Pricing - Lambda & ECS</h2>

Lambda:

    Pague por chamadas.
    Pague por duração.

ECS:

    EC2 modelo de tipo de lançamento: sem taxas adicionais, você paga pelos recursos da AWS armazenados e criados em seu aplicativo.

Fargate:

    Fargate modelo de tipo de lançamento: pague por vCPU e por recursos alocados na memória em sua aplicação nos contâiners .

<h2>Storage Pricing - S3</h2>

    Classe Padrão: S3 Standard, S3 Infrequent Access, S3 One-Zone IA, S3 Intelligent Tiering, S3 Glacier and S3 Glacier Deep Archive.
    Número e tamanho dos objetos: o preço pode ser escalonado (com base no volume).
    Número e tipo de pedidos.
    Transferência de dados fora da região s3.
    Aceleração de transferência s3.
    Transições do ciclo de vida.
    Serviço semelhante: EFS (pagamento por uso, acesso pouco frequente e regras de ciclo de vida).

<h2>Storage Pricing - EBS</h2>

    Tipo de volume (baseado em performance).
    Volume de armazenamento em GB provisionado por mês.
    IOPS:
        SSD de uso geral: incluído.
        SSD de IOPS provisionadas: valor provisionado em IOPS.
        Magnético: número de solicitações.
    Snapshots:
        Custo de dados adicionados por GB por mês.
    Transferência de dados:
        A transferência de dados de saída é escalonada para descontos por volume.

<h2>Database Pricing - RDS</h2>

    Cobrança por hora
    Características do banco de dados:
        motor
        tamanho
        classe de memória
    Tipo de compra:
        sob demanda
        instâncias reservadas (1 ou 3 anos) com adiantamento necessário
    
    Backup Storage: Não há cobranças adicionais para armazenamento de backup acima de 100% do total de armazenamento do seu banco de dados pela região
    
    Armazenamento adicional (em GB por mês)
    Numero de solicitações de entrada e saída por mês
    
    Tipo de implantação (armazenamento e i/0 são variáveis):
        Único AZ
        Múltiplas AZs
    
    Transferência de dados:
        A transferência de dados de saída é escalonada para descontos por volume
        A entrada é gratuita

<h2>Content Delivery - Cloud Front</h2>

    Precificação diferente entre as regiões geográficas diferentes.
    Agregado para cada ponto de presença e aplicado à sua fatura.
    Transferência de dados para fora (desconto por volume).
    Número de solicitações Http/Https.

<h2>Networking Costs in AWS per GB - Simplified</h2>

    Use IP privado em vez de IP público para economizar e melhorar o desempenho da rede

    Use o mesmo AZ para economia máxima (ao custo de alta disponibilidade)