val theCars = listOf("Audi", "Maserati", )
val Planes = listOf("Boeing737", "Boeing777",)

fun arrayOfCars(): Car? {
    return CarFactory().create(theCars.random())
}

fun arrayOfPlnes(): Aircraft? {
    return AircraftFactory().create(Planes.random())
}