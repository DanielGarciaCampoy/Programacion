Algoritmo _4_5_ej2
	Definir hora Como Real;
	
	Escribir "Introduzca una hora: ";
		Leer hora;
		
		Si hora >= 6 y hora <= 12 Entonces;
			Escribir "Buenos días";
		FinSi;
		Si hora >= 13 y hora <= 20 Entonces;
			Escribir "Buenas tardes";
		FinSi;
		Si hora >= 21 y hora <= 5 Entonces;
			Escribir "Buenas noches";
		FinSi;
FinAlgoritmo