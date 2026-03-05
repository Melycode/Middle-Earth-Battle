# Middle-Earth Battle - Java Project

## Description
This project simulates battles between the forces of good and evil in Middle-Earth. Each race has a strength value between 1 and 5. The total strength of each army is calculated
by multiplying the race value by the number of members. 
The program determines whether good wins, evil wins, or there is a draw.

---

## Class

The class `MiddleEarthBattle` was created defining the kind and evil army members and their strength values using two `HashMap`.

## Races and Values

| Kind Races       | Value | Evil Races     | Value |
|------------------|-------|----------------|-------|
| Pelosos          | 1     | Sureños malos  | 2     |
| Sureños buenos   | 2     | Orcos          | 2     |
| Enanos           | 3     | Goblins        | 2     |
| Númenóreanos     | 4     | Huargos        | 3     |
| Elfos            | 5     | Trolls         | 5     |

The following methods were created:

- **`calculateStrength()`** - Calculates the total strength of an army. Throws `IllegalArgumentException` if the race is not valid.
- **`calculateResult()`** - Compares the points of both armies and returns the result as a `String`.
- **`battleForTheMiddleEarth()`** - Calls the two methods above and prints the battle result to the console.

---

## Main

The main contains 5 example battles:

1. 4 Númenóreanos (16) **kind wins to** 2 Orcos (4)
2. 2 Sureños buenos (4) **evil wins to** 5 Trolls (25)
3. 5 Elfos (25) **kind wins to** 5 Goblins (10)
4. 1 Peloso (1) **evil wins to** 2 Sureños malos (4)
5. 3 Enanos (9) **draw** 3 Huargos (9)

---

## Tests

The project includes 6 tests:

- `assertEquals` - Verifies that 4 Númenóreanos have a strength of 16, and that evil wins when it has more points.
- `assertNotEquals` - Verifies that 5 Elfos do not have a strength of 10.
- `assertTrue` - Verifies that 3 Enanos draw against 3 Huargos.
- `assertFalse` - Verifies that 1 Peloso does not win against 2 Sureños malos.
- `assertThrows` - Verifies that an exception is thrown when an invalid race is introduced.
