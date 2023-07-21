<h1 align="center"> Security Group</h1>

Um grupo de segurança atua como um firewall que controla o tráfego permitido para e a partir dos recursos de sua nuvem privada virtual (VPC). É possivel escolher as portas e os protocolos para permitir tráfego tanto de entrada quanto de saída.

Para cada grupo de segurança, é possível incluir conjuntos separados para o tráfego de saída.

<h2>Noções básicas do grupo de segurança</h2>

<h3>Características dos grupos de segurança</h3>

<li>Ao criar um grupo de segurança, você deve fornecer um nome e uma descrição. As seguintes regras se aplicam:

O nome do grupo de segurança deve ser exclusivo dentro da VPC.

Os nomes e as descrições podem ter até 255 caracteres de comprimento.
    
Os nomes e as descrições são limitados aos seguintes caracteres: a-z; A-Z; 0-9; espaços e ._-:/(),@[]+=&;{}!$*.

Quando o nome termina com espaços, cortamos os espaços existentes no final do nome. Por exemplo, se você inserir "Testar grupo de segurança" para o nome, nós o armazenaremos como "Testar grupo de segurança" para o nome, nós o armazenaremos como "Testar grupo de segurança".

Um nome de grupo de segurança não pode começar com sg-.</li><br><hr>

<li>Os grupos de segurança são com estado. Por exemplo, se você enviar uma soliciação de uma instância, o tráfego de resposta dessa solicitação terá permissão para alcançar a instância, independente das regras do grupo de segurança de entrada. As respostas ao tráfego de entrada permitido têm permissão para deixar a instância, idependentemente das regras de saída.</li><br><hr>

<li>Os grupos de segurança não filtram tráfego de entrada ou de saída de:

Serviços de nomes de domínio (DNS) da Amazon

Dynamic Host Configuration Protocol (DHCP - Protocol de configuração de host dinâmico) da Amazon

Metadados da instância do Amazon EC2

Endpoints de metadados de tarefas do Amazon ECS

Ativação de licença para instâncias do Windows

Amazon Time Sync Service

Endereços IP reservados usados pelo roteador padrão da VPC</li><br><hr>

<li>Existem cotas no número de grupos de segurança que podem ser criados por VPC, o número de regras que podem ser adicionadas a cada grupo de segurança e o número de grupos de segurança que podem ser associados a uma interface de rede. Para obter mais informações, consulte Cotas da Amazon VPC.</li><br><hr>

<h2>Práticas Recomendadas</h2>

<li>Autorize somente entidades principais específicaas do IAM para criar e modificar grupos de segurança.</li><br><hr>

<li>Crie o número mínimo de grupos de segurança necessários para diminuir o risco de erro. Use cada grupo de segurança para gerenciar o acesso a recursos que tenham funções e requisitos de segurança semelhantes.</li><br><hr>

<li>Quando você adicionar regras de entrada para as portas 22 (SSH) ou 3389 (RPD) para poder acessar as instâncias do EC2, autorize somente intervalos específicos de endereços IP. Se você especificar 0.0.0.0/0 (IPV4) ::/ (IPV6), qualquer pessoa poderá acessar suas instâncias de qualquer endereço IP usando o protocolo especificado.</li><br><hr>

<li>Não abra grandes intervalos de portas. Certifique-se de que o acesso por meio de cada porta seja restrito às fontes ou destinos que o exigem.</li><br><hr>

<li>Você pode configurar ACLs da rede com regras semelhantes às dos grupos de segurança para adicionar uma camada de segurança à sua VPC.</li><br><hr>