<h1 align="center">Amazon Cognito</h1>

O Amazon Cognito Identity permite que você crie AWS credenciais temporárias com privilégios limitados para uso em aplicativos móveis e web. Ao usar o Amazon Cognito Identity, você cria grupos de identidade que criam identidades exclusivas para seus usuários e os autentica com provedores de identidade, como Login com Amazon, Facebook e Google. Você também pode usar as identidades do Amazon Cognito com suas próprias identidades autenticadas de desenvolvedor.

Para usar o Amazon Cognito Identity, você define um pool de identidades do Amazon Cognito associado a uma função do IAM. A função do IAM está associada a uma política do IAM que concede às identidades do seu grupo de identidades permissão para acessar AWS recursos como AWS serviços de chamada.

O Amazon Cognito Identity cria identidades não autenticadas e autenticadas. As identidades não autenticadas são usadas para usuários convidados em um aplicativo móvel ou web que desejam usar o aplicativo sem fazer login. Os usuários não autenticados recebem somente as permissões especificadas na política do IAM associada ao pool de identidades.

Ao usar identidades autenticadas, além da política do IAM anexada ao grupo de identidades, você deve anexar uma AWS IoT política a uma identidade do Amazon Cognito usando a AttachPolicyAPI e conceder permissões a um usuário individual do seu aplicativo. AWS IoT Você pode usar a AWS IoT política para atribuir permissões detalhadas para clientes específicos e seus dispositivos.

