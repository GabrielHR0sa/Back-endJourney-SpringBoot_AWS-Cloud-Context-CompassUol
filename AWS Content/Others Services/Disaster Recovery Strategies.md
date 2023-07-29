<h1 align="center">Disaster Recovery Strategie</h1>

As estratégias de recuperação de desastres disponíveis para você na AWS podem ser amplamente categorizadas em quatro abordagens, variando de baixo custo e baixa complexidade de fazer backups a estratégias mais complexas usando várias regiões ativas. As estratégias ativas/passivas usam um site ativo (como uma região da AWS) para hospedar a carga de trabalho e atender ao tráfego. O site passivo (como uma região diferente da AWS) é usado para recuperação. O site passivo não atende ativamente o tráfego até que um evento de failover seja acionado.

É fundamental avaliar e testar regularmente sua estratégia de recuperação de desastres para ter confiança em invocá-la, caso seja necessário. Use o AWS Resilience Hub para validar e rastrear continuamente a resiliência de suas cargas de trabalho da AWS, incluindo se você provavelmente atingirá suas metas de RTO e RPO.

Para um evento de desastre baseado na interrupção ou perda de um datacenter físico para uma carga de trabalho bem arquitetada e altamente disponível, você pode exigir apenas uma abordagem de backup e restauração para recuperação de desastres. Se a sua definição de desastre for além da interrupção ou perda de um data center físico para uma região ou se você estiver sujeito a requisitos regulamentares que o exijam, considere Pilot Light, Warm Standby ou Multi-Site Active/ Ativo.

Ao escolher sua estratégia e os recursos da AWS para implementá-la, lembre-se de que na AWS geralmente dividimos os serviços em plano de dados e plano de controle. O plano de dados é responsável por fornecer serviço em tempo real enquanto os planos de controle são usados ​​para configurar o ambiente. Para resiliência máxima, você deve usar apenas operações de plano de dados como parte de sua operação de failover. Isso ocorre porque os planos de dados geralmente têm objetivos de design de disponibilidade mais altos do que os planos de controle.

Backup e restauração