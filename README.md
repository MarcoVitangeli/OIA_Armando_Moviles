# OIA_Armando_Moviles

Descripción del problema
Un artesano hace, entre otras cosas, móviles para chicos. Estos están compuestos básicamente de 3 partes:
• varillas
• colgantes
• hilo

Los que realiza son sencillos: un móvil está compuesto por una varilla que cuelga por el punto medio y de sus extremos cuelgan sendos colgantes. Hay sólo un requisito para que un móvil quede bien: Los pesos colgados de cada extremo debenser iguales. El artesano prepara de antemano las varillas con sus "enganches" para los hilos (dos a los extremos, uno en el punto medio), y los colgantes (en general blancos y negros que son los mejores para despertar la creatividad de los chicos), luego pesa los colgantes, confeccionando una tabla. Se te pide que mediante un programa, determines la mayor
cantidad de móviles que se puede realizar e informes su peso total y la cantidad de varillas necesarias para construirlos.

 Datos de entrada
Se recibe un archivo colgantes.in en el directorio actual con los siguientes datos:
• Primero una línea con la cantidad C de colgantes ( 0 ≤ C ≤ 1000 )
• Luego C líneas con el peso de cada colgante pc ( 1 ≤ pc ≤ 100 )

Datos de salida
Se debe generar un archivo colgantes.out en el directorio actual con una única línea con una de las siguientes alternativas:
• La hilera "no se puede" si no se puede realizar ningún móvil con los elementos disponibles.
• El peso total de los móviles y el número de varillas necesarias, separados por un espacio.

Ejemplo
Si la entrada colgantes.in fuera: 

6
4
3
1
2
3
1 

La salida colgantes.outdebería ser:

8 2 
