#ifndef LAB10_MONSTER_H
#define LAB10_MONSTER_H

#include <iostream>
using namespace std;

class Monster {
private:
    int health = 100;
    int id;
public:
    virtual void attack(Monster *monster) = 0;
};

class WaterMon : public Monster {
private:
    static const int DEFAULT_DAMAGE = 10;
    static const int CRITICAL_DAMAGE = 25;
public:

};

class FireMon : public Monster {
private:
    static const int DEFAULT_DAMAGE = 10;
    static const int CRITICAL_DAMAGE = 30;
public:

};

class GrassMon : public Monster {
private:
    static const int DEFAULT_DAMAGE = 15;
    static const int CRITICAL_DAMAGE = 20;
public:

};

#endif //LAB10_MONSTER_H
