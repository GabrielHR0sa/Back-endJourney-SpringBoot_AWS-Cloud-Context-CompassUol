<h1 align="center">Encoding, Encryption and Hashing</h1>

Encoding, encryption e hashing são termos relacionados à segurança e manipulação de dados, mas têm propósitos distintos:

<ol>

<li>Encoding (Codificação):
Encoding é o processo de transformar dados em uma forma legível e compatível com um determinado sistema. Geralmente, é utilizado para converter caracteres especiais, símbolos ou outros formatos de dados em uma representação que possa ser facilmente transmitida ou armazenada. Exemplos comuns de codificação são o ASCII, Unicode e base64. A codificação não fornece segurança, apenas altera a forma de representação dos dados.</li><br>

<li>Encryption (Criptografia):
Encryption, ou criptografia, é o processo de codificar dados de forma que só possam ser lidos por pessoas autorizadas. O objetivo é proteger a confidencialidade dos dados. A criptografia envolve o uso de algoritmos e chaves criptográficas para transformar os dados originais em uma forma ilegível, conhecida como texto cifrado. Somente quem possui a chave correta pode decifrar o texto cifrado e obter os dados originais. A criptografia é amplamente usada para proteger informações confidenciais, como senhas, informações bancárias e dados pessoais.</li><br>

<li>Hashing (Hash):
Hashing é uma técnica utilizada para mapear dados de entrada (geralmente de tamanho variável) em um valor fixo de tamanho fixo, chamado de hash. O objetivo principal do hashing é garantir a integridade dos dados, ou seja, verificar se os dados não foram modificados ou corrompidos. Os algoritmos de hashing são unidirecionais, o que significa que é muito difícil, ou quase impossível, reverter o processo e obter os dados originais a partir do hash. Além disso, uma pequena alteração nos dados de entrada resultará em um hash completamente diferente. Os hashes são amplamente utilizados para armazenar senhas de forma segura, verificar a integridade de arquivos e garantir a autenticidade dos dados.</li><br>

</ol>

Em resumo, encoding é a transformação de dados para uma representação legível e compatível, enquanto encryption é a codificação de dados para proteger sua confidencialidade e hashing é a geração de um valor fixo (hash) para verificar a integridade dos dados.