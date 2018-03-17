

# Tablice

```java
int [100] cosie;
```

indeksowane od 0 do 99

```java
cosie [0] = 3;
cosie [7] = 4;
cosie [100] = kaboom;
```

[100] jest poza zakresem niedozwolone

każda tablica jest obiektem dlatego tworzy się je przez `new`


tablica rzeczy typu int:
`int [] cosie = new int [100];`


Boolean więcej operatorów:
\==
\!=
\>
\<
\>=
\<=
\and
\or
\not

```java
if((x==7)and(y==7)){
    return 30;
}
```

Switch case:

```java
switch (a){
    case1:
        ...
        ...
        break;
    case2:
        ...
        break;
    default:
        ...
        return x;
}
```

Trójargumentowość (ternary)

`b= a=5 ? 5 : 19;`

for (int i=0; i<10; ++i){
    System.out.println(i);
}


Pętla `for` jest starożytna.

```int[] cosie = new int [100];

for (c : cosie){
    System.out.println(c);
}
```

Pętla `while` warunek sprawdza na początku:

```java
int i =0;
while (i<10){
System.out.println(i);
++1;
}
```

Pętla `do{} while` warunek sprawdza na koniec:

```java
int i = 0;
do{
System.out.println(i);
++i;
}while(i<10);
```


```java
for(int i = 0; i<10; ++i){
    if (i == 5){
        break;
    }
System.out.println(i);

}
```

```java
while (true){

 if (cośtam){
    break;
 }
}
```


```java
for( , ){
    if(i==3){
    continue;
    }
    System.out.println(i);
}
```


# Hierarchia klas

Person

|imie|nazwisko|pesel|
|---|---|---|
||||

Student

|rok|numer indeksu|
|----|---|---|
|||

Employee

|id|kasa|
|---|---|
|||

Instructor

|zajecia|tytul|
|---|---|
|||

##SOLID

Single responsibility:
jedna klasa - jeden powód do zmiany klasy
Student zmienia nazwisko - zmienia się student, person etc... - źle

klasa może mieć spokojnie 6-8 metod
10-12 get/set

całe systemy zarządzania

### Kompozycja
___composition over inheritance___

```java
w main:
    person = new Person(Ada, ...);
    student = new Student(Dziennikarstwo,...);
    employee = null;
    instructor = null;

class man{
    man(person person, student student...){


    )
}
```

### Interfejsy

*Class Person*

interface person


W kontruktorze nie powinno wystąpić `new` powinien dostać je z zewnątrz.

inversion of controll - samochód nie odpowiada za koła,
on się z nich składa.

# wzorce projektowe

wymagania

|funkcjonalne | niefunkcjonalne|
|---|---|
|narysuj okienko|szybki|
||stabilny|
||secure|

niefunkcjonalne:
-ość
-ability


Zaczynać od niefunkcjonalnych, bo dodanie
kolejnych wymagań niefunkcjonalnych najczęściej prowadzi
do pisania programu od nowa.

Po określeniu wymagań niefunkcjonalnych można myśleć o architekturze
implementacja to wymagania funkcjonalne (okienko kwadratowe czy okragłe)

wzorce projektowe - informatyka jest skodyfikowana, dużo zasad,
żeby było łatwiej, bo ktoś już to wymyślił.

antywzorce - są powsszechnie używane, ale nie powinny.
40 wzorców projektowania (gang of four GOF - wzorce architektoniczne
_design patterns_)

## dobre praktyki
- funkcja nie powinna mieć więcej niż 3 argumety
jak robi się więcej to testowalność będzie kiepska
jeśli jest więcej argumentów trzeba komponować to z mniejszych elementów

- jednocześnie z pisaniem kodu pisać od razu nudne proste testy jednostkowe

## unit testy

pochodzą od jednostki, ale nie wszystkie testy są jednostkowe

testowanie pojedynczych klas czy też metod

jak nie ma w kodzie testów to nie ruszać, bo nie wiadomo co i kiedy się zespusje

__jeden test sprawdza jedną rzecz__

testy robimy dla każdej linii kodu, każdego argumentu, każdej funkcji

Test funkcji wykorzystującej inne funkcje jest testem funkcyjnym,
żeby nie sprawdzać jeszcze raz sprawdzonych funkcji robi się mocking.
pomijając sprawdzanie wołanej funkcji


## builder

w klasie Fatman:

```java
public Fatman(){
}

public static getFatman(){
    Fatman f = new Fatman();
    return f;
}
```

builder do niego:

```java
fatMan = getFatman()
    .getPerson()
        .setFirstMan()
        .setPesel()
    .getStudent()
        .setFaculty()
        .setIndeksNumber();
```

seter w interfesie zwraca `this` (zamiast void)

__wzorzec kreacyjny__



Kompozyt vs. dziedziczenie

has A - kompozyt
is A - dziedziczenie


# Metody

```java
class Person{
long Pesel; // dodać private final
Person();
getPesel();
setPesel();
}
```

metody:
- które zmieniają obiekt w sobie (np. set...)
- które nie zmieniają obiektu (np. get...)

__immutable vs mutable__

robimy nowe obiekty a nie zmieniamy ich

# Wyjątki

bardzo wygodne i pożyteczne zajęcie

Rule no 1:
__nie nadużywać__

jest kosztowna - jest na prawdę kosztowna i pamięć i czas.

- tam gdzie można je sformułować to należy to zrobić

jeśli jest dużo danych to jeśli coś jest źle to wywalić tego złola
a nie wszystko i resztę przetworzyć

obsługa wyjątków to najczęściej polega na tym, żeby napisać co się zepsuło i co zrobić
kiedy nie możemy się wydobyć z sytuacji i należy porzucić przetwarzanie

__są wewnątrz toku przetwarzania__

```java
//Jakaś metoda:
void ... (){
    if (pesel == null){
        throw(  );
    }
    this.pesel = pesel;

}
```

throw przerywa aż do funkcji gdzie jest:

```java
try{


} catch(  ){

}
```

_rzucamy gorącym kartoflem, kto złapie ten działa_

`throw(except1())`

złapie go najbliższy catch obsługujący taki wyjątek

`catch(except2())`

niezłapany wyjątek wychodzi całkiem z funkcji

```java

f1(){
    throw(new Exception ("Exc1"));
}


f2(){

    try{
    f1();
    } catch (Exc2){
    } catch (Exc3){
    } //wyjątek niezłapany

}
```

```java

f1(){
    throw(Exc1());
}


f2(){

    try{
    f1();
    } catch (Exc2){
    } catch (Exc1){ //wyjątek złapany
    }

}
```

Wyjątek potomny:

```
Exc11 extends Exc1
try{

    throw (new Exception("Exc11"))

} catch(Exc1){ //złapie Exc11
} catch(Exc11){ //tu nie doleci a powinien
}
```

```
Exc11 extends Exc1
try{

    throw (new Eception("Exc1"));

} catch(Exc11){ //złapie Exc11 ale Exc1 przeleci
} catch(Exc1){ //tu złapie Exc1
}
```

Składnia:
```
Exception{
    Exception(String reason){

    }
}
```

Jeżeli funkcja rzuciła wyjątkiem ale nie łapie, to się nie skompiluje jeśli nie jest zadeklarowany

`void f1 throws E1 | E2;`

`void f1 throws Exceptions`


Throwable
- error
  - runtime error
- exception
  - ___throws___


`Long x = 7L;` lepszy bierze obiekt z pool
`Long y = new Long(7L);` tak samo dobry, ale gorszy

`String s1 = "Ala";` + pool
`String s2 = new String("Ala");`

`int[17]x;`

`new Array <Integer>;`




```
try{
} catch (){
} finally{
}
```

Java zbiera finally ale nie musi od razu, startuje z garbage collectorem

ręczne korzystanie z garbage collectora jest źle postrzegane.

Jak program kończy się przed garbage collectorem to nie zaistnieje

## trajkacz z zasobami

try/catch with resources

```java
File f //open

File implements Closeable;
    void close(){}

try(f){ //java wie że f jest closeable i zrobi to w dobeym momencie


}catch

```

dobra konstrukcja i działa poprawnie w przeciwieństwie do finally

abstract factory - fabryka abstrakcyjna
simple factory - fabryka prosta
factory method - metoda wytwórcza

#Fluent API

String.append()

```
result
    .append()
    .append()
    .toLowerCase()
    .substring(10,12);
```



# Wzorzec projektowy: observer

2 byty - obiekt obserwujący i obserwowany

uruchomienie w modelu setData i wysyła z modelu do widoku wiadomość zmieniło się
pokazuj, a on mówi ok pokażę

podejścia:

changed -> silny push //statefull

1, 2, TIC -> lekki push (widok ma kopię danych) //statefull odchodzi się od niego

changed -> <- pull //stateless


### systemy przetwarzające informacje
- stanowe (statefull) - musimy przekazywać informacje zawsze do tej samej maszyny
- bezstanowe (stateless) - klient nie zapisuje stanu w pamięci //mogą być problemy z logowaniem

#### mediator

informuje obserwatorów o zmianie

dodajemy obserwującego z metodą - dodaj mnie jako subskrybenta

MVC - model nie myśli tylko przechowuje dane, jeden obiekt obserwowany

model mówi mediatorowi co się zmieniło, a obserwator pyta mediatora co potrzebuje
mediator tłumaczy jedno na drugie i często kumuluje informacje.

haczyk - obserwujący o sobie nie wiedzą




# Operacje wejścia wyjścia

njaprostsze podejście do dysku i wczytywania plików daje klasa
`File("D:\\date.txt")`

w Javie za czytanie odpowiadają strumienie STREAM

Komunikacje plikowe

Object
- Reader
    - Filereader - czytanie stringów upierdliwe - czeka na koniec linii żeby go skompletować
    - Bufferedreader

- Writer
    - Filewriter - zapisuje od razu na dysku
    - Bufferedwriter - buforuje i paczkami zapisuje

- Stream

- Channel

- Mem Mapped File - jeden proces czyta drugi pisze


#### Procesy i wątki

są jeszcze lżejsze - włókna (fiber) - nie sa współbieżne, wątków nie ma

Nie ma wsparcia wątków na kartach graficznych

Procesy są silnie separowane, źle się komunikują, nie nadpisują swojej pamięci
ta izolacja jest ważna i potrzebna.



| Seq | Random access |
|---|---|
| | |

Kolekcje
Struktury dane dla dużych cosiów

Array[5]

||||||
|---|---|---|---|---|

List
odniesienia do kolejnych elementów (trzeba przeczytać poprzednie)
Sequential access (tania przy sekwencyjnym dostępie)

dostęp od razu do piątego elementu - random access
przy randomowym dostępie Lista jest kosztowna


pliki są po to żeby je wczytać

object stream do wczytywania objektów
    ipmlementuje serializable; - obiekt jest w stanie zamienić się na coś bajt po bajcie,
    żeby się wczytać bajt po bajcie

    zapisany String jako ciąg bajtów, który można zapisać do pliku
    String 4 znaki [a][l][a][ ]


`Java
Person {implements serializable;
        int age;
        String name;
        //-> 16 3 Ada
        }
`

LSB
MSB
Big Endian


różne entery:

win: \n \a (0.0D, 0.0A)
lx: \n
m+c: \a

porównywanie typów

porównywanie Stringów przez == jest nielegalne - robi się to przez .equals()

znak unicode 2 bajtowy - niekoniecznie dobrze przenoszą języki

String jest immutable
- można zrobić nowy, zmienić
- nie można wyciąć z niego
"" - jest literałem String
"". - zawiera metody

String jest final - nie można go rozszerzyć, nie będzie potomków

.compareTo() - miewa problemy z porównywaniem różnymi językami

kłopot ze stringiem - biblioteka ICU (dla C) i ICU4J (dla Java)

.endsWith() - czy kończy się na

.contains() - zawiera

.equals() - dziedziczy po obiekcie więc trzeba być czujnym

.hashCode() - zwraca skróty

.indexOf() - w którym miejscu stringu, ma wersję zaczynającą od tego gdzie skończyła

.isEmpty() - lepszy niż > 0

.lastIndexOf() -

.matches()

.split() - dzieli po czymś i zwraca tabelę


### kolekcja

kolekcja zbiór odniesień do bytów, są przetwarzane jako jednowątkowe

List - uporządkowany - implementacje:
- ArrayList - można zrobić .resize()
- LinkedList
- Vector - nie używać!!!

Set - zbiór (matematycznie rozumiany) nieuporządkowany
tych samych elementów jest 1 sztuka (można multisety)

Queue - kolejka
- LIFO - stos (stosy często implementowane jako Array)
- FIFO

Map - bardziej jak baza danych (identyfikator "Ada", wartość 19) - tablica hashująca / indeksująca
są unikalne

Map <indeks, wartość> - musi być sprawna funkcja hashująca

Mapa ["Ala"] = 7;
Mapa ["Ala"] ++;
Map <String, Person>
Map <Person, Person>
Map <Person, List<Person>>


List <Integer> data = new ArrayList<>();

Class..
    void Abc(){

    }

    Integer q1;
    Integer q2 = 100;


W każdej klasie można dodać initialization block:

```Java
{
 //kod
}
```

blok inicjalizujący należy do obietu
static - przynależy do klasy, wszystkie inne do obiektu

|dostęp|
|---|
|public|
|protected|
private|
|niezdefiniowany|

Mechanizm refleksji
klasa może dowiedzieć się jak zbudowane są inne klasy, a nawet zmienić



biblioteki
GUAVA - google'a
APACHE COLLECTIONS

# Programowanie aspektowej

### AspectJ

spogląda na system z różnych stron (a teraz bezpieczeństwo każdej klasy)
refleksja sprawdza co się dzieje w runtime
dodajemy do systemu nieprzewidziane elementy

### Loggery

Nie są prostackie - takie widoczki.

Napisane jeszcze lepiej - nie psują się, są stabilne, nawet się nie testuje



### FSM Finite State Machine (maszyna stanów skończonych)

wywodzi się z mechaniki Automat Moore'a


Maszyna stanowa - są stany i opisane przejścia między nimi i co się musi wydarzyć

Język domenowy - czasem trzeba poznać (np. @Before i @After w @Test -ach)

Enum STATES
[from][to] msg action

[on][off] guzik off

każda krawędź opisana

|state|msg|state|action|
|---|---|---|---|
|Init|Button ON|ON|Zapalić kineskop|

Jak jest za dużo if else w kodzie i zbyt dużo decyzji - prawdopodobnie da się to zmieścić
w jednym miejscu w kodzie (jeżeli przycisk jest włączony i cośtam to przełącz to i tamto, a jeśli...)

Niedoceniana, a kozacka konstrukcja do podejmowania decyzji


# Maven

system budowania projektów w java

do tej pory był Ant

Gradle się przebija

- pokazują co się zmieniło, dopisują co potrzeba
- zajmują się dogrywaniem/importowaniem bibliotek
- żeby byblioteki były dostępne, fundacje które są odpowiedzialne za te systemy
zbierają wszystkie biblioteki javy


## wzorzec projektowy Catch 'em all!

sprawdzenie null -> notNull
od java8 jak konwencja, że jak trafia się null to wywal się od razu, bo znaczy że coś było zwalone

MODYFIKACJE KOLEKCJI NA KTÓREJ SIĘ ITERUJE SĄ ZABRONIONE

### Iteratory po kolekcjach


