# 🪄 Elemental Duel

**Elemental Duel** is a small arena-style **Java Greenfoot game**.  
The player and an AI opponent fight using elemental abilities, move around the arena, and collect randomly spawning potions to heal or buff themselves.

---

## 🕹️ How to Run
1. Open the project in **Greenfoot**.    
2. Click **Run** to start the game.  
3. Use the **arrow keys** to move your character.  
4. Use the **ability keys** to attack the enemy.  

---

## 🎮 Features Currently Implemented
- ✅ **Player and AI opponent** with health systems  
- ✅ **Movement controls** for the player and AI pathfinding logic  
- ✅ **Combat system** using abilities (e.g., attack or spell)   
- ✅ **Basic AI** that chases and attacks the player  

---

## ⚙️ Technologies Used
- **Java** (core language)
- **Greenfoot** (game framework and environment)
- **Object-Oriented Programming (OOP)**
- **Git + GitHub** for version control and project hosting

---

## 🧠 OOP Concepts Demonstrated
- **Abstraction** → `Character` is an abstract class that defines shared attributes (health, speed, abilities).  
- **Inheritance** → `Player` and `AIEnemy` extend the `Character` class to reuse and specialize behavior.  
- **Polymorphism** → Both `Player` and `AIEnemy` override the `update()` method differently.  
- **Encapsulation** → Each class manages its own state (e.g., health, ability cooldowns).  
- **Composition** → Characters *have* abilities, and *have* a health bar object.  
- **"Is-a" vs "Has-a"** → A `Player` *is a* `Character`, but *has a* `HealthBar` and *has* `Abilities`.

---

## 🚀 Future Improvements
- 🔥 Add more **abilities** (ranged attacks, area spells, defensive shields)  
- 🧙 Create multiple **character types**  
- 🧠 Improve **AI intelligence** (dodging, targeting logic, ability use)  
- ❤️ Enhance **UI elements** (healthbar, cooldowns, score, timers)  
- 🎵 Add **sound effects** and animations  
- 🌍 Possibly add **multiplayer** (local or online)