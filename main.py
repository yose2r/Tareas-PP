class Persona:
    #Constructor
    def __init__(self, nombre, apellido, edad, genero, direccion, telefono, email, nacionalidad, estado_civil, profesion):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.genero = genero
        self.direccion = direccion
        self.telefono = telefono
        self.email = email
        self.nacionalidad = nacionalidad
        self.estado_civil = estado_civil
        self.profesion = profesion

    # Métodos get/set
    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_apellido(self):
        return self.apellido

    def set_apellido(self, apellido):
        self.apellido = apellido

    def get_edad(self):
        return self.edad

    def set_edad(self, edad):
        self.edad = edad

    def get_genero(self):
        return self.genero

    def set_genero(self, genero):
        self.genero = genero

    def get_direccion(self):
        return self.direccion

    def set_direccion(self, direccion):
        self.direccion = direccion

    def get_telefono(self):
        return self.telefono

    def set_telefono(self, telefono):
        self.telefono = telefono

    def get_email(self):
        return self.email

    def set_email(self, email):
        self.email = email

    def get_nacionalidad(self):
        return self.nacionalidad

    def set_nacionalidad(self, nacionalidad):
        self.nacionalidad = nacionalidad

    def get_estado_civil(self):
        return self.estado_civil

    def set_estado_civil(self, estado_civil):
        self.estado_civil = estado_civil

    def get_profesion(self):
        return self.profesion

    def set_profesion(self, profesion):
        self.profesion = profesion


def main():
    # Crear una nueva instancia de Persona
    persona = Persona("Juan", "Pérez", 30, "Masculino", "123 Calle Principal", "123456789", "juan@example.com", "Mexicana", "Soltero", "Ingeniero")

    print("Nombre completo:", persona.nombre, persona.apellido)
    print("Edad:", persona.edad)
    print("Género:", persona.genero)
    print("Dirección:", persona.direccion)
    print("Teléfono:", persona.telefono)
    print("Correo electrónico:", persona.email)
    print("Nacionalidad:", persona.nacionalidad)
    print("Estado civil:", persona.estado_civil)
    print("Profesión:", persona.profesion)

# Llamada a la función principal
if __name__ == "__main__":
    main()
