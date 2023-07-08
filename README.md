# home-banking-base-level


Esercitazione in vista dell'esame finale per il diploma di FinTech Software Developer erogato da ITS ICT Piemonte


## Requisiti

### Home Banking

É necessario scrivere un’applicazione Web che consente di gestire un servizio di **home banking**. L’applicazione deve consentire di eseguire il seguente caso d’uso.

**Utente effettua versamento**

Scenario Principale:

- L’utente accede ad uno schermo iniziale (index.jsp) nel quale viene visualizzata una maschera per specificare i dati del conto corrente. Nella maschera è necessario specificare il codice del conto corrente (un numero intero)
- Il sistema verifica che nella base di dati esista un conto corrente con il codice specificato. I conti correnti sono memorizzati in una tabella ContiCorrenti della base di dati che contiene il numero del conto, il nome e cognome dell’utente, il saldo in Euro.
- Se il conto esiste, l’utente accede ad uno schermo (versamento.jsp) nel quale sono riassunti i dati del conto corrente; lo schermo contiene inoltre una maschera attraverso la quale l’utente fornisce l’importo da versare
- Il sistema aggiorna il saldo del conto effettuando il versamento
- L’utente accede ad uno schermo (conferma.jsp) nel quale vengono riassunti i risultati dell’operazione
(dati del conto ed importo versato); lo schermo contiene un collegamento allo schermo iniziale nel caso
l’utente voglia eseguire una ulteriore operazione Scenario alternativo: Il conto corrente non esiste
- Se, viceversa, il conto corrente non esiste, l’utente accede ad uno schermo (errore.jsp) in cui viene
visualizzato un messaggio di errore ed un collegamento allo schermo principale per effettuare una nuova operazione
Scrivere l’applicazione Web che effettua le operazioni elencate sopra secondo le seguenti specifiche:
- L’applicazione deve utilizzare pagine JSP e un’architettura di tipo Modello 1.
- La grafica deve essere organizzata utilizzando un foglio di stile CSS.
- Non è necessario provvedere alla convalida dei dati sottomessi dall’utente.
- Non è necessario provvedere alla convalida del codice HTML prodotto dalle pagine JSP.
