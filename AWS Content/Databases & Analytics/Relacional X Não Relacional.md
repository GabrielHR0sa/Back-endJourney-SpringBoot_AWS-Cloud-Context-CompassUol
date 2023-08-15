<h1 align="center">Bancos de dados Relacionais X Não Relacionais</h1>

Os bancos de dados relacionais e não relacionais (ou NoSQL) diferem principalmente em seus modelos de dados, arquiteturas e casos de uso.

<h2>Relacionais</h2>

Os bancos de dados relacionais organizam os dados em tabelas com linhas e colunas, seguindo um esquema predefinido. As relações entre as tabelas são estabelecidas por meio de chaves primárias e estrangeiras, garantindo integridade e consistência.

Os bancos de dados relacionais são mais rígidos em relação à estrutura dos dados devido ao esquema definido. Qualquer alteração no esquema pode ser complicada e pode exigir migrações complexas.

Os bancos de dados relacionais são otimizados para consultas complexas e transações ACID (Atomicidade, Consistência, Isolamento, Durabilidade). No entanto, podem enfrentar desafios de escalabilidade horizontal com grandes volumes de dados.

Os bancos de dados relacionais geralmente priorizam a consistência e a integridade dos dados. Isso pode resultar em tempos de resposta mais longos em situações de alta carga.

Os bancos de dados relacionais são amplamente utilizados em sistemas que exigem integridade transacional, como sistemas de gerenciamento de pedidos, sistemas de CRM e aplicativos financeiros.



<h2>Não Relacionais</h2>

Os bancos de dados não relacionais (NoSQL) não seguem o modelo tabular. Eles podem ser baseados em diferentes modelos de dados, como documentos, chave-valor, coluna larga ou grafo. Isso permite uma flexibilidade maior na modelagem de dados.

Os bancos de dados NoSQL oferecem mais flexibilidade na modelagem de dados, permitindo adicionar novos campos sem a necessidade de um esquema fixo. Isso é especialmente útil quando os dados não são bem definidos ou mudam com frequência.

Os bancos de dados NoSQL são projetados para escalabilidade horizontal, tornando-os adequados para grandes volumes de dados e cargas de trabalho distribuídas. Eles podem variar em termos de suporte a consultas complexas e transações ACID, dependendo do modelo.

Os bancos de dados NoSQL muitas vezes priorizam a disponibilidade e a velocidade, o que pode levar a compromissos em termos de consistência de dados. Alguns modelos NoSQL oferecem opções para ajustar o nível de consistência.

Os bancos de dados NoSQL são adequados para casos de uso com grande volume de dados, velocidade, flexibilidade de esquema e escalabilidade, como análise de big data, gerenciamento de conteúdo, IoT e aplicativos em tempo real.

<hr>

<h2>Exemplos Relacionais</h2>

<ol>

<li>Amazon RDS (Relational Database Service): Oferece suporte a vários mecanismos de banco de dados relacionais, como MySQL, PostgreSQL, Oracle, Microsoft SQL Server e MariaDB.</li><br>

<li>Amazon Aurora: Um mecanismo de banco de dados compatível com MySQL e PostgreSQL, mas projetado para oferecer maior desempenho, escalabilidade e disponibilidade.</li><br>

<li>Amazon Redshift: Um serviço de data warehousing projetado para análises de dados em grande escala usando uma arquitetura colunar.</li><br>

<li>Amazon Neptune: Embora o nome possa sugerir o contrário, o Amazon Neptune é um banco de dados que suporta tanto o modelo de grafo quanto o modelo de documentos. Pode ser classificado como um banco de dados relacionado devido à sua compatibilidade com o modelo de grafo.</li><br>

</ol>

<h2>Exemplos Não Relacionais</h2>

<ol>

<li>Amazon DynamoDB: Um banco de dados NoSQL totalmente gerenciado, altamente escalável e de baixa latência, que suporta os modelos de documento e chave-valor.</li><br>
<li>Amazon DocumentDB: Um serviço de banco de dados de documentos compatível com MongoDB, projetado para cargas de trabalho que exigem escalabilidade e disponibilidade.</li><br>
<li>Amazon ElastiCache: Um serviço de cache gerenciado que oferece suporte aos mecanismos de cache em memória Redis e Memcached, que são categorizados como bancos de dados NoSQL em cache.</li><br>
<li>Amazon Keyspaces (para Apache Cassandra): Um serviço de banco de dados de coluna larga, compatível com Apache Cassandra, adequado para cargas de trabalho que exigem alta disponibilidade e escalabilidade.</li><br>
<li>Amazon Timestream: Um banco de dados otimizado para séries temporais, projetado para análise de dados de séries temporais em grande escala.</li><br>

</ol>