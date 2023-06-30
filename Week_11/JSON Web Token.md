<h1 align="center">JWT - JSON Web Token</h1>

JWT (JSON Web Token) é um padrão aberto (RFC 7519) para token de acesso que permite a troca segura de informações entre partes por meio de objetos JSON compactos e autenticados. Ele é amplamente utilizado como um mecanismo de autenticação e autorização em aplicações web e APIs RESTful.

O JWT é composto por três partes: o cabeçalho (header), o payload (dados) e a assinatura (signature). Cada parte é codificada em Base64 e separada por um ponto (.). A estrutura geral de um JWT é a seguinte:

    <header>.<payload>.<signature>


<li>Cabeçalho (Header): O cabeçalho contém informações sobre o tipo de token e o algoritmo de assinatura utilizado. Ele é representado como um objeto JSON com duas propriedades principais: "typ" (tipo de token) e "alg" (algoritmo de assinatura). Exemplo: {"typ": "JWT", "alg": "HS256"}.</li><br>

<li>Payload (Dados): O payload contém os dados adicionais do token, como informações do usuário ou quaisquer outros dados relevantes. Ele também é representado como um objeto JSON. Existem três tipos de claims (reivindicações) padrão definidos pelo JWT: claims registradas, claims públicas e claims privadas. Além disso, você pode adicionar claims personalizadas conforme necessário.</li><br>

<li>Assinatura (Signature): A assinatura é usada para verificar a integridade do token e garantir que ele não tenha sido modificado. É gerada usando a combinação do cabeçalho codificado em Base64, o payload codificado em Base64, uma chave secreta (ou chave pública/privada, dependendo do algoritmo usado) e o algoritmo de assinatura especificado no cabeçalho. A assinatura é representada como uma sequência de caracteres.</li><br>

Quando um cliente faz uma solicitação para um servidor e precisa provar sua identidade, ele inclui o JWT em uma solicitação HTTP, geralmente como um cabeçalho de autorização (por exemplo, "Bearer token"). O servidor pode então validar e decodificar o JWT para verificar se é válido, autenticar o usuário e conceder acesso aos recursos protegidos.

As vantagens do uso de JWTs incluem a capacidade de serem autossuficientes (contendo todas as informações necessárias), não exigir estado no servidor (pois todas as informações necessárias estão no próprio token) e serem amplamente suportados por várias linguagens de programação e frameworks.

No entanto, é importante tomar precauções ao usar JWTs, como garantir a segurança da chave de assinatura, definir corretamente as expirações dos tokens e evitar a inclusão de informações sensíveis no payload, pois os JWTs podem ser decodificados e lidos por qualquer pessoa.

Em resumo, o JWT é um padrão para token de acesso que permite a autenticação e autorização em aplicações web e APIs RESTful. Ele fornece uma forma segura e eficiente de transmitir informações entre partes confiáveis.<hr>