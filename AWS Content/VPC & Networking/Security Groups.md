<h1 align="center">Security Groups</h1>

Os Security Groups (Grupos de Segurança) são recursos importantes em uma Virtual Private Cloud (VPC) de provedores de nuvem, como a Amazon Web Services (AWS), Microsoft Azure ou Google Cloud Platform (GCP). Eles são usados para controlar o tráfego de entrada e saída de instâncias (ou outros recursos) em uma VPC, atuando como um firewall virtual.

Aqui estão os principais pontos sobre os Security Groups:

<ol>

<li>Firewall Virtual: Os Security Groups funcionam como um firewall virtual a nível de instância. Eles permitem que você defina regras que controlam o tráfego de entrada e saída com base em protocolos, portas e endereços IP.</li><br>

<li>Regras de Permissão: Cada Security Group possui regras de permissão que determinam quais tipos de tráfego são permitidos para as instâncias associadas a ele. As regras são definidas para tráfego de entrada e tráfego de saída separadamente.</li><br>

<li>Estadoful: Os Security Groups são considerados "stateful", o que significa que, quando você permite o tráfego de entrada de uma determinada origem para uma instância, o tráfego de retorno da instância para a origem é automaticamente permitido. Não é necessário criar regras separadas para o tráfego de retorno, pois esse comportamento é tratado automaticamente pelo Security Group.</li><br>

<li>Referência a Instâncias: Os Security Groups são associados a instâncias (ou outros recursos) dentro da VPC. Você pode associar um ou mais Security Groups a uma instância, permitindo que ela esteja sujeita às regras de cada grupo.</li><br>

<li>Princípio do "deny-all": Por padrão, um Security Group nega todo o tráfego de entrada e permite todo o tráfego de saída. Isso significa que, a menos que você crie explicitamente regras para permitir tráfego de entrada, nenhuma conexão externa será possível para as instâncias associadas a esse grupo.</li><br>

<li>Prioridade das Regras: As regras dentro de um Security Group são avaliadas em ordem sequencial, e a primeira regra correspondente é aplicada. Portanto, é importante definir as regras na ordem correta, caso existam conflitos entre elas.</li><br>

<li>Alterações Dinâmicas: Você pode fazer alterações nas regras de um Security Group a qualquer momento. As mudanças são aplicadas imediatamente e não exigem a reinicialização da instância.</li><br>

</ol>

Os Security Groups fornecem uma camada de segurança essencial para suas instâncias e recursos na VPC. Ao criar regras de permissão específicas, você pode controlar quais serviços e portas estão acessíveis a partir da internet ou de outras redes, restringindo o tráfego indesejado e protegendo seus recursos contra ameaças de segurança. É recomendável que você configure as regras dos Security Groups com cuidado, garantindo que apenas o tráfego necessário seja permitido para suas instâncias.