object Paciente {
  class Pacientes {
    var nombre = "Jose de Jesus"
    var primerApellido = "Muñez"
    var segundoApellido = "Rodriguez"
    var edad = 23
    var fecha = List("19-04-2019", "11-09-2020", "27-12-2020", "03-06-2021")
    var horaRegistro = List("13:11", "21:09", "12:47", "16:05")
    var nivelBienestar = List(2, 5, 3, 1, 2)
    var temperatura = List(36.5, 37.0, 37.5, 36.0, 38.0)
    var humedad = List(23.5, 38.6, 49.4, 55.3, 38.2)

    def promedioBienestar(): Double = {
      nivelBienestar.sum.toDouble / nivelBienestar.length.toDouble
    }

    def temperaturaMayor(): Unit = {
      var mayor = 0.0
      var nivelBienestarMayor = 0
      var fechaMayor = ""

      for (i <- 0 until temperatura.length) {
        if (temperatura(i) > mayor) {
          mayor = temperatura(i)
          nivelBienestarMayor = nivelBienestar(i)
          fechaMayor = fecha(i)
        }
      }

      println("La Temperatura mayor registrada es de: " + mayor + " Se registro en: " + fechaMayor + " y el nivel de bienestar es de: " + nivelBienestarMayor)

    }

    def temperaturaMenor(): Unit = {
      var menor = 1000000.0
      var nivelBienestarMenor = 0
      var fechaMenor = ""

      for (i <- 0 until temperatura.length) {
        if (temperatura(i) < menor) {
          menor = temperatura(i)
          nivelBienestarMenor = nivelBienestar(i)
          fechaMenor = fecha(i)
        }
      }

      println("La Temperatura mayor registrada es de: " + menor + " Se registro en: " + fechaMenor + " y el nivel de bienestar es de: " + nivelBienestarMenor)

    }

  }

  def main(args: Array[String]): Unit = {
    val pac = new Pacientes
    println("Promedio de Nivel de Bienestar para el paciente" + pac.nombre + " es de: " + pac.promedioBienestar())
    pac.temperaturaMayor()
    pac.temperaturaMenor()
  }
}
