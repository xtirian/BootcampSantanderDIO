## Getting Started

### Nomenclatura
Vamos imaginar, que sua empresa se chama Power Soft e ela estÃ¡ desenvolvendo software comercial, governamental e um software livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela abaixo:

Comercial : com.powersoft;
Governamental : gov.powersoft;
Código aberto: org.powersoft.

Bem, acima já podemos perceber que existe uma definição, para o uso do nome dos pacotes, porém, podemos organizar ainda mais um pouco as nossas classes, mediante a proposta de sua existência:

- model : Classes que representam a camada e modelo da aplicaÃ§Ã£o : Cliente, Pedido, NotaFiscal, Usuario;
- repository: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository;
- service: Classes que contÃ©m regras de negÃ³cio do sistema : ClienteService possui o mÃ©todo validar o CPF, do cliente cadastrado;
- controller: Classes que possuem a finalidade de, disponibilizar os nossos recursos da aplicaÃ§Ã£o, para outras aplicaÃ§Ãµes via padrÃ£o HTTP;
- view: Classes que possuem alguma interaÃ§Ã£o, com a interface grÃ¡fica acessada pelo usuÃ¡rio;
- util: Pacote que contÃ©m, classes utilitÃ¡rias do sistema: FormatadorNumeroUtil, ValidadorUtil.