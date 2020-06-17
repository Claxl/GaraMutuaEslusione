# *GaraMutuaEslusione* #
# Mutua Esclusione #
In informatica la mutua esclusione indica un procedimento di sincronizzazione fra processi o thread concorrenti, con il quale si impedisce che più task paralleli accedano contemporaneamente ai dati in memoria o ad altre risorse soggette a race condition (o condizione critica). Questo concetto riveste importanza fondamentale nella programmazione parallela e soprattutto per i sistemi di transazione.

SOLUZIONE CON VARIABILE OCCUPATO
La soluzione con variabile occupato è una soluzione molto più semplice rispetto a quella di Peterson, serve una sola variabile occupato, ma si possono presentare alcuni problemi a lungo andare. Infatti potrebbero impostare tutti e due i Thread contemporaneamente la variabile occupato ad 1, per questo abbiamo deciso di implementare una attesa casuale. In questa soluzione si presenta l’attesa attiva (starvation).
