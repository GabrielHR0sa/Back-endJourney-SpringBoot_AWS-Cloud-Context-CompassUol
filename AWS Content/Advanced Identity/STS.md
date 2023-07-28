<h1 align="center">Security Token Service (STS)</h1>

É possível usar o AWS Security Token Service (AWS STS) para criar e fornecer aos usuários confiáveis credenciais de segurança temporárias que podem controlar o acesso aos seus recursos da AWS. As credenciais de segurança temporárias funcionam quase de forma idêntica às credenciais de chave de acesso de longo prazo, com as seguintes diferenças:

<li>As credenciais de segurança temporárias são de curto prazo, como o nome indica. Elas podem ser configuradas para durar de alguns minutos a várias horas. Depois que as credenciais expiram, a AWS não as reconhece mais ou permite qualquer tipo de acesso de solicitações de API feitas com elas.</li><br>

<li>As credenciais de segurança temporárias não são armazenadas com o usuário, mas são geradas dinamicamente e fornecidas ao usuário quando solicitadas. Quando (ou até mesmo antes) as credenciais de segurança temporárias expiram, o usuário pode solicitar novas credenciais, desde que o usuário solicitante ainda tenha permissões para fazê-lo.</li><br>

Como resultado, as credenciais temporárias apresentam as seguintes vantagens em relação às credenciais de longo prazo:

<li>Você não tem que distribuir ou incorporar credenciais de segurança da AWS de longo prazo com um aplicativo.</li><br>

<li>Você pode fornecer acesso aos seus recursos da AWS para os usuários sem a necessidade de definir uma identidade da AWS para eles. As credenciais temporárias são a base para funções e federação de identidades.</li><br>

<li>As credenciais de segurança temporárias têm uma vida limitada, portanto não é necessário mudá-las ou explicitamente revogá-las quando elas não forem mais necessárias. Quando as credenciais de segurança temporárias expiram, elas não podem ser reutilizadas. Você pode especificar por quanto tempo as credenciais são válidas, até um limite máximo.</li><br>

<h2>Regiões</h2>

Credenciais de segurança temporárias são geradas pelo AWS STS. Por padrão, o AWS STS é um serviço global com um único endpoint em https://sts.amazonaws.com. 

No entanto, você também pode optar por fazer chamadas de API do AWS STS para endpoints em qualquer outra região com suporte. 

Isso pode reduzir a latência (atraso do servidor), enviando as solicitações para servidores em uma região que está geograficamente mais perto de você. 

Não importa de qual região suas credenciais são, elas funcionam globalmente.