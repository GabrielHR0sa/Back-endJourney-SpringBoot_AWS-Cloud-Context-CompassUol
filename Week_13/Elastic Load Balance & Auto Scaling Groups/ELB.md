<h1 align="center">ELB - Elastic Load Balance</h1><hr>

O ELB (Elastic Load Balancer) da AWS é um serviço que distribui automaticamente o tráfego de entrada para várias instâncias de aplicativos ou recursos de computação na nuvem. Ele ajuda a garantir alta disponibilidade e escalabilidade, permitindo que os aplicativos lidem com um grande volume de solicitações sem sobrecarregar nenhum recurso específico.

Além de distribuir o tráfego, o ELB oferece recursos como detecção automática de instâncias saudáveis, escalabilidade automática, monitoramento integrado e gerenciamento simplificado. Ele também pode ser integrado a outros serviços da AWS, como o Auto Scaling, para dimensionar automaticamente a capacidade com base na demanda.

Em resumo, o ELB da AWS é um serviço de balanceamento de carga que ajuda a distribuir automaticamente o tráfego de entrada entre várias instâncias ou recursos, garantindo alta disponibilidade, escalabilidade e desempenho confiável para aplicativos em execução na nuvem da AWS.

<hr>

<h1 align="center">Load Balancer</h1>

<h2>Why use load balancer?</h2>

    Spread load across multiple downstream instances.
    Expose a single point of access (DNS) to your application.
    Seamlessly handle failures of downstream instances.
    Do regular health checks to your instances.
    Provide SSL termination (HTTPS) for your websites
    High availability across zones.
    Auto scaling groups ASG.

<hr>

<h2>Scalability vs Elasticity (vs Agility)</h2>

<li> Scalability:
Ability to accomodate a larger load by making the hardware stronger (scale up) or by adding nodes (scale out).</li><br>

<li> Elasticity:
Once a system is scalable, elasticity means that there will be some "auto-scaling" so that system can scale based on the load. This is "cloud-friendly"; pay-per-use match demand, optimize costs.</li><br>

<li>Agility:
(Not related to scalability - distractor) New IT resource are only a click away, which means that you reduce the time to make those resources available to your developers from weeks to just minutes.</li><br>

    
                               ----------> EC2
    USER ------> LOAD BALANCER
                               ----------> EC2

<hr>

<h2>Application Load Balancer</h2>

    HTTP/HTTPS/gRPC protocols (layer 7)
    HTTP Routing features
    Static DNS (URL)


            Http/https/gRPC
                            ----------> EC2
    USER ------>    ALB     ----------> EC2
                            ----------> EC2

<hr>

<h2>Network Load Balancer</h2>

    TCP/UDP protocols (Layer 4)
    High Performance: millions of request per seconds
    Static IP though Elastic IP

      
                            ----------> EC2
    USER ------>    NLB     ----------> EC2
                            ----------> EC2

<hr>

<h2>Gateway Load Balancer</h2>

    GENEVE protocol on IP Packets (Layer 3)
    Route Traffic to firewalls that you manage on EC2 Instances
    Intrusion detection


                            
    USER ------>    GWLB      Application (destination)
                    
                    traffic       
                             
                    3rd Party Security
                    Virtual Applications

<hr>