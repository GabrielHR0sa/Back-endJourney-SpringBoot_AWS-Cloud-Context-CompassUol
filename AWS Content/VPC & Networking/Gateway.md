<h1 align="center">Gateway</h1>

O Gateway em um VPC (Virtual Private Cloud) é um componente importante que facilita a comunicação entre a rede virtual (VPC) e a Internet pública ou outros serviços da AWS. Existem dois tipos principais de gateway em um VPC: o Internet Gateway (IGW) e o Virtual Private Gateway (VGW).

<li>Internet Gateway (IGW)

O internet Gateway é usado para permitir a comunicação bidirecional entre os recursos dentro do VPC e a Internet pública. Quando você associa um Internet Gateway ao seu VPC, as instâncias EC2 ou outros recursos que estão em sub-redes públicas têm acesso direto à internet, permitindo que sejam acessíveis a partir da web.

Principais pontos sobre o Internet Gateway:

    Permite que instâncias com endereços IP públicos sejam acessíveis da Internet.
    Possibilita que instâncias dentro do VPC iniciem conexões de saída para a Internet.
    O tráfego de entrada vindo da Internet deve ser permitido pelas regras de segurança (grupos de segurança) associadas aos recursos.

<li>Virtual Private Gateway (VGW)

O Virtual Private Gateway é usado para estabelecer uma conexão segura e criptografada entre o VPC e uma rede local, como a rede de uma empresa, escritório ou data center. Essa conexão é estabelecida usando uma conexão VPN (Virtual Private Network).

Principais pontos sobre o Virtual Private Gateway:

    Permite que você crie uma conexão VPN entre o VPC e sua rede local.
    A conexão VPN proporciona uma comunicação segura e criptografada entre a rede local e o VPC na AWS.
    Isso permite estender a infraestrutura local para a nuvem, possibilitando que as instâncias EC2 ou os outros recursos no VPC se comuniquem com recursos na rede local e vice-versa.
    Isso permite estender a infraestrutura local para a nuvem, possibilitando que as instâncias EC2 ou outros recursos no VPC se comuniquem com recursos na rede local e vice-versa.

Os gateways são componentes fundamentais para a conectividade e o acesso a recursos em um VPC. Eles permitem que você conecte sua rede virtual à internet pública e também estabeleça  conexões seguras entre a AWS e sua infraestrutura local. Vale ressaltar que o Internet Gateway é um serviço da AWS e sua infraestrutura local. Vale ressaltar que o Internet Gateway é um serviço da AWS que tem um custo associado ao uso, enquanto o Virtual Private Gateway é uma configuração para estabelecer a VPN entre o VPC e a rede local, e os custos associados dependem da escolha de configurações específicas, como o tipo de VPN e a quantidade de dados transferidos.
