<h1 align="center">Cross Origin Resourse Sharing</h1>

Cross-Origin Resource Sharing (CORS) é um mecanismo utilizado pelos navegadores para permitir ou restringir as solicitações de recursos (como arquivos JavaScript, imagens, fontes, etc.) feitas a partir de um domínio (origem) diferente do domínio do próprio recurso.

Normalmente, os navegadores aplicam a "Política de mesma origem" (Same-Origin Policy) para restringir solicitações entre diferentes origens, como medida de segurança. Isso significa que, por padrão, um script em um site só pode acessar recursos em seu próprio domínio.

No entanto, há casos legítimos em que um site pode precisar fazer solicitações a recursos de um domínio diferente, como quando um site utiliza APIs de terceiros ou busca recursos em um servidor externo. O CORS foi introduzido para fornecer um mecanismo de controle mais granular para permitir essas solicitações de origens cruzadas, mantendo a segurança.

O CORS funciona por meio da adição de cabeçalhos HTTP nas solicitações e nas respostas do servidor. Quando um navegador faz uma solicitação a um recurso de um domínio diferente, ele inclui um cabeçalho "Origin" na solicitação para indicar a origem da solicitação. O servidor, por sua vez, pode responder com cabeçalhos "Access-Control-Allow-Origin" para indicar quais origens são permitidas a acessar o recurso.

Existem diferentes configurações que podem ser usadas no CORS, como:

<ol>

<li>Access-Control-Allow-Origin: Indica quais origens são permitidas a acessar o recurso. Pode ser configurado para permitir uma única origem específica, várias origens ou usar o valor "*" para permitir qualquer origem.</li><br>

<li>Access-Control-Allow-Methods: Especifica os métodos HTTP permitidos para acessar o recurso (por exemplo, GET, POST, PUT, DELETE).</li><br>

<li>Access-Control-Allow-Headers: Define quais cabeçalhos adicionais além dos padrões são permitidos na solicitação.</li><br>

<li>Access-Control-Allow-Credentials: Indica se as credenciais, como cookies, são permitidas na solicitação.</li><br>

</ol>

Esses cabeçalhos e outras configurações do CORS são definidos pelo servidor que hospeda os recursos. O navegador verifica esses cabeçalhos e, com base neles, decide se permite ou bloqueia a solicitação de origem cruzada.

O CORS é uma importante medida de segurança que permite que sites interajam com recursos de domínios diferentes de forma controlada, protegendo contra ataques de origem cruzada indesejados.