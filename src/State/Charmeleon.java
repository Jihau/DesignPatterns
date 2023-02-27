package State;

public class Charmeleon extends PokemonState {
    public void attack() {
        System.out.println("Charmeleon uses Flamethrower!");
    }

    public void move() {
        System.out.println("Charmeleon jumps around.");
        System.out.println("                     ,-'`\\\n" +
                "                  _,\"'    j\n" +
                "           __....+       /               .\n" +
                "       ,-'\"             /               ; `-._.'.\n" +
                "      /                (              ,'       .'\n" +
                "     |            _.    \\             \\   ---._ `-.\n" +
                "     ,|    ,   _.'  Y    \\             `- ,'   \\   `.`.\n" +
                "     l'    \\ ,'._,\\ `.    .              /       ,--. l\n" +
                "  .,-        `._  |  |    |              \\       _   l .\n" +
                " /              `\"--'    /              .'       ``. |  )\n" +
                ".\\    ,                 |                .        \\ `. '\n" +
                "`.                .     |                '._  __   ;. \\'\n" +
                "  `-..--------...'       \\                  `'  `-\"'.  \\\n" +
                "      `......___          `._                        |  \\\n" +
                "               /`            `..                     |   .\n" +
                "              /|                `-.                  |    L\n" +
                "             / |               \\   `._               .    |\n" +
                "           ,'  |,-\"-.   .       .     `.            /     |\n" +
                "         ,'    |     '   \\      |       `.         /      |\n" +
                "       ,'     /|       \\  .     |         .       /       |\n" +
                "     ,'      / |        \\  .    +          \\    ,'       .'\n" +
                "    .       .  |         \\ |     \\          \\_,'        / j\n" +
                "    |       |  L          `|      .          `        ,' '\n" +
                "    |    _. |   \\          /      |           .     .' ,'\n" +
                "    |   /  `|    \\        .       |  /        |   ,' .'\n" +
                "    |   ,-..\\     -.     ,        | /         |,.' ,'\n" +
                "    `. |___,`    /  `.   /`.       '          |  .'\n" +
                "      '-`-'     j     ` /.\"7-..../|          ,`-'\n" +
                "                |        .'  / _/_|          .\n" +
                "                `,       `\"'/\"'    \\          `.\n" +
                "                  `,       '.       `.         |\n" +
                "             __,.-'         `.        \\'       |\n" +
                "            /_,-'\\          ,'        |        _.\n" +
                "             |___.---.   ,-'        .-':,-\"`\\,' .\n" +
                "                  L,.--\"'           '-' |  ,' `-.\\\n" +
                "                                        `.' ");
    }

    public void evolve() {
        System.out.println("Charmeleon evolves into Charizard!");
        pokemon.setState(new Charizard());
    }
}