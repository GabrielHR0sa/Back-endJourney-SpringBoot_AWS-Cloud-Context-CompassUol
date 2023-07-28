<h1 align="center">IAM Identity Center</h1>

Com AWS IAM Identity Center (successor to AWS Single Sign-On), você pode gerenciar a segurança de login para suas identidades de força de trabalho, também conhecidas como usuários da força de trabalho. O IAM Identity Center fornece um local onde você pode criar ou conectar usuários da força de trabalho e gerenciar centralmente seu acesso em todos as suas Contas da AWS aplicativos.

<h3>Identidates da força de trabalho</h3>

Você pode criar usuários e grupos de força de trabalho no Centro de Identidade do IAM ou se conectar e sincronizar com um conjunto existente de usuários e grupos em sua própria fonte de identidade para uso em todas as suas contas da AWS e aplicações. As fontes de identidade suportadas incluem os Serviços de Domínio do Microsoft Active Directory e provedores de identidade externos, como o Okta Universal Directory ou o Microsoft Azure AD.

<h3>Atribuições de aplicativos para aplicativos SAML</h3>

Com as atribuições de aplicativos, você pode conceder aos usuários da sua força de trabalho no IAM Identity Center acesso de login único aos aplicativos SAML 2.0, como Salesforce e Microsoft 365. Seus usuários podem acessar esses aplicativos em um único lugar, sem a necessidade de você configurar uma federação separada.

<h3>Aplicativos habilitados para o Identity Center</h3>

Aplicativos e serviços, como Amazon Managed Grafana, Amazon Monitron e Amazon SageMaker Studio Notebooks, descobrem e se conectam automaticamente ao IAM Identity Center para receber serviços de login e diretório de usuários. 

Isso fornece aos usuários uma experiência consistente de login único para esses aplicativos, sem nenhuma configuração adicional dos aplicativos. Como os aplicativos compartilham uma visão comum de usuários, grupos e membros de grupos, os usuários também têm uma experiência consistente ao compartilhar recursos do aplicativo com outras pessoas.

<h3>Permissões de várias contas</h3>

Com as permissões de várias contas, você pode planejar e implementar centralmente as permissões do IAM em várias contas ao mesmo tempo, sem precisar configurar cada uma de suas contas manualmente. 

Você pode criar permissões refinadas com base em funções de trabalho comuns ou definir permissões personalizadas que atendam às suas necessidades de segurança. Em seguida, você pode atribuir essas permissões aos usuários da força de trabalho para controlar seu acesso em contas específicas.

<h3>AWS portal de acesso</h3>

O portal de acesso fornece aos usuários da sua força de trabalho acesso com um clique a todos os aplicativos atribuídos a contas da AWS e na nuvem por meio de um portal web simples.