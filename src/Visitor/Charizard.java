package Visitor;

public class Charizard extends PokemonState {
    public void attack() {
        System.out.println("Charizard uses Fire Blast!");
        System.out.println("            .\"-,.__\n" +
                "                 `.     `.  ,\n" +
                "              .--'  .._,'\"-' `.\n" +
                "             .    .'         `'\n" +
                "             `.   /          ,'\n" +
                "               `  '--.   ,-\"'\n" +
                "                `\"`   |  \\\n" +
                "                   -. \\, |\n" +
                "                    `--Y.'      ___.\n" +
                "                         \\     L._, \\\n" +
                "               _.,        `.   <  <\\                _\n" +
                "             ,' '           `, `.   | \\            ( `\n" +
                "          ../, `.            `  |    .\\`.           \\ \\_\n" +
                "         ,' ,..  .           _.,'    ||\\l            )  '\".\n" +
                "        , ,'   \\           ,'.-.`-._,'  |           .  _._`.\n" +
                "      ,' /      \\ \\        `' ' `--/   | \\          / /   ..\\\n" +
                "    .'  /        \\ .         |\\__ - _ ,'` `        / /     `.`.\n" +
                "    |  '          ..         `-...-\"  |  `-'      / /        . `.\n" +
                "    | /           |L__           |    |          / /          `. `.\n" +
                "   , /            .   .          |    |         / /             ` `\n" +
                "  / /          ,. ,`._ `-_       |    |  _   ,-' /               ` \\\n" +
                " / .           \\\"`_/. `-_ \\_,.  ,'    +-' `-'  _,        ..,-.    \\`.\n" +
                ".  '         .-f    ,'   `    '.       \\__.---'     _   .'   '     \\ \\\n" +
                "' /          `.'    l     .' /          \\..      ,_|/   `.  ,'`     L`\n" +
                "|'      _.-\"\"` `.    \\ _,'  `            \\ `.___`.'\"`-.  , |   |    | \\\n" +
                "||    ,'      `. `.   '       _,...._        `  |    `/ '  |   '     .|\n" +
                "||  ,'          `. ;.,.---' ,'       `.   `.. `-'  .-' /_ .'    ;_   ||\n" +
                "|| '              V      / /           `   | `   ,'   ,' '.    !  `. ||\n" +
                "||/            _,-------7 '              . |  `-'    l         /    `||\n" +
                ". |          ,' .-   ,' ||               | .-.        `.      .'     ||\n" +
                " `'        ,'    `\".'    |               |    `.        '. -.'       `'\n" +
                "          /      ,'      |               |,'    \\-.._,.'/'\n" +
                "          .     /        .               .       \\    .''\n" +
                "        .`.    |         `.             /         :_,'.'\n" +
                "          \\ `...\\   _     ,'-.        .'         /_.-'\n" +
                "           `-.__ `,  `'   .  _.>----''.  _  __  /\n" +
                "                .'        /\"'          |  \"'   '_\n" +
                "               /_|.-'\\ ,\".             '.'`__'-( \\\n" +
                "                 / ,\"'\"\\,'               `/  `-.|\" ");
    }

    public void move() {
        System.out.println("Charizard flies around.");
    }

    @Override
    public void evolve() {
    }

    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }

}