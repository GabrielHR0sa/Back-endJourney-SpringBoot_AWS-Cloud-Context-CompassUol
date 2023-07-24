<h1 align="center">Global Accelerator</h1>

<h2>O que é o AWS Global Accelerator?</h2>

O AWS Global Accelerator é um serviço no qual você cria aceleradoras para melhorar o desempenho dos seus aplicativos para usuários locais e globais. Dependendo do tipo de acelerador que você escolher, você pode obter benefícios adicionais.

<li>Ao usar um acelerador padrão, você pode melhorar a disponibilidade de seus aplicativos da Internet que são usados por um público global. Com um acelerador padrão, o Global Accelerator direciona o tráfego pela rede global da AWS para endpoints na região mais próxima do cliente.</li><br>
<li>Usando um acelerador de roteamento personalizado, você pode mapear um ou mais usuários para um destino específico entre muitos destinos.</li><br>
<hr>

<h2>Acelerador Global</h2>

O Global Accelerator é um serviço global que oferece suporte a endpoints em várias regiões da AWS, listadas na Tabela de região da AWS.

Por padrão, o Global Accelerator fornece dois endereços IP estáticos que você associa ao acelerador. 

Com um acelerador padrão, em vez de usar os endereços IP fornecidos pelo Global Accelerator, você pode configurar esses pontos de entrada para endereços IPv4 de seus próprios intervalos de endereços IP que você traz para o Global Accelerator. Os endereços IP estáticos são anycast da rede de borda da AWS.

<h2>! IMPORTANTE</h2>

Os endereços IP estáticos permanecem atribuídos ao acelerador enquanto ele existir, mesmo se você desativar o acelerador e ele não aceitar ou rotear o tráfego. No entanto, quando você deleta um acelerador, você perde os endereços IP estáticos atribuídos a ele, portanto, você não pode mais rotear o tráfego usando eles.

Você pode usar políticas do IAM como permissões baseadas em tags com o Global Accelerator para limitar os usuários que têm permissões para excluir um acelerador.
<hr>

<h2>Acelerador Padrão</h2>

Para aceleradores padrão, o Global Accelerator usa a rede global da AWS para rotear o tráfego para o endpoint regional ideal com base na integridade, na localização do cliente e nas políticas que você configura, o que aumenta a disponibilidade de seus aplicativos. 

Os endpoints para aceleradores padrão podem ser Network Load Balancers, Application Load Balancers, instâncias do Amazon EC2 ou endereços Elastic IP localizados em uma região da AWS ou em várias regiões.

O serviço reage instantaneamente às mudanças na integridade ou na configuração para garantir que o tráfego da Internet dos clientes seja sempre direcionado para endpoints saudáveis.
<hr>

<h2>Acelerador de roteamento personalizado</h2>

Os aceleradores de roteamento personalizados oferecem suporte apenas aos tipos de endpoint de sub-rede da nuvem privada virtual (VPC) e roteiam o tráfego de endereços IP privados nessa sub-rede

