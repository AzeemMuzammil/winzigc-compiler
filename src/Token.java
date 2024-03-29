public enum Token {
    UNKNOWN,
    EOF,

    SYM_DOT,
    SYM_COMMA,
    SYM_COLLON,
    SYM_SEMI_COLLON,
    BRACKET_LPARAN,
    BRACKET_RPARAN,

    OP_EQ,
    OP_PLUS,
    OP_MINUS,
    OP_MUL,
    OP_DIV,
    OP_LT,
    OP_LTEQ,
    OP_GT,
    OP_GTEQ,
    OP_NOTEQ,
    OP_MOD,
    OP_AND,
    OP_OR,
    OP_NOT,

    IDENTIFIER,

    TYPE_INT,
    TYPE_CHAR,
    TYPE_STRING,

    COMMENT,
    WHITE_SPACE,
    NEW_LINE,

    KWORD_PROGRAM,
    KWORD_VAR,
    KWORD_CONST,
    KWORD_TYPE,
    KWORD_FUNCTION,
    KWORD_RETURN,
    KWORD_BEGIN,
    KWORD_END,
    KWORD_SWAP,
    KWORD_ASSIGN,
    KWORD_OUTPUT,
    KWORD_IF,
    KWORD_THEN,
    KWORD_ELSE,
    KWORD_WHILE,
    KWORD_DO,
    KWORD_CASE,
    KWORD_OF,
    KWORD_CASE_EXP,
    KWORD_OTHERWISE,
    KWORD_REPEAT,
    KWORD_FOR,
    KWORD_UNTIL,
    KWORD_LOOP,
    KWORD_POOL,
    KWORD_EXIT,
    KWORD_READ,
    KWORD_SUCC,
    KWORD_PRED,
    KWORD_CHAR,
    KWORD_ORD,
    KWORD_EOP
}