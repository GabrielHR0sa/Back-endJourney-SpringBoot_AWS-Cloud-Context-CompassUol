<h1 align="center">Tracking Costs in the Cloud - Cost Allocation Tags</h1>

Uma tag é um rótulo que você ou a AWS atribui a um recurso da AWS. Cada tag consiste em uma chave e um valor.

Em todos os recursos, cada chave de etiqueta deve ser exclusiva e pode ter apenas um valor. Você pode usar tags para organizar os seus recursos e tags de alocação de custos para acompanhar os custos da AWS em um nível detalhado.

O seguinte diagrama ilustra o conceito. No exemplo, você atribuiu e ativou tags em duas instâncias do Amazon EC2: uma tag denominada Centro de custo e outra tag denominada Pilha. Cada uma das tags tem um valor associado. Você também ativou tags geradas pela AWS, `createdBy` antes de criar esses recursos. A tag `createdBy` controla quem criou um recurso. As tags definidas pelo usuário usam o prefixo `user` e a tag gerada pela AWS usa o prefixo `aws`:

                         Key        Value
               [] - aws:createdBy=Root:123456789
    i-4a1c2f5d [] - user:Cost Center = 78925
               [] - user:Stack = Test

               [] - aws:createdBy=Root:123456789
    i-1a2b3c4d [] - user:Cost Center = 78925
               [] - user:Stack = Production

Depois que você ou a AWS aplica tags aos seus recursos da AWS (como instâncias do Amazon EC2 ou buckets do Amazon S3) e você ativa as tags no console do Billing and Cost Management, a AWS gerará um relatório de alocação de custos como valores separados por vírgulas (arquivo CSV) com seu uso e custos agrupados por tags ativas. É possível aplicar tags que representem categorias de negócios (como centros de custos, nomes de aplicações ou proprietários) para organizar seus custos de vários serviços.

O relatório de alocação de custos inclui todos os seus custos da AWS para cada período de faturamento. O relatório inclui recursos com e sem tags, para que você possa organizar claramente as cobranças de cada um deles.             