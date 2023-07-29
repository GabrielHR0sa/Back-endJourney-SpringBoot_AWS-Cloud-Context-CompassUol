<h1 align="center">Elastic Transcoder</h1>

Amazon Elastic Transcoder: permite converter arquivos de mídia armazenados no Amazon Elastic Simple Storage Service (Amazon S3) em arquivos de mídia nos formatos usados em dispositivos de reprodução dos consumidores. 

Por exemplo, você pode converter arquivos de mídia digital grande e de alta qualidade em formatos que podem ser reproduzidos em dispositivos móveis, tablets, navegadores da web e televisões conectadas.

O Elastic Transcoder tem quatro componentes:

<li>Os trabalhos realizam a transcodificação. Cada trabalho converte um arquivo em até 30 formatos. Por exemplo, para converter um arquivo de mídia em seis formatos diferentes, é possível criar arquivos em todos os seis formatos gerando um único trabalho.

Ao criar um trabalho, você especifica o nome do arquivo que deseja transcodificar, os nomes que deseja que o Elastic Transcoder dê aos arquivos transcodificados e várias outras configurações. Para cada formato que você deseja transcodificar, também deve especificar um modelo, conhecido como uma predefinição (veja abaixo), que contém as configurações de áudio e vídeo que deseja usar para os arquivos transcodificados.</li><br>

<li>Os pipelines são filas que gerenciam seus trabalhos de transcodificação. Ao criar uma tarefa, você especifique em qual pipeline deseja que o trabalho, O Elastic Transcoder começa a processar os trabalhos em um pipeline na ordem em que você os adicionou. Se você configurar uma tarefa para transcodificar em mais de um formato, o Elastic Transcoder criará os arquivos para cada formato na ordem em que você especifica os formatos na tarefa.

Uma configuração comum é criar dois pipelines: um para trabalhos de prioridade padrão e outro para trabalhos de alta prioridade. A maioria dos trabalhos passa pelo pipeline de prioridade padrão. Use o pipeline de alta prioridade somente quando for necessário transcodificar um arquivo imediatamente.

Se um pipeline já contém trabalhos quando você cria um novo trabalho, o Elastic Transcoder enfileira o trabalho mais recente e começa a processá-lo assim que os recursos estiverem disponíveis para esse pipeline. Se o pipeline já estiver usando todos os seus recursos, o Elastic Transcoder começará a processar a próxima tarefa no pipeline ao concluir uma das tarefas que está processando atualmente.

Um pipeline pode processar mais de um trabalho simultaneamente e o tempo necessário para concluir um trabalho varia significativamente dependendo do tamanho do arquivo que está sendo convertido e das especificações do trabalho. De modo semelhante, os trabalhos não são necessariamente concluídos na ordem em que foram criados.

Você pode interromper temporariamente o processamento de trabalhos pausando o pipeline.</li><br>

<li>As predefinições são modelos que contêm a maioria das configurações para transcodificar arquivos de mídia de um formato para outro. O Elastic Transcoder inclui algumas predefinições padrão para formatos comuns, por exemplo, várias versões de iPod e iPhone. Você também pode criar suas próprias predefinições para formatos que não são incluídos nas predefinições padrão. A predefinição que você deseja usar deve ser especificada quando criar um trabalho.</li><br>

<li>As notificações permitem que você configure opcionalmente o Elastic Transcoder e o Amazon Simple Notification Service para mantê-lo informado sobre o status de um trabalho: quando o Elastic Transcoder começa a processar o trabalho, quando o Elastic Transcoder conclui o trabalho e se o Elastic Transcoder encontra condições de aviso ou erro durante o processamento. As notificações eliminam a necessidade de sondagem para determinar quando um trabalho for concluído. Você configura notificações quando cria um pipeline.</li><br>