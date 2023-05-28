<h1 align="center" >SPRING FRAMEWORK ANNOTATIONS</h1>


<h2 align="center" >CORE SPRING FRAMEWORK ANNOTATIONS</h2>


<h2>@Required</h2>
Esta anotação é aplicada em métodos setter de bean. Considere um cenário em que você precisa aplicar uma propriedade necessária. A anotação @Required indica que o bean afetado deve ser preenchido no momento da configuração com a propriedade exigida. Caso contrário, uma exceção do tipo BeanInitializationException é lançada.

-------------------------------------------------------------------------

<h2>@Autowired</h2>
Essa anotação é aplicada em campos, métodos setter e construtores. A anotação @Autowired injeta dependência de objeto implicitamente.

Quando você usa @Autowired em campos e passa os valores para os campos usando o nome da propriedade, o Spring atribui automaticamente os campos com os valores passados.

Você pode até usar @Autowired em propriedades privadas, conforme mostrado abaixo. (Esta é uma prática muito ruim!)

        public class Customer {
            @Autowired                               
            private Person person;                   
            private int type;
        }
    
Quando você usa @Autowired em métodos setter, o Spring tenta executar o by Type autowiring no método. Você está instruindo o Spring que ele deve iniciar esta propriedade usando o método setter onde você pode adicionar seu código personalizado, como inicializar qualquer outra propriedade com esta propriedade.

        public class Customer {                                                                
            private Person person;
            @Autowired                                                                                                      
            public void setPerson (Person person) {
            this.person=person;
            }
        }

Considere um cenário em que você precisa da instância da classe A, mas não armazena A no campo da classe. Você apenas usa A para obter a instância de B e está armazenando B neste campo. Neste caso, a fiação automática do método setter será mais adequada para você. Você não terá campos não utilizados em nível de classe.

Quando você usa @Autowired em um construtor, a injeção do construtor ocorre no momento da criação do objeto. Ele indica o construtor para autowire quando usado como um bean. Uma coisa a observar aqui é que apenas um construtor de qualquer classe de bean pode carregar a anotação @Autowired.

        @Component
        public class Customer {
            private Person person;
            @Autowired
            public Customer (Person person) {          
            this.person=person;
        }
}

-------------------------------------------------------------------------

<h2>@Qualifier</h2>
Essa anotação é usada junto com a anotação @Autowired. Quando você precisa de mais controle do processo de injeção de dependência, @Qualifier pode ser usado. @Qualifier pode ser especificado em argumentos de construtor ou parâmetros de método individuais. Esta anotação é usada para evitar confusão que ocorre quando você cria mais de um bean do mesmo tipo e deseja conectar apenas um deles com uma propriedade.

Considere um exemplo onde uma interface BeanInterface é implementada por dois beans BeanB1 e BeanB2.

        @Component
        public class BeanB1 implements BeanInterface {
            //
        }
        @Component
        public class BeanB2 implements BeanInterface {
            //
        }

Agora, se o BeanA conectar automaticamente essa interface, o Spring não saberá qual das duas implementações injetar.
    Uma solução para esse problema é o uso da anotação @Qualifier.

        @Component
        public class BeanA {
            @Autowired
            @Qualifier("beanB2")
            private BeanInterface dependency;
            ...
        }
    
Com a anotação @Qualifier adicionada, o Spring agora saberá qual bean conectar automaticamente onde beanB2 é o nome de BeanB2.

-------------------------------------------------------------------------

<h2>@Configuration</h2>
Esta anotação é usada em classes que definem beans. @Configuration é um análogo para arquivo de configuração XML – é configuração usando classe Java. A classe Java anotada com @Configuration é uma configuração por si só e terá métodos para instanciar e configurar as dependências.

Aqui está um exemplo:

        @Configuration
        public class DataConfig{ 
            @Bean
            public DataSource source(){
                DataSource source = new OracleDataSource();
                source.setURL();
                source.setUser();
                return source;
            }
            @Bean
            public PlatformTransactionManager manager(){
                PlatformTransactionManager manager = new BasicDataSourceTransactionManager();
                manager.setDataSource(source());
                return manager;
            }
        }   
    
-------------------------------------------------------------------------

<h2>@ComponentScan</h2>
Essa anotação é usada com a anotação @Configuration para permitir que o Spring conheça os pacotes para verificar os componentes anotados. @ComponentScan também é usado para especificar pacotes base usando basePackageClasses ou atributos basePackage para varredura. Caso não sejam definidos pacotes específicos, a varredura ocorrerá a partir do pacote da classe que declara esta anotação.

Confira esta postagem para uma análise aprofundada da anotação Component Scan.

-------------------------------------------------------------------------

<h2>@Bean</h2>
Essa anotação é usada no nível do método. A anotação @Bean funciona com @Configuration para criar Spring beans. Conforme mencionado anteriormente, @Configuration terá métodos para instanciar e configurar dependências. Tais métodos serão anotados com @Bean. O método anotado com esta anotação funciona como bean ID e cria e retorna o bean real.

Aqui está um exemplo:

        @Configuration
        public class AppConfig{
            @Bean
            public Person person(){
                return new Person(address());
            }
            @Bean
            public Address address(){
                return new Address();
            }
        }

-------------------------------------------------------------------------

<h2>@Lazy</h2>
Essa anotação é usada em classes de componentes. Por padrão, todas as dependências autowired são criadas e configuradas na inicialização. Mas se você quiser inicializar um bean preguiçosamente, você pode usar a anotação @Lazy sobre a classe. Isso significa que o bean será criado e inicializado somente quando for solicitado pela primeira vez. Você também pode usar essa anotação em classes @Configuration. Isso indica que todos os métodos @Bean dentro dessa @Configuration devem ser inicializados lentamente.

-------------------------------------------------------------------------

<h2>@Value</h2>
Essa anotação é usada no campo, no parâmetro do construtor e no nível do parâmetro do método. A anotação @Value indica uma expressão de valor padrão para o campo ou parâmetro com o qual inicializar a propriedade. Como a anotação @Autowired diz ao Spring para injetar um objeto em outro quando ele carrega o contexto de sua aplicação, você também pode usar a anotação @Value para injetar valores de um arquivo de propriedade em um atributo de bean. Ele suporta os espaços reservados #{...} e ${...}.

-------------------------------------------------------------------------

<h2 align="center" >SPRING FRAMEWORK STEREOTYPE ANNOTATIONS</h2>


<h2>@Component</h2>
Essa anotação é usada em classes para indicar um componente Spring. A anotação @Component marca a classe Java como um bean ou, digamos, componente para que o mecanismo de varredura de componentes do Spring possa ser incluído no contexto do aplicativo.

-------------------------------------------------------------------------

<h2>@Controller</h2>
A anotação @Controller é usada para indicar que a classe é um controlador Spring. Essa anotação pode ser usada para identificar controladores para Spring MVC ou Spring WebFlux.

-------------------------------------------------------------------------

<h2>@Service</h2>
Esta anotação é usada em uma classe. O @Service marca uma classe Java que executa algum serviço, como executar lógica de negócios, realizar cálculos e chamar APIs externas. Esta anotação é uma forma especializada da anotação @Component destinada a ser usada na camada de serviço.

-------------------------------------------------------------------------

<h2>@Repository</h2>
Esta anotação é utilizada em classes Java que acessam diretamente o banco de dados. A anotação @Repository funciona como marcador para qualquer classe que cumpra o papel de repositório ou Objeto de Acesso a Dados.

Esta anotação tem um recurso de tradução automática. Por exemplo, quando ocorre uma exceção no @Repository, há um manipulador para essa exceção e não há necessidade de adicionar um bloco try catch.   

-------------------------------------------------------------------------

<h2 align="center" >SPRING BOOT ANNOTATIONS</h2>


<h2>@EnableAutoConfiguration</h2>
This annotation is usually placed on the main application class. The @EnableAutoConfiguration annotation implicitly defines a base “search package”. This annotation tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.

-------------------------------------------------------------------------

<h2>@SpringBootApplication</h2>
Essa anotação é usada na classe do aplicativo durante a configuração de um projeto Spring Boot. A classe anotada com @SpringBootApplication deve ser mantida no pacote base. A única coisa que o @SpringBootApplication faz é uma verificação de componente. Mas ele fará a varredura apenas de seus subpacotes. Por exemplo, se você colocar a classe anotada com @SpringBootApplication em com.example, @SpringBootApplication fará a varredura de todos os seus subpacotes, como com.example.a, com.example.b e com.example.a.x.

O @SpringBootApplication é uma anotação conveniente que adiciona o seguinte:

        @Configuration
        @EnableAutoConfiguration
        @ComponentScan

-------------------------------------------------------------------------

<h2>SPRING MVC AND REST ANNOTATIONS</h2>


<h2>@Controller</h2>
Essa anotação é usada em classes Java que desempenham o papel de controlador em seu aplicativo. A anotação @Controller permite a detecção automática de classes de componentes no classpath e o registro automático de definições de bean para elas. Para habilitar a detecção automática de tais controladores anotados, você pode adicionar a varredura de componentes à sua configuração. A classe Java anotada com @Controller é capaz de lidar com vários mapeamentos de solicitação.

Essa anotação pode ser usada com Spring MVC e Spring WebFlux.

-------------------------------------------------------------------------

<h2>@RequestMapping</h2>
Essa anotação é usada tanto no nível de classe quanto no nível de método. A anotação @RequestMapping é usada para mapear solicitações da Web em classes de manipulador e métodos de manipulador específicos. Quando @RequestMapping é usado no nível de classe, ele cria um URI base para o qual o controlador será usado. Quando essa anotação é usada em métodos, ela fornecerá a URI na qual os métodos do manipulador serão executados. A partir disso, você pode inferir que o mapeamento de solicitação em nível de classe permanecerá o mesmo, enquanto cada método manipulador terá seu próprio mapeamento de solicitação.

Às vezes, você pode querer executar operações diferentes com base no método HTTP usado, mesmo que o URI de solicitação permaneça o mesmo. Em tais situações, você pode usar o atributo de método de @RequestMapping com um valor de método HTTP para limitar os métodos HTTP a fim de invocar os métodos de sua classe.

Aqui está um exemplo básico de como um controlador junto com os mapeamentos de solicitação funcionam:

        @Controller
        @RequestMapping("/welcome")
        public class WelcomeController{
            @RequestMapping(method = RequestMethod.GET)
            public String welcomeAll(){
                return "welcome all";
            }  
        }

Neste exemplo, apenas as solicitações GET para /welcome são tratadas pelo método welcomeAll().

Essa anotação também pode ser usada com Spring MVC e Spring WebFlux.

A anotação @RequestMapping é muito versátil. Por favor, veja minha postagem detalhada sobre Mapeamento de Solicitações antes.

-------------------------------------------------------------------------

<h2>@CookieValue</h2>
Essa anotação é usada no nível do parâmetro do método. @CookieValue é usado como argumento do método de mapeamento de solicitação. O cookie HTTP está vinculado ao parâmetro @CookieValue para um determinado nome de cookie. Essa anotação é usada no método anotado com @RequestMapping.
Vamos considerar que o seguinte valor de cookie é recebido com uma solicitação http:

        JSESSIONID=418AB76CD83EF94U85YD34W
    
Para obter o valor do cookie, use @CookieValue assim:

        @RequestMapping("/cookieValue")
        public void getCookieValue(@CookieValue "JSESSIONID" String cookie){
        }   

-------------------------------------------------------------------------

<h2>@CrossOrigin</h2>
Essa anotação é usada no nível de classe e método para habilitar solicitações de origem cruzada. Em muitos casos, o host que atende ao JavaScript será diferente do host que atende aos dados. Nesse caso, o Cross Origin Resource Sharing (CORS) permite a comunicação entre domínios. Para habilitar essa comunicação basta adicionar a anotação @CrossOrigin.

Por padrão, a anotação @CrossOrigin permite todas as origens, todos os cabeçalhos, os métodos HTTP especificados na anotação @RequestMapping e maxAge de 30 min. Você pode personalizar o comportamento especificando os valores de atributos correspondentes.

Um exemplo para usar @CrossOrigin nos níveis de método do controlador e do manipulador é este.

        @CrossOrigin(maxAge = 3600)
        @RestController
        @RequestMapping("/account")
        public class AccountController {

            @CrossOrigin(origins = "http://example.com")
            @RequestMapping("/message")
            public Message getMessage() {
                // ...
            }
 
            @RequestMapping("/note")
            public Note getNote() {
                    // ...
            }
        }

Neste exemplo, os métodos getExample() e getNote() terão um maxAge de 3600 segundos. Além disso, getExample() permitirá apenas solicitações de origem cruzada de http://example.com, enquanto getNote() permitirá solicitações de origem cruzada de todos os hosts.

-------------------------------------------------------------------------

<h2 align="center" >COMPOSED @REQUESTMAPPING VARIANTS</h2>


<h2>@GetMapping</h2>
Essa anotação é usada para mapear solicitações HTTP GET em métodos de manipulador específicos. @GetMapping é uma anotação composta que atua como um atalho para @RequestMapping(method = RequestMethod.GET)

-------------------------------------------------------------------------

<h2>@PostMapping</h2>
Essa anotação é usada para mapear solicitações HTTP POST em métodos de manipulador específicos. @PostMapping é uma anotação composta que atua como um atalho para           @RequestMapping(method = RequestMethod.POST)

-------------------------------------------------------------------------

<h2>@PutMapping</h2>
Essa anotação é usada para mapear solicitações HTTP PUT em métodos de manipulador específicos. @PutMapping é uma anotação composta que atua como um atalho para @RequestMapping(method = RequestMethod.PUT)

-------------------------------------------------------------------------

<h2>@PatchMapping</h2>
Essa anotação é usada para mapear solicitações HTTP PATCH em métodos de manipulador específicos. @PatchMapping é uma anotação composta que atua como um atalho para @RequestMapping(method = RequestMethod.PATCH)

-------------------------------------------------------------------------

<h2>@DeleteMapping</h2>
Essa anotação é usada para mapear solicitações HTTP DELETE em métodos de manipulador específicos. @DeleteMapping é uma anotação composta que atua como um atalho para @RequestMapping(method = RequestMethod.DELETE)
    [estilo divisor =”4″]

-------------------------------------------------------------------------

<h2>@ExceptionHandler</h2>
Essa anotação é usada em níveis de método para lidar com exceções no nível do controlador. A anotação @ExceptionHandler é utilizada para definir a classe de exceção que irá capturar. Você pode usar essa anotação em métodos que devem ser invocados para lidar com uma exceção. Os valores @ExceptionHandler podem ser definidos como uma matriz de tipos de exceção. Se for lançada uma exceção que corresponda a um dos tipos na lista, o método anotado com @ExceptionHandler correspondente será invocado.

-------------------------------------------------------------------------

<h2>@InitBlinder</h2>
Esta anotação é uma anotação de nível de método que desempenha o papel de identificar os métodos que inicializam o WebDataBinder – um DataBinder que vincula o parâmetro de solicitação a objetos JavaBean. Para personalizar a vinculação de dados do parâmetro de solicitação, você pode usar os métodos anotados @InitBinder em nosso controlador. Os métodos anotados com @InitBinder são todos os tipos de argumento suportados pelos métodos do manipulador.
    Os métodos anotados @InitBinder serão chamados para cada solicitação HTTP se você não especificar o elemento de valor dessa anotação. O elemento de valor pode ser um único ou vários nomes de formulário ou parâmetros de solicitação aos quais o método de fichário init é aplicado.

-------------------------------------------------------------------------

<h2>@Mappings and @Mapping</h2>
Esta anotação é usada em campos. A anotação @Mapping é uma meta anotação que indica uma anotação de mapeamento da web. Ao mapear diferentes nomes de campo, você precisa configurar o campo de origem para seu campo de destino e, para isso, deve adicionar a anotação @Mappings. Essa anotação aceita uma matriz de @Mapping com os campos de origem e destino.

-------------------------------------------------------------------------

<h2>@MatrixVariable</h2>
Essa anotação é usada para anotar os argumentos do método do manipulador de solicitação para que o Spring possa injetar os bits relevantes do URI da matriz. Variáveis ​​de matriz podem aparecer em qualquer segmento, cada uma separada por um ponto e vírgula. Se uma URL contiver variáveis ​​de matriz, o padrão de mapeamento de solicitação deverá representá-las com um modelo de URI. A anotação @MatrixVariable garante que a solicitação corresponda às variáveis ​​de matriz corretas do URI.

-------------------------------------------------------------------------

<h2>@PathVariable</h2>
Essa anotação é usada para anotar os argumentos do método do manipulador de solicitação. A anotação @RequestMapping pode ser usada para lidar com mudanças dinâmicas no URI onde determinado valor de URI atua como um parâmetro. Você pode especificar esse parâmetro usando uma expressão regular. A anotação @PathVariable pode ser usada para declarar este parâmetro.

-------------------------------------------------------------------------

<h2>@RequestAttribute</h2>
Essa anotação é usada para vincular o atributo de solicitação a um parâmetro de método do manipulador. O Spring recupera o valor dos atributos nomeados para preencher o parâmetro anotado com @RequestAttribute. Enquanto a anotação @RequestParam é usada para vincular os valores de parâmetro da string de consulta, o @RequestAttribute é usado para acessar os objetos que foram preenchidos no lado do servidor.

-------------------------------------------------------------------------

<h2>@RequestBody</h2>
Essa anotação é usada para anotar os argumentos do método do manipulador de solicitação. A anotação @RequestBody indica que um parâmetro de método deve ser vinculado ao valor do corpo da solicitação HTTP. O HttpMessageConveter é responsável por converter a mensagem de solicitação HTTP em objeto.

-------------------------------------------------------------------------

<h2>@RequestHeader</h2>
Essa anotação é usada para anotar os argumentos do método do manipulador de solicitação. A anotação @RequestHeader é usada para mapear o parâmetro do controlador para solicitar o valor do cabeçalho. Quando o Spring mapeia a solicitação, @RequestHeader verifica o cabeçalho com o nome especificado na anotação e vincula seu valor ao parâmetro do método do manipulador. Essa anotação ajuda você a obter os detalhes do cabeçalho na classe do controlador.

-------------------------------------------------------------------------

<h2>@RequestParam</h2>
Essa anotação é usada para anotar os argumentos do método do manipulador de solicitação. Às vezes, você obtém os parâmetros na URL da solicitação, principalmente em solicitações GET. Nesse caso, junto com a anotação @RequestMapping, você pode usar a anotação @RequestParam para recuperar o parâmetro de URL e mapeá-lo para o argumento do método. A anotação @RequestParam é usada para vincular parâmetros de solicitação a um parâmetro de método em seu controlador.

-------------------------------------------------------------------------

<h2>@RequestPart</h2>
Essa anotação é usada para anotar os argumentos do método do manipulador de solicitação. A anotação @RequestPart pode ser usada em vez de @RequestParam para obter o conteúdo de uma multipart específica e vincular ao argumento do método anotado com @RequestPart. Esta anotação leva em consideração o cabeçalho “Content-Type” no multipart(request part).

-------------------------------------------------------------------------

<h2>@RequestBody</h2>
Essa anotação é usada para anotar os métodos do manipulador de solicitação. A anotação @ResponseBody é semelhante à anotação @RequestBody. A anotação @ResponseBody indica que o tipo de resultado deve ser escrito diretamente no corpo da resposta em qualquer formato especificado, como JSON ou XML. Spring converte o objeto retornado em um corpo de resposta usando o método HttpMessageConveter.

-------------------------------------------------------------------------

<h2>@ResponseStatus</h2>
Essa anotação é usada em métodos e classes de exceção. @ResponseStatus marca um método ou classe de exceção com um código de status e um motivo que deve ser retornado. Quando o método manipulador é invocado, o código de status é definido como a resposta HTTP que substitui as informações de status fornecidas por qualquer outro meio. Uma classe de controlador também pode ser anotada com @ResponseStatus, que é então herdada por todos os métodos @RequestMapping.

-------------------------------------------------------------------------

<h2>@ControllerAdvice</h2>
Essa anotação é aplicada no nível de classe. Conforme explicado anteriormente, para cada controlador você pode usar @ExceptionHandler em um método que será chamado quando ocorrer uma determinada exceção. Mas isso lida apenas com as exceções que ocorrem dentro do controlador no qual é definido. Para superar esse problema, agora você pode usar a anotação @ControllerAdvice. Essa anotação é usada para definir os métodos @ExceptionHandler, @InitBinder e @ModelAttribute que se aplicam a todos os métodos @RequestMapping. Assim se você definir a anotação @ExceptionHandler em um método da classe @ControllerAdvice, ela será aplicada a todos os controllers.

-------------------------------------------------------------------------

<h2>@RestController</h2>
Essa anotação é usada no nível de classe. A anotação @RestController marca a classe como um controlador onde cada método retorna um objeto de domínio em vez de uma exibição. Ao anotar uma classe com essa anotação, você não precisa mais adicionar @ResponseBody a todo o método RequestMapping. Isso significa que você não usa mais resolvedores de exibição ou envia html em resposta. Você apenas envia o objeto de domínio como resposta HTTP no formato que é entendido pelos consumidores como JSON.

    @RestController é uma anotação de conveniência que combina @Controller e @ResponseBody.

-------------------------------------------------------------------------

<h2>@RestControllerAdvice</h2>
This annotation is applied on Java classes. @RestControllerAdvice is a convenience annotation which combines @ControllerAdvice and @ResponseBody. This annotation is used along with the @ExceptionHandler annotation to handle exceptions that occur within the controller.

-------------------------------------------------------------------------

<h2>@SessionAttribute</h2>
Essa anotação é usada no nível do parâmetro do método. A anotação @SessionAttribute é usada para vincular o parâmetro do método a um atributo de sessão. Essa anotação fornece um acesso conveniente aos atributos de sessão existentes ou permanentes.

-------------------------------------------------------------------------

<h2>@SessionAttributes</h2>
Essa anotação é aplicada no nível de tipo para um manipulador específico. A anotação @SessionAtrributes é usada quando você deseja incluir um objeto JavaBean em uma sessão. Isso é usado quando você deseja manter o objeto em sessão por um curto período de tempo. @SessionAttributes é usado em conjunto com @ModelAttribute.
Considere este exemplo.

    @ModelAttribute("person")
    public Person getPerson(){} 
    // within the same controller as above snippet
    @Controller
    @SeesionAttributes(value="person", types={Person.class})
    public class PersonController{}

O nome @ModelAttribute é atribuído a @SessionAttributes como valor. O @SessionAttributes tem dois elementos. O elemento value é o nome da sessão no modelo e o elemento types é o tipo de atributos da sessão no modelo.
-------------------------------------------------------------------------