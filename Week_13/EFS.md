<h1 align="center">Elastic File System (EFS)</h1>

O Amazon Elastic File System (Amazon EFS) fornece armazenamento de arquivos totalmente elástico e sem servidor para que você possa compartilhar dados de arquivos sem provisionar ou gerenciar a capacidade e o desempenho do armazenamento. O Amazon EFS foi criado para ser dimensionado sob demanda para petabytes sem interromper os aplicativos, podendo aumentar ou diminuir à medida que você adiciona e remove arquivos. Como o Amazon EFS tem uma interface simples de serviços web, você pode criar e configurar sistemas de arquivos com rapidez e facilidade. O serviço gerencia toda a infraestrutura de armazenamento de arquivos para você, para que você evite a complexidade de implantar, corrigir e manter configurações complexas de sistemas de arquivos.

O Amazon EFS suporta o protocolo Network File System versão 4 (NFSv4.1 e NFSv4.0), portanto, os aplicativos e ferramentas que você usa atualmente funcionam perfeitamente com o Amazon EFS. Várias instâncias de computação, incluindo Amazon EC2, Amazon ECS eAWS Lambda, podem acessar um sistema de arquivos do Amazon EFS ao mesmo tempo. Portanto, um sistema de arquivos do EFS podem fornecer uma fonte de dados comum para cargas de trabalho e aplicativos que estão sendo executados em mais de uma instância de computação ou servidor.

Com o Amazon EFS, você paga somente pelo armazenamento usado pelo seu sistema de arquivos e não há nenhuma taxa mínima ou custo de configuração. O Amazon EFS oferece as seguintes opções de classe de armazenamento para diferentes casos de uso:

<li>Classes de armazenamento padrão (recomendadas) — EFS Standard e EFS Standard — Acesso infrequente (Standard—IA), que oferecem resiliência Multi-AZ e os mais altos níveis de durabilidade e disponibilidade.</li><br>

<li>Classes de armazenamento One Zone — EFS One Zone e EFS One Zone—Infrequent Access (EFS One Zone—IA), que oferecem a opção de economia adicional ao optar por salvar seus dados em uma única zona de disponibilidade.</li><br><br>

O Amazon EFS fornece a taxa de transferência, IOPS e baixa latência necessárias para uma ampla variedade de cargas de trabalho.

O serviço foi projetado para ser altamente escalável, altamente disponível e altamente durável. Os sistemas de arquivos Amazon EFS que usam classes de armazenamento padrão armazenam dados e metadados em várias zonas de disponibilidade em regiões da AWS. Os sistemas de arquivos EFS podem crescer até a escala de petabytes, gerar altos níveis de produtividade e permitir o acesso massivamente parallel das instâncias de computação aos seus dados.

O Amazon EFS oferece suporte a recursos de autenticação, autorização e criptografia para ajudar você a atender aos seus requisitos de segurança e conformidade. O Amazon EFS oferece suporte a duas formas de criptografia para sistemas de arquivos: criptografia em trânsito e criptografia em repouso.

<li>Você pode ativar a criptografia em repouso ao criar um sistema de arquivos do Amazon EFS. Se fizer isso, todos os seus dados e metadados serão criptografados.</li><br>

<li>Você pode ativar a criptografia em trânsito ao montar o sistema de arquivos. O acesso do cliente NFS ao EFS é controlado por políticas AWS Identity and Access Management (IAM) e políticas de segurança de rede, como grupos de segurança.</li><br>