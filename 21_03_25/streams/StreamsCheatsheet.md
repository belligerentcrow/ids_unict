
# Lista di metodi e tipi di Java Stream
*(Where "returns" is empty, it returns a stream.)*

| Name                   | Type       | Returns    | Example                                                                                                |
| ---------------------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------ |
| `.filter()`            | Intermedia |            | `.filter(i -> i.isVegan())`<br>`.filter(x -> x.getCity == "Rome")`                                     |
| `.map()`               | Intermedia |            | `.map(Weapon::getName)`<br>`.map(x -> x.getYear())`                                                    |
| `.limit()`             | Intermedia |            | `.limit(3)`                                                                                            |
| `.skip()`              | Intermedia |            | `.skip(1)`                                                                                             |
| `.distinct()`          | Intermedia |            | `.distinct()`                                                                                          |
| `.max()`               | TERMINALE  | Optional   | `.max(Comparator.comparing(Persona::getEta)`                                                           |
| `.min()`               | TERMINALE  | Optional   | `.min(Comparator.comparing(Transaction::getValue)`                                                     |
| `.collect()`           | TERMINALE  | Collectors | `.collect(Collectors.toList());`                                                                       |
| `.of()`/ `Stream.of()` | Intermedia |            | `Stream.of(2,5,212,-5)`                                                                                |
| `.reduce()`            | TERMINALE  | One value  | `.reduce(0,(a,b) -> a+b);`<br>`.reduce("", (a,b) -> a+b);`                                             |
| `.count()`             | TERMINALE  | Int        | ................`.count()`                                                                             |
| `.flatMap()`           | Intermedia |            | `.flatMap(i->list.stream().map(j->new int[]{i,j}))`<br>`.flatMap(Arrays::stream)`                      |
| `.allMatch()`          | TERMINALE  | boolean    | `.allMatch(x->x.getCalories < 1000);`                                                                  |
| `.anyMatch()`          | TERMINALE  | boolean    | `.anyMatch(Dish::isVegetarian);`                                                                       |
| `.noneMatch()`         | TERMINALE  | boolean    | `.noneMatch(x->x.getCalories>1000);`                                                                   |
| `.findFirst()`         | TERMINALE  | Optional   | `.map(x->x*x).filter(x->x%3 ==0).findFirst()`                                                          |
| `.findAny()`           | TERMINALE  | Optional   | `stream().filter(num::isPositive).findAny()`                                                           |
| `.sorted()`            | Intermedia |            | `.sorted(Comparator.comparing(Dish::getCalories))`<br>`.sorted(Comparator.comparing(Document::getID))` |
| `.forEach()`           | TERMINALE  | void       | `.forEach(System.out::println)`                                                                        |

