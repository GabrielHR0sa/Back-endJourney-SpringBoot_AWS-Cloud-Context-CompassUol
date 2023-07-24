<h1 align="center">Relational Database Service (RDS)</h1>

RDS significa serviço de banco de dados relacional.

É um serviço para banco de dados, usa SQL como linguagem de consulta.

Permite a criação de bancos de dados na nuvem que são gerenciados pela AWS

    Postgres
    MySQL
    MariaDB
    Oracle
    Microsoft SQL Server
    Aurora (AWS Proprietary database)

<h2>Vantagens sobre o uso de RDS versus a implantação do banco de dados em EC2</h2>

RDS é um serviço gerenciado:

    Patch de sistema operacional de provisionamento automatizado.

    Backups contínuos e restauração para data e hora específica (Restauração Pontual).

    Painéis de monitoramento.

    Lê réplicas para melhorar o desempenho

    Configuração multi AZ para recuperação de desastres.

    Janelas de manuteção para atualizações.

    Capacidade de Escalabilidade (vertical e horizontal).

    Armazenamento apoiado pelo EBS (gp2 ou io I).

Mas não é possível utilizar o SSH dentro das instâncias.