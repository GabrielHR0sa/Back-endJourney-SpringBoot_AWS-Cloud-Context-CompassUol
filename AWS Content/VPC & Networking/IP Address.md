<h1 align="center">IP Address</h1>


Os endereços IP (Internet Protocol) em um VPC (Virtual Private Cloud) são os identificadores únicos atribuídos a cada recurso dentro da rede virtual. Esses endereços permitem que os recursos se comuniquem entre si e com a Internet. Quando você cria um VPC na AWS, precisa definir um intervalo de endereços IP que será usado para os recursos dentro dessa rede.

Aqui estão alguns pontos importantes sobre os endereços IP em um VPC da AWS:

<ol>

<li>Intervalo de IP do VPC: Ao criar um VPC, você precisa especificar um bloco de endereços IP no formato CIDR (Classless Inter-Domain Routing). Por exemplo, um intervalo de IP válido pode ser algo como "10.0.0.0/16" ou "192.168.0.0/20". Esse bloco de IP determinará a quantidade total de endereços disponíveis em seu VPC.</li><br>

<li>Sub-redes: Depois de criar o VPC, você pode dividir o intervalo de IP em sub-redes menores. Cada sub-rede terá seu próprio bloco de IP, que deve estar dentro do bloco de IP do VPC. Essas sub-redes podem ser públicas ou privadas, dependendo se elas estão associadas a uma tabela de roteamento que permite o acesso direto à Internet (sub-rede pública) ou não (sub-rede privada).</li><br>

<li>Endereço IP privado: Um endereço IP privado é aquele que não é roteado através da Internet pública. São endereços reservados e utilizados internamente em redes privadas, como o VPC. A faixa de IP privado mais comum é a "10.0.0.0/8", que inclui todos os endereços IP de "10.0.0.0" a "10.255.255.255".</li><br>

<li>Endereço IP público: Um endereço IP público é aquele que é roteado através da Internet pública e é acessível a partir da Internet. Se uma instância EC2 ou outro recurso tiver um IP público associado, ele poderá ser acessado da Internet, desde que suas regras de segurança permitam.</li><br>

<li>Endereços IP elásticos: Um endereço IP elástico é um endereço IP público estático que você pode reservar e associar a recursos dentro do seu VPC, como instâncias EC2. Ele permite que o recurso mantenha o mesmo endereço IP mesmo após a reinicialização.</li><br>

<li>NAT Gateway: O NAT Gateway é um serviço que permite que instâncias em uma sub-rede privada acessem a Internet para atualizações de software, downloads etc. O NAT Gateway tem um endereço IP público associado a ele que é usado para traduzir o tráfego de saída das instâncias com endereços IP privados para a Internet.</li><br>

<li>DNS e resolução de nomes: Por padrão, os recursos em um VPC têm acesso a serviços de DNS da AWS para resolução de nomes. Isso permite que você use nomes de domínio, como "amazon.com", em vez de endereços IP brutos para acessar serviços externos.</li><br>

</ol>