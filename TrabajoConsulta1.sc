 /*
1. Crear una función con nombre (integracion) que use el método de Simpson para
calcular el valor aproximado de cualquier función . Se recomienda analizar lo
siguiente:
  a) El tipo de dato que devolverá la función integracion
      - El tipo de dato que devolvera la función integration() es Double
  b) ¿Cuáles son los parámetros que recibe la función?
      - Los parámetros que recibe la función son:
        f: una función que toma un Double y devuelve un Double
        a: entero
        b: entero
*/

def integration(f: Double => Double, a: Int, b: Int): Double =
  val valueX = (a + b) / 2
  (b - a) * ((f(a) + (4 * valueX) + f(b)) / 6)

def error(valueObtained: Double, valueExpected: Double): Double =
  valueExpected - valueObtained

/*
2. Aproxima el valor de las siguientes integrales definidas usando la función
integracion creada en el paso 1.
*/

val i1 = integration(x => -Math.pow(x,2) + 8*x - 12, 3, 5)
val i2 = integration(x => 3*Math.pow(x,2), 0, 2)
val i3 = integration(x => x + 2*Math.pow(x,2) - Math.pow(x,3) + 5*Math.pow(x,4), -1, 1)
val i4 = integration(x => (2*x + 1) / (Math.pow(x,2) + x), 1, 2)
val i5 = integration(x => Math.exp(x), 0, 1)
val i6 = integration(x => 1/Math.sqrt(x-1), 2, 3)
val i7 = integration(x => 1/Math.sqrt(1 + Math.pow(x,2)), 0, 1)

/*
3. Calcula el error que se presenta en cada aproximación. El error es igual al valor
absoluto de la resta entre el valor esperado y el valor obtenido, así:
*/

val e1 = error(i1, 7.33)
printf("I1 = %.2f\nError = %.2f\n", i1, e1)

val e2 = error(i2, 8)
printf("I2 = %.2f\nError = %.2f\n", i2, e2)

val e3 = error(i3, 3.33)
printf("I3 = %.2f\nError = %.2f\n", i3, e3)

val e4 = error(i4, 1.09)
printf("I4 = %.2f\nError = %.2f\n", i4, e4)

val e5 = error(i5, 1.71)
printf("I5 = %.2f\nError = %.2f\n", i5, e5)

val e6 = error(i6, 0.82)
printf("I6 = %.2f\nError = %.2f\n", i6, e6)

val e7 = error(i7, 0.78)
printf("I7 = %.2f\nError = %.2f\n", i7, e7)

// Sebastián "cbhas" Calderón
