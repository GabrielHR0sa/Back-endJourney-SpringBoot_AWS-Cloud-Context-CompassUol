<h1 align="center">O que são URI's em Rest?</h1>

Uma URI (Uniform Resource Identifier) em REST é uma sequência de caracteres que identifica de forma única um recurso na web. É um conceito importante na arquitetura REST para identificar e acessar os recursos por meio de uma API RESTful.

Uma URI é uma sequência de caracteres que segue um formato padrão e pode incluir informações sobre a localização do recurso, bem como os parâmetros necessários para acessá-lo. Ela geralmente é composta por vários componentes:

<ol>

<li>Esquema (Scheme): É o prefixo da URI que especifica o protocolo utilizado, como "http://" ou "https://".</li><br>

<li>Autoridade (Authority): É a parte da URI que indica a localização do recurso, geralmente incluindo o nome do servidor e, opcionalmente, a porta, separados por "@" e ":" respectivamente. Por exemplo, "www.exemplo.com" ou "www.exemplo.com:8080".</li><br>

<li>Caminho (Path): É o componente que representa o caminho para o recurso dentro do servidor. Geralmente, é uma sequência de diretórios separados por "/". Por exemplo, "/api/usuarios" ou "/produtos/123".</li><br>

<li>Consulta (Query): É uma sequência de parâmetros separados por "&" que fornecem informações adicionais para a solicitação do recurso. Geralmente, é usado para filtrar, classificar ou paginar os resultados. Por exemplo, "?pagina=2&limite=10" ou "?filtro=ativo".</li><br>

<li>Fragmento (Fragment): É um identificador adicional opcional que pode ser usado para especificar uma parte específica do recurso. Geralmente, é usado para acessar uma seção específica de um documento HTML. Por exemplo, "#secao1" ou "#referencia".</li><br>

</ol>

No contexto de uma API RESTful, a URI é usada para identificar e acessar os recursos disponíveis. Os clientes da API utilizam URIs para fazer solicitações ao servidor e manipular os recursos por meio dos métodos HTTP apropriados, como GET, POST, PUT ou DELETE.

É importante ressaltar que as URIs devem ser projetadas de forma significativa e consistente para facilitar a compreensão, a descoberta e a navegação dos recursos na API. O design adequado das URIs é uma consideração importante no desenvolvimento de uma API RESTful.<hr>