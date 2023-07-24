<h1 align="center">Simple Storage Service</h1><hr>

O serviço S3 (Simple Storage Service) da AWS é um serviço de armazenamento de objetos altamente escalável, durável e seguro. Ele oferece uma forma simples de armazenar e recuperar qualquer quantidade de dados de forma eficiente pela Internet. O S3 é amplamente utilizado para armazenar e distribuir arquivos estáticos, backups, conteúdo de sites, dados para análise e muitos outros casos de uso.

Aqui estão algumas características-chave do serviço S3:

<ol>

<li>Armazenamento de objetos: O S3 permite armazenar objetos, que podem ser arquivos de qualquer tipo (como documentos, imagens, vídeos, etc.), em "buckets" (contêineres virtuais). Cada objeto é atribuído a um identificador exclusivo chamado de chave.</li><br>

<li>Escalabilidade e Durabilidade: O S3 foi projetado para ser altamente escalável e durável. Ele armazena automaticamente várias cópias dos objetos em diferentes servidores e instalações, garantindo durabilidade de 99,999999999% (onze noves).</li><br>

<li>Acesso via HTTP/HTTPS: Os objetos armazenados no S3 podem ser acessados via HTTP/HTTPS, permitindo que sejam baixados ou visualizados diretamente através de URLs públicas ou restritas.</li><br>

<li>Controle de Acesso: O S3 oferece recursos de controle de acesso flexíveis, permitindo definir políticas para controlar quem pode acessar os objetos e em que condições. Você pode usar políticas de acesso, permissões de bucket, autenticação com base em chaves ou integração com o AWS Identity and Access Management (IAM) para gerenciar o acesso aos seus dados.</li><br>

<li>Gerenciamento de Ciclo de Vida: O S3 permite automatizar o gerenciamento do ciclo de vida dos objetos. Você pode definir regras para transicionar objetos para classes de armazenamento com custos mais baixos à medida que envelhecem, arquivá-los para backup ou excluí-los automaticamente após um determinado período de tempo.</li><br>

<li>Integração com outros serviços: O S3 é altamente integrado com outros serviços da AWS. Por exemplo, você pode usar o S3 como origem ou destino para transferência de dados com o Amazon CloudFront (serviço de entrega de conteúdo), fazer backup de bancos de dados no Amazon RDS, armazenar dados gerados por serviços como o AWS Glue, entre outros.</li><br>

</ol>

O S3 é um serviço fundamental na arquitetura de muitas aplicações e oferece uma solução altamente escalável e confiável para armazenamento de objetos na nuvem. Ele oferece diferentes classes de armazenamento para atender a diferentes necessidades de desempenho e custo, permitindo que você escolha a melhor opção para seus dados.

<hr>

<h2>Use Cases :</h2>

    Backup and storage
    Disaster Recovery
    Archive
    Hybrid Cloud Storage
    Application hosting
    Media hosting
    Data lakes & Big data analytics
    Software delivery
    Static website

<hr>

<h2>Amazon S3 - Buckets</h2>

Amazon S3 allows people to store objects (files) in "buckets" (directories)

Buckets must have a globally unique name (across all regions all accounts)

Buckets are defined at the region level

S3 looks like a global service but buckets are created in a region

Naming convention:

    No uppercase, no underscore
    3 - 63 characters long
    Not an IP
    Must start with lowercase letter or number
    Must not start with the prefix xn--
    Must not end with the suffix -s3alias

<hr>

<h2>Amazon S3 - Objects</h2>

Objects (files) have a key

The key is the FULL path:

    s3://my-bucket/my_file.txt
    s3://my-bucket/my_folder/another_folder/my_fyle.txt

The key is composed of prefix + object name

                       prefix                 object name
    s3://my-bucket/my_folder/another_folder/  my_fyle.txt

There's no concept of "directories" within buckets (authough the UI will trick you to think otherwise)

Just keys with very long names that containt slashes ("/")

<hr>

<h2>Amazon S3 - Replication</h2>

    Cross Region Replication : CRR
    Same Region Replication : SRR

Use cases:

    CRR - Compliance, lower latency access, replication across accounts.
    SRR - Long aggregation, live replication between production and test accounts. 