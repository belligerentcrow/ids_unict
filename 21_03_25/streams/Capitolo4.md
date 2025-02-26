# Java Streams - notes chapter 4

*from Java 8 in Action - Urma*

---

<!-- TOC -->
- [Esempio di stream](#esempio-di-stream)
- [4.2 - Getting started with Streams](#42---getting-started-with-streams)
  - [Sequenza di Elementi](#sequenza-di-elementi)
  - [Fonte](#fonte)
  - [Operazioni di Data processing](#operazioni-di-data-processing)
  - [Operatore collect() rispetto agli altri](#operatore-collect-rispetto-agli-altri)
    - [Codice threeHighCaloricDishNames - see dishesData](#codice-threehighcaloricdishnames---see-dishesdata)
  - [Differences between Streams and Collections libraries](#differences-between-streams-and-collections-libraries)
  - [Attraversabili solo una volta - Consumo dello Stream](#attraversabili-solo-una-volta---consumo-dello-stream)
  - [Differenze in iterazione per estrapolare dati](#differenze-in-iterazione-per-estrapolare-dati)
  - [Funzioni stream](#funzioni-stream)
  - [Riassunto del Quarto Capitolo](#riassunto-del-quarto-capitolo)
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

### Differences between Streams and Collections libraries
  
Metafora di un film: in un formato DVD esso è una ***Collezione***, perché il DVD contiene l'intera quantità di dati che costituiscono il film.  
Lo stesso video tramite internet è invece uno ***Stream***. Viene scaricato poco alla volta, mentre si vede il frammento di esso che l'utente sta guardando.  
Si consideri pure che il lettore video potrebbe non avere neanche la possibilità di caricarer l'intero film tutto in una volta. E sarebbe controproducente mostrare il primo frame solo nel momento in cui l'ultimo sia stato caricato, i tempi di attesa sarebbero assurdi.  
  
La sostanziale differenza tra **Streams** e **Collezioni** consta nel *quando* gli elementi vengono caricati: nelle collezioni, ogni elemento viene caricato dall'inizio, la struttura dati contiene tutti i dati. Ogni elemento viene computato prima che qualcosa venga inserito in memoria.  
  
Uno **Stream** invece è una struttura dati concettualmente fissa, i quali elementi vengono **computati on-demand**. Altra differenza: è possibile creare uno stream infinito.  
  
Il concetto fondamentale degli streams è il fatto che essi sono fatti affinché gli utenti possano estrarre da essi ciò che a loro serve, quando serve. Una sorta di *"costruzione lazy".*  *Metafora: una tipografia on-demand, contro un archivio o biblioteca piena di libri.*  
  
### Attraversabili solo una volta - Consumo dello Stream 
  
Uno **stream** può essere attraversato una volta sola, come gli iteratori all'interno di un Loop. Possiamo estrapolare dallo stream dei dati che possiamo utilizzare di nuovo, come delle collezioni, ma non è possibile fare questo se per esempio lo stream restituisce un I/O (`System.out::println` ad esempio)  
  
>[!tldr] E' possibile considerare uno stream come dei valori che si estendono "nel tempo", a differenza delle collezioni, considerabili dei valori che si estendono "nello spazio" (memoria).  
  

### Differenze in iterazione per estrapolare dati  
  
Le collezioni utilizzano iteratori "esterni", mentre gli streams utilizzano "iteratori interni"  
  
**Collezioni**:  
```java
List<String> names = new ArrayList<>();
for(Dish d : menu){
  names.add(d.getName());
}
```  
  
**Streams**:  
```java
List<String> names = menu.stream()
                         .map(Dish::getName)
                         .collect(toList());
```
Quest'ultimo fa la stessa cosa: crea una lista dei nomi di ogni piatto contenuto in menu. 
  
```java
List<String> names = menu.stream()
                         .filter(d -> d.getCalories() > 300)
                         .map(Dish::getName)
                         .limit(3)
                         .collect(toList());
```

### Funzioni stream  
  
(Le specifiche saranno spiegate meglio dopo)  
  
filter()  
map()  
limit()  
sorted()  
distinct()  
forEach()  
count()  
collect()  
  
### Riassunto del Quarto Capitolo  
  
Uno stream è una sequenza di elementi da una fonte che supporta operazioni di data processing.  
Gli Streams utilizzano un tipo di iterazione interna, a differenza delle collezioni; si applica astrazione all'iterazione tramite metodi come `filter()`, `map()`, e `sorted()`.  
Ci sono due tipi di operazioni Stream: **Intermedie** e **Terminali**.  
Le operazioni **intermedie**, come `filter()` e `map()` ritornano un'altro stream, e possono essere concatenate in una pipeline, ma non ritornano risulato.  
Operazioni **terminali** come `forEach()` e `count()` non ritornano uno stream ma un altro tipo di valore: sono utilizzate per processare lo stream al suo termine, per produrre il risultato, appunto, finale.  
Gli elementi di uno stream sono computati on-demand.   
