#ifndef LAB10_MONSTER_H
#define LAB10_MONSTER_H

#include <iostream>
using namespace std;

class Monster {
private:
    int health = 100;
    int id; // 1~12
    static int lastId;
public:
    Monster();
    virtual string getType() = 0;
    virtual void attack(Monster *monster) = 0;
    void decreaseHealth(int damage);
    friend ostream &operator<<(ostream &os, Monster *m); // Why 'friend'?
//    friend ostream &operator<<(ostream &os, const Monster& m);
};

class WaterMon : public Monster {
private:
    static const string type;
    static const int DEFAULT_DAMAGE = 10;
    static const int CRITICAL_DAMAGE = 25;
public:
    string getType();
    void attack(Monster *monster);
};

class FireMon : public Monster {
private:
    static const string type;
    static const int DEFAULT_DAMAGE = 10;
    static const int CRITICAL_DAMAGE = 30;
public:
    string getType();
    void attack(Monster *monster);
};

class GrassMon : public Monster {
private:
    static const string type;
    static const int DEFAULT_DAMAGE = 15;
    static const int CRITICAL_DAMAGE = 20;
public:
    string getType();
    void attack(Monster *monster);
};

#endif //LAB10_MONSTER_H
