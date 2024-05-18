Laboratorium III - JPQL

Uwaga! Do wykonania zadan konieczne jest zaimplementowanie architektury warstwowej i testow z Laboratorium II !

Uzupelnij plik data.sql o dane niezbedne do realizacji nastepujacych zapytan:
1. Znajdz pacjentow po nazwisku -- DONE !
2. Znajdz wszystkie wizyty pacjenta po jego ID -- DONE !
3. znajdz pacjentow ktorzy mieli wiecej niz X wizyt (X jest parametrem wejsciowym) -- DONE !
4. Znajdz pacjentow po dodanym przez Ciebie polu - nie wyszukuj wprost po wartosci, uzyj zapytania typu wieksze/mniejsze/pozniej/wczesniej/zawiera, w zaleznosci od wybranego typu zmiennej. -- DONE !

Napisz testy do zapytan w nastepujacej formie:
1. do zapytania nr 1  - test DAO
2. do zapytania nr 2 - test serwisu
3. do zapytania nr 3 - test DAO
4. do zapytania nr 4 - test DAO


======== NIE PRZETESTUJE TEGO BO TE TESTY PO PROSTU MI NIE DZIAŁAJĄ, WCZORAJ SIĘ NAWKURWIAŁEM NA SWOJE IDE I NIE ROZWIĄŻE TEGO PROBLEMU =======
======== ZROBIŁEM CI TEMPLATKI OPISUJĄCE JAK TE TESTY ZACZĄĆ, JEŻELI CI BĘDĄ DZIAŁAĆ TO SOBIE SPRÓBUJ NAPISAĆ =====================
=== SCHEMAT ->
1. Jeżeli testujemy to musimy mieć funkcję DAO lub SERWISU.
2. W DAO LUB SERVICE TWORZYMY FUNKCJĘ KTÓRA ROBI TO CO TESTUJEMY
3. NASTĘPNIE W PatientDaoTest albo PatientTestService robimy funkcję i tam zazwyczaj tworzymy nowy obiekt Patient a potem za pomocą tej funkcji
z DAO lub service próbujemy wykonać operacje.
4. Assert(Załóż że) 