#include "pocketmon_game.h"

int main() {
    PocketmonGame pocketmon_game;
    pocketmon_game.add_monster_for_player1("WaterMon");
    pocketmon_game.add_monster_for_player1("FireMon");
    pocketmon_game.add_monster_for_player2("GrassMon");
    pocketmon_game.add_monster_for_player2("FireMon");
    pocketmon_game.print_status();
    pocketmon_game.attack2(1, 2);
    pocketmon_game.print_status();
    pocketmon_game.attack1(2, 1);
    pocketmon_game.print_status();
}
