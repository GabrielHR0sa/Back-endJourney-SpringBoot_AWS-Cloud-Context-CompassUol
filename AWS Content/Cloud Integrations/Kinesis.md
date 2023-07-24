<h1 align="center">Kinesis</h1>

<h2>O que é o Amazon Kinesis Data Streams?</h2>

Você pode usar o Amazon Kinesis Data Streams para coletar e processar grandes córregos de registros de dados em tempo real. Você pode criar aplicativos de processamento de dados, conhecidos como Aplicativos Kinesis Data Streams.

Você pode enviar os registros processados para painéis, usá-los para gerar alertas, alterar dinamicamente as estratégias de definição de preços e publicidade ou enviar dados para uma variedade de outros serviços da AWS.

A seguir, alguns cenários típicos de uso do Kinesis Data Streams:

<h3>Log acelerado e consumo e processamento de dados</h3>

Você pode ter produtores que gerem dados diretamente em um stream. Por exemplo, gere logs de sistemas e aplicativos e eles estarão disponíveis para processamento em segundos. Isso evita que os dados de log sejam perdidos se o servidor de front-end ou de aplicativos falhar. O Kinesis Data Streams fornece uma entrada acelerada de dados, pois você não organiza os dados em lotes nos servidores antes de enviá-los para entrada.

<h3>Métricas e relatórios em tempo real</h3>

Você pode usar os dados coletados no Kinesis Data Streams para simples análise de dados e geração de relatórios em tempo real. Por exemplo, seu aplicativo de processamento de dados pode funcionar em métricas e geração de relatórios para logs do sistema e de aplicativos à medida que os dados passam por ele em vez de esperar receber lotes de dados.

<h3>Análise de dados em tempo real</h3>

Ela combina o poder do processamento paralelo com o valor de dados em tempo real. Por exemplo, processar clickstreams do site em tempo real e, em seguida, analisar o envolvimento da capacidade de uso do site usando vários aplicativos do Kinesis Data Streams diferentes do Kinesis Data Streams sendo executados em paralelo.

<h3>Complexo processamento de stream</h3>

Você pode criar Directed Acyclic Graphs (DAGs — Gráficos acíclicos dirigidos) de aplicativos do Kinesis Data Streams. Isso normalmente envolve colocar dados de vários aplicativos do Kinesis Data Streams em outro streaming para processamento em downstream por um aplicativo Kinesis Data Streams diferente.