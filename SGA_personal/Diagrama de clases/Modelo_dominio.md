# Modelo de dominio

#### Package in package 'Modelado estructural'

#### Modelo de dominio

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

## Modelo de dominio diagram

#### Class diagram in package 'Modelo de dominio'

#### Modelo de dominio

#### Version 1.

#### leosa created on 29/06/2026. Last modified 12/07/

```
Figure 1: Modelo de dominio
```
## Tipos de datos

#### Package in package 'Modelo de dominio'

#### Tipos de datos

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 1/07/2026. Last modified 1/07/


### LocalDate

#### DataType in package 'Tipos de datos'

#### LocalDate

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 2/07/2026. Last modified 2/07/

### LocalDateTime

#### DataType in package 'Tipos de datos'

#### LocalDateTime

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 1/07/2026. Last modified 2/07/

### String

#### DataType in package 'Tipos de datos'

#### String

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 1/07/2026. Last modified 1/07/

## Acudiente

#### Class in package 'Modelo de dominio'

#### Acudiente

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 2/07/

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Generalization from Acudiente to Persona
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
idAcudiente : int Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Destination -> Source)
```
```
Source: Private acudiente (Class) Acudiente
Cardinality: [1]
```
```
Target: Public (Class) AcudienteEstudiante
Cardinality: [1..*]
```
```
Association (direction: Source -> Destination)
```

##### ASSOCIATIONS

```
Source: Public (Class) AcudienteAspirante
Cardinality: [1..*]
```
```
Target: Private acudiente (Class) Acudiente
Cardinality: [0..1]
```
## AcudienteAspirante

#### Class in package 'Modelo de dominio'

#### AcudienteAspirante

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 30/06/2026. Last modified 30/06/

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Aggregation from AcudienteAspirante to Preinscripcion
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
acudiente : Acudiente Private
[ Is static True. Containment is Not Specified. ]
```
```
correoElectronico : String Private
[ Is static True. Containment is Not Specified. ]
```
```
esPrincipal : boolean Private
[ Is static True. Containment is Not Specified. ]
```
```
idAcudienteAspirante : int Private
[ Is static True. Containment is Not Specified. ]
```
```
parentesco : String Private
[ Is static True. Containment is Not Specified. ]
```
```
primerApellido : String Private
[ Is static True. Containment is Not Specified. ]
```
```
primerNombre : String Private
[ Is static True. Containment is Not Specified. ]
```
```
segundoApellido : String Private
[ Is static True. Containment is Not Specified. ]
```
```
segundoNombre : String Private
[ Is static True. Containment is Not Specified. ]
```

##### ATTRIBUTES

```
telefono : String Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) AcudienteAspirante
Cardinality: [1..*]
```
```
Target: Private acudiente (Class) Acudiente
Cardinality: [0..1]
```
## AcudienteEstudiante

#### Class in package 'Modelo de dominio'

#### AcudienteEstudiante

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 1/07/2026. Last modified 1/07/

##### ATTRIBUTES

```
acudiente : Acudiente Private
[ Is static True. Containment is Not Specified. ]
```
```
esPrincipal : boolean Private
[ Is static True. Containment is Not Specified. ]
```
```
estudiante : Estudiante Private
[ Is static True. Containment is Not Specified. ]
```
```
idAcudienteEstudiante : int Private
[ Is static True. Containment is Not Specified. ]
```
```
parentesco : String Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Bi-Directional)
```
```
Source: Private estudiante (Class) Estudiante
Cardinality: [1..*]
```
```
Target: Private acudientes (Class)
AcudienteEstudiante
Cardinality: [1..*]
```
```
Association (direction: Destination -> Source)
```
```
Source: Private acudiente (Class) Acudiente
Cardinality: [1]
```
```
Target: Public (Class) AcudienteEstudiante
Cardinality: [1..*]
```

## Boletin

#### Class in package 'Modelo de dominio'

#### Boletin

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Aggregation from Boletin to Estudiante
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
estudiante : Estudiante Private
[ Is static True. Containment is Not Specified. ]
```
```
idBoletin : int Private
[ Is static True. Containment is Not Specified. ]
```
```
logros : List<LogroEstudiante> Private
[ Is static True. Containment is Not Specified. ]
```
```
periodoAcademico : PeriodoAcademico Private
[ Is static True. Containment is Not Specified. ]
```
```
profesor : Profesor Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Boletin
Cardinality: [0..*]
```
```
Target: Private periodoAcademico (Class)
PeriodoAcademico
Cardinality: [1]
```
```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Boletin
Cardinality: [1]
```
```
Target: Private logros (Class) LogroEstudiante
Cardinality: [1..*]
```
```
Association (direction: Destination -> Source)
```
```
Source: Private profesor (Class) Profesor
Cardinality: [1]
```
```
Target: Public (Class) Boletin
Cardinality: [0..*]
```

##### OPERATIONS

```
añadirLogro (logro : LogroEstudiante ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
## CategoriaLogro

#### Class in package 'Modelo de dominio'

#### CategoriaLogro

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### INCOMING STRUCTURAL RELATIONSHIPS

```
Aggregation from Logro to CategoriaLogro
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
idCategoriaLogro : int Private
[ Is static True. Containment is Not Specified. ]
```
```
nombreCategoriaLogro : String Private
[ Is static True. Containment is Not Specified. ]
```
## Directivo

#### Class in package 'Modelo de dominio'

#### Directivo

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Generalization from Directivo to Persona
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
idDirectivo : int Private
[ Is static True. Containment is Not Specified. ]
```
## Entrevista

#### Class in package 'Modelo de dominio'


#### Entrevista

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### ATTRIBUTES

```
estadoEntrevista : EstadoEntrevista Private
[ Is static True. Containment is Not Specified. ]
```
```
horarioEntrevista : HorarioEntrevista Private
[ Is static True. Containment is Not Specified. ]
```
```
idEntrevista : int Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Entrevista
Cardinality: [0..1]
```
```
Target: Private horarioEntrevista (Class)
HorarioEntrevista
Cardinality: [1]
```
```
Association (direction: Destination -> Source)
```
```
Source: Private estadoEntrevista (Enumeration) EstadoEntrevista
Cardinality: [1]
```
```
Target: Public (Class) Entrevista
Cardinality: [0..*]
```
```
Association (direction: Source -> Destination)
```
```
Source: Private (Class) Preinscripcion
Cardinality: [1]
```
```
Target: Private entrevistas (Class) Entrevista
Cardinality: [1..*]
```
##### OPERATIONS

```
cancelarEntrevista () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
marcarRealizada () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
programarEntrevista (horarioEntrevista : HorarioEntrevista ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
## Estudiante

#### Class in package 'Modelo de dominio'

#### Estudiante


#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Generalization from Estudiante to Persona
[ Direction is 'Source -> Destination'. ]
```
```
Aggregation from Estudiante to Grupo
[ Direction is 'Source -> Destination'. ]
```
##### INCOMING STRUCTURAL RELATIONSHIPS

```
Aggregation from LogroEstudiante to Estudiante
[ Direction is 'Source -> Destination'. ]
```
```
Aggregation from HojaVida to Estudiante
[ Direction is 'Source -> Destination'. ]
```
```
Aggregation from Boletin to Estudiante
[ Direction is 'Source -> Destination'. ]
```
```
Aggregation from Reporte to Estudiante
[ Direction is 'Source -> Destination'. ]
```
```
Aggregation from Observador to Estudiante
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
acudientes : List<AcudienteEstudiante> Private
[ Is static True. Containment is Not Specified. ]
```
```
estadoEstudiante : EstadoEstudiante Private
[ Is static True. Containment is Not Specified. ]
```
```
grado : Grado Private
[ Is static True. Containment is Not Specified. ]
```
```
grupo : Grupo Private
[ Is static True. Containment is Not Specified. ]
```
```
idEstudiante : int Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS


##### ASSOCIATIONS

```
Association (direction: Bi-Directional)
```
```
Source: Private estudiante (Class) Estudiante
Cardinality: [1..*]
```
```
Target: Private acudientes (Class)
AcudienteEstudiante
Cardinality: [1..*]
```
```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Estudiante
Cardinality: [0..*]
```
```
Target: Private grado (Class) Grado
Cardinality: [1]
```
```
Association (direction: Destination -> Source)
```
```
Source: Private estadoEstudiante (Enumeration) EstadoEstudiante
Cardinality: [1]
```
```
Target: Public (Class) Estudiante
Cardinality: [0..*]
```
```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) EstudianteAspirante
Cardinality: [1]
```
```
Target: Private estudiante (Class) Estudiante
Cardinality: [0..1]
```
##### OPERATIONS

```
activar () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
asignarAcudientePrincipal (acudiente : AcudienteEstudiante ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
mandarVacaciones () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
retirar () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
## EstudianteAspirante

#### Class in package 'Modelo de dominio'

#### EstudianteAspirante

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 30/06/2026. Last modified 1/07/

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Aggregation from EstudianteAspirante to Preinscripcion
[ Direction is 'Source -> Destination'. ]
```

##### ATTRIBUTES

```
edad : int Private
[ Is static True. Containment is Not Specified. ]
```
```
estadoAprobacion : EstadoAprobacion Private
[ Is static True. Containment is Not Specified. ]
```
```
gradoAspira : Grado Private
[ Is static True. Containment is Not Specified. ]
```
```
idEstudianteAspirante : int Private
[ Is static True. Containment is Not Specified. ]
```
```
primerApellido : String Private
[ Is static True. Containment is Not Specified. ]
```
```
primerNombre : String Private
[ Is static True. Containment is Not Specified. ]
```
```
segundoApellido : String Private
[ Is static True. Containment is Not Specified. ]
```
```
segundoNombre : String Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) EstudianteAspirante
Cardinality: [1]
```
```
Target: Private estudiante (Class) Estudiante
Cardinality: [0..1]
```
```
Association (direction: Destination -> Source)
```
```
Source: Private estadoAprobacion (Enumeration)
EstadoAprobacion
Cardinality: [1]
```
```
Target: Public (Class) EstudianteAspirante
Cardinality: [0..*]
```
##### OPERATIONS

```
aprobar () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
desistirProceso () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```

##### OPERATIONS

```
ponerEnEspera () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
ponerEnPendiente () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
rechazar () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
## Grado

#### Class in package 'Modelo de dominio'

#### Grado

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### ATTRIBUTES

```
grupos : List<Grupo> Private
[ Is static True. Containment is Not Specified. ]
```
```
idGrado : int Private
[ Is static True. Containment is Not Specified. ]
```
```
nombreGrado : String Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Grado
Cardinality: [1]
```
```
Target: Private grupos (Class) Grupo
Cardinality: [2..*]
```
```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Estudiante
Cardinality: [0..*]
```
```
Target: Private grado (Class) Grado
Cardinality: [1]
```
##### OPERATIONS

```
añadirGrupo (grupo : Grupo ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
eliminarGrupo (grupo : Grupo ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```

##### OPERATIONS

## Grupo

#### Class in package 'Modelo de dominio'

#### Grupo

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### INCOMING STRUCTURAL RELATIONSHIPS

```
Aggregation from Estudiante to Grupo
[ Direction is 'Source -> Destination'. ]
```
```
Aggregation from Profesor to Grupo
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
directorGrupo : Profesor Private
[ Is static True. Containment is Not Specified. ]
```
```
idGrupo : int Private
[ Is static True. Containment is Not Specified. ]
```
```
nombreGrupo : String Private
[ Is static True. Containment is Not Specified. ]
```
```
profesores : List<Profesor> Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Grado
Cardinality: [1]
```
```
Target: Private grupos (Class) Grupo
Cardinality: [2..*]
```
##### OPERATIONS

```
añadirProfesor (profesor : Profesor ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
eliminarProfesor (profesor : Profesor ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```

##### OPERATIONS

```
establecerDirector (profesor : Profesor ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
## HojaVida

#### Class in package 'Modelo de dominio'

#### HojaVida

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Aggregation from HojaVida to Estudiante
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
alergias : String Private
[ Is static True. Containment is Not Specified. ]
```
```
aspectosRelevantes : String Private
[ Is static True. Containment is Not Specified. ]
```
```
enfermedades : String Private
[ Is static True. Containment is Not Specified. ]
```
```
estudiante : Estudiante Private
[ Is static True. Containment is Not Specified. ]
```
```
idHojaVida : int Private
[ Is static True. Containment is Not Specified. ]
```
## HorarioEntrevista

#### Class in package 'Modelo de dominio'

#### HorarioEntrevista

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 1/07/

##### ATTRIBUTES

```
estadoHorarioEntrevista : EstadoHorarioEntrevista Private = DISPONIBLE
[ Is static True. Containment is Not Specified. ]
```
```
finHorario : LocalDateTime Private
```

##### ATTRIBUTES

```
[ Is static True. Containment is Not Specified. ]
```
```
idHorarioEntrevista : int Private
[ Is static True. Containment is Not Specified. ]
```
```
inicioHorario : LocalDateTime Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Entrevista
Cardinality: [0..1]
```
```
Target: Private horarioEntrevista (Class)
HorarioEntrevista
Cardinality: [1]
```
```
Association (direction: Destination -> Source)
```
```
Source: Private estadoHorarioEntrevista (Enumeration)
EstadoHorarioEntrevista
Cardinality: [1]
```
```
Target: Public (Class) HorarioEntrevista
Cardinality: [0..*]
```
##### OPERATIONS

```
liberar () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
reservar () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
validarHorario (inicioHorario : LocalDateTime , finHorario : LocalDateTime ) : boolean Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
## Logro

#### Class in package 'Modelo de dominio'

#### Logro

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Aggregation from Logro to CategoriaLogro
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES


##### ATTRIBUTES

```
categoriaLogro : CategoriaLogro Private
[ Is static True. Containment is Not Specified. ]
```
```
descripcionLogro : String Private
[ Is static True. Containment is Not Specified. ]
```
```
idLogro : int Private
[ Is static True. Containment is Not Specified. ]
```
```
nombreLogro : String Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) LogroEstudiante
Cardinality: [1]
```
```
Target: Private logro (Class) Logro
Cardinality: [1]
```
## LogroEstudiante

#### Class in package 'Modelo de dominio'

#### LogroEstudiante

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Aggregation from LogroEstudiante to Estudiante
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
estudiante : Estudiante Private
[ Is static True. Containment is Not Specified. ]
```
```
fechaLogro : LocalDate Private
[ Is static True. Containment is Not Specified. ]
```
```
idLogroEstudiante : int Private
[ Is static True. Containment is Not Specified. ]
```
```
logro : Logro Private
[ Is static True. Containment is Not Specified. ]
```

##### ATTRIBUTES

```
periodoAcademico : PeriodoAcademico Private
[ Is static True. Containment is Not Specified. ]
```
```
profesor : Profesor Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) LogroEstudiante
Cardinality: [1]
```
```
Target: Private logro (Class) Logro
Cardinality: [1]
```
```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) LogroEstudiante
Cardinality: [0..*]
```
```
Target: Private periodoAcademico (Class)
PeriodoAcademico
Cardinality: [1]
```
```
Association (direction: Destination -> Source)
```
```
Source: Private profesor (Class) Profesor
Cardinality: [1]
```
```
Target: Public (Class) LogroEstudiante
Cardinality: [0..*]
```
```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Boletin
Cardinality: [1]
```
```
Target: Private logros (Class) LogroEstudiante
Cardinality: [1..*]
```
```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Reporte
Cardinality: [1..*]
```
```
Target: Private logrosEstudiante (Class)
LogroEstudiante
Cardinality: [1..*]
```
## Observacion

#### Class in package 'Modelo de dominio'

#### Observacion

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Aggregation from Observacion to Observador
[ Direction is 'Source -> Destination'. ]
```

##### ATTRIBUTES

```
descripcionObservacion : String Private
[ Is static True. Containment is Not Specified. ]
```
```
fechaObservacion : LocalDate Private
[ Is static True. Containment is Not Specified. ]
```
```
idObservacion : int Private
[ Is static True. Containment is Not Specified. ]
```
```
profesor : Profesor Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Destination -> Source)
```
```
Source: Private profesor (Class) Profesor
Cardinality: [1]
```
```
Target: Public (Class) Observacion
Cardinality: [0..*]
```
## Observador

#### Class in package 'Modelo de dominio'

#### Observador

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Aggregation from Observador to Estudiante
[ Direction is 'Source -> Destination'. ]
```
##### INCOMING STRUCTURAL RELATIONSHIPS

```
Aggregation from Observacion to Observador
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
estudiante : Estudiante Private
[ Is static True. Containment is Not Specified. ]
```
```
idObservador : int Private
[ Is static True. Containment is Not Specified. ]
```
```
observaciones : List<Observacion> Private
```

##### ATTRIBUTES

```
[ Is static True. Containment is Not Specified. ]
```
```
periodoAcademico : PeriodoAcademico Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Observador
Cardinality: [0..*]
```
```
Target: Private periodoAcademico (Class)
PeriodoAcademico
Cardinality: [1]
```
##### OPERATIONS

```
añadirObservacion (observacion : Observacion ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
eliminarObservacion (observacion : Observacion ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
## PeriodoAcademico

#### Class in package 'Modelo de dominio'

#### PeriodoAcademico

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### ATTRIBUTES

```
estadoPeriodoAcademico : EstadoPeriodoAcademico Private
[ Is static True. Containment is Not Specified. ]
```
```
finPeriodoAcademico : LocalDate Private
[ Is static True. Containment is Not Specified. ]
```
```
idPeriodoAcademico : int Private
[ Is static True. Containment is Not Specified. ]
```
```
inicioPeriodoAcademico : LocalDate Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```

##### ASSOCIATIONS

```
Source: Public (Class) Reporte
Cardinality: [0..*]
```
```
Target: Private periodoAcademico (Class)
PeriodoAcademico
Cardinality: [1]
```
```
Association (direction: Destination -> Source)
```
```
Source: Private estadoPeriodoAcademico (Enumeration)
EstadoPeriodoAcademico
Cardinality: [1]
```
```
Target: Public (Class) PeriodoAcademico
Cardinality: [0..*]
```
```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Boletin
Cardinality: [0..*]
```
```
Target: Private periodoAcademico (Class)
PeriodoAcademico
Cardinality: [1]
```
```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Observador
Cardinality: [0..*]
```
```
Target: Private periodoAcademico (Class)
PeriodoAcademico
Cardinality: [1]
```
```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) LogroEstudiante
Cardinality: [0..*]
```
```
Target: Private periodoAcademico (Class)
PeriodoAcademico
Cardinality: [1]
```
##### OPERATIONS

```
abrirPeriodo () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
cerrarPeriodo () : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
## Persona

#### Class in package 'Modelo de dominio'

#### Persona

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### INCOMING STRUCTURAL RELATIONSHIPS

```
Generalization from Acudiente to Persona
[ Direction is 'Source -> Destination'. ]
```

##### INCOMING STRUCTURAL RELATIONSHIPS

```
Generalization from Directivo to Persona
[ Direction is 'Source -> Destination'. ]
```
```
Generalization from Estudiante to Persona
[ Direction is 'Source -> Destination'. ]
```
```
Generalization from Profesor to Persona
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
idPersona : int Private
[ Is static True. Containment is Not Specified. ]
```
```
primerApellido : String Private
[ Is static True. Containment is Not Specified. ]
```
```
primerNombre : String Private
[ Is static True. Containment is Not Specified. ]
```
```
segundoApellido : String Private
[ Is static True. Containment is Not Specified. ]
```
```
segundoNombre : String Private
[ Is static True. Containment is Not Specified. ]
```
```
usuario : Usuario Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Destination -> Source)
```
```
Source: Private usuario (Class) Usuario
Cardinality: [0..1]
```
```
Target: Public (Class) Persona
Cardinality: [1]
```
## Preinscripcion

#### Class in package 'Modelo de dominio'

#### Preinscripcion

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/

##### INCOMING STRUCTURAL RELATIONSHIPS


##### INCOMING STRUCTURAL RELATIONSHIPS

```
Aggregation from EstudianteAspirante to Preinscripcion
[ Direction is 'Source -> Destination'. ]
```
```
Aggregation from AcudienteAspirante to Preinscripcion
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
acudientesAspirantes : List<AcudienteAspirante> Private
[ Is static True. Containment is Not Specified. ]
```
```
entrevistas : List<Entrevista> Private
[ Is static True. Containment is Not Specified. ]
```
```
estudiantesAspirantes : List<EstudianteAspirante> Private
[ Is static True. Containment is Not Specified. ]
```
```
fechaPreinscripcion : LocalDateTime Private
[ Is static True. Containment is Not Specified. ]
```
```
idPreinscripcion : int Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Private (Class) Preinscripcion
Cardinality: [1]
```
```
Target: Private entrevistas (Class) Entrevista
Cardinality: [1..*]
```
##### OPERATIONS

```
agregarAcudienteAspirante (acudienteASpirante : AcudienteAspirante ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
agregarEntrevista (entrevista : Entrevista ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
agregarEstudianteAspirante (estudianteAspirante : EstudianteAspirante ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
eliminarAcudienteAspirante (acudienteAspirante : AcudienteAspirante ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
eliminarEntrevista (entrevista : Entrevista ) : void Public
```

##### OPERATIONS

```
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
eliminarEstudianteAspirante (estudianteAspirante : EstudianteAspirante ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
evaluarEstado (estudianteAspirante : EstudianteAspirante ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
## Profesor

#### Class in package 'Modelo de dominio'

#### Profesor

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/2026

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Generalization from Profesor to Persona
[ Direction is 'Source -> Destination'. ]
```
```
Aggregation from Profesor to Grupo
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
idProfesor : int Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Destination -> Source)
```
```
Source: Private profesor (Class) Profesor
Cardinality: [1]
```
```
Target: Public (Class) Reporte
Cardinality: [0..*]
```
```
Association (direction: Destination -> Source)
```
```
Source: Private profesor (Class) Profesor
Cardinality: [1]
```
```
Target: Public (Class) Observacion
Cardinality: [0..*]
```
```
Association (direction: Destination -> Source)
```
```
Source: Private profesor (Class) Profesor
Cardinality: [1]
```
```
Target: Public (Class) LogroEstudiante
Cardinality: [0..*]
```
```
Association (direction: Destination -> Source)
```

##### ASSOCIATIONS

```
Source: Private profesor (Class) Profesor
Cardinality: [1]
```
```
Target: Public (Class) Boletin
Cardinality: [0..*]
```
## Reporte

#### Class in package 'Modelo de dominio'

#### Reporte

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/2026

##### OUTGOING STRUCTURAL RELATIONSHIPS

```
Aggregation from Reporte to Estudiante
[ Direction is 'Source -> Destination'. ]
```
##### ATTRIBUTES

```
descripcionReporte : String Private
[ Is static True. Containment is Not Specified. ]
```
```
estudiante : Estudiante Private
[ Is static True. Containment is Not Specified. ]
```
```
idReporte : int Private
[ Is static True. Containment is Not Specified. ]
```
```
logrosEstudiante : List<LogroEstudiante> Private
[ Is static True. Containment is Not Specified. ]
```
```
nombreReporte : String Private
[ Is static True. Containment is Not Specified. ]
```
```
periodoAcademico : PeriodoAcademico Private
[ Is static True. Containment is Not Specified. ]
```
```
profesor : Profesor Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Reporte
Cardinality: [0..*]
```
```
Target: Private periodoAcademico (Class)
PeriodoAcademico
Cardinality: [1]
```

##### ASSOCIATIONS

```
Association (direction: Source -> Destination)
```
```
Source: Public (Class) Reporte
Cardinality: [1..*]
```
```
Target: Private logrosEstudiante (Class)
LogroEstudiante
Cardinality: [1..*]
```
```
Association (direction: Destination -> Source)
```
```
Source: Private profesor (Class) Profesor
Cardinality: [1]
```
```
Target: Public (Class) Reporte
Cardinality: [0..*]
```
##### OPERATIONS

```
agregarLogroEstudiante (logroEstudiante : LogroEstudiante ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
```
eliminarLogroEstudiante (logroEstudiante : LogroEstudiante ) : void Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
## Rol

#### Class in package 'Modelo de dominio'

#### Rol

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/2026

##### ATTRIBUTES

```
idRol : int Private
[ Is static True. Containment is Not Specified. ]
```
```
nombreRol : String Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Destination -> Source)
```
```
Source: Private rol (Class) Rol
Cardinality: [1]
```
```
Target: Public (Class) Usuario
Cardinality: [1..*]
```
## Usuario

#### Class in package 'Modelo de dominio'


#### Usuario

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 29/06/2026. Last modified 29/06/2026

##### ATTRIBUTES

```
contraseña : String Private
[ Is static True. Containment is Not Specified. ]
```
```
correoElectronico : String Private
[ Is static True. Containment is Not Specified. ]
```
```
idUsuario : int Private
[ Is static True. Containment is Not Specified. ]
```
```
nombreUsuario : String Private
[ Is static True. Containment is Not Specified. ]
```
```
rol : Rol Private
[ Is static True. Containment is Not Specified. ]
```
```
telefono : String Private
[ Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Destination -> Source)
```
```
Source: Private usuario (Class) Usuario
Cardinality: [0..1]
```
```
Target: Public (Class) Persona
Cardinality: [1]
```
```
Association (direction: Destination -> Source)
```
```
Source: Private rol (Class) Rol
Cardinality: [1]
```
```
Target: Public (Class) Usuario
Cardinality: [1..*]
```
##### OPERATIONS

```
validarCredenciales (credencial : String ) : boolean Public
[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]
```
## EstadoAprobacion

#### Enumeration in package 'Modelo de dominio'

#### EstadoAprobacion

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 30/06/2026. Last modified 30/06/2026


##### ATTRIBUTES

```
APROBADO : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
```
RECHAZADO : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
```
EN_ESPERA : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
```
PENDIENTE : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
```
CANCELADO : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Destination -> Source)
```
```
Source: Private estadoAprobacion (Enumeration)
EstadoAprobacion
Cardinality: [1]
```
```
Target: Public (Class) EstudianteAspirante
Cardinality: [0..*]
```
## EstadoEntrevista

#### Enumeration in package 'Modelo de dominio'

#### EstadoEntrevista

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 1/07/2026. Last modified 1/07/2026

##### ATTRIBUTES

```
PROGRAMADA : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
```
REALIZADA : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
```
CANCELADA : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Destination -> Source)
```

##### ASSOCIATIONS

```
Source: Private estadoEntrevista (Enumeration) EstadoEntrevista
Cardinality: [1]
```
```
Target: Public (Class) Entrevista
Cardinality: [0..*]
```
## EstadoEstudiante

#### Enumeration in package 'Modelo de dominio'

#### EstadoEstudiante

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 30/06/2026. Last modified 30/06/2026

##### ATTRIBUTES

```
RETIRADO : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
```
VACACIONES : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
```
ACTIVO : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Destination -> Source)
```
```
Source: Private estadoEstudiante (Enumeration) EstadoEstudiante
Cardinality: [1]
```
```
Target: Public (Class) Estudiante
Cardinality: [0..*]
```
## EstadoHorarioEntrevista

#### Enumeration in package 'Modelo de dominio'

#### EstadoHorarioEntrevista

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 30/06/2026. Last modified 1/07/2026

##### ATTRIBUTES

```
DISPONIBLE : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
```
OCUPADO : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS


##### ASSOCIATIONS

```
Association (direction: Destination -> Source)
```
```
Source: Private estadoHorarioEntrevista (Enumeration)
EstadoHorarioEntrevista
Cardinality: [1]
```
```
Target: Public (Class) HorarioEntrevista
Cardinality: [0..*]
```
## EstadoPeriodoAcademico

#### Enumeration in package 'Modelo de dominio'

#### EstadoPeriodoAcademico

#### Version 1.0 Phase 1.0 Proposed

#### leosa created on 10/07/2026. Last modified 10/07/2026

##### ATTRIBUTES

```
ABIERTO : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
```
CERRADO : Public
[ Stereotype is «enum». Is static True. Containment is Not Specified. ]
```
##### ASSOCIATIONS

```
Association (direction: Destination -> Source)
```
```
Source: Private estadoPeriodoAcademico (Enumeration)
EstadoPeriodoAcademico
Cardinality: [1]
```
```
Target: Public (Class) PeriodoAcademico
Cardinality: [0..*]
```

