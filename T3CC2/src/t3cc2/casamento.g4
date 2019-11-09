grammar casamento;

programa:
    'casamento:' titulo
    'data:' data
    'numero_de_convidados:' numConvidados
    'padrinhos:' listaPadrinhos
    'presentes:' listaPresentes
    'convidados:' listaConvidados
    'servicos:' listaServicos
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
    '[' 
        presente* 
    ']'
;

presente:
    '{'
        descricao=STRING ','
        url=URL ','
        '[' (NOME (',' NOME)*)? ']'
    '}'
;

listaConvidados:
    '['
        STRING (',' STRING)*
    ']'
;

listaServicos:
    '['
          'fotografo:' fotografo
        | 'buffet:' buffet
        | 'cerimonial:' cerimonial
        | 'local:' local
        | 'musica:' musica
        | 'decoracao:' decoracao
        | 'convites:' convites
        | 'lua_de_mel:' lua_de_mel
    ']'
;

fotografo:
    '{' 
        'nome:' STRING
        'contato:' NUM_INT
        'preco:' 'R$' NUM_REAL
    '}'
;

buffet:
    '{'
        'nome:' STRING
        'contato:' NUM_INT
        'preco:' 'R$' NUM_REAL
    '}'
;

cerimonial:
    '{'
        'nome:' STRING
        'contato:' NUM_INT
        'preco:' 'R$' NUM_REAL
    '}'
;

local:
    '{'
        'nome:' STRING
        'endereco:' STRING
        'contato:' NUM_INT
        'preco:' 'R$' NUM_REAL
    '}'
;

musica:
    '{'
        'nome:' STRING
        'contato:' NUM_INT
        'preco:' 'R$' NUM_REAL
        'instrumento:' STRING (',' STRING)*
        'musica:' STRING (',' STRING)*
    '}'
;

decoracao:
    '{'
        'nome:' STRING
        'contato:' NUM_INT
        'preco:' 'R$' NUM_REAL
        ('itens_decoracao:' STRING)?
    '}'
;

convites:
    '{'
        'nome:' STRING
        'contato:' NUM_INT
        'quantidade_convites:' NUM_INT
        'preco_unidade:' 'R$' NUM_REAL
    '}'
;

lua_de_mel:
    '{'
        'local:' STRING
        'hospedagem:' STRING
        'contato_hospedagem:' NUM_INT
        'preco_total:' 'R$' NUM_REAL
        'data_ida:' DATA
        'data_volta:' DATA
        'valor_passagem:' 'R$' NUM_REAL
    '}'
;

NOME: ('a'..'z') ('a'..'z')
;

STRING: ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
;

DATA: ('0'..'3') ('0'..'9') '/' ('0'..'1') ('0'..'9') '/' ('0'..'2') ('0'..'9') ('0'..'9') ('0'..'9')
;

NUM_INT: ('0'..'9')+
;

NUM_REAL : ('0' .. '9')+ '.' ('0' .. '9')+
;

URL: 'h' 't' 't' 'p' ':' '/' '/' 'w' 'w' 'w' '.' ('a'..'z')+ '.' 'c' 'o' 'm' ('/')? ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' | '?' | '.' | '=' | '/')*
;