<h1 align="center">IAM - Identity and Acess Management</h1><hr>


O serviço IAM (Identity and Access Management) da AWS é um serviço de gerenciamento de identidade e acesso que permite controlar de forma granular o acesso aos recursos da AWS. Ele ajuda a proteger os dados e os sistemas da AWS, permitindo que você gerencie usuários, grupos, permissões e políticas.

Com o IAM, você pode criar e gerenciar identidades para usuários, grupos e funções da AWS. Além disso, você pode definir permissões para cada identidade, especificando quais ações ela pode realizar nos serviços da AWS e quais recursos pode acessar. Isso ajuda a garantir que apenas usuários autorizados possam acessar e interagir com os recursos e dados da AWS.

Aqui estão alguns conceitos-chave relacionados ao IAM:

<ol>

<li>Usuários: Representam pessoas ou aplicativos que precisam interagir com a AWS. Cada usuário possui credenciais de acesso exclusivas, como nome de usuário e senha, ou chaves de acesso para uso com APIs.</li><br>

<li>Grupos: Permitem agrupar usuários com permissões semelhantes. As políticas de acesso são associadas aos grupos, facilitando a atribuição de permissões a vários usuários simultaneamente.</li><br>

<li>Funções: São usadas para conceder permissões temporárias a entidades externas, como serviços da AWS ou aplicativos em execução em servidores EC2. As funções não estão vinculadas a usuários específicos e podem ser assumidas por entidades que precisam acessar recursos da AWS.</li><br>

<li>Políticas: São documentos em formato JSON que definem as permissões. Você pode criar políticas personalizadas ou usar políticas pré-definidas pela AWS. As políticas são anexadas aos usuários, grupos ou funções para especificar quais ações são permitidas ou negadas.</li><br>

<li>Permissões: Determinam quais ações os usuários, grupos ou funções podem realizar em serviços e recursos específicos. As permissões são concedidas por meio da associação de políticas.</li><br>

</ol>

O IAM permite que você aplique o princípio do menor privilégio, concedendo apenas as permissões necessárias para que os usuários realizem suas tarefas, reduzindo assim o risco de acesso não autorizado ou uso indevido dos recursos da AWS.

Em resumo, o serviço IAM da AWS oferece recursos poderosos de gerenciamento de identidade e acesso, permitindo que você controle com precisão quem pode acessar seus recursos e o que eles podem fazer com eles na plataforma da AWS.