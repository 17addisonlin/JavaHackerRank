# Java Stdin and Stdout I

## Description

Most HackerRank challenges require you to read input from `stdin` (standard input) and write output to `stdout` (standard output).

One popular way to read input from `stdin` is by using the `Scanner` class and specifying the input stream as `System.in`. For example:

```java
Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
```

The code above creates a `Scanner` object named `scanner` and uses it to read a `String` and an `int`. It then closes the `Scanner` object because there is no more input to read, and prints to `stdout` using `System.out.println(String)`.

If the input is:

```text
Hi 5
```

The code will print:

```text
myString is: Hi
myInt is: 5
```

Alternatively, you can use the `BufferedReader` class.

## Task

In this challenge, you must read `3` integers from `stdin` and then print them to `stdout`. Each integer must be printed on a new line.

To make the problem a little easier, a portion of the code is provided for you in the editor.

## Input Format

There are `3` lines of input, and each line contains a single integer.

## Notes

- `Scanner` object name: `scan`
- Read `3` integers
- There are `3` input lines

## Sample Input

```text
42
100
125
```

## Sample Output

```text
42
100
125
```

## Source

HackerRank
