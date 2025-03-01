# Java Streams - notes chapter 5

*from Java 8 in Action - Urma*

---

<!-- TOC -->
    - [Filtering and Slicing](#filtering-and-slicing)
    - [Filtering con predicato - .filter(predicato)](#filtering-con-predicato---filterpredicato)
    - [Filtering elementi unici  - .distinct()](#filtering-elementi-unici----distinct)
    - [Troncare un elemento - .limit(n)](#troncare-un-elemento---limitn)
    - ['Skippare' un elemento - .skip(n)](#skippare-un-elemento---skipn)
<!-- /TOC -->

---

* Filtering, Slicing, Matching
* Finding, Matching, Reducing
* Using numeric streams such as ranges of numbers
* Creating streams from multiple sources
* Infinite streams


Il fatto è che con gli stream è possibile *lasciare che sia la API Stream stessa a prendersi cura di come processare i dati*, in maniera efficiente e ottimizzata, e possibilmente parallelizzata.  

### Filtering and Slicing  
   
#### Filtering con predicato - .filter(predicato)
  
`filter()` prende come argomento un predicato (funzione che ritorna boolean) e ritorna un altro stream che include tutti gli elementi che rendono vero il predicato.  
  
> [!tldr] Pensa al "->" nella funzione lambda come "tale che":  Ad esempio, `.filter(i -> i % 2 ==0)`  

#### Filtering elementi unici  - .distinct()
  
`.distinct()` fa in modo che non ci siano duplicati all'interno dello stream. 
  
#### Troncare un elemento - .limit(n)
  
`.limit()` limita lo stream, ritornando un altro stream che non è più lungo di un `n` dato. Quindi, messo in pipeline dopo altri elementi, da in modo che lo stream prenda solo i primi n elementi che soddisfino la condizione data.  
  
#### 'Skippare' un elemento - .skip(n)  
  
`.skip(n)` scarta i primi n elementi di uno stream, creando uno stream che escluda i primi n elementi. Se lo stream ha n o meno elementi, ritorna uno stream vuoto.  
  
#### Mappare - .map()  
  
`.map()` prende una funzione come argomento (di solito una getter ma dipende). La funzione viene quindi applicata a tutti gli elementi; trasforma quindi lo stream attuale in un altro stream fatto di tutti gli elementi estratti tramite quella funzione.  
Se estraiamo tutte le Strings di nomi di un menu, avremo una lista di String; se estraiamo tutti i prezzi di un catalogo, avremo una lista di Integers (ad esempio).  
  
#### Appiattare uno stream - .flatMap()
  
Se volessimo fare in modo di inserire in una lista i caratteri distinti di una stringa, ad esempio "H" "e" "l" "o" "W" "r" "d", non possiamo usare direttamente `.map()`; abbiamo bisogno di un'altra funzione chiamata `.flatMap()`.  
  
```java
List<String> uniqueCharacters = words.stream()
                                     .map(w -> w.split(""))
                                     .flatmap(Arrays::stream)
                                     .distinct()
                                     .collect(Collectors.toList());
```  
  
`flatMap()` mappa ogni array non con uno stream, ma con il contenuto di quello stream. Tutti gli stream generati (per esempio usando map.(Arrays::stream)) vengono amalgamati - appiattiti - dentro un solo stream.  
  
`.flatMap()` fa sostituire ogni valore di uno stream con un'altro stream, e poi concatena tutti gli streams assieme in uno stream singolo.  
  
### Finding and matching
  
#### Vedere se almeno un elemento soddisfa il predicato - anyMatch()  
  
Il metodo `.anyMatch()` controlla se esiste almeno un elemento nello stream che soddisfa il predicato inserito in `.anyMatch()`.  
  
Ad esempio:  
```java
if(menu.stream().anyMatch(Dish::isVegetarian)){
    System.out.println("There is at least one vegetarian dish in the menu.");
}
```  
  
`.anyMatch()` ritorna un boolean: è una operazione terminale.  
  
#### Vedere se tutti gli elementi soddisfano il predicato - allMatch()  
  
Questo metodo controlla se **tutti** gli elementi di uno stream soddisfano un predicato.  
  
```java
if(menu.stream().allMatch(Dish::isVegetarian)){
    System.out.println("The whole menu is vegetarian");
}
if(menu.stream().allMatch(x -> x.getCalories < 1000)){
    System.out.println("This menu is low on calories");
}
```  
  
#### Vedere se nessun elemento soddisfa il predicato - noneMatch()
  
L'opposto di `.allMatch()`. Ritorna un boolean vero/positivo se **nessuno** degli elementi presenti nello stream soddisfa la condizione/il predicato.  
  
>[!tldr] .allMatch(), .noneMatch(), e .anyMatch() applicano la scorciatoia di valutazione "corto-circuito". Ovvero, non hanno bisogno di valutare l'intero stream se trovano un elemento che rende falso il predicato, o lo rende vero.  
  
#### Trovare un elemento qualunque 'il quale...' - findAny()

Ritorna un tipo `Optional`.  
  
```java
Optional<Dish> dish = menu.stream().filter(Dish::isVegetarian).findAny();
```
  
##### Optional types  
  
E' una classe container che rappresenta l'esistenza (o non esistenza) di un valore. Quindi è possibile che un `.findAny()` non trovi nessun elemento. Invece di ritornare `null`, sarà comunque ritornato un Optional<T>, che ritornerà un boolean negativo a `.isPresent()`.
E' possibile ritornare il valore con `.get()`, o eseguire una operazione condizionale se presente grazie a `.ifPresent(x->x.someFunction())`. 
  
#### Trovare il primo elemento - .findFirst  
  
Vorremo voler trovare il primo elemento disponibile di una certa collezione - ad esempio una lista ordinata per un certo criterio. `.findFirst()` fa proprio questo, ed è simile a `.findAny()` 
  
La differenza tra i due è l'ordine: in dubbio, se non è necessario che l'eventuale Optional punti al primo disponibile, conviene utilizzare `.findAny()`, poichè potrebbe ottimizzare con parallelismi.  
  
