<h1 align="center">Cross Site Request Forgery</h1>

CSRF (Cross-Site Request Forgery), também conhecido como ataque de falsificação de solicitação entre sites, é um tipo de vulnerabilidade de segurança que explora a confiança do navegador em um usuário autenticado. Nesse tipo de ataque, um invasor engana um usuário legítimo para que execute ações indesejadas em um site no qual o usuário está autenticado.

A exploração do CSRF ocorre quando um invasor cria uma solicitação HTTP falsificada, que geralmente é um link ou um formulário, e faz com que o usuário legítimo clique nele ou o envie sem o seu conhecimento. Essa solicitação falsificada contém instruções para executar uma ação específica no site, como fazer uma transferência de fundos, alterar uma senha ou excluir dados.

Para que o ataque CSRF seja bem-sucedido, algumas condições devem ser atendidas:

<ol>

<li>O usuário legítimo deve estar autenticado no site alvo.</li><br>

<li>O invasor deve ser capaz de enganar o usuário para que ele acesse o link ou envie o formulário com a solicitação falsificada.</li><br>

<li>O site alvo deve aceitar solicitações sem mecanismos adequados de proteção contra CSRF.</li><br>

</ol>

Para prevenir ataques CSRF, é comum usar tokens de proteção, conhecidos como tokens anti-CSRF ou tokens de sincronização de formulário (CSRF tokens). Esses tokens são incluídos em formulários ou solicitações e são verificados pelo servidor para garantir que a solicitação seja legítima e provenha de uma fonte confiável.

É importante que os desenvolvedores de aplicativos e os proprietários de sites estejam cientes da ameaça CSRF e implementem medidas de segurança adequadas, como o uso de tokens anti-CSRF, para mitigar essa vulnerabilidade. Os navegadores também implementam medidas de segurança para ajudar a prevenir ataques CSRF, como a política de mesmo site (Same-Site), que restringe o envio de cookies em solicitações entre sites diferentes.