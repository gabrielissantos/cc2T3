grammar casamento;

programa:
    titulo
    data
    numConvidados
    listaPadrinhos
    listaPresentes
    listaConvidados
    listaServicos
;

titulo:
    'casamento' ':' STRING
;

data:
    'data' ':' DATA
;

numConvidados:
    'convidados' ':' NUM_INT
;

listaPadrinhos:
    '['
        NOME ':' STRING
    ']'
;

listaPresentes:
    '[' presente* ']'
;

presente:
    descricao=STRING ','
    url=URL ','
    '[' (NOME (',' NOME)*)? ']'
;



NOME: <igual variavel>

STRING: ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
      ;

DATA: ('0'..'3') ('0'..'9') '/' ('0'..'1') ('0'..'9') '/' ('0'..'1') ('0'..'9') ('0'..'1') ('0'..'9')

URL:
