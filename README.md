 Manexo de ficheiros.
=====================

1.  2.  <span> Crea unha clase serializable de nome Produto, que teña
    como atributos:</span>

-   <span> identificador, enteiro</span>

-   <span> nome do produto: cadea de caracteres</span>

-   <span> prezo: número real.</span>

1.  <span> Crea un programa que, partindo de arrays de 5 números
    enteiros, 5 nomes de produtos e 5 prezos, escriba nun ficheiro
    binario de nome produtos.dat obxectos da clase produto creados
    usando a información anterior.</span>

2.  <span> Crea un programa que mostre por pantalla a información
    gardada en produtos.dat.</span>

3.  <span> Indica cales das seguintes afirmacións sobre SAX e DOM son
    correctas:</span>

-   <span> Mediante SAX cárgase todo o ficheiro XML en memoria e lese de
    forma secuencial producindo unha secuencia de eventos.</span>

-   <span> Mediante DOM almacénase toda a estrutura do documento XML en
    memoria en forma de árbore con nodos pai, nodos fillo e
    nodos finais.</span>

-   <span> SAX é máis complexo de programar que DOM.</span>

-   <span> O tipo de procesamento de SAX necesita máis recursos de
    memoria e tempo sobre todo se os ficheiros XML a procesar son
    bastante grandes e complexos.</span>

-   <span> O tipo de procesamento de DOM impide ter unha visión global
    do documento polo que navegar.</span>

1.  <span> ¿Cal é a función da clase org.w3c.dom.Document?</span>

<span>     a. Procesar o documento XML.</span>

<span>     b. Almacenar o documento XML nun modelo de obxectos accesible
desde Java.</span>

<span>     c. Fabricar un novo construtor de documentos.</span>

1.  <span> Dado o seguinte código XML:
    “<span>&lt;</span>pedido<span>&gt;</span><span>&lt;</span>!--Datos
    do pedido
    --<span>&gt;</span><span>&lt;</span>/pedido<span>&gt;</span> indica
    que elementos DOM atopamos no mesmo:</span>

    <span> a. org.w3c.dom.Element</span>

    <span> b. org.w3c.dom.Node</span>

    <span> c. org.w3c.dom.Text</span>

    <span> d. org.w3c.dom.Comment</span>

2.  <span> ¿Para que se utiliza un procesador de XML ou parser? </span>

3.  <span> Indica cales son os procesadores de XML máis empregados e as
    principais características de cada un deles.</span>

4.  <span> Explica que é XSL.</span>

5.  <span> Crea un programa que xere un ficheiro xml de nome
    pedidos.xml, cun elemento raíz de nome pedidos e 10 elementos coa
    estrutura seguinte:</span>

<span>     <span>&lt;</span>pedido<span>&gt;</span></span>

<span>         <span>&lt;</span>idPedido<span>&gt;</span> ….
<span>&lt;</span>/idPedido<span>&gt;</span></span>

<span>         <span>&lt;</span>nomeCliente<span>&gt;</span> ….
<span>&lt;</span>/nomeCliente<span>&gt;</span></span>

<span>         <span>&lt;</span>produto<span>&gt;</span></span>

<span>             <span>&lt;</span>idProduto<span>&gt;</span> ....
<span>&lt;</span>/idProduto<span>&gt;</span></span>

<span>             <span>&lt;</span>descricion<span>&gt;</span> ..…
<span>&lt;</span>/descricion<span>&gt;</span></span>

<span>             <span>&lt;</span>prezo<span>&gt;</span> ….
<span>&lt;</span>/prezo<span>&gt;</span></span>

<span>         <span>&lt;</span>/produto<span>&gt;</span></span>

<span>     <span>&lt;</span>/pedido<span>&gt;</span></span>

1.  <span>   No programa débense usar arrays de datos para xerar os 10
    elementos <span>&lt;</span>pedido<span>&gt;</span></span>

2.  <span> Crea un programa que lea e mostre por pantalla o contido do
    ficheiro pedidos.xml. Engade control de erros de maneira que nos
    mostre unha mensaxe informativa en galego cando o ficheiro a
    procesar non teña a estrutura esperada.</span>

3.  <span> A partir do ficheiro de obxectos Persoa que creamos en clase,
    xera un documento XML usando DOM.</span>

4.  <span> Escribe unha clase de nome UtilidadesXML cos seguintes
    métodos de clase:</span>

-   <span> Método **creaDOMBaleiro,** que crea un DOM baleiro. Recibe o
    nome da etiqueta raíz e devolve o documento, de
    tipo Document.</span>

-   <span> Método **creaElementoTexto**, que recibe un nome de etiqueta
    (para crear nodo tipo Element), o texto que contén a etiqueta (para
    crear nodo tipo Text) e o documento (tipo Document), e devolve un
    Element que contén o texto.</span>

-   <span> Método **XMLaDOM**, que recibe unha cadea co nome dun
    documento XML e devolve un documento DOM (tipo Document).</span>

-   <span> Método **mostraElementoRaiz**, recibe o documento
    (tipo Document) e mostra por pantalla o nome do elemento raíz
    do documento.</span>

-   <span> Método **mostraContidoElemento**, que recibe un elemento
    (tipo Element) e mostra por pantalla as etiquetas e os textos
    incluídos nos nodos fillo deste elemento.</span>

-   <span> Método **borraElementosEtiqueta**, que recibe un nome de
    etiqueta e o documento (tipo Document) e borra tódolos elementos con
    esa etiqueta.</span>

-   <span> Método **DOMaXML**, que recibe un documento DOM
    (tipo Document) e unha cadea co nome dun documento XML. Este método
    converte o DOM en XML. </span>

1.  <span> Escribe unha clase de nome CreaAxenda, que usa os métodos da
    clase anterior para crear un documento de nome axenda.xml, coa
    estrutura que se mostra a continuación, no que haxa 6 contactos.
    Úsense arrais cos datos para xerar cada contacto. Engade na anterior
    clase os métodos que consideres necesarios.</span>

<span> <span>&lt;</span>axenda<span>&gt;</span></span>

<span>      <span>&lt;</span>contacto id=1<span>&gt;</span></span>

<span>
      <span>&lt;</span>nome<span>&gt;</span>Luis<span>&lt;</span>/nome<span>&gt;</span></span>

<span>
  <span>&lt;</span>telefono<span>&gt;</span>222222222<span>&lt;</span>/telefono<span>&gt;</span></span>

<span>   <span>&lt;</span>enderezo<span>&gt;</span></span>

<span>         <span>&lt;</span>rua<span>&gt;</span>rua Nova
<span>&lt;</span>/rua<span>&gt;</span></span>

<span>   
     <span>&lt;</span>numero<span>&gt;</span>3<span>&lt;</span>/numero<span>&gt;</span></span>

<span>   <span>&lt;</span>/enderezo<span>&gt;</span></span>

<span>   <span>&lt;</span>/contacto<span>&gt;</span></span>

<span>   <span>&lt;</span>contacto id=2<span>&gt;</span></span>

<span>   ....</span>

<span>   <span>&lt;</span>/contacto<span>&gt;</span></span>

<span> ...</span>

<span> <span>&lt;</span>/axenda<span>&gt;</span></span>

1.  <span> Escribe unha clase de nome ProcesaAxenda, que usa os métodos
    da clase UtilidadesXML para realizar as seguintes tarefas (engade na
    anterior clase os métodos que consideres necesarios):</span>

-   <span> Carga en memoria usando DOM o ficheiro axenda.xml</span>

-   <span> Mostra por pantalla o nome do elemento raíz.</span>

-   <span> Mostra por pantalla o contido do documento.</span>

-   <span> Borra os elementos de nome telefono e xera axenda1.xml co
    contido actual do documento en memoria.</span>

-   <span> Borra os elementos de tipo enderezo e xera axenda2.xml co
    contido actual do documento en memoria.</span>

-   <span> Engade elementos de tipo correoe e xera axenda3.xml co
    contido actual do documento en memoria.</span>

1.  <span> Utiliza SAX para visualizar o contido do ficheiro
    empregados.xml creado anteriormente.</span>

<!-- -->

1.  <span> Crea un programa que, partindo do ficheiro produtos.dat
    creado anteriormente, xere un xml, cun elemento raíz de nome
    <span>&lt;</span>produtos<span>&gt;</span>, e un elemento de nome
    <span>&lt;</span>produto<span>&gt;</span> por cada un dos produtos.
    **Usa Xstream.**</span>

<!-- -->

1.  <span> Crea o seguinte programa:</span>

<span> a. Crea unha clase serializable de nome Libro, que teña como
atributos:</span>

<span> - ISBN: cadea de caracteres</span>

<span> - Titulo: cadea de caracteres</span>

<span> - Autores: lista de autores (String)</span>

<span> - Ano: enteiro</span>

<span> b. Crea unha clase de nome UtilidadesLibro, cun método de nome
xerarDatLibro que, partindo de arrays de datos, cree 6 obxectos da clase
libro e os garde nun ficheiro binario de nome libros.dat.</span>

<span> c. Engade na anterior clase un método de nome mostrarDatLibro que
mostre por pantalla a información gardada en libros.dat.</span>

<span> d. Engade na anterior clase un método de nome xerarXmlLibroDom
que, a partir do ficheiro libros.dat, xera un documento XML usando
DOM.</span>

<span> e. Engade na anterior clase un método de nome
xerarXmlLibroXStream que, a partir de libros.dat xera un documento XML,
cun elemento raíz de nome <span>&lt;</span>libros<span>&gt;</span>, e un
elemento <span>&lt;</span>libro<span>&gt;</span> por cada un dos
libros.</span>

<span> f. Crea unha clase de nome XestionLibro, cun método main desde o
cal se invoca ós métodos anteriores.</span>

<span> g. **Proposta de mellora**: engadir no libro un campo de nome
prestado, de tipo boolean, e un campo de nome Lector, de tipo
Persoa.</span>

1.  <span> Crea unha plantilla de nome pedidos.xsl para transformar a
    html o ficheiro pedidos.xml.</span>

<!-- -->

1.  <span> Crea un programa que xenere unha páxina de nome pedidos.html
    usando pedidos.xml e pedidos.xsl.</span>


