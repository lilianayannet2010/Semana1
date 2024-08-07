fun main() {
    // Crear un objeto Scanner para leer la entrada del usuario
    val scanner = java.util.Scanner(System.`in`)

    // Solicitar al usuario que ingrese una cadena de caracteres
    print("Ingrese una cadena de caracteres: ")
    val input = scanner.nextLine()

    // Convertir la cadena a minúsculas para hacer la búsqueda  a mayúsculas y minúsculas
    val lowerCaseInput = input.lowercase()

    // Definir las vocales
    val vowels = "aeiou"

    // Contar las vocales
    var vowelCount = 0

    // Iterar a través de cada carácter en la cadena
    for (char in lowerCaseInput) {
        // Verificar si el carácter es una vocal
        if (char in vowels) {
            vowelCount++
        }
    }

    // Mostrar el número total de vocales encontradas
    println("Número total de vocales encontradas: $vowelCount")
}
