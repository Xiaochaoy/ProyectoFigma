package com.example.proyectofigma;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

public class terminosFragment extends Fragment {

    NavController navController;
    Button finalizar;
    TextView textazo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_terminos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        finalizar = view.findViewById(R.id.finalizar);
        textazo = view.findViewById(R.id.textazo);

        textazo.setText("El presente Acuerdo de suscriptor a Steam («acuerdo») es un documento legal en el que se explican sus derechos y obligaciones como suscriptor de Steam de Valve Corporation, una empresa registrada con arreglo a las leyes del estado de Washington, con domicilio fiscal en: 10400 NE 4th St., Bellevue, WA 98004, Estados Unidos, con número de la Secretaría de Estado de Washington: 60 22 90 773, y con número de identificación a efectos de IVA: EU 8260 00671 («Valve»). Léalo atentamente.\n" +
                "\n" +
                "EL APARTADO 11 CONTIENE UN ACUERDO DE ARBITRAJE VINCULANTE Y UNA CLÁUSULA SOBRE RENUNCIA A DEMANDAS COLECTIVAS. AFECTA A LA MANERA EN LA QUE SE RESUELVEN LAS DISPUTAS. LE RECOMENDAMOS QUE LO LEA ATENTAMENTE. EL APARTADO 11 NO SE APLICA SI RESIDE EN LA PROVINCIA DE QUEBEC (CANADÁ) O EN LA UNIÓN EUROPEA.\n" +
                "\n" +
                "1. REGISTRO COMO SUSCRIPTOR, TÉRMINOS APLICABLES Y CUENTA ⏶\n" +
                "\n" +
                "Steam es un servicio en línea suministrado por Valve.\n" +
                "\n" +
                "Al completar el registro de una cuenta de usuario de Steam se convierte en suscriptor de Steam («suscriptor»). Este acuerdo entrará en validez en el momento en que usted indique que acepta estos términos. No se le permite convertirse en un suscriptor si es menor de 13 años de edad. Steam no se ha diseñado para menores de 13 años y Valve no recopilará de forma deliberada ninguna información de ningún menor de 13 años.\n" +
                "\n" +
                "A. Partes contratantes\n" +
                "\n" +
                "Para cualquier interacción con Steam, la relación contractual es con Valve. A menos que se indique en el momento de realizar la transacción (como sucede en el caso de compras a otro suscriptor en un bazar de suscripciones de Steam), cualquier transacción relacionada con la Suscripción (tal y como se define a continuación) que haga en Steam se realiza en Valve.\n" +
                "\n" +
                "B. Suscripciones, contenido y servicios\n" +
                "\n" +
                "Como suscriptor, puede tener acceso a determinados servicios, software y contenidos disponibles para los suscriptores. A efectos de este acuerdo, el software del cliente de Steam y cualquier otro software, contenido o actualización que descargue o a los que tenga acceso a través de Steam, incluidos pero sin limitarse a videojuegos de Valve o de terceros y contenido para juegos, software asociado a hardware, así como los artículos virtuales o hardware con los que comercie, que venda o compre en el bazar de suscripciones de Steam, se llamarán en conjunto «contenidos y servicios»; también a efectos de este acuerdo, los derechos de acceso o uso sobre cualquier contenido y servicios accesibles a través de Steam se llamarán «suscripciones».\n" +
                "\n" +
                "Cada suscripción le permite obtener acceso a ciertos contenidos y servicios. El uso de determinadas suscripciones puede estar sujeto a términos adicionales especificados para cada una de ellas («términos de suscripción»); por ejemplo, un acuerdo de licencia de usuario final para un juego concreto, o los términos de uso específicos para un determinado producto o una determinada característica de Steam. Asimismo, es posible que se publiquen términos adicionales (por ejemplo, procedimientos de pago y facturación) en http://www.steampowered.com o dentro del ámbito del servicio de Steam («normas de uso»). Las normas de uso incluyen las «Normas de conducta en línea de Steam» http://steampowered.com/index.php?area=online_conduct y la «Política de reembolsos de Steam» http://store.steampowered.com/steam_refunds. Los términos de suscripción, las normas de uso y la política de confidencialidad de Valve (que se pueden encontrar en http://www.valvesoftware.com/privacy.htm) quedan también incorporados al presente acuerdo y son vinculantes una vez que usted haya indicado que los acepta o que acepta este acuerdo o si se ve obligado por ellos tal y como se describe en el apartado 8 (Modificaciones a este acuerdo).\n" +
                "\n" +
                "C. Su cuenta\n" +
                "\n" +
                "Al completar el proceso de registro de Steam, se crea una cuenta de Steam («cuenta»). En la información de su cuenta también se pueden incluir los datos de facturación que haya suministrado a Valve para adquirir suscripciones, contenido y servicios, y cualquier bien físico ofertado para su compra a través de Steam («hardware»). No debe revelar, compartir ni permitir de ningún otro modo que otros usuarios utilicen su contraseña o cuenta, excepto si Valve lo autoriza expresamente. El usuario es el responsable de la confidencialidad de su información de inicio de sesión y contraseña y de la seguridad de su equipo de cómputo. Valve no es responsable del uso que le dé a su contraseña y cuenta, así como de todas las comunicaciones y actividades realizadas en Steam que resulten del uso que le dé a su nombre de inicio de sesión y contraseña ni las que resulten del uso que les dé otra persona a la que se le hayan revelado de forma deliberada o por negligencia infringiendo esta disposición sobre la confidencialidad. A menos que se deba a una negligencia o error de Valve, Valve no es responsable del uso que se dé a su cuenta por parte de una persona que use de forma fraudulenta su nombre de inicio de sesión y su contraseña sin su autorización. Si cree que la confidencialidad de su nombre de usuario o contraseña puede estar en riesgo, debe avisar inmediatamente a Valve mediante el formulario de asistencia (https://support.steampowered.com/newticket.php).\n" +
                "\n" +
                "Su cuenta, incluida toda información vinculada a ella (p. ej. datos de contacto, datos de facturación, historial de la cuenta y suscripciones, etc.), es estrictamente personal. Por lo tanto, no tiene permiso para vender su cuenta, cobrar a terceros por el derecho de usarla ni transferirla de cualquier otro modo; tampoco tiene permiso para vender sus suscripciones, cobrar a terceros por el derecho de usarlas ni transferirlas, excepto en los casos que queden expresamente permitidos en este acuerdo (incluidos los términos de suscripción o las normas de uso) o cuando Valve lo autorice específicamente.\n" +
                "\n" +
                "D. Procesamiento de los pagos\n" +
                "\n" +
                "El procesamiento de los pagos relacionados con contenidos y servicios y/o hardware comprados en Steam lo realiza o bien Valve Corporation directamente o la subsidiaria Valve GmbH (de la cual Valve es completamente propietaria) en nombre de Valve Corporation, dependiendo del tipo de método de pago utilizado. Si la tarjeta del usuario se emitió fuera de Estados Unidos, el pago lo procesará Valve GmbH a través de un tercero europeo en nombre de Valve Corporation. Para otros tipos de compras, el pago lo cobrará Valve Corporation directamente. En cualquier caso, tanto la entrega de contenidos y servicios como la del hardware la realizará Valve Corporation.\n" +
                "\n" +
                "2. LICENCIAS ⏶\n" +
                "\n" +
                "A. Licencia general de contenidos y servicios\n" +
                "\n" +
                "Steam y sus suscripciones requieren la descarga y la instalación de contenidos y servicios en su equipo. Por el presente acuerdo, Valve concede, y usted acepta, una licencia no exclusiva y el derecho de utilizar los contenidos y servicios para su uso personal sin fines comerciales (excepto si su uso comercial está permitido de manera explícita en este acuerdo o en los términos de suscripción aplicables). Esta licencia finaliza en el momento de la rescisión de (a) el presente Acuerdo o (b) una suscripción que incluya la licencia. Los contenidos y servicios se otorgan mediante una licencia y no son objeto de venta. La licencia no le concede la titularidad ni la propiedad de los contenidos y servicios. Para utilizar los contenidos y servicios, es necesario que tenga una cuenta Steam, y es posible que se le solicite que tenga en funcionamiento el cliente de Steam y que esté conectado a Internet.\n" +
                "\n" +
                "Por razones entre las que se incluyen, sin limitarse a ellas, la seguridad del sistema, la estabilidad y la interoperatividad multijugador, puede que Steam necesite actualizar automáticamente, precargar y crear nuevas versiones o mejorar los contenidos y servicios de otro modo y que, en consecuencia, los requisitos del sistema necesarios para utilizar los contenidos y servicios pueden variar con el tiempo. Usted autoriza dicha actualización automática. Usted entiende que el presente acuerdo (incluidos los términos de suscripción correspondientes) no le da derecho a recibir actualizaciones, nuevas versiones ni otras mejoras futuras de los contenidos y servicios asociadas con cualquier suscripción concreta, si bien Valve puede decidir proporcionar tales actualizaciones y demás a su entera discreción.\n" +
                "\n" +
                "B. Licencia de software beta\n" +
                "\n" +
                "De vez en cuando, es posible que Valve ponga software a su disposición por medio de Steam antes del lanzamiento comercial general de dicho software («software beta»). Aunque usted no está obligado a utilizar el software beta, si Valve se lo ofrece, puede utilizarlo de acuerdo con los siguientes términos. El software beta se considerará parte de los contenidos y servicios, y cada componente del software beta se considerará una suscripción a dicho software beta, según las siguientes disposiciones específicas relativas al software beta:\n" +
                "\n" +
                "Su derecho de utilizar el software beta puede tener una duración limitada y estar sujeto a términos de suscripción adicionales;\n" +
                "Valve o cualquiera de sus empresas asociadas puede solicitar o requerir que proporcione sugerencias, comentarios o datos relativos al uso del software beta, que formarán parte del contenido generado por el usuario, definido más adelante en el apartado 6 como «contenido generado por el usuario»; y\n" +
                "además de las renuncias y limitaciones de responsabilidad aplicables al software, según se detalla más adelante en el apartado 7 (Renuncias; limitación de responsabilidad; sin garantías; garantía limitada y acuerdo) y según corresponda, reconoce específicamente que el software beta únicamente se publica con fines de prueba y mejora, particularmente para brindar valoraciones a Valve sobre la calidad y usabilidad de dicho software beta, y por lo tanto contiene errores, no es final, y puede causar incompatibilidades y daños en el ordenador, los datos o el software. Si decide instalar o utilizar el software beta, se compromete a utilizarlo únicamente conforme a los fines del mismo, es decir, por motivos de prueba y mejora; en ningún caso se utilizará en un sistema o para fines en los que una anomalía del software beta pueda causar cualquier tipo de daño. Asimismo, recomendamos realizar copias de seguridad completas de cualquier sistema en el que se instale el software beta.\n" +
                "C. Licencia de uso de las herramientas de desarrollo de Valve\n" +
                "\n" +
                "Sus suscripciones pueden incluir el acceso a diversas herramientas de Valve que sirven para crear contenido («herramientas de desarrollo»). Algunas de ellas son el kit de desarrollo de software («SDK») de Valve para una versión del motor de videojuegos conocido como «Source» («motor Source») y el editor asociado Valve Hammer Editor, el software Source® Filmmaker o herramientas integradas en los juegos de Valve mediante las que pueda editarlos o crear obras derivadas de ellos. Es posible que algunas herramientas de desarrollo (por ejemplo, el software Source® Filmmaker) se distribuyan con unos términos de suscripción independientes y diferentes de las normas establecidas en este apartado. A excepción de lo acordado en los términos de suscripción independientes aplicables al uso de una herramienta de desarrollo específica, puede utilizar las herramientas de desarrollo, así como usar, reproducir, publicar, ejecutar, mostrar y distribuir cualquier contenido creado con ellas del modo que desee siempre que no sea con fines comerciales.\n" +
                "\n" +
                "Si desea utilizar el SDK de Source Engine o cualquier otra herramienta de desarrollo de Valve para un fin comercial, póngase en contacto con Valve en la dirección sourceengine@valvesoftware.com.\n" +
                "\n" +
                "D. Licencia de uso de contenido de juegos de Valve en obras derivadas.\n" +
                "\n" +
                "Valve desea dar las gracias a la comunidad de suscriptores que crean diseños, relatos y trabajos audiovisuales que hacen referencia a juegos de Valve («obras derivadas»). Puede incorporar contenido de juegos de Valve en sus obras derivadas. Salvo que se indique lo contrario en este apartado o en cualquiera de los términos de suscripción, puede usar, reproducir, publicar, ejecutar, mostrar y distribuir obras derivadas que incorporen contenido de juegos de Valve del modo que desee siempre que no sea con fines comerciales.\n" +
                "\n" +
                "Si incorpora contenido de terceros en cualquier obra derivada, debe asegurarse de que el propietario le otorgue todos los derechos necesarios.\n" +
                "\n" +
                "Está permitido el uso comercial de parte del contenido de los juegos de Valve mediante características como Steam Workshop o un bazar de suscripciones de Steam. Los términos aplicables a dicho uso se estipulan en los apartados 3.D. y 6.B. siguientes y en cualquiera de los términos de suscripción facilitados para tales características.\n" +
                "\n" +
                "Para leer la política sobre vídeos de Valve, que incluye términos adicionales referentes al uso de trabajos audiovisuales que incorporan la propiedad intelectual de Valve o que se han creado con el software Source® Filmmaker, haga clic aquí: http://www.valvesoftware.com/videopolicy.html\n" +
                "\n" +
                "E. Licencia de uso del software del servidor dedicado de Valve\n" +
                "\n" +
                "Sus suscripciones pueden incluir el acceso al software del servidor dedicado de Valve. En ese caso, puede utilizar el software del servidor dedicado de Valve en un número ilimitado de ordenadores con el fin de alojar partidas multijugador en línea de productos de Valve. Si desea hacer uso del software del servidor dedicado de Valve, usted será el único responsable de obtener el acceso a Internet, el ancho de banda y el hardware necesarios para tales actividades y se hará cargo de todos los gastos asociados a este uso.\n" +
                "\n" +
                "F. Propiedad de los contenidos y servicios\n" +
                "\n" +
                "La titularidad, los derechos de propiedad y los derechos de propiedad intelectual relativos a los contenidos y servicios y todas sus copias son propiedad de Valve o de los otorgantes de licencias de sus empresas asociadas. Todos los derechos están reservados, a menos que se disponga lo contrario de forma expresa en el presente acuerdo. Los contenidos y servicios se encuentran protegidos por las leyes de derechos de autor, los tratados y convenciones internacionales sobre derechos de autor y otras leyes. Los contenidos y servicios contienen determinados materiales sujetos a licencia, y los otorgantes de las licencias de Valve y sus empresas asociadas pueden proteger sus derechos en caso de que se produzca cualquier incumplimiento del presente acuerdo.\n" +
                "\n" +
                "G. Restricciones en el uso de los contenidos y servicios\n" +
                "\n" +
                "Se prohíbe el uso de los contenidos y servicios para usos distintos del acceso permitido a Steam y a sus suscripciones o del uso personal sin fines comerciales de sus suscripciones, excepto si se permite de manera explícita en este acuerdo o en los términos de suscripción aplicables. Con excepción de los permisos detallados en este acuerdo (incluidos los términos de suscripción y las normas de uso) o según la ley correspondiente, a pesar de estas restricciones, no puede, ni en parte ni en su totalidad, copiar, fotocopiar, reproducir, publicar, distribuir, traducir, modificar, desensamblar ni descompilar los contenidos y servicios, ni aplicarles ingeniería inversa, manipular su código fuente, crear obras derivadas de ellos ni tampoco quitar ningún aviso ni ninguna etiqueta de propiedad de dichos contenidos y servicios, ni de ningún software al que pueda accederse por medio de Steam sin el consentimiento previo y por escrito de Valve.\n" +
                "\n" +
                "El usuario tiene derecho a utilizar los contenidos y servicios para su propio uso personal pero no tiene derecho a: (i) vender los contenidos y servicios, conceder derechos de garantía sobre ellos ni transferir reproducciones a terceros de ningún modo ni alquilar o arrendar los contenidos y servicios, u otorgar licencias de ellos a otros sin el consentimiento previo y por escrito de Valve, excepto en lo contemplado expresamente en cualquier otra parte de este acuerdo (incluidos los términos de suscripción o las normas de uso); (ii) alojar o proporcionar servicios de búsqueda de jugadores para los contenidos y servicios, ni emular o redirigir los protocolos de comunicación utilizados por Valve en ninguna función de red de los contenidos y servicios mediante la emulación de protocolos, la creación de túneles, la modificación o la adición de componentes en los contenidos y servicios, el uso de un programa de utilidades ni ninguna otra técnica conocida en la actualidad o desarrollada en el futuro con ningún propósito, incluidas, sin limitarse a ellas, partidas de red por Internet, partidas de red utilizando redes de juego comerciales y no comerciales o como parte de redes de agregación de contenidos, sin el consentimiento previo y por escrito de Valve; ni (iii) explotar los contenidos y servicios ni ninguna de sus partes con fines comerciales excepto en lo contemplado expresamente en cualquier otra parte de este acuerdo (incluidos los términos de suscripción o las normas de uso).\n" +
                "\n" +
                "3. FACTURACIÓN, PAGOS Y OTRAS SUSCRIPCIONES ⏶\n" +
                "\n" +
                "Todos los cargos incurridos en Steam y todas las compras realizadas con la cartera de Steam se pagan por adelantado y son definitivos, a excepción de lo descrito en los apartados 3.I y 7 más abajo.\n" +
                "\n" +
                "A. Autorización del pago\n" +
                "\n" +
                "Al proporcionar a Valve o a uno de sus procesadores de pagos la información necesaria para realizar el pago, está declarando ante Valve que usted es el usuario autorizado de la tarjeta, el PIN, la clave o la cuenta asociados a ese pago, y autoriza a Valve a cargar a su tarjeta de crédito o a procesar mediante el procesador de pagos externo elegido para cualquier suscripción el pago de cualquier suscripción, la carga de fondos en la cartera de Steam, la compra de hardware y otros gastos que se le puedan cargar. Valve puede solicitarle que facilite su dirección o cualquier otra información, con el fin de poder cumplir todas sus obligaciones de la legislación fiscal vigente.\n" +
                "\n" +
                "En el caso de suscripciones adquiridas que se basen en un período de uso acordado y en las que se realicen pagos periódicos a cambio de que el uso sea ininterrumpido («suscripciones de pago periódico»), al seguir utilizándolas, acuerda y confirma que Valve está autorizada a realizar el cargo en su tarjeta de crédito (o en su cartera de Steam si tiene fondos) o a procesar el pago con cualquier otro medio de pago de terceros por cualquier importe correspondiente al pago periódico. Si ha adquirido alguna suscripción de pago periódico, acepta informar de inmediato a Valve de cualquier cambio en su dirección de facturación, su número de tarjeta de crédito o la fecha de vencimiento de esta o en el número de su cuenta de PayPal o de otro medio de pago, y acepta notificar a Valve de inmediato si su tarjeta de crédito o su cuenta de PayPal o de otro medio de pago expira o se cancela por cualquier motivo.\n" +
                "\n" +
                "Si el uso de Steam está sujeto a algún tipo de impuesto (por el uso o por la compra), Valve también puede cobrarle esos impuestos, además de la suscripción y de otros cargos indicados en las normas de uso. El impuesto sobre el valor añadido de la UE («IVA») que carga Valve refleja el IVA aplicable al valor de cualquier contenido y servicio, hardware o suscripción.\n" +
                "\n" +
                "Usted accede a no utilizar un servidor proxy ni otros métodos para enmascarar la IP y ocultar su lugar de residencia, ya sea para evitar las restricciones geográficas sobre el contenido del juego, para comprar a precios no aplicables a su área geográfica o para cualquier otra finalidad. Si infringe esa condición, Valve podría cancelar el acceso a su cuenta.\n" +
                "\n" +
                "B. Responsabilidad respecto a los cargos asociados con la cuenta\n" +
                "\n" +
                "Como propietario de la cuenta, usted es responsable de todos los cargos derivados de ella, incluidos los impuestos correspondientes, y de todas las compras realizadas por usted o cualquiera que utilice su cuenta, incluidos familiares y amigos. Si cancela su cuenta, Valve se reserva el derecho a cobrar los cargos, recargos o costes que se hayan generado antes de la cancelación de su cuenta. Para que Valve lo autorice a volverse a registrar, deberá saldar las cuentas impagadas.\n" +
                "\n" +
                "C. Cartera de Steam\n" +
                "\n" +
                "Steam puede poner a su disposición un sistema de control de ingresos y gastos asociado con su cuenta («cartera de Steam»). La Cartera de Steam no es una cuenta bancaria ni es ningún tipo de instrumento de pago. Funciona como saldo prepagado para comprar contenido y servicios. Puede ingresar fondos en su cartera de Steam mediante una tarjeta de crédito, una tarjeta prepago, un código de promoción o cualquier otro método de pago aceptado por Steam, hasta un importe máximo que determinará Valve. Dentro de un período de veinticuatro (24) horas, el importe total almacenado en su cartera de Steam, más el importe total gastado de su cartera de Steam, en conjunto, no pueden superar los 2000 USD o su equivalente en su moneda local; cualquier intento de depositar fondos en la cartera de Steam que supere ese umbral podría no acreditarse hasta que la actividad vuelva a descender por debajo de ese límite. Es posible que Valve modifique los límites de uso o el sistema de control de cuentas de la cartera de Steam o que imponga otros distintos.\n" +
                "\n" +
                "Se le notificará por correo electrónico de cualquier cambio en el control de cuentas de la cartera de Steam en un plazo máximo de sesenta (60) días antes de la entrada en vigor de dicho cambio. El uso continuado de su cuenta de Steam más de treinta (30) días a partir de la entrada en vigor de las modificaciones constituirá su aceptación de los cambios. Si no está de acuerdo con los cambios, la única solución es cancelar su cuenta de Steam o dejar de utilizar la cartera de Steam. En este caso, Valve no tendrá obligación alguna de reembolsar los créditos restantes en la cartera de Steam.\n" +
                "\n" +
                "Usted puede utilizar los fondos de su cartera de Steam para adquirir hardware y suscripciones, así como para hacer compras durante el juego allá donde estén habilitadas las transacciones con la cartera de Steam. Según lo estipulado en el apartado 3.I, los fondos ingresados en la cartera de Steam no son reembolsables ni transferibles. Los fondos ingresados en la cartera de Steam no constituyen un derecho de propiedad personal, no tienen valor fuera de Steam y solo se pueden utilizar para comprar hardware, suscripciones y contenido relacionado a través de Steam (incluidos, pero sin limitarse a, juegos y otras aplicaciones ofrecidas a través de la tienda de Steam o en un bazar de suscripciones de Steam). Los fondos de la cartera de Steam no tienen valor en efectivo y no se pueden cambiar por dinero en efectivo. Los fondos de la cartera de Steam que se consideren propiedad no reclamada pueden cederse a la autoridad competente.\n" +
                "\n" +
                "D. Intercambio y ventas de suscripciones entre suscriptores\n" +
                "\n" +
                "Steam puede incluir una o más funciones o sitios que permitan a los suscriptores intercambiar, vender o comprar determinados tipos de suscripciones (por ejemplo, los derechos de licencia sobre artículos virtuales) entre suscriptores («bazares de suscripciones»). Un ejemplo de bazar de suscripciones es el Mercado de la comunidad Steam. Al utilizar los bazares de suscripciones, autoriza a Valve, en su propio nombre o como agente o concesionario de la licencia de cualquier otro creador o editor de las suscripciones correspondientes a su cuenta, a transferir esas suscripciones desde su cuenta, con el fin de hacer efectiva cualquier operación de intercambio o venta realizada.\n" +
                "\n" +
                "Valve puede cobrar una tarifa por los intercambios o las ventas realizados en un bazar de suscripciones. Se le avisará de cualquier tarifa antes de finalizar el intercambio o la venta.\n" +
                "\n" +
                "Al realizar un intercambio, una venta o una compra en un bazar de suscripciones, reconoce y acuerda que usted es responsable de pagar los impuestos, si los hubiera, que pudieran corresponder a las transacciones que realice, incluyendo los impuestos por el uso o el IVA, y que cumplirá las leyes tributarias que sean aplicables. El dinero procedente de las ventas que realice en un bazar de suscripciones puede considerarse un ingreso a efectos fiscales. Debería consultar con un asesor fiscal para determinar su responsabilidad fiscal en relación con sus actividades en el bazar de suscripciones.\n" +
                "\n" +
                "Usted comprende y reconoce que Valve puede decidir discontinuar el funcionamiento de cualquier bazar de suscripciones, modificar las tarifas que cobra por las transacciones o modificar los términos o las características del bazar de suscripciones. Valve no tendrá responsabilidad alguna hacia usted derivada de la imposibilidad de realizar intercambios de suscripciones en el bazar de suscripciones, ni siquiera en el caso de interrupción del servicio o cambio en los términos, las características o los requisitos para poder participar en cualquier bazar de suscripciones.\n" +
                "\n" +
                "Usted también comprende y reconoce que las suscripciones intercambiadas, vendidas o compradas a través del bazar de suscripciones son derechos de licencia, que usted no tiene intereses de propiedad en tales suscripciones y que Valve no reconoce ninguna transferencia de suscripciones (incluidas las transferencias por mandato judicial) realizada fuera del entorno de Steam.\n" +
                "\n" +
                "E. Compras minoristas\n" +
                "\n" +
                "Es posible que Valve ofrezca o requiera una suscripción para los compradores de paquetes de versiones de productos de venta al por menor o versiones OEM de productos de Valve. La «clave del CD» o «clave de producto» que acompaña a tales versiones se utiliza para activar la suscripción.\n" +
                "\n" +
                "F. Distribuidores autorizados de Steam\n" +
                "\n" +
                "Puede adquirir una suscripción a través de un distribuidor autorizado de Valve. La «clave de producto» que se suministra al realizar esta compra debe utilizarse para activar la suscripción. Si usted adquiere una suscripción de un distribuidor autorizado de Valve, acepta dirigir cualquier pregunta relativa a la clave de producto a dicho distribuidor.\n" +
                "\n" +
                "G. Suscripciones gratuitas\n" +
                "\n" +
                "En algunos casos, Valve puede ofrecer una suscripción gratuita a ciertos servicios, software o contenidos. Como en el caso de cualquier otra suscripción, usted es siempre responsable de cualquier cargo de su proveedor de servicios de Internet, teléfono u otras conexiones en el que incurra al utilizar Steam, incluso cuando Valve ofrece una suscripción de forma gratuita.\n" +
                "\n" +
                "H. Sitios de terceros\n" +
                "\n" +
                "Es posible que Steam proporcione vínculos a sitios de terceros. Algunos de esos sitios pueden cobrar cargos por separado que son adicionales y no están incluidos en los cargos por suscripción u otros cargos que usted debe abonar a Valve. Asimismo, Steam puede dar acceso a otros distribuidores que proporcionan contenidos, bienes o servicios a través de Steam o por Internet. Usted es responsable de cualquier cargo u obligación adicionales derivados de su relación con esos otros distribuidores. Valve no hace promesas ni da garantías, ya sean expresas o implícitas, con respecto a cualquiera de los sitios de terceras partes. En concreto, Valve no hace promesas ni da garantías respecto a que un determinado servicio o suscripción ofrecido a través de terceros no cambiará, no se interrumpirá o no se cancelará.\n" +
                "\n" +
                "I. Reembolsos y derecho de desistimiento\n" +
                "\n" +
                "Sin perjuicio de cualquier derecho legal que pueda tener, puede solicitar un reembolso de sus compras en Steam según los términos de la Política de reembolsos de Valve: http://store.steampowered.com/steam_refunds/.\n" +
                "\n" +
                "Para consumidores de la Unión Europea:\n" +
                "\n" +
                "La normativa de la UE proporciona un derecho legal a desistir de determinados contratos por mercancías físicas y por la compra de contenido digital. Encontrará más información sobre el alcance del derecho legal a desistir y las formas en las que puede ejercerlo en la siguiente página: https://support.steampowered.com/kb_article.php?ref=8620-QYAL-4516.\n" +
                "\n" +
                "4. CONDUCTA EN LÍNEA, TRAMPAS Y MANIPULACIÓN DE PROCESOS ⏶\n" +
                "\n" +
                "Su conducta en línea y su interacción con otros suscriptores deberán basarse en el sentido común y en unas normas de comportamiento básicas. En especial, debe cumplir con las normas de conducta en línea de Steam, que se pueden encontrar en http://steampowered.com/index.php?area=online_conduct. Dependiendo de los términos de uso impuestos por terceros cuando sean estos quienes alojen determinados juegos y otros servicios, también podrían indicarse requisitos adicionales en los términos de suscripción aplicables a una determinada suscripción.\n" +
                "\n" +
                "Es posible que Steam y los contenidos y servicios incluyan funciones diseñadas para identificar procesos o funciones de software o hardware que pueden dar al jugador una ventaja competitiva injusta al jugar con versiones multijugador de cualquier contenido o servicio, o modificaciones de estos («trampas»). Usted acepta que no creará trampas ni ayudará a terceros a crearlas o usarlas en modo alguno. Asimismo, acepta que no desactivará, burlará ni interferirá de ningún otro modo, ya sea de manera directa o indirecta, el funcionamiento de cualquier software diseñado para evitar o informar sobre el uso de trampas.\n" +
                "\n" +
                "Usted acepta no manipular la ejecución de Steam o los Contenidos y Servicios a menos que Valve lo autorice de otro modo. Reconoce y acepta que Valve o cualquier anfitrión de un juego multijugador en línea distribuido a través de Steam (\"Host externo\") puede optar por no permitirle participar en ciertas partidas multijugador en línea si utiliza Trampas o manipula la ejecución de Steam o los Contenidos o Servicios.\n" +
                "\n" +
                "Además, usted reconoce y acepta que los Hosts externos pueden informar de su uso de Trampas o manipulación de procesos no autorizada en Valve, y Valve puede comunicar su historial de uso de estos a los Hosts externos dentro de los límites de la Política de privacidad de Steam.\n" +
                "\n" +
                "Valve puede suspender su cuenta o suscripción individual a causa de cualquier conducta o actividad ilegal, que constituya una trampa o que afecte negativamente de cualquier otro modo al disfrute de Steam por parte de otros suscriptores. Reconoce que Valve no tiene la obligación de avisarle antes de suspender sus suscripciones o su cuenta.\n" +
                "\n" +
                "No está permitido utilizar Trampas, software automatizado (bots), mods, aplicaciones de trampas (hacks) ni cualquier otro software de terceros no autorizado para modificar o automatizar cualquier proceso del bazar de suscripciones o el proceso de creación de cuentas de Steam.\n" +
                "\n" +
                "5. CONTENIDO DE TERCEROS ⏶\n" +
                "\n" +
                "En cuanto a las suscripciones y los contenidos y servicios ajenos a Valve, Valve no filtra ese contenido de terceros disponible en Steam o a través de otras fuentes. Valve no acepta responsabilidad ni obligación alguna por el contenido de terceros. Algunas aplicaciones de software de terceros pueden utilizarse con fines comerciales; no obstante, si usted adquiere ese software a través de Steam, solo puede utilizarlo con fines privados.\n" +
                "\n" +
                "6. CONTENIDO GENERADO POR EL USUARIO ⏶\n" +
                "\n" +
                "A. Disposiciones generales\n" +
                "\n" +
                "Steam proporciona interfaces y herramientas para que el usuario pueda generar contenido y ponerlo a disposición de otros usuarios o Valve a su entera discreción. Con «contenido generado por el usuario» nos referimos a cualquier contenido que el usuario ponga a disposición de otros usuarios como resultado de su uso de las características para varios usuarios de Steam o bien a disposición de Valve o sus empresas asociadas al utilizar los contenidos o servicios, o por cualquier otro motivo.\n" +
                "\n" +
                "Al cargar su contenido en Steam para ponerlo a disposición de otros usuarios o Valve, concede a Valve y sus empresas asociadas el derecho no exclusivo y mundial de utilizar, reproducir, modificar, distribuir, transmitir, transcodificar, traducir, divulgar o comunicar de cualquier otro modo contenido generado por el usuario y crear obras derivadas del mismo, así como de mostrar y ejecutar públicamente el contenido generado por el usuario y las obras derivadas del mismos para efectos del funcionamiento, la distribución, la incorporación como parte del servicio de Steam y la promoción de este, los juegos de Steam y otros contenidos ofrecidos por Steam, incluidas las suscripciones. Esta licencia se concede a Valve cuando el contenido se carga en Steam por la misma duración que la de sus derechos de propiedad intelectual. Puede cesar si Valve infringe la licencia y no resuelve dicha infracción en un plazo de catorce (14) días a partir de recibir la notificación por parte del usuario a la atención del departamento jurídico de Valve (Valve Legal Department) en la dirección de Valve que se indica en esta página de la Política de confidencialidad. La anulación de dicha licencia no afectará a los derechos de cualquier titular de sublicencia de conformidad con cualquier sublicencia concedida por Valve antes del cese de la licencia. Valve es el único propietario de las obras derivadas creadas por Valve a partir del contenido generado por el usuario y, por tanto, tiene derecho a conceder licencias relativas a estas obras derivadas. Si utiliza el almacenamiento «en nube» de Valve, nos concede una licencia para almacenar su información como parte de dicho servicio. Valve se reserva el derecho de poner límites a la cantidad de espacio para almacenamiento que se le permite utilizar.\n" +
                "\n" +
                "Si proporciona a Valve comentarios o sugerencias sobre Steam, los contenidos o servicios, o cualquier producto, hardware o servicio de Valve, Valve tiene total libertad para darles el uso que desee sin tener que responder de ninguna forma ante usted.\n" +
                "\n" +
                "B. Contenido cargado en Steam Workshop\n" +
                "\n" +
                "Algunos juegos y algunas aplicaciones disponibles en Steam («aplicaciones compatibles con Workshop») permiten crear contenido generado por el usuario basado en dichas aplicaciones o que las utiliza y enviar ese contenido («aportación a Workshop») a una página web o varias de Steam Workshop. Las aportaciones a Workshop son visibles para la comunidad Steam y, en el caso de ciertas categorías de aportaciones, los usuarios pueden interactuar con ellas, descargarlas o adquirirlas. En algunos casos, Valve u otros desarrolladores pueden incorporar las aportaciones a Workshop a juegos o a un bazar de suscripciones.\n" +
                "\n" +
                "Comprende y acepta que Valve no tiene ninguna obligación de usar, distribuir ni seguir distribuyendo copias de ninguna aportación a Workshop y que se reserva el derecho, no la obligación, de restringir o eliminar aportaciones a Workshop por cualquier motivo.\n" +
                "\n" +
                "Algunas aplicaciones compatibles con Workshop o páginas web de Workshop pueden incluir términos especiales («términos específicos de las aplicaciones») que complementan o alteran los términos dispuestos en este apartado. En particular, en el caso de las aportaciones a Workshop de pago, los términos específicos de las aplicaciones explican el reparto de los ingresos. Salvo especificación en contrario en los términos específicos de las aplicaciones (si existen), se aplican las siguientes normas generales a las aportaciones a Workshop.\n" +
                "\n" +
                "Las aportaciones a Workshop son suscripciones y, por lo tanto, acepta que los suscriptores que reciban distribuciones de ellas disfrutan de los mismos derechos de uso (y están sujetos a las mismas restricciones) que se estipulan en este acuerdo para el resto de suscripciones.\n" +
                "Independientemente de la licencia descrita en el apartado 6.A., Valve solo tendrá el derecho de modificar o crear obras derivadas de sus aportaciones a Workshop en los siguientes casos: (a) Valve podría realizar las modificaciones necesarias para hacer que la aportación sea compatible con la funcionalidad o la interfaz de usuario de Workshop y Steam y (b) Valve o el desarrollador que corresponda podría realizar modificaciones a las aportaciones a Workshop aceptadas para la distribución desde dentro de la aplicación que considerase necesarias o recomendables para mejorar la experiencia de juego.\n" +
                "Tiene derecho a eliminar, a su sola discreción, aportaciones a Workshop de las páginas de Workshop correspondientes. Si lo hace, Valve deja de tener el derecho de usar, distribuir, transmitir, comunicar y mostrar o ejecutar públicamente la aportación a Workshop con estas salvedades: (a) Valve puede seguir ejerciendo estos derechos con las aportaciones a Workshop aceptadas para su distribución dentro de los juegos o distribuidas de modo que se puedan usar dentro de ellos y (b) la eliminación no afecta a los derechos de los suscriptores que ya hayan tenido acceso a una copia de la aportación a Workshop.\n" +
                "Salvo especificación en contrario en los términos específicos de las aplicaciones, la aceptación por parte de Valve de su aportación a Workshop es su única compensación, de manera que no puede exigir ningún otro derecho ni ninguna otra compensación en relación con los derechos otorgados a Valve y a otros suscriptores.\n" +
                "\n" +
                "C. Promociones y respaldos\n" +
                "\n" +
                "Si utiliza los servicios de Steam (por ejemplo, las listas de mentores de Steam o el servicio de retransmisión de Steam) para promocionar o respaldar un producto, servicio o evento a cambio de cualquier tipo de retribución de un tercero (incluyendo las de carácter no monetario, como juegos gratis), debe indicar claramente a la audiencia la fuente de dicha retribución.\n" +
                "\n" +
                "D. Declaraciones y garantías\n" +
                "\n" +
                "El usuario declara y garantiza a Valve que dispone de los derechos suficientes sobre el contenido generador por el usuario como para conceder a Valve y otras partes implicadas las licencias descritas anteriormente bajo los epígrafes A. y B. o en los términos de licencia específicos que pudiera tener la aplicación compatible con Workshop o la página de Workshop. Eso incluye, sin limitación, todo tipo de derechos de propiedad intelectual o derechos personales o de patente relacionados con el contenido generado por el usuario o incluidos en él. En particular, con respecto a las aportaciones a Workshop, declara y garantiza que es su autor original (o usted y otros colaboradores si se trata de aportaciones conjuntas y, en ese caso, también que tiene derecho a enviar tales aportaciones a Workshop en nombre de dichos colaboradores).\n" +
                "\n" +
                "Asimismo, declara y garantiza que ni el contenido generado por el usuario en sí ni su envío ni la concesión de derechos sobre él infringen ningún contrato ni ninguna ley ni normativa aplicables.\n" +
                "\n" +
                "7. RENUNCIAS; LIMITACIÓN DE RESPONSABILIDAD; SIN GARANTÍAS; GARANTÍA LIMITADA Y ACUERDO ⏶\n" +
                "\n" +
                "LA SECCIÓN 7 NO SE APLICA A LOS SUSCRIPTORES DE LA UE.\n" +
                "\n" +
                "PARA LOS SUSCRIPTORES DE AUSTRALIA, ESTE APARTADO 7 NO EXCLUYE, LIMITA NI MODIFICA LA APLICACIÓN DE CUALQUIER GARANTÍA, DERECHO O RECURSO QUE NO SE PUEDA EXCLUIR, LIMITAR O MODIFICAR, INCLUIDOS LOS OTORGADOS POR LA LEY DEL CONSUMIDOR DE AUSTRALIA (ACL). BAJO LA ACL, LAS MERCANCÍAS CONLLEVAN GARANTÍAS, INCLUIDA UNA GARANTÍA DE QUE SEAN DE CALIDAD ACEPTABLE. SI NO SE SATISFACE ESTA GARANTÍA, EL CONSUMIDOR TIENE DERECHO A UN RECURSO (QUE PODRÍA INCLUIR LA REPARACIÓN, SUSTITUCIÓN O REEMBOLSO DE LAS MERCANCÍAS). SI NO SE PUEDE REPARAR NI SUSTITUIR, O SI SUFRE ALGÚN ERROR MAYOR, EL CONSUMIDOR TIENE DERECHO A UN REEMBOLSO.\n" +
                "PARA LOS SUSCRIPTORES DE NUEVA ZELANDA, ESTE APARTADO 7 NO EXCLUYE, LIMITA NI MODIFICA LA APLICACIÓN DE CUALQUIER DERECHO O RECURSO QUE SE PUEDA EXCLUIR, LIMITAR O MODIFICAR, INCLUIDOS LOS OTORGADOS POR LA LEY DE GARANTÍAS DEL CONSUMIDOR DE NUEVA ZELANDA DE 1993. ESTA LEY OFRECE GARANTÍAS QUE INCLUYEN QUE LOS BIENES Y SERVICIOS SEAN DE UNA CALIDAD ACEPTABLE. EN CASO DE INCUMPLIMIENTO DE ESTA GARANTÍA, EL CONSUMIDOR DISPONE DE DERECHOS DE RECURSO SOBRE EL SOFTWARE (LO QUE PUEDE INCLUIR LA REPARACIÓN, LA SUSTITUCIÓN O EL REEMBOLSO). SI NO ES POSIBLE PRESTAR UN RECURSO O EL FALLO ES GRAVE, LA LEY ESTABLECE EL REEMBOLSO DEL IMPORTE ABONADO.\n" +
                "Antes de adquirir una suscripción, debe consultar la información del producto suministrada en Steam, incluidos la descripción de la suscripción, los requisitos técnicos mínimos y las críticas de los usuarios.\n" +
                "\n" +
                "A. RENUNCIAS\n" +
                "\n" +
                "HASTA DONDE LO PERMITAN LAS LEYES CORRESPONDIENTES, VALVE, SUS EMPRESAS ASOCIADAS Y SUS PROVEEDORES DE SERVICIOS RENUNCIAN DE FORMA EXPRESA A (I) CUALQUIER GARANTÍA SOBRE STEAM, LOS CONTENIDOS Y SERVICIOS DE STEAM Y LOS ARTÍCULOS COMERCIALES, Y (II) CUALQUIER OBLIGACIÓN DE DERECHO CONSUETUDINARIO EN RELACIÓN CON STEAM, LOS CONTENIDOS Y SERVICIOS, Y LAS SUSCRIPCIONES, INCLUIDAS LAS OBLIGACIONES POR AUSENCIA DE NEGLIGENCIA Y AUSENCIA DE ESFUERZO RAZONABLE Y DILIGENCIA. STEAM, LOS CONTENIDOS Y SERVICIOS, LAS SUSCRIPCIONES Y CUALQUIER INFORMACIÓN DISPONIBLE RELACIONADA CON ELLOS SE PROPORCIONAN «TAL CUAL», «SEGÚN DISPONIBILIDAD», «CON TODOS LOS DEFECTOS» Y SIN NINGÚN TIPO DE GARANTÍA, YA SEA EXPRESA O IMPLÍCITA, INCLUIDAS PERO SIN LIMITARSE A ELLAS, LAS GARANTÍAS IMPLÍCITAS DE COMERCIALIZACIÓN, ADECUACIÓN PARA UN DETERMINADO FIN O DE NO VIOLACIÓN DE DERECHOS. QUEDA EXCLUIDA DE MANERA EXPRESA CUALQUIER GARANTÍA CONTRA LA INFRACCIÓN DE DERECHOS QUE PUDIERA QUEDAR RECOGIDA EN EL APARTADO 2-312 DEL «UNIFORM COMMERCIAL CODE» DE ESTADOS UNIDOS O EN CUALQUIER OTRO CÓDIGO ESTATAL COMPARABLE. ASIMISMO, NO EXISTE NINGUNA GARANTÍA DE TITULARIDAD, NO INTERFERENCIA EN SU DISFRUTE NI AUTORIDAD EN RELACIÓN CON STEAM, LOS CONTENIDOS Y SERVICIOS, LAS SUSCRIPCIONES O LA INFORMACIÓN DISPONIBLE RELATIVA A ELLOS.\n" +
                "\n" +
                "QUEDA EXCLUIDA DE MANERA EXPRESA CUALQUIER GARANTÍA CONTRA CUALQUIER INFRACCIÓN QUE PUDIERA QUEDAR RECOGIDA EN EL APARTADO 2-312 DEL «UNIFORM COMMERCIAL CODE» DE ESTADOS UNIDOS.\n" +
                "\n" +
                "B. LIMITACIÓN DE RESPONSABILIDAD\n" +
                "\n" +
                "HASTA DONDE LO PERMITAN LAS LEYES CORRESPONDIENTES, NI VALVE NI SUS OTORGANTES DE LICENCIAS NI SUS EMPRESAS ASOCIADAS NI NINGUNO DE LOS PROVEEDORES DE SERVICIOS DE VALVE SERÁN RESPONSABLES EN MODO ALGUNO POR LAS PÉRDIDAS O DAÑOS DE CUALQUIER NATURALEZA DERIVADOS DEL USO O LA IMPOSIBILIDAD DE USAR STEAM, LA CUENTA Y LOS CONTENIDOS Y SERVICIOS, INCLUIDOS PERO SIN LIMITARSE A ELLOS, LA PÉRDIDA DE FONDO DE COMERCIO, LA INTERRUPCIÓN DE TRABAJOS, LOS FALLOS O ERRORES INFORMÁTICOS O CUALQUIER OTRO DAÑO O PÉRDIDA COMERCIAL. VALVE NO SERÁ RESPONSABLE EN NINGÚN CASO DE DAÑOS INDIRECTOS, INCIDENTALES, CONSECUENTES, ESPECIALES, PUNITIVOS NI EJEMPLARES NI DE CUALQUIER OTRO TIPO QUE PUDIERAN DEPENDER O DERIVARSE DE CUALQUIER MODO DE STEAM, LOS CONTENIDOS Y SERVICIOS, LAS SUSCRIPCIONES Y CUALQUIER INFORMACIÓN DISPONIBLE RELACIONADA CON ELLOS NI DEL RETRASO O LA IMPOSIBILIDAD DE USO DE LOS CONTENIDOS Y SERVICIOS, LAS SUSCRIPCIONES O CUALQUIER INFORMACIÓN, INCLUSO EN CASO DE ERROR, AGRAVIO (INCLUIDA NEGLIGENCIA), RESPONSABILIDAD ESTRICTA Y RUPTURA DE CONTRATO O DE LA GARANTÍA DE VALVE, NI SIQUIERA EN EL CASO DE QUE SE HUBIERA INFORMADO A VALVE DE LA POSIBILIDAD DE DICHOS DAÑOS. ESTAS LIMITACIONES Y EXCLUSIONES DE RESPONSABILIDAD SON APLICABLES INCLUSO EN EL SUPUESTO DE QUE ALGÚN RECURSO LEGAL NO PROPORCIONE UN RESARCIMIENTO ADECUADO.\n" +
                "\n" +
                "DEBIDO A QUE ALGUNOS PAÍSES O JURISDICCIONES NO PERMITEN LA EXCLUSIÓN O LA LIMITACIÓN DE LA RESPONSABILIDAD POR DAÑOS INCIDENTALES O DERIVADOS, EN DICHOS PAÍSES O JURISDICCIONES, LA RESPONSABILIDAD DE VALVE, SUS OTORGANTES DE LICENCIAS Y SUS EMPRESAS ASOCIADAS SE LIMITARÁ HASTA DONDE LO PERMITAN LAS LEYES LOCALES VIGENTES.\n" +
                "\n" +
                "C. SIN GARANTÍAS\n" +
                "\n" +
                "HASTA DONDE LO PERMITAN LAS LEYES CORRESPONDIENTES, NI VALVE NI SUS EMPRESAS ASOCIADAS GARANTIZAN LA CONTINUIDAD, LA AUSENCIA DE ERRORES, LA AUSENCIA DE VIRUS NI LA SEGURIDAD DEL FUNCIONAMIENTO Y EL ACCESO A STEAM, LOS CONTENIDOS Y SERVICIOS, LA CUENTA DEL USUARIO Y SUS SUSCRIPCIONES O CUALQUIER INFORMACIÓN DISPONIBLE Y RELACIONADA CON ELLOS.\n" +
                "\n" +
                "D. GARANTÍA LIMITADA Y ACUERDO\n" +
                "\n" +
                "DETERMINADO HARDWARE ADQUIRIDO A VALVE ESTÁ SUJETO A UNA GARANTÍA LIMITADA Y UN ACUERDO [O, EN FUNCIÓN DE SU UBICACIÓN, UNA GARANTÍA LEGAL], DESCRITA EN DETALLE AQUÍ.\n" +
                "\n" +
                "8. MODIFICACIONES AL PRESENTE ACUERDO ⏶\n" +
                "\n" +
                "NOTA: Si es un consumidor con lugar de residencia en Alemania, se le aplica una versión diferente del apartado 8, que está disponible aquí.\n" +
                "\n" +
                "A. Modificación mutua\n" +
                "\n" +
                "Este Acuerdo podrá modificarse en cualquier momento de mutuo acuerdo mediante su consentimiento expreso a los cambios propuestos por Valve.\n" +
                "\n" +
                "B. Modificación unilateral\n" +
                "\n" +
                "Asimismo, Valve se reserva el derecho a modificar el presente acuerdo (incluidos los términos de suscripción y las normas de uso) de forma unilateral en cualquier momento y a su exclusiva discreción. En este caso, se le notificará por correo electrónico de cualquier modificación del presente Acuerdo realizada por Valve en un plazo de al menos treinta (30) días antes de la entrada en vigor de dicha modificación. Puede consultar el acuerdo en cualquier momento en http://www.steampowered.com/. La no cancelación de su cuenta antes de la entrada en vigor del cambio constituirá su aceptación de los términos modificados. Si no acepta las modificaciones o alguno de los términos del presente acuerdo, su único recurso es cancelar su cuenta o dejar de utilizar las suscripciones afectadas. Valve no tendrá obligación alguna de devolver las cantidades que se hayan podido cobrar en la cuenta antes de la cancelación de esta o de que deje de utilizar alguna suscripción; así mismo, bajo estas circunstancias, Valve tampoco tendrá ninguna obligación de devolver la parte proporcional de gasto alguno.\n" +
                "\n" +
                "9. VIGENCIA Y FINALIZACIÓN ⏶\n" +
                "\n" +
                "A. Vigencia\n" +
                "\n" +
                "La vigencia del presente acuerdo («vigencia») comienza en la fecha en que usted dio su primera aceptación de estos términos, y continuará hasta su rescisión, según lo estipulado en este acuerdo.\n" +
                "\n" +
                "B. Finalización por parte de usted\n" +
                "\n" +
                "Puede cancelar su cuenta en cualquier momento. Puede dejar de utilizar una suscripción en cualquier momento o, si lo prefiere, puede solicitar que Valve cancele su acceso a una suscripción. No obstante, las suscripciones no son transferibles e, incluso si su acceso a una suscripción para un determinado juego o una aplicación concreta ha finalizado, la clave de activación original no podrá registrarse para ninguna otra cuenta, ni siquiera si la suscripción se ha obtenido en un comercio minorista. El acceso a las suscripciones adquiridas como parte de un paquete o conjunto no se puede cancelar de forma individual; al cancelar el acceso a uno de los juegos que componen el conjunto, se cancelará el acceso a todos los juegos adquiridos en el paquete. En el caso de que usted cancele una cuenta o deje de utilizar cualquier suscripción o solicite que se cancele el acceso a una suscripción, no tendrá derecho a recibir la devolución de cargo alguno ni a que se le reembolse el pago que hiciera por la suscripción. Valve se reserva el derecho a cobrar los cargos, recargos o costes realizados antes de la cancelación de la cuenta o de que usted dejara de tener acceso a una determinada suscripción. Además, usted es responsable de cualquier cargo al que se hubiera comprometido con distribuidores o proveedores de contenido antes de que procediera a la cancelación.\n" +
                "\n" +
                "C. Finalización por parte de Valve\n" +
                "\n" +
                "Valve puede cancelar su cuenta o cualquier suscripción en cualquier momento en caso de que (a) Valve deje de proporcionar ese tipo de suscripción en general a suscriptores en situaciones similares o (b) usted incumpla cualquiera de los términos del presente acuerdo (incluidos los términos de suscripción y las normas de uso). En el caso de que Valve cancele o rescinda su cuenta o una suscripción concreta por el incumplimiento de este acuerdo o por actividades inadecuadas o delictivas, usted no recibirá ningún reembolso ni se le devolverán los cargos por suscripción ni los fondos no usados de su cartera de Steam.\n" +
                "\n" +
                "D. Vigencia de los términos\n" +
                "\n" +
                "Los apartados 2.C., 2.D., 2.F., 2.G., 3.A., 3.B., 3.D., 3.H. y del 5 al 12 seguirán vigentes al término o a la finalización del presente acuerdo.\n" +
                "\n" +
                "10. LEGISLACIÓN, MEDIACIÓN, JURISDICCIÓN O COSTAS LEGALES APLICABLES ⏶\n" +
                "\n" +
                "Para todos los clientes fuera de la Unión Europea:\n" +
                "\n" +
                "Usted y Valve aceptan que este acuerdo se ha establecido y ejecutado en el estado de Washington (EE. UU.) y que cualquier disputa que surja se resolverá según las leyes de Washington, excluidas la ley de conflictos y la Convención de las Naciones Unidas sobre los contratos de compraventa internacional de mercancías en lo referente a: (i) cualquier aspecto de la relación entre ustedes y nosotros; (ii) este acuerdo, o (iii) el uso que usted haga de Steam, su cuenta o los contenidos y servicios; a menos que la ley federal sobre arbitraje estadounidense (Federal Arbitration Act) rija el arbitraje si las leyes de su país lo permiten. Según lo estipulado más adelante en el apartado 11 (Resolución de conflictos/Arbitraje vinculante/Renuncia a demandas colectivas), usted y Valve acceden a que cualquier reclamación interpuesta mediante un proceso legal se iniciará y continuará de forma exclusiva en cualquier tribunal estatal o federal con sede en King County, Washington, y que dicho tribunal tendrá competencia en el asunto. Por el presente acuerdo, usted y Valve reconocen la jurisdicción exclusiva de dicho tribunal. En cualquier disputa que surja a partir de este acuerdo o en relación con él, su uso de Steam, su cuenta o el contenido y servicios, la parte a la que el tribunal dé la razón tendrá derecho a que se le compensen los gastos y las costas legales (excepto en caso de arbitraje, consulte el apartado 11.C.)\n" +
                "\n" +
                "Para clientes de la UE:\n" +
                "\n" +
                "En caso de conflicto relativo a la interpretación, prestación o validez del presente acuerdo de suscriptor, se buscará una solución amistosa entre las partes antes de proceder a cualquier acción legal. Puede presentar su queja en http://help.steampowered.com. En caso de que la queja no se resuelva satisfactoriamente podrá, en el plazo de un año desde su presentación, recurrir a un proceso de resolución de disputas alternativo mediante la presentación de una queja en línea en la plataforma de resolución de litigios en línea de la Comisión Europea: https://webgate.ec.europa.eu/odr/main/index.cfm?event=main.home.chooseLanguage.\n" +
                "\n" +
                "En el caso de que sea imposible una resolución extrajudicial, se podrá presentar el conflicto ante los tribunales competentes.\n" +
                "\n" +
                "11. RESOLUCIÓN DE CONFLICTOS/ARBITRAJE VINCULANTE/RENUNCIA A DEMANDAS COLECTIVAS ⏶\n" +
                "\n" +
                "Este apartado 11 se aplicará hasta el máximo permitido por las leyes vigentes. EN PARTICULAR, EL APARTADO 11 NO SE APLICA SI RESIDE EN LA PROVINCIA DE QUEBEC (CANADÁ) O EN LA UNIÓN EUROPEA.\n" +
                "\n" +
                "La mayoría de los problemas de los usuarios se puede resolver mediante nuestro sitio de atención al cliente de Steam, en https://support.steampowered.com/. Si Valve no logra resolver su problema y sigue habiendo motivo de conflicto entre usted y Valve, en este apartado se explica cómo nos comprometemos a resolverlo.A.\n" +
                "\n" +
                "A. Debe arbitrar todas las reclamaciones, excepto las relacionadas con IP, uso no autorizado, piratería o robo\n" +
                "\n" +
                "USTED Y NOSOTROS, VALVE, ACORDAMOS RESOLVER TODOS LOS CONFLICTOS Y RECLAMACIONES QUE SURJAN ENTRE LAS DOS PARTES MEDIANTE UN MECANISMO DE ARBITRAJE VINCULANTE E INDIVIDUAL. ESO INCLUYE, SIN LIMITACIÓN, CUALQUIER RECLAMACIÓN RESULTANTE O RELACIONADA CON: (I) CUALQUIER ASPECTO DE LA RELACIÓN ENTRE USTEDES Y NOSOTROS; (II) ESTE ACUERDO, O (III) EL USO QUE HAGA DE STEAM, SU CUENTA, EL HARDWARE O LOS CONTENIDOS Y SERVICIOS. SE APLICARÁ INDEPENDIENTEMENTE DE SI DICHAS RECLAMACIONES SON DE CARÁCTER CONTRACTUAL O POR AGRAVIOS, INFRACCIÓN DE LEYES, FRAUDE, COMPETENCIA DESLEAL, FALSAS DECLARACIONES O TIENEN CUALQUIER OTRA BASE LEGAL, E INCLUYE TODAS LAS RECLAMACIONES EN NOMBRE DE TERCEROS.\n" +
                "\n" +
                "No obstante, el apartado 11 no se aplica a los siguientes tipos de reclamaciones o conflictos, que usted o Valve pueden presentar ante cualquier tribunal competente: (i) reclamaciones o infracciones u otros malos usos de los derechos de propiedad intelectual, incluidas las reclamaciones que soliciten medidas cautelares, y (ii) reclamaciones relacionadas con cualquier uso supuestamente no autorizado, piratería o robo, o que se deriven de él.\n" +
                "\n" +
                "El apartado 11 no impide que usted lleve su conflicto ante cualquier organismo oficial federal, estatal o local que pueda, si la ley lo permite, solicitarnos una rectificación a favor de usted.\n" +
                "\n" +
                "El arbitraje consiste en presentar el motivo de un conflicto ante un mediador neutral, en vez de ante un juez o un jurado. El arbitraje es menos formal que una demanda judicial, y el proceso de presentación de pruebas es mucho menos exhaustivo. Sigue unas reglas distintas a las de los juicios ante un tribunal, y está sujeto a una revisión muy limitada por parte de los tribunales. El mediador emitirá una decisión por escrito y razonará los motivos de su fallo, si cualquiera de las dos partes lo solicita. USTED COMPRENDE QUE USTED Y VALVE RENUNCIAN AL DERECHO A LLEVAR SUS CONFLICTOS ANTE UN TRIBUNAL ASÍ COMO SOMETERLOS A UN JUICIO ANTE UN JUEZ O UN JURADO.\n" +
                "\n" +
                "B. Resolver una disputa de manera informal antes\n" +
                "\n" +
                "Usted y Valve están de acuerdo en hacer todos los esfuerzos razonables y de buena fe para resolver de manera informal cualquier conflicto, antes de iniciar un proceso de arbitraje. Si una de las partes decide recurrir al arbitraje, primero deberá enviar a la otra un aviso por escrito que describa la naturaleza de la reclamación o conflicto y que indique el tipo de compensación que se solicita. Si usted y Valve no llegan a un acuerdo para resolver esa reclamación o ese conflicto dentro de los 30 días siguientes a la recepción de ese aviso, usted o Valve pueden iniciar el proceso de arbitraje. Debe enviarse un aviso por escrito mediante correo postal a Valve a la siguiente dirección: ATTN: Arbitration Notice, Valve Corporation, P.O. Box 1688, Bellevue, WA 98004 (EE. UU.)».\n" +
                "\n" +
                "C. Normas y costas de arbitraje\n" +
                "\n" +
                "La ley federal sobre arbitraje estadounidense (Federal Arbitration Act) se aplicará en el apartado 11 si las leyes de su país lo permiten. El arbitraje se regirá por las normas de arbitraje de cliente (Consumer Arbitration Rules) o las normas de arbitraje comerciales, en caso de que las normas de arbitraje de cliente no se puedan aplicar, de la asociación de arbitraje de Estados Unidos («AAA») según lo modificado mediante este acuerdo. Las normas están disponibles en http://www.adr.org. El mediador está obligado a actuar según los términos de este acuerdo.\n" +
                "\n" +
                "La AAA administrará el arbitraje. Fuera de los EE.UU., Valve seleccionará a un proveedor de servicios de arbitraje que emplee dichas normas o similares. Este puede realizarse mediante la presentación de documentos, por teléfono o en persona en el lugar en el que usted viva o en otro lugar decidido de mutuo acuerdo.\n" +
                "\n" +
                "Si usted reclama una compensación de 10 000 USD o inferior, Valve accede a reembolsarle las tasas de solicitud y la parte que le corresponda a usted de los costes del arbitraje, incluida su parte de la compensación al mediador, a no ser que este determine que, a su criterio, sus reclamaciones son frívolas o se han clasificado por acoso. Valve accede a no solicitar compensación por los costes o los honorarios de sus abogados a no ser que el mediador determine que la reclamación que usted ha presentado es frívola o se ha presentado como una forma de acoso. Si desea una compensación superior a 10 000 USD y las normas de arbitraje de cliente (Consumer Arbitration Rules) de la AAA no se aplican, los costes del arbitraje, incluida la retribución para el mediador, se dividirán entre usted y Valve, según las Normas de Arbitraje comercial de la AAA.\n" +
                "\n" +
                "D. Arbitraje vinculante e individual únicamente\n" +
                "\n" +
                "USTED Y VALVE ACUERDAN NO INICIAR NI PARTICIPAR EN UNA DEMANDA COLECTIVA O REPRESENTATIVA, UNA ACCIÓN GENERAL CON ABOGADO PRIVADO, UNA ACCIÓN ALERTADORA O UN ARBITRAJE DE CLASE, COLECTIVO O REPRESENTATIVO, INCLUSO EN EL CASO DE QUE LAS NORMAS DE LA AAA LO PERMITAN. EL MEDIADOR PUEDE CONCEDER UNA COMPENSACIÓN SOLO A FAVOR DE LA PARTE QUE SOLICITE COMPENSACIÓN Y SOLO HASTA EL PUNTO DE LO RECLAMADO POR LA PARTE INDIVIDUAL. Asimismo, usted y Valve acuerdan no buscar combinar ninguna acción legal o arbitraje con cualquier otra acción legal o arbitraje, sin el consentimiento de todas las partes firmantes de este acuerdo y de todas las demás acciones legales o arbitrajes.\n" +
                "\n" +
                "Este acuerdo no permite el arbitraje de clase, colectivo ni representativo. Un tribunal posee autoridad exclusiva para regir cualquier afirmación que lo haga.\n" +
                "\n" +
                "E. Si parte del apartado 11 se considerara ilegal o no practicable\n" +
                "\n" +
                "Si cualquier parte del apartado 11 (Resolución de conflictos/arbitraje vinculante/renuncia a demandas colectivas) se considerara ilegal o no practicable, el resto permanecerá en vigor (con un laudo arbitral emitido antes del inicio de cualquier proceso judicial), a menos que el hecho de que se considere ilegal o no practicable permita un arbitraje de clase, colectivo o representativo, en cuyo caso todo el apartado 11 quedará inhabilitado y la reclamación o disputa se resolverá en un tribunal.\n" +
                "\n" +
                "12. VARIOS ⏶\n" +
                "\n" +
                "Salvo estipulación expresa en contrario en este acuerdo, en el caso de que un mediador o un tribunal competente dictamine que alguna de las disposiciones de este acuerdo es ilegal o no practicable, esa disposición se aplicará hasta el máximo permitido y el resto del acuerdo se mantendrá plenamente vigente y aplicable. El apartado 11.E. rige si algunas partes del apartado 11 (Resolución de conflictos/arbitraje vinculante/renuncia a demandas colectivas) se consideran ilegales o no practicables. Este acuerdo, incluidos cualquier término de suscripción, las normas de uso y la política de confidencialidad de Valve, así como la política de garantía de hardware limitada de Valve, constituye y contiene el acuerdo completo entre las partes en cuanto al objeto del contrato y sustituye a cualquier acuerdo oral o escrito previo. Usted acepta que el presente acuerdo no pretende conceder ni concede ningún derecho o recurso a personas que no sean las firmantes de este acuerdo.\n" +
                "\n" +
                "Las obligaciones de Valve están sujetas a las leyes vigentes y a los procesos legales, y Valve puede cumplir con las solicitudes de aplicación de la ley, a pesar de que algún término pueda entrar en conflicto.\n" +
                "\n" +
                "Usted acepta cumplir todas las leyes y normativas de importación y exportación aplicables. Usted acepta no exportar los contenidos y servicios o el hardware ni permitir el uso de su cuenta por parte de individuos de cualquier país partidario del terrorismo para los que la oficina de administración de exportaciones de EE. UU. haya decretado una restricción de las exportaciones cifradas en el momento de la exportación. Usted declara y garantiza que no se encuentra en ninguno de esos países prohibidos y que no está bajo su control ni es ciudadano o residente en ellos.\n" +
                "\n" +
                "Este acuerdo se actualizó por última vez el 28 de agosto de 2020 (\"Fecha de revisión\"). Si ya era suscriptor antes de esta fecha de revisión, este acuerdo sustituye al acuerdo existente entre usted y Valve o Valve SARL en el día que entró en vigor según lo estipulado en el apartado 8 anterior.");

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_registrarFragment);
            }
        });
    }
}