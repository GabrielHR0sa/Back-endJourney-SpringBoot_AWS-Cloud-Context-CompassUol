<h1 align="center">Subnet</h1>

Uma sub-rede (subnet) em um VPC (Virtual Private Cloud) é uma divisão lógica da rede virtual em segmentos menores, cada um contendo um intervalo específico de endereços IP. Essa divisão é útil para organizar recursos em grupos lógicos e também para aplicar diferentes configurações de rede a cada grupo, como regras de segurança e conectividade com a Internet.

Aqui estão alguns pontos importantes sobre sub-redes em um VPC:

<ol>

<li>Organização da rede: Ao criar um VPC, você pode dividir o bloco de endereços IP especificado para o VPC em sub-redes menores. Essas sub-redes são como "subdivisões" do VPC e permitem que você crie grupos lógicos de recursos. Por exemplo, você pode ter uma sub-rede para servidores web, outra para bancos de dados e outra para aplicativos de backend.</li><br>

<li>CIDR da Sub-rede: Cada sub-rede é definida por seu próprio bloco de endereços IP no formato CIDR (Classless Inter-Domain Routing). Por exemplo, uma sub-rede pode ter o intervalo "10.0.1.0/24", que inclui 256 endereços IP disponíveis para os recursos nessa sub-rede.</li><br>

<li>Conectividade: As sub-redes podem ser configuradas como públicas ou privadas. Uma sub-rede pública é aquela que tem uma rota para a Internet via um Internet Gateway (IGW), permitindo que as instâncias nessa sub-rede se comuniquem diretamente com a Internet pública e sejam acessíveis a partir dela. Já uma sub-rede privada não tem uma rota direta para a Internet, o que significa que as instâncias nessa sub-rede não podem ser acessadas diretamente pela Internet e só podem se comunicar com recursos dentro do VPC ou com a Internet através de um NAT Gateway.</li><br>

<li>Zonas de Disponibilidade: Ao criar uma sub-rede, você deve associá-la a uma ou mais zonas de disponibilidade (Availability Zones) em uma região da AWS. Cada zona de disponibilidade é um data center fisicamente separado, o que aumenta a resiliência e a disponibilidade dos recursos na sub-rede.</li><br>

<li>Grupos de Segurança: Cada sub-rede pode ser associada a um ou mais grupos de segurança. Os grupos de segurança são como firewalls virtuais que controlam o tráfego de entrada e saída dos recursos dentro da sub-rede. Eles permitem que você especifique quais portas e protocolos são permitidos ou negados para cada recurso.</li><br>

<li>Endereços IP privados: Os recursos dentro de uma sub-rede recebem automaticamente um endereço IP privado a partir do bloco de endereços reservados para o VPC. Esses endereços IP privados são usados para comunicação interna entre recursos no VPC.</li><br>

<li>Roteamento: O roteamento entre sub-redes é gerenciado pelas tabelas de roteamento do VPC. É possível configurar rotas para permitir a comunicação entre diferentes sub-redes dentro do VPC ou definir rotas específicas para acessar a Internet através do Internet Gateway ou do NAT Gateway.</li><br>

</ol>

As sub-redes são uma peça fundamental na criação de uma arquitetura de rede robusta e segura na AWS. Elas permitem que você crie uma estrutura organizada para os recursos do seu aplicativo, isolando-os logicamente e aplicando políticas de segurança específicas para cada grupo de recursos.