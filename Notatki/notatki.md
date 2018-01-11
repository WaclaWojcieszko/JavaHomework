

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