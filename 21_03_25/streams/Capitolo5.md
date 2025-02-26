# Java Streams - notes chapter 5

*from Java 8 in Action - Urma*

---

<!-- TOC -->
    - [Filtering and Slicing](#filtering-and-slicing)
<!-- /TOC -->

---

* Filtering, Slicing, Matching
* Finding, Matching, Reducing
* Using numeric streams such as ranges of numbers
* Creating streams from multiple sources
* Infinite streams

The thing about the streams is that *you let the Streams API itself* manage how to process the data, in a way that will be more efficient and optimized; and perhaps, parallelized.  

### Filtering and Slicing  
  
#### Filtering with a predicate  
  
`filter()` takes as argument a predicate (function that returns a boolean) and returns another stream. 