# Java Streams - notes

*from Java 8 in Action - Urma*

---

<!-- TOC -->
- [4.2 - Getting started with Streams](#42---getting-started-with-streams)
<!-- /TOC -->

---

## Esempio di stream 

```java
Map<Dish.Type, List<Dish>> dishesByType =
    menu.stream().collect(groupingBy(Dish::getType));
```

## 4.2 - Getting started with Streams

>Uno Stream è *"una sequenza di elementi da una fonte che supporta operazioni di data processing."* 
>*-From Java 8 in Action*
  
  
### Sequenza di Elementi 

Uno **stream** offre interfaccia ad un insieme di elementi con certi specifici tipi. A differenza delle strutture dati, che si occupano più di memorizzare dati e accedere ad essi, gli **Streams** si occupano di eseguire computazioni su essi: ad esempio `.filter()`, `.sorted()` o `.map()`. 

### Fonte

Gli **Streams** 'consumano' da una fonte, come ad esempio una collezione, un Array, o altri I/O. Generare uno stream da una collezione ordinata mantiene l'ordine pre-esistente. 

### Operazioni di Data processing

Gli **Streams** supportano operazioni e queries simili a quelle utilizzate per gestire Databases (linguaggio SQL), e altre operazioni comuni a linguaggi funzionali per manipolare dati.  
  
<br> 

### Operatore collect() rispetto agli altri

Alcune operazioni, come `filter()`, `map()`, e `limit()`, ritornano un altro stream -> in questo modo possono essere messe in fila in una **pipeline**.  
  
Il metodo `collect()` processa la pipeline per restituire un risultato. E' diverso perché non ritorna uno stream ma, in questo caso, *una Lista*.  
  
Nota: *non si produce risultato* e *non viene selezionato niente dalla collezione originale* **prima di invocare** `collect()`. Possiamo pensarla come mettere in coda metodi fino a quando non viene chiamato `collect()`  

#### Codice threeHighCaloricDishNames - see dishesData

Consideriamo il codice:  
```java
List<String> threeHighCaloricDishNames = 
    menu.stream()
        .filter(d -> d.getCalories() > 300)
        .map(Dish::getName)
        .limit(3)
        .collect(toList());
```

* `filter(d -> d.getCalories() > 300)` prende in input una funzione Lambda *(vedi capitolo 3 dello stesso libro)* e filtra in base alla funzione lambda passata  
  
* `map(Dish::getName)` prende anche esso in input una funzione lambda per trasformare l'elemento o estrarer informazioni da esso. In questo caso, rendiamo ogni elemento della lista il suo attributo `nome`, eseguendo, appunto, una mappatura. *(In questo caso, dato che tutti i piatti hanno l'attributo nome, il passaggio prima e il passaggio dopo di map() continuano ad avere lo stesso numero di elementi)*. 
  * `Dish::getName` e `d->d.getName()` sono equivalenti. 
  
* `limit(3)` tronca la lista a 3 numeri. In generale `limit()` limita la lista di elementi "presi in considerazione" dallo stream.  
<br><br>
* `collect(toList())` converte gli elementi dello stream in una Lista. In generale, `collect()` converte lo stream in altro.  
