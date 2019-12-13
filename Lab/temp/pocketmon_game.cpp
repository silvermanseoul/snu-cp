#include "pocketmon_game.h"

void PocketmonGame::add_monster_for_player1(const char *monster_type) {
    player1.add_monster(monster_type);
}

void PocketmonGame::add_monster_for_player2(const char *monster_type) {
    player2.add_monster(monster_type);
}

void PocketmonGame::attack1(int attack_monster_number, int defense_monster_number) {
    player2.attack(player1, attack_monster_number, defense_monster_number);
}

void PocketmonGame::attack2(int attack_monster_number, int defense_monster_number) {
    player1.attack(player2, attack_monster_number, defense_monster_number);
}

void PocketmonGame::print_status() {
    cout << "===== Current Status =====" << endl
         << "player 1: " << player1 << endl
         << "player 2: " << player2 << endl;
}


