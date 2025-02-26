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
  
### Filtering con predicato - .filter(predicato)
  
`filter()` prende come argomento un predicato (funzione che ritorna boolean) e ritorna un altro stream che include tutti gli elementi che rendono vero il predicato.  
  
> [!tldr] Pensa al "->" nella funzione lambda come "tale che":  Ad esempio, `.filter(i -> i % 2 ==0)`  

### Filtering elementi unici  - .distinct()
  
`.distinct()` fa in modo che non ci siano duplicati all'interno dello stream. 
  
### Troncare un elemento - .limit(n)
  
`.limit()` limita lo stream, ritornando un altro stream che non è più lungo di un `n` dato. Quindi, messo in pipeline dopo altri elementi, da in modo che lo stream prenda solo i primi n elementi che soddisfino la condizione data.  
  
### 'Skippare' un elemento - .skip(n)  
  
`.skip(n)` scarta i primi n elementi di uno stream, creando uno stream che escluda i primi n elementi. Se lo stream ha n o meno elementi, ritorna uno stream vuoto.  
  
### Mappare - .map()  
  
`.map()` prende una funzione come argomento (di solito una getter ma dipende). La funzione viene quindi applicata a tutti gli elementi; trasforma quindi lo stream attuale in un altro stream fatto di tutti gli elementi estratti tramite quella funzione.  
Se estraiamo tutte le Strings di nomi di un menu, avremo una lista di String; se estraiamo tutti i prezzi di un catalogo, avremo una lista di Integers (ad esempio).  
