Ideen:



Kinoprogramm

Zeitschriften



# Verwaltung braucht verschiedene Suchbäume



Attribute:



**Name**

**Laufzeit**

letzte Vorstellung (wann es zum letzten Mal gezeigt wird)

**Preis**

**nächste Vorstellung**

Rezension von Filmkritiker\*innen

in welchem Saal

eigene Rezension einfügen?

**Altersfreigabe**

durchschnittliche Besucherzahl

Inhalt / Zusammenfassung

link zum Trailer

andere Filme der Reihe (falls es eine Filmreihe ist)



Methoden:



Name ausgeben

alphabetisch sortieren

Laufzeit ausgeben

nach Laufzeit sortieren

nach Laufzeit suchen und alle Filme die kürzer sind werden ausgegeben

*Nach letzter Vorstellung sortieren -> Datum eingeben und Filme, die an dem Tag zuletzt gezeigt werden, werden ausgegeben*

Preis ausgeben

Preis eingeben und Filme die weniger kosten werden ausgegeben

nächste Vorstellung ausgeben

Datum eingeben und Filme die bis zu dem Datum noch gezeigt werden, werden ausgegeben

*Saal ausgeben*

nach Altersfreigabe sortieren

Ein Alter eingeben und alle Filme die mit dem Alter geguckt werden können werden ausgegeben







Pseudocode:



getName:

 Namen ausgeben



sortName:

  Filme sind alphabetisch geordnet in dem BST



getTime:

Laufzeit ausgeben



searchTime: (zeit pZeit)

  wenn ein Film PZeit lang ist oder Kürzer

    wird er zu einer Liste hinzugefügt

    die Liste wird sortiert

    die Liste wird ausgegeben

 sonst wird der Film nicht ausgegeben (nichts passiert)



*getLastWatch:*

*letzte Vorstellung ausgeben*



*searchLastWatch: (Datum pDatum)*

*wenn ein Film an pDatum das letzte Mal gezeigt wird oder vorher schon die letzte Vorstellung ist*

    *\*wird er zu einer Liste hinzugefügt\**



    *\*die Liste wird sortiert\**



    *\*die Liste wird ausgegeben\**



*sonst wird der Film nicht ausgegeben (nichts passiert)*



 getPrice:

Preis ausgeben



searchPrice: (Geld pGeld)

  wenn ein Film pGeld oder weniger kostet

    wird er zu einer Liste hinzugefügt

    wird die Liste sortiert

    wird die Liste ausgegeben

 sonst wird der Film nicht ausgegeben (nichts passiert)



getNextWatch:

 nächste Vorstellung wird ausgegeben



searchNextWatch: (Datum pDatum)

 

richtigen Knoten finden, dann kompletten rechten Teilbaum traversieren, in eine Liste packen und zurückgeben



getAllowedAge

 Altersfreigabe ausgeben



searchAllowedAge (alter pAlter)

  wenn der Film für pAlter oder jünger freigegeben ist

    wird er zu einer Liste hinzugefügt

    wird die Liste sortiert

    wird die Liste ausgegeben

  sonst wird der Film nicht ausgegeben (nichts passiert)





 

