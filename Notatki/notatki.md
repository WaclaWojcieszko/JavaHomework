

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


#Metody

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