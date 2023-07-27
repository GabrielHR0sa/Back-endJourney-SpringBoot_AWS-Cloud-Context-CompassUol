<h1 align="center">AWS Organization</h1>

O AWS Organizations é um serviço de gerenciamento de contas que permite consolidar várias contas da Contas da AWS em uma única organização que você cria e gerencia centralmente. O AWS Organizations inclui todas as funcionalidades de gerenciamento de contas e de faturamento consolidado que permitem atender melhor às necessidades de orçamento, segurança e compatibilidade de sua empresa. Como um administrador de uma organização, você pode criar contas em sua organização e convidar contas existentes a participarem da organização.

<h2>Recursos do AWS Organizations</h2>

<h3>Gerenciamento centralizado de todas as suas Contas da AWS</h3>

Você pode combinar suas contas existentes em uma organização que permite gerenciar as contas de forma centralizada. 

Você pode criar contas que automaticamente façam parte de sua organização e convidar outras contas para ingressar nela. 

Você também pode anexar políticas que afetam algumas ou todas as suas contas.<hr>

<h3>Faturamento consolidado para todas as contas de membros</h3>

Faturamento consolidado é um recurso do AWS Organizations. Você pode usar a conta de gerenciamento de sua organização para consolidar e pagar para todas as contas-membro. 

No faturamento consolidado, as contas de gerenciamento também podem acessar as informações de faturamento, informações de conta e atividade das contas-membro de sua organização. 

Essas informações podem ser usadas em serviços, como o Cost Explorer, que podem ajudar as contas de gerenciamento a melhorar a performance em custos de sua organização.<hr>

<h3>Agrupamento hierárquico de suas contas para atender às necessidades de orçamento, segurança ou conformidade</h3>

Você pode agrupar suas contas em organizational units (UOs – unidades organizacionais) e anexar diferentes políticas de acesso para cada UO. 

Por exemplo, se você tiver contas que devam acessar apenas os serviços da AWS que atendem a certos requisitos normativos, pode colocar as contas em uma UO. 

Em seguida, pode anexar uma política para essa UO que bloqueie o acesso a serviços que não atendam a esses requisitos normativos. 

Você pode aninhar UOs com outras UOs, chegando até a cinco níveis, fornecendo flexibilidade para estruturar seus grupos de contas.<hr>

<h3>Políticas para centralizar o controle sobre os serviços da AWS e as açoes da API que cada conta pode acessar</h3>

Como administrador da conta de gerenciamento de uma organização, você pode usar políticas de controle de serviço (SCPs - service control policies) para especificar o máximo de permissões para as contas-membro da organização.

Nas SCPs, você pode restringir os serviços, recursos e ações individuais de API da AWS que os usuários e funções em cada conta-membro podem acessar. Você também pode definir condições para quando o acesso aos serviços, recursos e ações de API da AWS deve ser restringido.

Essas restrições substituem até mesmo os administradores de contas-membro da organização. Quando o AWS Organizations bloqueia o acesso a um serviço, recurso ou ação de API para uma conta-membro, um usuário ou função nessa conta não pode acessá-lo. 

Esse bloqueio permanece em vigor mesmo que um administrador de uma conta-membro conceda explicitamente essas permissões em uma política do IAM.<hr>

<h3>Políticas para padronizar tags em todos os recursos das contas da organização</h3>

Você pode usar políticas de tag para manter tags consistentes, incluindo o tratamento preferencial de maiúsculas e minúsculas de chaves e valores de tag.<hr>

<h2>Definição de preços</h2>

O AWS Organizations é um recurso da sua Conta da AWS oferecido gratuitamente. Você só é cobrado quando acessa outros serviços da AWS a partir das contas de sua organização.

Por exemplo, são cobradas as tarifas padrão para as instâncias do Amazon EC2 usadas pelos usuários ou pelas funções nas suas contas-membro.