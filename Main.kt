import kotlin.math.absoluteValue

enum class MEDIUMFONT(val id: Array<Char>, val top : String, val mid : String, val bot : String, val leng : Int) {
    A(arrayOf('A', 'a'),"____ ", "|__| ", "|  | ", 5),
    B(arrayOf('B', 'b'), "___  ", "|__] ", "|__] ", 5),
    C(arrayOf('C', 'c'), "____ ", "|    ", "|___ ",5),
    D(arrayOf('D', 'd'), "___  ", "|  \\ ", "|__/ ",5),
    E(arrayOf('E','e'),"____ ","|___ ", "|___ ", 5),
    F(arrayOf('F','f'),"____ ","|___ ", "|    ", 5),
    G(arrayOf('G','g'),"____ ","| __ ", "|__] ", 5),
    H(arrayOf('H','h'),"_  _ ","|__| ", "|  | ", 5),
    I(arrayOf('I','i'),"_ ","| ", "| ", 2),
    J(arrayOf('J','j')," _ "," | ", "_| ", 3),
    K(arrayOf('K','k'),"_  _ ","|_/  ", "| \\_ ", 5),
    L(arrayOf('L','l'),"_    ","|    ", "|___ ",5),
    M(arrayOf('M','m'),"_  _ ","|\\/| ", "|  | ", 5),
    N(arrayOf('N','n'),"_  _ ","|\\ | ", "| \\| ",5),
    O(arrayOf('O','o'),"____ ","|  | ", "|__| ",5),
    P(arrayOf('P','p'),"___  ","|__] ", "|    ",5),
    Q(arrayOf('Q','q'),"____ ","|  | ", "|_\\| ",5),
    R(arrayOf('R','r'),"____ ","|__/ ", "|  \\ ",5),
    S(arrayOf('S','s'),"____ ","[__  ", "___] ",5),
    T(arrayOf('T','t'),"___ "," |  ", " |  ",4),
    U(arrayOf('U','u'),"_  _ ","|  | ", "|__| ",5),
    V(arrayOf('V','v'),"_  _ ","|  | ", " \\/  ",5),
    W(arrayOf('W','w'),"_ _ _ ","| | | ", "|_|_| ",6),
    X(arrayOf('X','x'),"_  _ "," \\/  ", "_/\\_ ",5),
    Y(arrayOf('Y','y'),"_   _ "," \\_/  ", "  |   ",6),
    Z(arrayOf('Z','z'),"___  ","  /  ", " /__ ",5),
    SPACE(arrayOf(' '), "     ", "     ", "     ", 5),
    ERROR(arrayOf('~'),"*top*","*mid*", "*bot*", 0);

    companion object {
        fun getLetter (letter: Char) : MEDIUMFONT {
            for (enum in MEDIUMFONT.values()) {
                if (enum.id.contains(letter)) return enum
            }
            return SPACE
        }
        fun printTop(name: Char) = print(getLetter(name).top)
        fun printMid(name: Char) = print(getLetter(name).mid)
        fun printBot(name: Char) = print(getLetter(name).bot)
        fun getLength(name: Char): Int = getLetter(name).leng
    }
}
//
enum class ROMANLETTERS(val id: Char, val strings: Array<String> = arrayOf(), val leng : Int) {
    a('a', arrayOf("          "     , "          "   , " .oooo.   "      , "`P  )88b  "     , " .oP\"888  "     , "d8(  888  "      , "`Y888\"\"8o "    , "          "  , "          "  , "          "),10),
    b('b', arrayOf(" .o8       "    , "\"888       " , " 888oooo.  "     , " d88' `88b "    , " 888   888 "     , " 888   888 "     , " `Y8bod8P' "     , "           " , "           " , "           "),11),
    c('c', arrayOf("          "     , "          "   , " .ooooo.  "      , "d88' `\"Y8 "    , "888       "      , "888   .o8 "      , "`Y8bod8P' "      , "          "  , "          "  , "          "),10),
    d('d', arrayOf("      .o8  "    , "     \"888  " , " .oooo888  "     , "d88' `888  "    , "888   888  "     , "888   888  "     , "`Y8bod88P\" "    ,"           "  , "           " , "           "),11),
    e('e', arrayOf("          "     , "          "   , " .ooooo.  "      , "d88' `88b "     , "888ooo888 "      , "888    .o "      , "`Y8bod8P' "      , "          "  , "          "  , "          "),10),
    f('f', arrayOf(" .o88o. "       , " 888 `\" "    , "o888oo  "        , " 888    "       , " 888    "        , " 888    "        , "o888o   "        , "        "    , "        "    , "        "),8),
    g('g', arrayOf("           "    , "           "  , " .oooooooo "     , "888' `88b  "    , "888   888  "     , "`88bod8P'  "     , "`8oooooo.  "     ,"d\"     YD  " , "\"Y88888P'  ", "           "),11),
    h('h', arrayOf("oooo        "   , "`888        " , " 888 .oo.   "    , " 888P\"Y88b  "  , " 888   888  "    , " 888   888  "    , "o888o o888o "    ,"            " , "            ", "            "),12),
    i('i', arrayOf(" o8o  "         , " `\"'  "      , "oooo  "          , "`888  "  , " 888  "    , " 888  "    , "o888o "    ,"      "    , "      "  , "      "),                                    6),
    j('j', arrayOf("    o8o "       , "    `\"' "    , "   oooo "  , "   `888 "  , "    888 "    , "    888 "    , "    888 "    ,"    888 "    , ".o. 88P "  , "`Y888P  "), 8),
    k('k', arrayOf("oooo        " , "`888        " , " 888  oooo  "  , " 888 .8P'   "  , " 888888.    "    , " 888 `88b.  "    , "o888o o888o "    ,"            "    , "            "  , "            "), 12),
    l('l', arrayOf("oooo  " , "`888  " , " 888  "  , " 888  "  , " 888  "    , " 888  "    , "o888o "    ,"      "    , "      "  , "      "),                                          6),
    m('m', arrayOf("                  " , "                  " , "ooo. .oo.  .oo.   "  , "`888P\"Y88bP\"Y88b  "  , " 888   888   888  "    , " 888   888   888  ", "o888o o888o o888o " ,"                  " , "                  "  , "                  "), 18),
    n('n', arrayOf("            " , "            ", "ooo. .oo.   ", "`888P\"Y88b  ", " 888   888  ", " 888   888  ", "o888o o888o ","            ", "            "  , "            "), 12),
    o('o', arrayOf("          " , "          ", " .ooooo.  ", "d88' `88b ", "888   888 ", "888   888 ", "`Y8bod8P' ","          ", "          "  , "          "),                       10),
    p('p', arrayOf("           " , "           ", "oo.ooooo.  ", " 888' `88b ", " 888   888 ", " 888   888 ", " 888bod8P' "," 888       ", "o888o      "  , "           "),             11),
    q('q', arrayOf("           " , "           ", " .ooooo oo ", "d88' `888  ", "888   888  ", "888   888  ", "`V8bod888  ","      888. ", "      8P'  "  , "      \"    "), 11),
    r('r', arrayOf("         " , "         ", "oooo d8b ", "`888\"\"8P ", " 888     ", " 888     ", "d888b    ","         ", "         "  , "         "), 9),
    s('s', arrayOf("         " , "         ", " .oooo.o ", "d88(  \"8 ", "`\"Y88b.  ", "o.  )88b ", "8\"\"888P' ","         ", "         "  , "         "), 9),
    t('t', arrayOf("    .   " , "  .o8   ", ".o888oo ", "  888   ", "  888   ", "  888 . ", "  \"888\" ","        ", "        "  , "        "), 8),
    u('u', arrayOf("            " , "            ", "oooo  oooo  ", "`888  `888  ", " 888   888  ", " 888   888  ", " `V88V\"V8P' ","            ", "            "  , "            "), 12),
    v('v', arrayOf("            " , "            ", "oooo    ooo ", " `88.  .8'  ", "  `88..8'   ", "   `888'    ", "    `8'     ","            ", "            "  , "            "), 12),
    w('w', arrayOf("                 " , "                 ", "oooo oooo    ooo ", " `88. `88.  .8'  ", "  `88..]88..8'   ", "   `888'`888'    ", "    `8'  `8'     ","                 ", "                 "  , "                 "), 17),
    x('x', arrayOf("            " , "            ", "oooo    ooo ", " `88b..8P'  ", "   Y888'    ", " .o8\"'88b   ", "o88'   888o ","            ", "            "  , "            "), 12),
    y('y', arrayOf("            " , "            ", "oooo    ooo ", " `88.  .8'  ", "  `88..8'   ", "   `888'    ", "    .8'     ",".o..P'      ", "`Y8P'       "  , "            "), 12),
    z('z', arrayOf("           " , "           ", "  oooooooo ", " d'\"\"7d8P  ", "   .d8P'   ", " .d8P'  .P ", "d8888888P  ", "           ", "           "  , "           "), 11),

    A('A', arrayOf("      .o.       ", "     .888.      ","    .8\"888.     ","   .8' `888.    ", "  .88ooo8888.   ", " .8'     `888.  ", "o88o     o8888o ", "                ","                ", "                "), 16),
    B('B', arrayOf("oooooooooo.  ","`888'   `Y8b "," 888     888 "," 888oooo888' ", " 888    `88b ", " 888    .88P ", "o888bood8P'  ", "             ","             ", "             "), 13),
    C('C', arrayOf("  .oooooo.   "," d8P'  `Y8b  ","888          ","888          ", "888          ", "`88b    ooo  ", " `Y8bood8P'  ", "             ","             ", "             "), 13),
    D('D', arrayOf("oooooooooo.   ","`888'   `Y8b  "," 888      888 "," 888      888 ", " 888      888 ", " 888     d88' ", "o888bood8P'   ", "              ","              ", "              "), 14),
    E('E', arrayOf("oooooooooooo ","`888'     `8 "," 888         "," 888oooo8    ", " 888    \"    ", " 888       o ", "o888ooooood8 ", "             ","             ", "             "), 13),
    F('F', arrayOf("oooooooooooo ","`888'     `8 "," 888         "," 888oooo8    ", " 888    \"    ", " 888         ", "o888o        ", "             ","             ", "             "), 13),
    G('G', arrayOf("  .oooooo.    "," d8P'  `Y8b   ","888           ","888           ", "888     ooooo ", "`88.    .88'  ", " `Y8bood8P'   ", "              ","              ", "              "), 14),
    H('H', arrayOf("ooooo   ooooo ","`888'   `888' "," 888     888  "," 888ooooo888  ", " 888     888  ", " 888     888  ", "o888o   o888o ", "              ","              ", "              "), 14),
    I('I', arrayOf("ooooo " , "`888' ", " 888  ", " 888  ", " 888  ", " 888  ", "o888o ","      ", "      "  , "      "), 6),
    J('J', arrayOf("   oooo " , "   `888 ", "    888 ", "    888 ", "    888 ", "    888 ", ".o. 88P ","`Y888P  ", "        "  , "        "), 8),
    K('K', arrayOf("oooo    oooo ","`888   .8P'  "," 888  d8'    "," 88888[      ", " 888`88b.    ", " 888  `88b.  ", "o888o  o888o ", "             ","             ", "             "), 13),
    L('L', arrayOf("ooooo        ","`888'        "," 888         "," 888         ", " 888         ", " 888       o ", "o888ooooood8 ", "             ","             ", "             "), 13),
    M('M', arrayOf("ooo        ooooo " , "`88.       .888' ", " 888b     d'888  ", " 8 Y88. .P  888  ", " 8  `888'   888  ", " 8    Y     888  ", "o8o        o888o ","                 ", "                 "  , "                 "), 17),
    N('N', arrayOf("ooooo      ooo ", "`888b.     `8' "," 8 `88b.    8  "," 8   `88b.  8  ", " 8     `88b.8  ", " 8       `888  ", "o8o        `8  ", "               ","               ", "               "), 15),
    O('O', arrayOf("  .oooooo.   "," d8P'  `Y8b  ","888      888 ","888      888 ", "888      888 ", "`88b    d88' ", " `Y8bood8P'  ", "             ","             ", "             "), 13),
    P('P', arrayOf("ooooooooo.   ","`888   `Y88. "," 888   .d88' "," 888ooo88P'  ", " 888         ", " 888         ", "o888o        ", "             ","             ", "             "), 13),
    Q('Q', arrayOf("  .oooooo.      ", " d8P'  `Y8b     ","888      888    ","888      888    ", "888      888    ", "`88b    d88b    ", " `Y8bood8P'Ybd' ", "                ","                ", "                "), 16),
    R('R', arrayOf("ooooooooo.   ","`888   `Y88. "," 888   .d88' "," 888ooo88P'  ", " 888`88b.    ", " 888  `88b.  ", "o888o  o888o ", "             ","             ", "             "), 13),
    S('S', arrayOf(" .oooooo..o " , "d8P'    `Y8 ", "Y88bo.      ", " `\"Y8888o.  ", "     `\"Y88b ", "oo     .d8P ", "8\"\"88888P'  ","            ", "            "  , "            "), 12),
    T('T', arrayOf("ooooooooooooo ","8'   888   `8 ","     888      ","     888      ", "     888      ", "     888      ", "    o888o     ", "              ","              ", "              "), 14),
    U('U', arrayOf("ooooo     ooo ","`888'     `8' "," 888       8  "," 888       8  "," 888       8  ", " `88.    .8'  ", "   `YbodP'    ","              ", "              ", "              "), 14),
    V('V', arrayOf("oooooo     oooo ", " `888.     .8'  ","  `888.   .8'   ","   `888. .8'    ", "    `888.8'     ", "     `888'      ", "      `8'       ", "                ","                ", "                "), 16),
    W('W', arrayOf("oooooo   oooooo     oooo ", " `888.    `888.     .8'  " , "  `888.   .8888.   .8'   "  , "   `888  .8'`888. .8'    "  , "    `888.8'  `888.8'     ", "     `888'    `888'      ", "      `8'      `8'       " ,"                         ", "                         ", "                         "), 25),
    X('X', arrayOf("ooooooo  ooooo ", " `8888    d8'  ","   Y888..8P    ","    `8888'     ", "   .8PY888.    ", "  d8'  `888b   ", "o888o  o88888o ", "               ","               ", "               "), 15),
    Y('Y', arrayOf("oooooo   oooo "," `888.   .8'  ","  `888. .8'   ","   `888.8'    ","    `888'     ", "     888      ", "    o888o     ","              ", "              ", "              "), 14),
    Z('Z', arrayOf(" oooooooooooo ","d'\"\"\"\"\"\"d888' ","      .888P   ","     d888'    ","   .888P      ", "  d888'    .P ", ".8888888888P  ","              ", "              ", "              "), 14),
    SPACE(' ', arrayOf("          ", "          ", "          ", "          ", "          ", "          ", "          ", "          ", "          ", "          "), 10);

    companion object {
        fun getLetter (letter: Char) : ROMANLETTERS {
            for (enum in values()) {
                if (enum.id == letter) return enum
            }
            return SPACE
        }
        fun getLength(name: Char): Int = getLetter(name).leng
        fun printLine(name: Char, line: Int) = print(getLetter(name).strings[0 + line])

    }
}

fun main(args: Array<String>) {
    print("Enter name and surname: ")
    val nameAndSurname = readLine().toString().trim()
    print("Enter person's status: ")
    val status = readLine().toString().trim()
    val border = "8"
    val space = " "
    var nameLength = 0
    var sigLength = 0
    for (i in 0..nameAndSurname.lastIndex) nameLength += ROMANLETTERS.getLength(nameAndSurname[i])
    for (i in 0..status.lastIndex) sigLength += MEDIUMFONT.getLength(status[i])
    fun getFirstSpace(nameLength: Int, statusLength: Int): Int = if (nameLength < statusLength) (nameLength - statusLength).absoluteValue / 2 else 0
    fun getSecondSpace(nameLength: Int, statusLength: Int): Int = if (nameLength < statusLength) (nameLength - statusLength).absoluteValue - (nameLength - statusLength).absoluteValue / 2 else 0
    fun topBorder() {
        if (nameLength > sigLength) print(border.repeat(nameLength + 7)) else print(border.repeat(sigLength + 7))
        println(border)
    }
    fun leftBorder() = print("$border$border  " + space.repeat(getFirstSpace(nameLength, sigLength)))
    fun rightBorder() = print(space.repeat(getSecondSpace(nameLength, sigLength)) + "  $border$border\n")
    fun statusPrint() {
        print("$border$border  " + space.repeat(getFirstSpace(sigLength, nameLength)))
        for (i in 0..status.lastIndex) MEDIUMFONT.printTop(status[i])
        print(space.repeat(getSecondSpace(sigLength, nameLength)) + "  $border$border\n")

        print("$border$border  " + space.repeat(getFirstSpace(sigLength, nameLength)))
        for (i in 0..status.lastIndex) MEDIUMFONT.printMid(status[i])
        print(space.repeat(getSecondSpace(sigLength, nameLength)) + "  $border$border\n")

        print("$border$border  " + space.repeat(getFirstSpace(sigLength, nameLength)))
        for (i in 0..status.lastIndex) MEDIUMFONT.printBot(status[i])
        print(space.repeat(getSecondSpace(sigLength, nameLength)) + "  $border$border\n")
    }
    fun printLineRoman(line: Int, name: String) {
        leftBorder()
        for (i in 0..name.lastIndex) ROMANLETTERS.printLine(name[i], line)
        rightBorder()
    }
    topBorder()
    for (i in 0..9) printLineRoman(i, nameAndSurname)
    statusPrint()
    topBorder()
}
