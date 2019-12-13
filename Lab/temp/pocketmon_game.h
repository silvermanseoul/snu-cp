#ifndef LAB10_POCKETMON_GAME_H
#define LAB10_POCKETMON_GAME_H

#include "monster.h"
#include "player.h"

class PocketmonGame {
private:
    Player player1, player2;
public:
    void add_monster_for_player1(const char *monster_type);
    void add_monster_for_player2(const char *monster_type);
    void attack1(int attack_monster_number, int defense_monster_number);
    void attack2(int attack_monster_number, int defense_monster_number);
    void print_status();
};

#endif //LAB10_POCKETMON_GAME_H
