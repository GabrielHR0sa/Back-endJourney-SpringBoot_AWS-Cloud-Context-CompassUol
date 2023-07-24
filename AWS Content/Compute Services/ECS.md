<h1 align="center">Elastic Container Service</h1>

<h2>O que é o Amazon Elastic Container Service?</h2>

O Amazon Elastic Container Service (Amazon ECS) é um serviço totalmente gerenciado de orquestração de contêineres ajuda a implantar, gerenciar e dimensionar facilmente aplicações conteinerizadas. Como um serviço totalmente gerenciado, o Amazon ECS vem com práticas recomendadas operacionais e de configuração da AWS incorporadas. Ele é integrado à AWS e a ferramentas de terceiros, como o Amazon Elastic Container Registry e o Docker. Essa integração torna mais fácil para as equipes se concentrarem na criação das aplicações, não no ambiente. Você pode executar e dimensionar suas workloads de contêiner Regiões da AWS em na nuvem e on-premises, sem a complexidade de gerenciar um ambiente de gerenciamento.

Há 3 camadas no Amazon ECS:

<li>Capacidade - A infraestrutura em que seus contêineres funcionam</li><br>
<li>Controlador - Implante e gerencie seus aplicativos que são executados nos contêineres</li><br>
<li>Provisionamento - As ferramentas que você pode usar para interagir com o agendador para implantar e gerenciar seus aplicativos e contêineres</li><br>

<h2>Capacidade do Amazon ECS</h2>

A capacidade do Amazon ECS é a infraestrutura em que seus contêineres são executados. Veja abaixo uma visão geral das opções de capacidade:

<li>Instâncias do Amazon EC2 na nuvem AWS

Você escolhe o tipo de instância, o número de instâncias e gerencia a capacidade.</li><br>
<li>Sem servidor (AWS Fargate (Fargate)) na nuvem AWS

O Fargate é um mecanismo de computação sem servidor. pay-as-you-go Com o Fargate, você não precisa gerenciar servidores, lidar com o planejamento de capacidade ou isolar workloads de contêiner para segurança.</li><br>
<li>Máquinas virtuais (VM) ou servidores locais

O Amazon ECS Anywhere fornece suporte para registrar uma Instância externa, como um servidor on-premises ou uma máquina virtual (VM), no cluster do Amazon ECS.</li><br>


A capacidade pode estar localizada em qualquer um dos seguintes recursos AWS:

    Uma VPC com zonas de disponibilidade e uma zona Wavelength
    Local Zones
    Zonas de Wavelength
    Regiões da AWS
    AWS Outposts