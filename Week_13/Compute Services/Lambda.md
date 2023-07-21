<h1 align="center">Lambda</h1>

Funções virtuais, sem servidores para gerenciar.

Limitado por tempo, execuções curtas.

Utilizado sob demanda.

<h2>Benefícios do uso da AWS Lambda</h2>

Fácil precificação:

    Pague por solicitação e tempo de uso
    Free tier - 1.000.000 solicitações e 400.000 Gbs de tempo de computação

Integrado com todos os serviços da AWS.

Suas funções são invocadas quando necessárias.

Integrada com muitas linguagens de programação.

Fácil monitoramento atravéz da CloudWatch AWS.

Fácil obtenção de recursos por funções (de 10Gb de RAM).

Aumentar a RAM também melhora a CPU e a rede.

<h2>Linguagens suportadas</h2>

    NodeJs (JavaScript)
    Python
    Java 
    C#
    Golang
    C#/ Powershell
    Ruby
    Custom RunTime API (community supported, exemple Rust)

<h2>Exemplo de precificação</h2>

Pague por requests:

    As primeiras chamadas até 1.000.000 são grátis
    $0.20 por 1 milhão de requests depois ($0.0000002 por request)

Pague por tempo de uso: (incrementado de 1 ms):

    400.000 Gb por segundo grátis por mês
    == 400.000 segundos se a função possuir 1 Gb RAM
    == 3.200.00 segundos se a função possuir 128 Mb RAM
    Depois disso a cobrança passa a ser de $1.00 a cada 600.000 Gb p/ segundo 