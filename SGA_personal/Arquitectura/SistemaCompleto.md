Model Report 

16 July, 2026 

# **Modelado estructural** 

_Package in package 'Model'_ 

Modelado estructural Version 1.0  Phase 1.0  Proposed leosa created on 24/06/2026.  Last modified 24/06/2026 

## **Modelo de dominio** 

_Package in package 'Modelado estructural'_ 

Modelo de dominio Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 29/06/2026 

### **Arquitectura** 

_Package in package 'Modelo de dominio'_ 

Arquitectura Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_Arquitectura diagram_** 

_Package diagram in package 'Arquitectura'_ 

Arquitectura Version 1.0 leosa created on 13/07/2026.  Last modified 16/07/2026 

Page  1 of 78 



<!-- Start of picture text -->
CapaPresentacion<br>T<br>r<br>!<br>i<br>1<br>1<br>\I/"4<br>CasosDeUso<br>a + MostrarinformacionPeriocbéct val<br>M+ GestionAcceso<br>= + gestionBibliotecasLogros<br>f+ gestionBoletines<br>= + gestionCitaciones Capainterfaces<br>a= + gestionEntrevistas —] BearinnCarre<br>= ae fe + NotificacionCorreo<br>= * gestionEstudiente Moe ee ee Sat Sees = + NotificacionSMS<br>= * Bestion’orupos g + NotificacionwWhatsapp<br>.<br>_ + PGSgestionLogros *@ + NotificacionService<br>Ml-_ + gestionObservador *@ + RepositorioGeneri@<T>.<br>- + gestionPeriodosAcademicos<br>= + gestionReportes as<br>= + gestionUsuarios \ \.<br>m=: preinscripcion Ry<br>(from Modelo de dominio} a<br>i.<br>i .<br>iNa<br>! ‘<br>i z<br>I \<br>; \<br>i \<br>ModeloDeDominio SN<br>\ CapaDePersistencia<br>- oe —— “S| RB + Boletinrepository<br>= » hcetoteraanee | + EstudianteAspiranteRepository<br>= solet — =| + EstudianteRepository<br>= _, a | + GrupoRepository<br>= ‘mene . | + HorarioEntrevistasRepository<br>5 A ee 7 + LogroEstudianteRepository<br>5 + Estudiant + LogroRepository<br>= + ==. sudionten: ‘ aarante ee : Ss5 ++ PeriodoAcademicoRepository ObservadorRepository<br>= i 7 Pon ate | + PreinscripcionRepository<br>= ' —_ ia : Lee oR EB + ReportesRepository<br>— onan en eee<br>Ee | + RepositorioGenericoJPA<T><br>5 ++ LogroHorarioEntrevista Le- = ate Spe\<br>| + LogroEstudiante<br>5 + Observacion (from Modelo de dominio<br>B+ observador<br>= + PeriodoAcademico<br>5 + Persona<br>= + Preinscripcion<br>5 + Profesor<br>S + Reporte<br>=| + Rol<br>| + Usuario<br>fe + EstadoAprobacion<br>& + EstadoEntrevista<br>fe] + EstadoEstudiante<br>ic:| + EstadoHorarioEntrevista<br>® + EstadoPeriodoAcademico<br>= + Tipos de datos<br>(from Modelo de dominio)<br><!-- End of picture text -->

Model Report 

16 July, 2026 

Figure 1: Arquitectura 

### **_CapaDePersistencia_** 

_Package in package 'Modelo de dominio'_ 

CapaDePersistencia Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

##### **CONNECTORS** 



**Dependency** Source -> Destination From: CapaDePersistencia : Package, Public To: CasosDeUso : Package, Public **Dependency** Source -> Destination From: CapaDePersistencia : Package, Public To: ModeloDeDominio : Package, Public 

### **_CasosDeUso_** 

_Package in package 'Modelo de dominio'_ 

CasosDeUso Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

##### **CONNECTORS** 



**Dependency** Source -> Destination From: CasosDeUso : Package, Public To: ModeloDeDominio : Package, Public **Dependency** Source -> Destination From: CapaDePersistencia : Package, Public To: CasosDeUso : Package, Public **Dependency** Source -> Destination From: CapaPresentacion : Package, Public To: CasosDeUso : Package, Public **Dependency** Source -> Destination From: CapaInterfaces : Package, Public To: CasosDeUso : Package, Public 

### **_ModeloDeDominio_** 

_Package in package 'Modelo de dominio'_ 

ModeloDeDominio 

Page  3 of 78 

Model Report 

16 July, 2026 

Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

##### **CONNECTORS** 



**Dependency** Source -> Destination From: CasosDeUso : Package, Public To: ModeloDeDominio : Package, Public **Dependency** Source -> Destination From: CapaDePersistencia : Package, Public To: ModeloDeDominio : Package, Public 

### **_CapaInterfaces_** 

_Package in package 'Arquitectura'_ 

CapaInterfaces Version 1.0  Phase 1.0  Proposed leosa created on 16/07/2026.  Last modified 16/07/2026 

##### **CONNECTORS** 



**Dependency** Source -> Destination From: CapaInterfaces : Package, Public To: CasosDeUso : Package, Public 

### **_CapaPresentacion_** 

_Package in package 'Arquitectura'_ 

CapaPresentacion Version 1.0  Phase 1.0  Proposed leosa created on 16/07/2026.  Last modified 16/07/2026 

##### **CONNECTORS** 



**Dependency** Source -> Destination From: CapaPresentacion : Package, Public To: CasosDeUso : Package, Public 

### **_CapaInterfaces_** 

_Package in package 'Arquitectura'_ 

CapaInterfaces Version 1.0  Phase 1.0  Proposed leosa created on 16/07/2026.  Last modified 16/07/2026 

Page  4 of 78 



<!-- Start of picture text -->
S|<br><!-- End of picture text -->



<!-- Start of picture text -->
«interface»<br>NotificacionService «interface»<br>+ enviarMensaje(String, String): vad RepositorioGenerico<T>P<br>+ buscarPorld(int): T<br>+  eliminar(T): void<br>A A — + guardar(T): void<br>Pe. ‘i\ noe +  modificar(T): T<br>y . /i\<br>Pi, s 1i . \. ‘ I<br>2 x t<br>NotificacionCorreo NotificacionSMS NotifcadonWhatsapp=F I;<br>CapaDePersistencia::<br>RepositorioGenericoJPA<T><br>-  entidad: Class<T><br>+  actualizar(T): OptionalxT><br>+ consultarPorid{int): Optiond<T><br>+  eliminar(T): void<br>+  guardar(T): T<br><!-- End of picture text -->







Model Report 

16 July, 2026 

##### **INCOMING STRUCTURAL RELATIONSHIPS** 



Generalization  from  EstudianteAspiranteRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  BoletinRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  EstudianteRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  HorarioEntrevistasRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  ObservadorRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  LogroRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  ReportesRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  UsuarioRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  PreinscripcionRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] **CONNECTORS Dependency** Source -> Destination From: RepositorioGenericoJPA<T> : Class, Public To: RepositorioGenerico<T> : Interface, Public **ATTRIBUTES** entidad : Class<T>  Private [ Is static True. Containment is Not Specified. ] 

##### **CONNECTORS** 

##### **ATTRIBUTES** 

##### **OPERATIONS** 



actualizar (entidad : T ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



consultarPorId (id : int ) : Optional<T> Public 

<u>[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]</u> 

Page  6 of 78 

Model Report 

16 July, 2026 

##### **OPERATIONS** 



eliminar (entidad : T ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



guardar (entidad : T ) : T Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

#### **NotificacionCorreo** 

_Class in package 'CapaInterfaces'_ 

NotificacionCorreo Version 1.0  Phase 1.0  Proposed leosa created on 16/07/2026.  Last modified 16/07/2026 

##### **CONNECTORS** 



**Dependency** Source -> Destination From: NotificacionCorreo : Class, Public To: NotificacionService : Interface, Public 

#### **NotificacionSMS** 

_Class in package 'CapaInterfaces'_ 

NotificacionSMS Version 1.0  Phase 1.0  Proposed leosa created on 16/07/2026.  Last modified 16/07/2026 

##### **CONNECTORS** 



**Dependency** Source -> Destination From: NotificacionSMS : Class, Public To: NotificacionService : Interface, Public 

#### **NotificacionWhatsapp** 

_Class in package 'CapaInterfaces'_ 

NotificacionWhatsapp Version 1.0  Phase 1.0  Proposed leosa created on 16/07/2026.  Last modified 16/07/2026 



<!-- Start of picture text -->
CONNECTORS<br><!-- End of picture text -->

Page  7 of 78 

Model Report 

16 July, 2026 

##### **CONNECTORS** 



**Dependency** Source -> Destination From: NotificacionWhatsapp : Class, Public To: NotificacionService : Interface, Public 

#### **NotificacionService** 

_Interface in package 'CapaInterfaces'_ 

NotificacionService Version 1.0  Phase 1.0  Proposed leosa created on 16/07/2026.  Last modified 16/07/2026 

##### **CONNECTORS** 



**Dependency** Source -> Destination From: NotificacionWhatsapp : Class, Public To: NotificacionService : Interface, Public 



**Dependency** Source -> Destination From: NotificacionCorreo : Class, Public To: NotificacionService : Interface, Public 



**Dependency** Source -> Destination From: NotificacionSMS : Class, Public To: NotificacionService : Interface, Public 

##### **OPERATIONS** 



enviarMensaje (titulo : String , mensaje : String ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

#### **RepositorioGenerico<T>** 

_Interface in package 'CapaInterfaces'_ 

RepositorioGenerico<T> Version 1.0  Phase 1.0  Proposed leosa created on 16/07/2026.  Last modified 16/07/2026 

##### **CONNECTORS** 



**Dependency** Source -> Destination From: RepositorioGenericoJPA<T> : Class, Public To: RepositorioGenerico<T> : Interface, Public 

##### **OPERATIONS** 



buscarPorId (id : int ) : T Public 

Page  8 of 78 

Model Report 

16 July, 2026 

##### **OPERATIONS** 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### eliminar (entidad : T ) : void Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



guardar (entidad : T ) : void Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



modificar (entidad : T ) : T Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

Page  9 of 78 

Model Report 

16 July, 2026 

### **_CapaPresentacion_** 

_Package in package 'Arquitectura'_ 

CapaPresentacion Version 1.0  Phase 1.0  Proposed leosa created on 16/07/2026.  Last modified 16/07/2026 

**LINKS TO OTHER PACKAGES** Dependency from 'CapaPresentacion' Package  to Direction: Source -> Destination 'CasosDeUso' Package 

Page 10 of 78 







<!-- Start of picture text -->
PeriodoacademicoRepository BoletinRepository<br>actualzar(entidad: Entidad): OptionakT> + actualizar(entidad: Entidad): Optionakt ReportesRepository<br>+ buscarActivo():PeriodoAcademico + buscarEstudiantesSinBoletin(idPeriodo: int): ListEstudiante> actualizar(entidad: Entidad): Optional<T<br>consuitarPori:nt): Optional + buscarPorEstudianteYPeriodo(idEstudarte: it, Fencdko: irt): Bet | buscarPorEstudlanteYPeriodo(idestudlarte: nt uP: it}: UstcRepate><br>guardar(entidad: Entidad): T + eliminar(entidad: Entida): void Serer esdiiady: void<br>+ guardarfentidad: Entidad}: T + guardar(entidad: Entidad): T<br>+ actualizar(entidad: Entidad):EstudianteAspiranteRepositoryOptional<T> ~~ AS| - ae<br>++8+ guardar(entidad:_consultarPorEstadoAspirante(estadoAprobacion;consultarPorid{id:OREntidad):int): Optional<7 EstadoAprobacion): Ust<EstudanteAsirante> : i oy eaRepositorioGenericolPAcT>— ° Ac oe + actualizar(entidad: Entidad): HorariotntrevistasRepository-_OptionalcT> .<br>———FSpy]++ actualizarfentidad:consuitarPorid(ia: int:1): Optionaict>Optional — -<t ES Ses = ++ consultarPorid{id:buscarDisponibles(fechainicio:it): Optional<TLocalDateTime, fechaFin: LocalDateTime): Ust<Horaoentreustas<br>ee a Ss ++ eliminar(entidad:guardar(entidad: 7):T):7void KK oe ++ eliminar(entidad:guardar(entidad: Entidad):Entidad): Tvoid<br>+ actualizar(entidad: Entidad): OptionalcT> ees < | A RR ee<br>+ buscarPorCorreo(correotlectronico: tring): Usuario ; / 4 SS<br>++ buscarPorNombreUsuario{nombreUsuario:busearPorRol(rol: Rol): Usuar Sing): Usuaio = \ \ < ae ObservadorRepository<br>+ eliminar(entidad: Entidad): vold p \ . + buscarObservacionesPorFecha(fecha: LocalDate): List<Observacion><br>+ actualizarfentidad: Entidad): Optional: ; \ + guardarfentidad: Entidad): T<br>+ buscarPorEstado(estadoEbuscarEstudiantesPorAcudiente(idAcudiente:studiante: Estadokstuclarte):int): Ust<Estudiantes>Us-<Estudantes \ \ < . .<br>buscarPorGrupo(idGrupo: int): List<Estudiantes “ :<br>ESrSaRRTeCTIONK: it): Optionalcr> 5 \ PreinscripcionRepository<br>guardar(entidad: Entidad) \ . + buscarPorFecha(fecha: LocalDate): List<Preneaiqaon<br>Z \ + eliminar(entidad: Entidad): void<br>=, \ _ [+ _guardarlentidad: Ente)<br>+ buscarSinDirector() List<Grupo: \<br>+ consultarPorid{id: int}: OptionalcT> re LogroRepository<br>+ eliminar(entidad: Entidad): void + actualizar(entidad: Entidad): OptionalcT: buscarPorCategoria(idCategorialogres: i): Ust<logro><br>+ guardarfentidad: Entidad):T + buscarPorBibliotecaYventanaFecha(idBibliotecalogro: in, fechalnicio: LocalDate, fahefin: laalDate): Uist <Lagrefstudante: + consultarPorid{id: int}: OptionalT><br>+++ buscarPorEstudiante(int:buscarPorEstudianteYPeriodo(destudiante:buscarPorLogroYVentanaFecha(idLogro:nt): List<Logro€studiante>int, int,fechalnicio:idPeriodoAcademico:LocalDate, fechaFin:int): List<LogroEstudiante>LocalDate): ListcLogroE studiante> ++ eliminar(entidad:guardar(entidad: Entidad):Entidad): Tvoid<br>+ consultarPorid{id int): Optional<T<br>+ eliminar(entidad: Entidad): vod<br>+ guardarentidad: Entidad): T<br><!-- End of picture text -->

Model Report 

16 July, 2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  BoletinRepository to  RepositorioGenericoJPA<T> 

[ Direction is 'Source -> Destination'. ] 

##### **OPERATIONS** 



actualizar (entidad : Entidad ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarEstudiantesSinBoletin (idPeriodo : int ) : List<Estudiante> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorEstudiante (idEstudiante : int ) : Boletin Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorEstudianteYPeriodo (idEstudiante : int , idPeriodo : int ) : Boletin Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



consultarPorId (id : int ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



eliminar (entidad : Entidad ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



guardar (entidad : Entidad ) : T Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_EstudianteAspiranteRepository_** 

_Class in package 'CapaDePersistencia'_ 

EstudianteAspiranteRepository Version 1.0  Phase 1.0  Proposed leosa created on 15/07/2026.  Last modified 15/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  EstudianteAspiranteRepository to  RepositorioGenericoJPA<T> 

[ Direction is 'Source -> Destination'. ] 

##### **OPERATIONS** 



actualizar (entidad : Entidad ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



consultarPorEstadoAspirante (estadoAprobacion : EstadoAprobacion ) : List<EstudianteAspirante> Public 

Page 12 of 78 

Model Report 

16 July, 2026 

##### **OPERATIONS** 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### consultarPorId (id : int ) : Optional<T> Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### eliminar (entidad : Entidad ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



guardar (entidad : Entidad ) : T Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_EstudianteRepository_** 

_Class in package 'CapaDePersistencia'_ 

EstudianteRepository Version 1.0  Phase 1.0  Proposed leosa created on 15/07/2026.  Last modified 15/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  EstudianteRepository to  RepositorioGenericoJPA<T> 

- [ Direction is 'Source -> Destination'. ] 

##### **OPERATIONS** 



actualizar (entidad : Entidad ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarEstudiantesPorAcudiente (idAcudiente : int ) : List<Estudiantes> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorEstado (estadoEstudiante : EstadoEstudiante ) : List<Estudiantes> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorGrado (idGrado : int ) : List<Estudiantes> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorGrupo (idGrupo : int ) : List<Estudiantes> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### buscarSinGrupo () : List<Estudiantes> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



consultarPorId (id : int ) : Optional<T> Public 

<u>[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]</u> 

Page 13 of 78 

Model Report 

16 July, 2026 

##### **OPERATIONS** 



##### eliminar (entidad : Entidad ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### guardar (entidad : Entidad ) : T Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_GrupoRepository_** 

_Class in package 'CapaDePersistencia'_ 

GrupoRepository Version 1.0  Phase 1.0  Proposed leosa created on 15/07/2026.  Last modified 15/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  GrupoRepository to  RepositorioGenericoJPA<T> 

[ Direction is 'Source -> Destination'. ] 

##### **OPERATIONS** 



actualizar (entidad : Entidad ) : Optional<T> Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### buscarPorGrado (idGrado : int ) : List<Grupo> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### buscarSinDirector () : List<Grupo> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### consultarPorId (id : int ) : Optional<T> Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### contarEstudiantesActivos (idGrupo : int ) : int Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### eliminar (entidad : Entidad ) : void Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### guardar (entidad : Entidad ) : T Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

Page 14 of 78 

Model Report 

16 July, 2026 

### **_HorarioEntrevistasRepository_** 

_Class in package 'CapaDePersistencia'_ 

HorarioEntrevistasRepository Version 1.0  Phase 1.0  Proposed leosa created on 15/07/2026.  Last modified 15/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  HorarioEntrevistasRepository to  RepositorioGenericoJPA<T> 

[ Direction is 'Source -> Destination'. ] 

##### **OPERATIONS** 



actualizar (entidad : Entidad ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarDisponibles (fechaInicio : LocalDateTime , fechaFin : LocalDateTime ) : List<HorarioEntrevistas> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### consultarPorId (id : int ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### eliminar (entidad : Entidad ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### guardar (entidad : Entidad ) : T Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_LogroEstudianteRepository_** 

_Class in package 'CapaDePersistencia'_ 

LogroEstudianteRepository Version 1.0  Phase 1.0  Proposed leosa created on 15/07/2026.  Last modified 15/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  LogroEstudianteRepository to  RepositorioGenericoJPA<T> 

[ Direction is 'Source -> Destination'. ] 

##### **OPERATIONS** 



actualizar (entidad : Entidad ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorBibliotecaYVentanaFecha (idBibliotecaLogro : int , fechaInicio : LocalDate , fechaFin : LocalDate ) : List<LogroEstudiante> Public 

Page 15 of 78 

Model Report 

16 July, 2026 

##### **OPERATIONS** 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorEstudiante (int : int ) : List<LogroEstudiante> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorEstudianteYPeriodo (idEstudiante : int , idPeriodoAcademico : int ) : List<LogroEstudiante> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorLogroYVentanaFecha (idLogro : int , fechaInicio : LocalDate , fechaFin : LocalDate ) : List<LogroEstudiante> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



consultarPorId (id : int ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



eliminar (entidad : Entidad ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



guardar (entidad : Entidad ) : T Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_LogroRepository_** 

_Class in package 'CapaDePersistencia'_ 

LogroRepository Version 1.0  Phase 1.0  Proposed leosa created on 15/07/2026.  Last modified 15/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  LogroRepository to  RepositorioGenericoJPA<T> 

[ Direction is 'Source -> Destination'. ] 

##### **OPERATIONS** 



actualizar (entidad : Entidad ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorCategoria (idCategoriaLogros : int ) : List<Logro> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



consultarPorId (id : int ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



eliminar (entidad : Entidad ) : void Public 

Page 16 of 78 

Model Report 

16 July, 2026 

##### **OPERATIONS** 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



guardar (entidad : Entidad ) : T Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_ObservadorRepository_** 

_Class in package 'CapaDePersistencia'_ 

ObservadorRepository Version 1.0  Phase 1.0  Proposed leosa created on 15/07/2026.  Last modified 15/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  ObservadorRepository to  RepositorioGenericoJPA<T> 

[ Direction is 'Source -> Destination'. ] 

##### **OPERATIONS** 



actualizar (entidad : Entidad ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarObservacionesPorFecha (fecha : LocalDate ) : List<Observacion> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarObservacionPorProfesorYFecha (idProfesor : int , fecha : LocalDateTime ) : List<Observacion> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorEstudiante (idEstudiante : int ) : List<Observador> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorEstudianteYPeriodo (idEstudiante : int , idPeriodo : int ) : List<Observador> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



consultarPorId (id : int ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### eliminar (entidad : Entidad ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### guardar (entidad : Entidad ) : T Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

Page 17 of 78 

Model Report 

16 July, 2026 

### **_PeriodoAcademicoRepository_** 

_Class in package 'CapaDePersistencia'_ 

PeriodoAcademicoRepository Version 1.0  Phase 1.0  Proposed leosa created on 15/07/2026.  Last modified 15/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  PeriodoAcademicoRepository to  RepositorioGenericoJPA<T> 

[ Direction is 'Source -> Destination'. ] 

##### **OPERATIONS** 



actualizar (entidad : Entidad ) : Optional<T> Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### buscarActivo () : PeriodoAcademico Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorRangoFechas (fechaInicio : LocalDate , fechaFin : LocalDate ) : PeriodoAcademico Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### consultarPorId (id : int ) : Optional<T> Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### eliminar (entidad : Entidad ) : void Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



guardar (entidad : Entidad ) : T Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_PreinscripcionRepository_** 

_Class in package 'CapaDePersistencia'_ 

PreinscripcionRepository Version 1.0  Phase 1.0  Proposed leosa created on 15/07/2026.  Last modified 15/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  PreinscripcionRepository to  RepositorioGenericoJPA<T> 

- [ Direction is 'Source -> Destination'. ] 

##### **OPERATIONS** 



actualizar (entidad : Entidad ) : Optional<T> Public 

<u>[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]</u> 

Page 18 of 78 

Model Report 

16 July, 2026 

##### **OPERATIONS** 



buscarPorFecha (fecha : LocalDate ) : List<Preinscripcion> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



consultarPorId (id : int ) : Optional<T> Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### eliminar (entidad : Entidad ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



guardar (entidad : Entidad ) : T Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_ReportesRepository_** 

_Class in package 'CapaDePersistencia'_ 

ReportesRepository Version 1.0  Phase 1.0  Proposed leosa created on 15/07/2026.  Last modified 15/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  ReportesRepository to  RepositorioGenericoJPA<T> 

[ Direction is 'Source -> Destination'. ] 

##### **OPERATIONS** 



actualizar (entidad : Entidad ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorEstudiante (idEstudiante : int ) : List<Reporte> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorEstudianteYPeriodo (idEstudiante : int , idPeriodo : int ) : List<Reporte> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



consultarPorId (id : int ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### eliminar (entidad : Entidad ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



guardar (entidad : Entidad ) : T Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

Page 19 of 78 

Model Report 

16 July, 2026 

### **_RepositorioGenericoJPA<T>_** 

_Class in package 'CapaDePersistencia'_ 

RepositorioGenericoJPA<T> Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 16/07/2026 

##### **INCOMING STRUCTURAL RELATIONSHIPS** 



Generalization  from  LogroEstudianteRepository to  RepositorioGenericoJPA<T> 

[ Direction is 'Source -> Destination'. ] 



Generalization  from  PeriodoAcademicoRepository to  RepositorioGenericoJPA<T> 

[ Direction is 'Source -> Destination'. ] [ Direction is 'Source -> Destination'. ] 



Generalization  from  GrupoRepository to  RepositorioGenericoJPA<T> 



Generalization  from  EstudianteAspiranteRepository to  RepositorioGenericoJPA<T> 

[ Direction is 'Source -> Destination'. ] Generalization  from  BoletinRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  EstudianteRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  HorarioEntrevistasRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  ObservadorRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  LogroRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  ReportesRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  UsuarioRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] Generalization  from  PreinscripcionRepository to  RepositorioGenericoJPA<T> [ Direction is 'Source -> Destination'. ] 

















Page 20 of 78 

Model Report 

16 July, 2026 

##### **CONNECTORS** 



**Dependency** Source -> Destination From: RepositorioGenericoJPA<T> : Class, Public To: RepositorioGenerico<T> : Interface, Public 

##### **ATTRIBUTES** 



entidad : Class<T>  Private 

[ Is static True. Containment is Not Specified. ] 

##### **OPERATIONS** 



actualizar (entidad : T ) : Optional<T> Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### consultarPorId (id : int ) : Optional<T> Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### eliminar (entidad : T ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### guardar (entidad : T ) : T Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_UsuarioRepository_** 

_Class in package 'CapaDePersistencia'_ 

UsuarioRepository Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  UsuarioRepository to  RepositorioGenericoJPA<T> 

- [ Direction is 'Source -> Destination'. ] 

##### **OPERATIONS** 



actualizar (entidad : Entidad ) : Optional<T> Public 

- [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### buscarPorCorreo (correoElectronico : String ) : Usuario Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



buscarPorNombreUsuario (nombreUsuario : String ) : Usuario Public 

- <u>[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]</u> 

Page 21 of 78 

Model Report 

16 July, 2026 

##### **OPERATIONS** 



buscarPorRol (rol : Rol ) : Usuario Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



consultarPorId (id : int ) : Optional<T> Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



eliminar (entidad : Entidad ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



guardar (entidad : Entidad ) : T Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

Page 22 of 78 











<!-- Start of picture text -->
IniiarSesion Recuperatonirasiia (rearUsuadio Sa -si :AgendarEntcevista8 RReprogramarEntravtaBestionEntrevistas kreartorariotntredagestionEntrevst. |,aaa-<br>CerrarSesion iminarUsuario aang a a<br>CancelarEntrevsta ModificarHorariontasta FiminarHorariogntresta<br>Modificarinformaciont ure rearGrupo onsultarGrupo eeteatioraawo |. aaa ° 5 8 sestiontogros: Pedontogrce<br>eliotn ConsultarBibfotecalogos EiminartogroDesibiet ea Th ttrloprosit ud<br>— nr — Elminartogroststudante| _[DescargarLogrostaudante<br>" festionReportes:: gestionReportes: gestiontioletines: gestionBoletine<br>—, sestionHojavida: gestionHojavida: CrearReporte ModificarReporte feenerarBoletinsemestrd ConsuitarBoletin ———— a, 7<br>Ic DiigenciarHojavida ModifcatHojavida -ConsuitarPeriodoncadenicoieaes<br>8 8 ao ? DescargarReporte “DescargarBoletin 6 saterPaodoraderis<br>ModificarObaaaion EiminarObservaion ModificarPeriodoacademia hviPerodotcadenio<br>MostrarinformacionPesiodaActid |<br>{errarperiodoacademico<br><!-- End of picture text -->

Model Report 

16 July, 2026 

_Class in package 'GestionAcceso'_ 

CerrarSesion Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_IniciarSesion_** 

_Class in package 'GestionAcceso'_ 

IniciarSesion Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_RecuperarContraseña_** 

_Class in package 'GestionAcceso'_ 

RecuperarContraseña Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_ConsultarUsuario_** 

_Class in package 'gestionUsuarios'_ 

ConsultarUsuario Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_CrearUsuario_** 

_Class in package 'gestionUsuarios'_ 

CrearUsuario Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_EliminarUsuario_** 

_Class in package 'gestionUsuarios'_ 

EliminarUsuario Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_ModificarUsuario_** 

_Class in package 'gestionUsuarios'_ 

ModificarUsuario Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

Page 24 of 78 

Model Report 

16 July, 2026 

### **_AprobarAspirante_** 

_Class in package 'preinscripcion'_ 

AprobarAspirante Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_ConsultarListaAspirante_** 

_Class in package 'preinscripcion'_ 

ConsultarListaAspirante Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_DiligenciarFormularioPreinscripcion_** 

_Class in package 'preinscripcion'_ 

DiligenciarFormularioPreinscripcion Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 13/07/2026 

### **_RechazarAspirante_** 

_Class in package 'preinscripcion'_ 

RechazarAspirante Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_AgendarEntrevista_** 

_Class in package 'gestionEntrevistas'_ 

AgendarEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_CancelarEntrevista_** 

_Class in package 'gestionEntrevistas'_ 

CancelarEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_ConsultarHorarioEntrevista_** 

Page 25 of 78 

Model Report 

16 July, 2026 

_Class in package 'gestionEntrevistas'_ 

ConsultarHorarioEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_CrearHorarioEntrevista_** 

_Class in package 'gestionEntrevistas'_ 

CrearHorarioEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_EliminarHorarioEntrevista_** 

_Class in package 'gestionEntrevistas'_ 

EliminarHorarioEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_ModificarHorarioEntrevista_** 

_Class in package 'gestionEntrevistas'_ 

ModificarHorarioEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_ReprogramarEntrevista_** 

_Class in package 'gestionEntrevistas'_ 

ReprogramarEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_ConsultarEstudiante_** 

_Class in package 'gestionEstudiante'_ 

ConsultarEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_ModificarInformacionEstudiante_** 

_Class in package 'gestionEstudiante'_ 

ModificarInformacionEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 26 of 78 

Model Report 

16 July, 2026 

### **_PromoverGrado_** 

_Class in package 'gestionEstudiante'_ 

PromoverGrado Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_RetirarEstudiante_** 

_Class in package 'gestionEstudiante'_ 

RetirarEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_AsignarDirectorDeGrupo_** 

_Class in package 'gestionGrupos'_ 

AsignarDirectorDeGrupo Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_AsignarEstudiantesAGrupo_** 

_Class in package 'gestionGrupos'_ 

AsignarEstudiantesAGrupo Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_AsignarProfesorAGrupo_** 

_Class in package 'gestionGrupos'_ 

AsignarProfesorAGrupo Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_ConsultarGrupo_** 

_Class in package 'gestionGrupos'_ 

ConsultarGrupo Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

**_CrearGrupo_** 

Page 27 of 78 

Model Report 

16 July, 2026 

_Class in package 'gestionGrupos'_ 

CrearGrupo Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_DescargarListadoClase_** 

_Class in package 'gestionGrupos'_ 

DescargarListadoClase Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_EliminarGrupo_** 

_Class in package 'gestionGrupos'_ 

EliminarGrupo Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_AñadirLogroABiblioteca_** 

_Class in package 'gestionBibliotecasLogros'_ 

AñadirLogroABiblioteca Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_ConsultarBibliotecaLogros_** 

_Class in package 'gestionBibliotecasLogros'_ 

ConsultarBibliotecaLogros Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_CrearBibliotecaLogros_** 

_Class in package 'gestionBibliotecasLogros'_ 

CrearBibliotecaLogros Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_EliminarBibliotecaLogros_** 

_Class in package 'gestionBibliotecasLogros'_ 

EliminarBibliotecaLogros Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 28 of 78 

Model Report 

16 July, 2026 

### **_EliminarLogroDeBiblioteca_** 

_Class in package 'gestionBibliotecasLogros'_ 

EliminarLogroDeBiblioteca Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_AsignarLogroEstudiante_** 

_Class in package 'gestionLogros'_ 

AsignarLogroEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_ConsultarLogrosEstudiante_** 

_Class in package 'gestionLogros'_ 

ConsultarLogrosEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_DescargarLogrosEstudiante_** 

_Class in package 'gestionLogros'_ 

DescargarLogrosEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_EliminarLogrosEstudiante_** 

_Class in package 'gestionLogros'_ 

EliminarLogrosEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_AsignarObservacion_** 

_Class in package 'gestionObservador'_ 

AsignarObservacion Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

**_ConsultarObservador_** 

Page 29 of 78 

Model Report 

16 July, 2026 

_Class in package 'gestionObservador'_ 

ConsultarObservador Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_CrearObservador_** 

_Class in package 'gestionObservador'_ 

CrearObservador Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_EliminarObservacion_** 

_Class in package 'gestionObservador'_ 

EliminarObservacion Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_ModificarObservacion_** 

_Class in package 'gestionObservador'_ 

ModificarObservacion Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_ConsultarHojaVida_** 

_Class in package 'gestionHojaVida'_ 

ConsultarHojaVida Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_DiligenciarHojaVida_** 

_Class in package 'gestionHojaVida'_ 

DiligenciarHojaVida Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_ModificarHojaVida_** 

_Class in package 'gestionHojaVida'_ 

ModificarHojaVida Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 30 of 78 

Model Report 

16 July, 2026 

### **_ConsultarReporte_** 

_Class in package 'gestionReportes'_ 

ConsultarReporte Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_CrearReporte_** 

_Class in package 'gestionReportes'_ 

CrearReporte Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_DescargarReporte_** 

_Class in package 'gestionReportes'_ 

DescargarReporte Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_EliminarReporte_** 

_Class in package 'gestionReportes'_ 

EliminarReporte Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_ModificarReporte_** 

_Class in package 'gestionReportes'_ 

ModificarReporte Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_ConsultarBoletin_** 

_Class in package 'gestionBoletines'_ 

ConsultarBoletin Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_DescargarBoletin_** 

Page 31 of 78 

Model Report 

16 July, 2026 

_Class in package 'gestionBoletines'_ 

DescargarBoletin Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_GenerarBoletinSemestral_** 

_Class in package 'gestionBoletines'_ 

GenerarBoletinSemestral Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 14/07/2026 

### **_PrevisualizarBoletin_** 

_Class in package 'gestionBoletines'_ 

PrevisualizarBoletin Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_AbrirPeriodoAcademico_** 

_Class in package 'gestionPeriodosAcademicos'_ 

AbrirPeriodoAcademico Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_CerrarPeriodoAcademico_** 

_Class in package 'gestionPeriodosAcademicos'_ 

CerrarPeriodoAcademico Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_ConsultarPeriodoAcademico_** 

_Class in package 'gestionPeriodosAcademicos'_ 

ConsultarPeriodoAcademico Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_CrearPeriodoAcademico_** 

_Class in package 'gestionPeriodosAcademicos'_ 

CrearPeriodoAcademico Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 32 of 78 

Model Report 

16 July, 2026 

### **_ModificarPeriodoAcademico_** 

_Class in package 'gestionPeriodosAcademicos'_ 

ModificarPeriodoAcademico Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_RealizarCitacion_** 

_Class in package 'gestionCitaciones'_ 

RealizarCitacion Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

### **_GestionAcceso_** 

_Package in package 'CasosDeUso'_ 

GestionAcceso Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **CerrarSesion** 

_Class in package 'GestionAcceso'_ 

CerrarSesion Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **IniciarSesion** 

_Class in package 'GestionAcceso'_ 

IniciarSesion Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **RecuperarContraseña** 

_Class in package 'GestionAcceso'_ 

RecuperarContraseña Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

Page 33 of 78 

Model Report 

16 July, 2026 

#### **ValidarCredenciales** 

_Class in package 'GestionAcceso'_ 

ValidarCredenciales Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

Page 34 of 78 

Model Report 

16 July, 2026 

### **_gestionBibliotecasLogros_** 

_Package in package 'CasosDeUso'_ 

gestionBibliotecasLogros Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **AñadirLogroABiblioteca** 

_Class in package 'gestionBibliotecasLogros'_ 

AñadirLogroABiblioteca Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **ConsultarBibliotecaLogros** 

_Class in package 'gestionBibliotecasLogros'_ 

ConsultarBibliotecaLogros Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **CrearBibliotecaLogros** 

_Class in package 'gestionBibliotecasLogros'_ 

CrearBibliotecaLogros Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **EliminarBibliotecaLogros** 

_Class in package 'gestionBibliotecasLogros'_ 

EliminarBibliotecaLogros Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **EliminarLogroDeBiblioteca** 

_Class in package 'gestionBibliotecasLogros'_ 

EliminarLogroDeBiblioteca Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 35 of 78 

Model Report 

16 July, 2026 

### **_gestionBoletines_** 

_Package in package 'CasosDeUso'_ 

gestionBoletines Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **ConsultarBoletin** 

_Class in package 'gestionBoletines'_ 

ConsultarBoletin Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **DescargarBoletin** 

_Class in package 'gestionBoletines'_ 

DescargarBoletin Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **GenerarBoletinSemestral** 

_Class in package 'gestionBoletines'_ 

GenerarBoletinSemestral Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 14/07/2026 

#### **PrevisualizarBoletin** 

_Class in package 'gestionBoletines'_ 

PrevisualizarBoletin Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 36 of 78 

Model Report 

16 July, 2026 

### **_gestionCitaciones_** 

_Package in package 'CasosDeUso'_ 

gestionCitaciones Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **RealizarCitacion** 

_Class in package 'gestionCitaciones'_ 

RealizarCitacion Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 37 of 78 

Model Report 

16 July, 2026 

### **_gestionEntrevistas_** 

_Package in package 'CasosDeUso'_ 

gestionEntrevistas Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **AgendarEntrevista** 

_Class in package 'gestionEntrevistas'_ 

AgendarEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **CancelarEntrevista** 

_Class in package 'gestionEntrevistas'_ 

CancelarEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **ConsultarHorarioEntrevista** 

_Class in package 'gestionEntrevistas'_ 

ConsultarHorarioEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **CrearHorarioEntrevista** 

_Class in package 'gestionEntrevistas'_ 

CrearHorarioEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **EliminarHorarioEntrevista** 

_Class in package 'gestionEntrevistas'_ 

EliminarHorarioEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **ModificarHorarioEntrevista** 

_Class in package 'gestionEntrevistas'_ 

ModificarHorarioEntrevista Version 1.0  Phase 1.0  Proposed 

Page 38 of 78 

Model Report 

16 July, 2026 

leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **ReprogramarEntrevista** 

_Class in package 'gestionEntrevistas'_ 

ReprogramarEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

Page 39 of 78 

Model Report 

16 July, 2026 

### **_gestionEstudiante_** 

_Package in package 'CasosDeUso'_ 

gestionEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **ConsultarEstudiante** 

_Class in package 'gestionEstudiante'_ 

ConsultarEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **ModificarInformacionEstudiante** 

_Class in package 'gestionEstudiante'_ 

ModificarInformacionEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **PromoverGrado** 

_Class in package 'gestionEstudiante'_ 

PromoverGrado Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **RetirarEstudiante** 

_Class in package 'gestionEstudiante'_ 

RetirarEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 40 of 78 

Model Report 

16 July, 2026 

### **_gestionGrupos_** 

_Package in package 'CasosDeUso'_ 

gestionGrupos Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **AsignarDirectorDeGrupo** 

_Class in package 'gestionGrupos'_ 

AsignarDirectorDeGrupo Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **AsignarEstudiantesAGrupo** 

_Class in package 'gestionGrupos'_ 

AsignarEstudiantesAGrupo Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **AsignarProfesorAGrupo** 

_Class in package 'gestionGrupos'_ 

AsignarProfesorAGrupo Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **ConsultarGrupo** 

_Class in package 'gestionGrupos'_ 

ConsultarGrupo Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **CrearGrupo** 

_Class in package 'gestionGrupos'_ 

CrearGrupo Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **DescargarListadoClase** 

_Class in package 'gestionGrupos'_ 

DescargarListadoClase Version 1.0  Phase 1.0  Proposed 

Page 41 of 78 

Model Report 

16 July, 2026 

leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **EliminarGrupo** 

_Class in package 'gestionGrupos'_ 

EliminarGrupo Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 42 of 78 

Model Report 

16 July, 2026 

### **_gestionHojaVida_** 

_Package in package 'CasosDeUso'_ 

gestionHojaVida Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **ConsultarHojaVida** 

_Class in package 'gestionHojaVida'_ 

ConsultarHojaVida Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **DiligenciarHojaVida** 

_Class in package 'gestionHojaVida'_ 

DiligenciarHojaVida Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **ModificarHojaVida** 

_Class in package 'gestionHojaVida'_ 

ModificarHojaVida Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 43 of 78 

Model Report 

16 July, 2026 

### **_gestionLogros_** 

_Package in package 'CasosDeUso'_ 

gestionLogros Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **AsignarLogroEstudiante** 

_Class in package 'gestionLogros'_ 

AsignarLogroEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **ConsultarLogrosEstudiante** 

_Class in package 'gestionLogros'_ 

ConsultarLogrosEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **DescargarLogrosEstudiante** 

_Class in package 'gestionLogros'_ 

DescargarLogrosEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **EliminarLogrosEstudiante** 

_Class in package 'gestionLogros'_ 

EliminarLogrosEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 44 of 78 

Model Report 

16 July, 2026 

### **_gestionObservador_** 

_Package in package 'CasosDeUso'_ 

gestionObservador Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **AsignarObservacion** 

_Class in package 'gestionObservador'_ 

AsignarObservacion Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **ConsultarObservador** 

_Class in package 'gestionObservador'_ 

ConsultarObservador Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **CrearObservador** 

_Class in package 'gestionObservador'_ 

CrearObservador Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **EliminarObservacion** 

_Class in package 'gestionObservador'_ 

EliminarObservacion Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **ModificarObservacion** 

_Class in package 'gestionObservador'_ 

ModificarObservacion Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 45 of 78 

Model Report 

16 July, 2026 

### **_gestionPeriodosAcademicos_** 

_Package in package 'CasosDeUso'_ 

gestionPeriodosAcademicos Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **AbrirPeriodoAcademico** 

_Class in package 'gestionPeriodosAcademicos'_ 

AbrirPeriodoAcademico Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **CerrarPeriodoAcademico** 

_Class in package 'gestionPeriodosAcademicos'_ 

CerrarPeriodoAcademico Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **ConsultarPeriodoAcademico** 

_Class in package 'gestionPeriodosAcademicos'_ 

ConsultarPeriodoAcademico Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **CrearPeriodoAcademico** 

_Class in package 'gestionPeriodosAcademicos'_ 

CrearPeriodoAcademico Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **ModificarPeriodoAcademico** 

_Class in package 'gestionPeriodosAcademicos'_ 

ModificarPeriodoAcademico Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 46 of 78 

Model Report 

16 July, 2026 

### **_gestionReportes_** 

_Package in package 'CasosDeUso'_ 

gestionReportes Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **ConsultarReporte** 

_Class in package 'gestionReportes'_ 

ConsultarReporte Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **CrearReporte** 

_Class in package 'gestionReportes'_ 

CrearReporte Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **DescargarReporte** 

_Class in package 'gestionReportes'_ 

DescargarReporte Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **EliminarReporte** 

_Class in package 'gestionReportes'_ 

EliminarReporte Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

#### **ModificarReporte** 

_Class in package 'gestionReportes'_ 

ModificarReporte Version 1.0  Phase 1.0  Proposed leosa created on 13/07/2026.  Last modified 13/07/2026 

Page 47 of 78 

Model Report 

16 July, 2026 

### **_gestionUsuarios_** 

_Package in package 'CasosDeUso'_ 

gestionUsuarios Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **ConsultarUsuario** 

_Class in package 'gestionUsuarios'_ 

ConsultarUsuario Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **CrearUsuario** 

_Class in package 'gestionUsuarios'_ 

CrearUsuario Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **EliminarUsuario** 

_Class in package 'gestionUsuarios'_ 

EliminarUsuario Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **ModificarUsuario** 

_Class in package 'gestionUsuarios'_ 

ModificarUsuario Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

Page 48 of 78 

Model Report 

16 July, 2026 

### **_preinscripcion_** 

_Package in package 'CasosDeUso'_ 

preinscripcion Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **AprobarAspirante** 

_Class in package 'preinscripcion'_ 

AprobarAspirante Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **ConsultarListaAspirante** 

_Class in package 'preinscripcion'_ 

ConsultarListaAspirante Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

#### **DiligenciarFormularioPreinscripcion** 

_Class in package 'preinscripcion'_ 

DiligenciarFormularioPreinscripcion Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 13/07/2026 

#### **RechazarAspirante** 

_Class in package 'preinscripcion'_ 

RechazarAspirante Version 1.0  Phase 1.0  Proposed leosa created on 12/07/2026.  Last modified 12/07/2026 

### **_MostrarInformacionPeriodoActual_** 

_Class in package 'CasosDeUso'_ 

MostrarInformacionPeriodoActual Version 1.0  Phase 1.0  Proposed leosa created on 15/07/2026.  Last modified 15/07/2026 

Page 49 of 78 







<!-- Start of picture text -->
oe<br>= :<br>Acudiente \ ‘eliminarGrupo(grupo:LoafA Gripo): wr HEE.+ estabiecerDirectoriprofesor:ellminarProfesor(profesor:2 Profesor):Profesor): vok vod.<br>acudiente: Acudiente — + marcarPrincipal(): void \ Estadofstudiante /<br>esPrincipal: boolean is \ RETRADO<br>parentesco: String om a<br>agregarEstudianteAspirante(estudianteAspirante: Est uiart aAsprart e): 1a \= |= =<br>‘estadoAprobacion: EstadoAprobadan i es =<br>+ ponerEnéspera(): void a r* ‘activar(): void tminarLogro€studiante(logro€studiante: Logroestudiante): id a] | Mitmechoalid: String<br>CANCELADA. ie a - : ogrotstudiante = Bs<br>iberar(): vol + abrirPeriodot): vol profesor: Profes<br>feseripcionObservacion: Sting ‘categorialogro: Categonalogr<br>: EstadoPeriodoAcaterio<br><!-- End of picture text -->

Model Report 

16 July, 2026 

### **_Tipos de datos_** 

_Package in package 'ModeloDeDominio'_ 

Tipos de datos Version 1.0  Phase 1.0  Proposed leosa created on 1/07/2026.  Last modified 12/07/2026 

#### **LocalDate** 

_DataType in package 'Tipos de datos'_ 

LocalDate Version 1.0  Phase 1.0  Proposed leosa created on 2/07/2026.  Last modified 2/07/2026 

#### **LocalDateTime** 

_DataType in package 'Tipos de datos'_ 

LocalDateTime Version 1.0  Phase 1.0  Proposed leosa created on 1/07/2026.  Last modified 2/07/2026 

#### **String** 

_DataType in package 'Tipos de datos'_ 

String 

Version 1.0  Phase 1.0  Proposed leosa created on 1/07/2026.  Last modified 1/07/2026 

### **_Acudiente_** 

_Class in package 'ModeloDeDominio'_ 

Acudiente Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  Acudiente to  Persona 

[ Direction is 'Source -> Destination'. ] 

##### **ATTRIBUTES** 



idAcudiente : int  Private [ Is static True. Containment is Not Specified. ] 

Page 51 of 78 

Model Report 

16 July, 2026 

##### **ASSOCIATIONS** 



Association (direction: Destination -> Source) Source: Private acudiente (Class) Acudiente Target: Public (Class) AcudienteEstudiante Cardinality:  [1] Cardinality:  [1..*] Association (direction: Source -> Destination) Source: Public (Class) AcudienteAspirante Target: Private acudiente (Class) Acudiente Cardinality:  [1..*] Cardinality:  [0..1] 

### **_AcudienteAspirante_** 

_Class in package 'ModeloDeDominio'_ 

AcudienteAspirante Version 1.0  Phase 1.0  Proposed leosa created on 30/06/2026.  Last modified 12/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Aggregation from  AcudienteAspirante to  Preinscripcion 

[ Direction is 'Source -> Destination'. ] 

##### **ATTRIBUTES** 



acudiente : Acudiente  Private [ Is static True. Containment is Not Specified. ] correoElectronico : String  Private [ Is static True. Containment is Not Specified. ] esPrincipal : boolean  Private [ Is static True. Containment is Not Specified. ] idAcudienteAspirante : int  Private [ Is static True. Containment is Not Specified. ] parentesco : String  Private [ Is static True. Containment is Not Specified. ] primerApellido : String  Private [ Is static True. Containment is Not Specified. ] primerNombre : String  Private [ Is static True. Containment is Not Specified. ] 













Page 52 of 78 

Model Report 

16 July, 2026 

##### **ATTRIBUTES** 



segundoApellido : String  Private [ Is static True. Containment is Not Specified. ] segundoNombre : String  Private [ Is static True. Containment is Not Specified. ] telefono : String  Private [ Is static True. Containment is Not Specified. ] 





##### **ASSOCIATIONS** 



Association (direction: Source -> Destination) Source: Public (Class) AcudienteAspirante Target: Private acudiente (Class) Acudiente Cardinality:  [1..*] Cardinality:  [0..1] 

### **_AcudienteEstudiante_** 

_Class in package 'ModeloDeDominio'_ 

##### **ATTRIBUTES** 



acudiente : Acudiente  Private 



esPrincipal : boolean  Private 



estudiante : Estudiante  Private idAcudienteEstudiante : int  Private parentesco : String  Private 





AcudienteEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 1/07/2026.  Last modified 12/07/2026 [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Bi-Directional) 

Source: Private estudiante (Class) Estudiante Target: Private acudientes (Class) Cardinality:  [1..*] AcudienteEstudiante 

Page 53 of 78 

Model Report 

16 July, 2026 

##### **ASSOCIATIONS** 

Cardinality:  [1..*] 



Association (direction: Destination -> Source) Source: Private acudiente (Class) Acudiente Target: Public (Class) AcudienteEstudiante Cardinality:  [1] Cardinality:  [1..*] 

##### **OPERATIONS** 



marcarPrincipal () : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



quitarPrincipal () : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_Boletin_** 

_Class in package 'ModeloDeDominio'_ 

Boletin Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Aggregation from  Boletin to  Estudiante 

[ Direction is 'Source -> Destination'. ] 

##### **ATTRIBUTES** 



estudiante : Estudiante  Private 



idBoletin : int  Private 



logros : List<LogroEstudiante>  Private 



periodoAcademico : PeriodoAcademico  Private profesor : Profesor  Private 



[ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] 

**ASSOCIATIONS** 

Page 54 of 78 

Model Report 

16 July, 2026 

##### **ASSOCIATIONS** 



Association (direction: Source -> Destination) Source: Public (Class) Boletin Target: Private logros (Class) LogroEstudiante Cardinality:  [1] Cardinality:  [1..*] Association (direction: Source -> Destination) Source: Public (Class) Boletin Target: Private periodoAcademico (Class) Cardinality:  [0..*] PeriodoAcademico Cardinality:  [1] Association (direction: Destination -> Source) Source: Private profesor (Class) Profesor Target: Public (Class) Boletin Cardinality:  [1] Cardinality:  [0..*] **OPERATIONS** añadirLogro (logro : LogroEstudiante ) : void Public 

##### **OPERATIONS** 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_CategoriaLogro_** 

_Class in package 'ModeloDeDominio'_ 

CategoriaLogro Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **INCOMING STRUCTURAL RELATIONSHIPS** 



Aggregation  from  Logro to  CategoriaLogro 

[ Direction is 'Source -> Destination'. ] 

##### **ATTRIBUTES** 



idCategoriaLogro : int  Private 



nombreCategoriaLogro : String  Private 

[ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] 

### **_Directivo_** 

_Class in package 'ModeloDeDominio'_ 

Directivo 

Page 55 of 78 

Model Report 

16 July, 2026 

Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  Directivo to  Persona 

##### **ATTRIBUTES** 



idDirectivo : int  Private 

[ Direction is 'Source -> Destination'. ] [ Is static True. Containment is Not Specified. ] 

### **_Entrevista_** 

_Class in package 'ModeloDeDominio'_ 

Entrevista Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **ATTRIBUTES** 



estadoEntrevista : EstadoEntrevista  Private 



horarioEntrevista : HorarioEntrevista  Private 



idEntrevista : int  Private 

[ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Source -> Destination) 

Source: Public (Class) Entrevista Target: Private horarioEntrevista (Class) Cardinality:  [0..1] HorarioEntrevista Cardinality:  [1] Association (direction: Destination -> Source) Source: Private estadoEntrevista (Enumeration) EstadoEntrevista Target: Public (Class) Entrevista Cardinality:  [1] Cardinality:  [0..*] Association (direction: Source -> Destination) Source: Private (Class) Preinscripcion Target: Private entrevistas (Class) Entrevista Cardinality:  [1] Cardinality:  [1..*] 

Page 56 of 78 

Model Report 

16 July, 2026 

##### **OPERATIONS** 



cancelarEntrevista () : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



marcarRealizada () : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



programarEntrevista (horarioEntrevista : HorarioEntrevista ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_Estudiante_** 

_Class in package 'ModeloDeDominio'_ 

Estudiante Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Generalization from  Estudiante to  Persona Aggregation from  Estudiante to  Grupo **INCOMING STRUCTURAL RELATIONSHIPS** 



Aggregation  from  LogroEstudiante to  Estudiante Aggregation  from  Observador to  Estudiante Aggregation  from  Boletin to  Estudiante Aggregation  from  Reporte to  Estudiante Aggregation  from  HojaVida to  Estudiante **ATTRIBUTES** 

|[ Direction is 'Source -> Destination'. ]|
|---|
|[ Direction is 'Source -> Destination'. ]|
|[ Direction is 'Source -> Destination'. ]|
|[ Direction is 'Source -> Destination'. ]|
|[ Direction is 'Source -> Destination'. ]|
|[ Direction is 'Source -> Destination'. ]|
|[ Direction is 'Source -> Destination'. ]|





acudientes : List<AcudienteEstudiante>  Private 

Page 57 of 78 

Model Report 

16 July, 2026 

##### **ATTRIBUTES** 



estadoEstudiante : EstadoEstudiante  Private 



grado : Grado  Private 



grupo : Grupo  Private 



idEstudiante : int  Private 

[ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Bi-Directional) Source: Private estudiante (Class) Estudiante Target: Private acudientes (Class) Cardinality:  [1..*] AcudienteEstudiante Cardinality:  [1..*] 



Association (direction: Source -> Destination) 

Source: Public (Class) Estudiante Target: Private grado (Class) Grado Cardinality:  [0..*] Cardinality:  [1] 



Association (direction: Source -> Destination) 

Source: Public (Class) EstudianteAspirante Target: Private estudiante (Class) Estudiante Cardinality:  [1] Cardinality:  [0..1] 



Association (direction: Destination -> Source) 

Source: Private estadoEstudiante (Enumeration) EstadoEstudiante Cardinality:  [1] 

Target: Public (Class) Estudiante Cardinality:  [0..*] 

##### **OPERATIONS** 



activar () : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



agregarAcudiente (acudiente : AcudienteEstudiante ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



asignarAcudientePrincipal (acudiente : AcudienteEstudiante ) : void Public 

<u>[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]</u> 

Page 58 of 78 

Model Report 

16 July, 2026 

##### **OPERATIONS** 



eliminarAcudiente (acudiente : AcudienteEstudiante ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### mandarVacaciones () : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



retirar () : void Public 

### **_EstudianteAspirante_** 

_Class in package 'ModeloDeDominio'_ 

EstudianteAspirante Version 1.0  Phase 1.0  Proposed leosa created on 30/06/2026.  Last modified 12/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Aggregation from  EstudianteAspirante to  Preinscripcion 

[ Direction is 'Source -> Destination'. ] 

##### **ATTRIBUTES** 



edad : int  Private [ Is static True. Containment is Not Specified. ] estadoAprobacion : EstadoAprobacion  Private [ Is static True. Containment is Not Specified. ] gradoAspira : Grado  Private [ Is static True. Containment is Not Specified. ] idEstudianteAspirante : int  Private [ Is static True. Containment is Not Specified. ] primerApellido : String  Private [ Is static True. Containment is Not Specified. ] primerNombre : String  Private [ Is static True. Containment is Not Specified. ] segundoApellido : String  Private [ Is static True. Containment is Not Specified. ] 













Page 59 of 78 

Model Report 

16 July, 2026 



<!-- Start of picture text -->
ATTRIBUTES<br>  segundoNombre : String  Private<br>[ Is static True. Containment is Not Specified. ]<br>ASSOCIATIONS<br>  Association (direction: Source -> Destination)<br>Source: Public (Class) EstudianteAspirante Target: Private estudiante (Class) Estudiante<br>Cardinality:  [1] Cardinality:  [0..1]<br>  Association (direction: Destination -> Source)<br>Source: Private estadoAprobacion (Enumeration) Target: Public (Class) EstudianteAspirante<br>EstadoAprobacion Cardinality:  [0..*]<br>Cardinality:  [1]<br>OPERATIONS<br>  aprobar () : void Public<br>[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]<br>  desistirProceso () : void Public<br>[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]<br>  ponerEnEspera () : void Public<br>[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]<br>  ponerEnPendiente () : void Public<br>[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]<br>  rechazar () : void Public<br>[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ]<br><!-- End of picture text -->

### **_Grado_** 

_Class in package 'ModeloDeDominio'_ 

Grado Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **ATTRIBUTES** 



grupos : List<Grupo>  Private [ Is static True. Containment is Not Specified. ] 

Page 60 of 78 

Model Report 

16 July, 2026 

##### **ATTRIBUTES** 



idGrado : int  Private [ Is static True. Containment is Not Specified. ] nombreGrado : String  Private [ Is static True. Containment is Not Specified. ] 



##### **ASSOCIATIONS** 



Association (direction: Source -> Destination) Source: Public (Class) Grado Target: Private grupos (Class) Grupo Cardinality:  [1] Cardinality:  [2..*] Association (direction: Source -> Destination) Source: Public (Class) Estudiante Target: Private grado (Class) Grado Cardinality:  [0..*] Cardinality:  [1] 

##### **OPERATIONS** 



añadirGrupo (grupo : Grupo ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



##### eliminarGrupo (grupo : Grupo ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_Grupo_** 

_Class in package 'ModeloDeDominio'_ 

Grupo Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **INCOMING STRUCTURAL RELATIONSHIPS** 



Aggregation  from  Profesor to  Grupo 



Aggregation  from  Estudiante to  Grupo 

[ Direction is 'Source -> Destination'. ] [ Direction is 'Source -> Destination'. ] 

##### **ATTRIBUTES** 



directorGrupo : Profesor  Private [ Is static True. Containment is Not Specified. ] 

Page 61 of 78 

Model Report 

16 July, 2026 

##### **ATTRIBUTES** 



idGrupo : int  Private [ Is static True. Containment is Not Specified. ] nombreGrupo : String  Private [ Is static True. Containment is Not Specified. ] profesores : List<Profesor>  Private [ Is static True. Containment is Not Specified. ] 





##### **ASSOCIATIONS** 



Association (direction: Source -> Destination) Source: Public (Class) Grado Target: Private grupos (Class) Grupo Cardinality:  [1] Cardinality:  [2..*] **OPERATIONS** añadirProfesor (profesor : Profesor ) : void Public [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

##### **OPERATIONS** 



eliminarProfesor (profesor : Profesor ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] establecerDirector (profesor : Profesor ) : void Public 



[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_HojaVida_** 

_Class in package 'ModeloDeDominio'_ 

HojaVida Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 **OUTGOING STRUCTURAL RELATIONSHIPS** Aggregation from  HojaVida to  Estudiante [ Direction is 'Source -> Destination'. ] alergias : String  Private [ Is static True. Containment is Not Specified. ] aspectosRelevantes : String  Private <u>[ Is static True. Containment is Not Specified. ]</u> 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



##### **ATTRIBUTES** 





Page 62 of 78 

Model Report 

16 July, 2026 

##### **ATTRIBUTES** 



enfermedades : String  Private 

[ Is static True. Containment is Not Specified. ] 



estudiante : Estudiante  Private 



idHojaVida : int  Private 

[ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] 

### **_HorarioEntrevista_** 

_Class in package 'ModeloDeDominio'_ 

HorarioEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **ATTRIBUTES** 



estadoHorarioEntrevista : EstadoHorarioEntrevista  Private  = DISPONIBLE 

[ Is static True. Containment is Not Specified. ] 



finHorario : LocalDateTime  Private 



idHorarioEntrevista : int  Private 

[ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] 



inicioHorario : LocalDateTime  Private 

[ Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Destination -> Source) 

Source: Private estadoHorarioEntrevista (Enumeration) Target: Public (Class) HorarioEntrevista EstadoHorarioEntrevista Cardinality:  [0..*] Cardinality:  [1] 



Association (direction: Source -> Destination) 

Source: Public (Class) Entrevista Target: Private horarioEntrevista (Class) Cardinality:  [0..1] HorarioEntrevista Cardinality:  [1] 

##### **OPERATIONS** 

Page 63 of 78 

Model Report 

16 July, 2026 

##### **OPERATIONS** 



liberar () : void Public [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] reservar () : void Public [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] validarHorario (inicioHorario : LocalDateTime , finHorario : LocalDateTime ) : boolean Public [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 





### **_Logro_** 

_Class in package 'ModeloDeDominio'_ 

Logro Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Aggregation from  Logro to  CategoriaLogro 

[ Direction is 'Source -> Destination'. ] 

##### **ATTRIBUTES** 



categoriaLogro : CategoriaLogro  Private 



descripcionLogro : String  Private idLogro : int  Private nombreLogro : String  Private 





[ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Source -> Destination) Source: Public (Class) LogroEstudiante Target: Private logro (Class) Logro Cardinality:  [1] Cardinality:  [1] 

### **_LogroEstudiante_** 

Page 64 of 78 

Model Report 

16 July, 2026 

_Class in package 'ModeloDeDominio'_ 

LogroEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Aggregation from  LogroEstudiante to  Estudiante 

[ Direction is 'Source -> Destination'. ] **ATTRIBUTES** estudiante : Estudiante  Private [ Is static True. Containment is Not Specified. ] fechaLogro : LocalDate  Private [ Is static True. Containment is Not Specified. ] idLogroEstudiante : int  Private [ Is static True. Containment is Not Specified. ] logro : Logro  Private [ Is static True. Containment is Not Specified. ] periodoAcademico : PeriodoAcademico  Private [ Is static True. Containment is Not Specified. ] profesor : Profesor  Private [ Is static True. Containment is Not Specified. ] **ASSOCIATIONS** Association (direction: Source -> Destination) Source: Public (Class) LogroEstudiante Target: Private logro (Class) Logro Cardinality:  [1] Cardinality:  [1] Association (direction: Source -> Destination) Source: Public (Class) LogroEstudiante Target: Private periodoAcademico (Class) Cardinality:  [0..*] PeriodoAcademico Cardinality:  [1] Association (direction: Source -> Destination) Source: Public (Class) Boletin Target: Private logros (Class) LogroEstudiante Cardinality:  [1] Cardinality:  [1..*] 

**ATTRIBUTES** estudiante : Estudiante  Private fechaLogro : LocalDate  Private idLogroEstudiante : int  Private logro : Logro  Private periodoAcademico : PeriodoAcademico  Private profesor : Profesor  Private 

##### **ASSOCIATIONS** 



Association (direction: Destination -> Source) 

Page 65 of 78 

Model Report 

16 July, 2026 

##### **ASSOCIATIONS** 

Source: Private profesor (Class) Profesor Cardinality:  [1] 

Target: Public (Class) LogroEstudiante Cardinality:  [0..*] 



Association (direction: Source -> Destination) Source: Public (Class) Reporte Cardinality:  [1..*] 

Target: Private logrosEstudiante (Class) LogroEstudiante Cardinality:  [1..*] 

### **_Observacion_** 

_Class in package 'ModeloDeDominio'_ 

Observacion Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Aggregation from  Observacion to  Observador 

[ Direction is 'Source -> Destination'. ] 

##### **ATTRIBUTES** 



descripcionObservacion : String  Private 

[ Is static True. Containment is Not Specified. ] fechaObservacion : LocalDate  Private [ Is static True. Containment is Not Specified. ] idObservacion : int  Private [ Is static True. Containment is Not Specified. ] profesor : Profesor  Private [ Is static True. Containment is Not Specified. ] **ASSOCIATIONS** Association (direction: Destination -> Source) Source: Private profesor (Class) Profesor Target: Public (Class) Observacion Cardinality:  [1] Cardinality:  [0..*] 

idObservacion : int  Private profesor : Profesor  Private **ASSOCIATIONS** 

### **_Observador_** 

_Class in package 'ModeloDeDominio'_ 

Page 66 of 78 

Model Report 

16 July, 2026 

Observador Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

**OUTGOING STRUCTURAL RELATIONSHIPS** Aggregation from  Observador to  Estudiante [ Direction is 'Source -> Destination'. ] **INCOMING STRUCTURAL RELATIONSHIPS** Aggregation  from  Observacion to  Observador [ Direction is 'Source -> Destination'. ] **ATTRIBUTES** estudiante : Estudiante  Private [ Is static True. Containment is Not Specified. ] idObservador : int  Private [ Is static True. Containment is Not Specified. ] observaciones : List<Observacion>  Private [ Is static True. Containment is Not Specified. ] periodoAcademico : PeriodoAcademico  Private [ Is static True. Containment is Not Specified. ] **ASSOCIATIONS** Association (direction: Source -> Destination) Source: Public (Class) Observador Target: Private periodoAcademico (Class) Cardinality:  [0..*] PeriodoAcademico Cardinality:  [1] **OPERATIONS** añadirObservacion (observacion : Observacion ) : void Public [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] eliminarObservacion (observacion : Observacion ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_PeriodoAcademico_** 

_Class in package 'ModeloDeDominio'_ 

Page 67 of 78 

Model Report 

16 July, 2026 

PeriodoAcademico Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **ATTRIBUTES** 



estadoPeriodoAcademico : EstadoPeriodoAcademico  Private [ Is static True. Containment is Not Specified. ] finPeriodoAcademico : LocalDate  Private [ Is static True. Containment is Not Specified. ] idPeriodoAcademico : int  Private [ Is static True. Containment is Not Specified. ] inicioPeriodoAcademico : LocalDate  Private [ Is static True. Containment is Not Specified. ] **ASSOCIATIONS** Association (direction: Source -> Destination) Source: Public (Class) Observador Target: Private periodoAcademico (Class) Cardinality:  [0..*] PeriodoAcademico Cardinality:  [1] Association (direction: Destination -> Source) Source: Private estadoPeriodoAcademico (Enumeration) Target: Public (Class) PeriodoAcademico EstadoPeriodoAcademico Cardinality:  [0..*] Cardinality:  [1] Association (direction: Source -> Destination) Source: Public (Class) LogroEstudiante Target: Private periodoAcademico (Class) Cardinality:  [0..*] PeriodoAcademico Cardinality:  [1] Association (direction: Source -> Destination) Source: Public (Class) Reporte Target: Private periodoAcademico (Class) Cardinality:  [0..*] PeriodoAcademico Cardinality:  [1] Association (direction: Source -> Destination) Source: Public (Class) Boletin Target: Private periodoAcademico (Class) Cardinality:  [0..*] PeriodoAcademico Cardinality:  [1] 

Page 68 of 78 

Model Report 

16 July, 2026 

##### **OPERATIONS** 



abrirPeriodo () : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] cerrarPeriodo () : void Public [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



### **_Persona_** 

_Class in package 'ModeloDeDominio'_ 

Persona 

Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **INCOMING STRUCTURAL RELATIONSHIPS** 



Generalization  from  Estudiante to  Persona 

[ Direction is 'Source -> Destination'. ] Generalization  from  Profesor to  Persona [ Direction is 'Source -> Destination'. ] Generalization  from  Acudiente to  Persona [ Direction is 'Source -> Destination'. ] Generalization  from  Directivo to  Persona [ Direction is 'Source -> Destination'. ] idPersona : int  Private [ Is static True. Containment is Not Specified. ] primerApellido : String  Private [ Is static True. Containment is Not Specified. ] primerNombre : String  Private [ Is static True. Containment is Not Specified. ] segundoApellido : String  Private [ Is static True. Containment is Not Specified. ] segundoNombre : String  Private [ Is static True. Containment is Not Specified. ] 







##### **ATTRIBUTES** 











Page 69 of 78 

Model Report 

16 July, 2026 

##### **ATTRIBUTES** 



usuario : Usuario  Private [ Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Destination -> Source) Source: Private usuario (Class) Usuario Target: Public (Class) Persona Cardinality:  [0..1] Cardinality:  [1] 

### **_Preinscripcion_** 

_Class in package 'ModeloDeDominio'_ 

Preinscripcion Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **INCOMING STRUCTURAL RELATIONSHIPS** 



Aggregation  from  AcudienteAspirante to  Preinscripcion 



Aggregation  from  EstudianteAspirante to  Preinscripcion 

[ Direction is 'Source -> Destination'. ] [ Direction is 'Source -> Destination'. ] 

##### **ATTRIBUTES** 



acudientesAspirantes : List<AcudienteAspirante>  Private 



entrevistas : List<Entrevista>  Private estudiantesAspirantes : List<EstudianteAspirante>  Private fechaPreinscripcion : LocalDateTime  Private idPreinscripcion : int  Private 







[ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Source -> Destination) 

Page 70 of 78 

Model Report 

16 July, 2026 

##### **ASSOCIATIONS** 

Source: Private (Class) Preinscripcion Cardinality:  [1] 

Target: Private entrevistas (Class) Entrevista Cardinality:  [1..*] 

##### **OPERATIONS** 



agregarAcudienteAspirante (acudienteASpirante : AcudienteAspirante ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



agregarEntrevista (entrevista : Entrevista ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



agregarEstudianteAspirante (estudianteAspirante : EstudianteAspirante ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



eliminarAcudienteAspirante (acudienteAspirante : AcudienteAspirante ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



eliminarEntrevista (entrevista : Entrevista ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



eliminarEstudianteAspirante (estudianteAspirante : EstudianteAspirante ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



evaluarEstado (estudianteAspirante : EstudianteAspirante ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_Profesor_** 

_Class in package 'ModeloDeDominio'_ 

Profesor Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Aggregation from  Profesor to  Grupo 

[ Direction is 'Source -> Destination'. ] 



Generalization from  Profesor to  Persona 

[ Direction is 'Source -> Destination'. ] 

##### **ATTRIBUTES** 



idProfesor : int  Private 

<u>[ Is static True. Containment is Not Specified. ]</u> 

Page 71 of 78 

Model Report 

16 July, 2026 

##### **ATTRIBUTES** 

##### **ASSOCIATIONS** 



Association (direction: Destination -> Source) Source: Private profesor (Class) Profesor Target: Public (Class) Reporte Cardinality:  [1] Cardinality:  [0..*] Association (direction: Destination -> Source) Source: Private profesor (Class) Profesor Target: Public (Class) LogroEstudiante Cardinality:  [1] Cardinality:  [0..*] Association (direction: Destination -> Source) 

Source: Private profesor (Class) Profesor Target: Public (Class) Boletin Cardinality:  [1] Cardinality:  [0..*] Association (direction: Destination -> Source) Source: Private profesor (Class) Profesor Target: Public (Class) Observacion Cardinality:  [1] Cardinality:  [0..*] 

### **_Reporte_** 

_Class in package 'ModeloDeDominio'_ 

Reporte Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **OUTGOING STRUCTURAL RELATIONSHIPS** 



Aggregation from  Reporte to  Estudiante 

[ Direction is 'Source -> Destination'. ] descripcionReporte : String  Private [ Is static True. Containment is Not Specified. ] estudiante : Estudiante  Private [ Is static True. Containment is Not Specified. ] idReporte : int  Private [ Is static True. Containment is Not Specified. ] 

##### **ATTRIBUTES** 







Page 72 of 78 

Model Report 

16 July, 2026 

**ATTRIBUTES** logrosEstudiante : List<LogroEstudiante>  Private [ Is static True. Containment is Not Specified. ] nombreReporte : String  Private [ Is static True. Containment is Not Specified. ] periodoAcademico : PeriodoAcademico  Private [ Is static True. Containment is Not Specified. ] profesor : Profesor  Private [ Is static True. Containment is Not Specified. ] **ASSOCIATIONS** Association (direction: Source -> Destination) Source: Public (Class) Reporte Target: Private logrosEstudiante (Class) Cardinality:  [1..*] LogroEstudiante Cardinality:  [1..*] Association (direction: Source -> Destination) Source: Public (Class) Reporte Target: Private periodoAcademico (Class) Cardinality:  [0..*] PeriodoAcademico Cardinality:  [1] Association (direction: Destination -> Source) Source: Private profesor (Class) Profesor Target: Public (Class) Reporte Cardinality:  [1] Cardinality:  [0..*] **OPERATIONS** agregarLogroEstudiante (logroEstudiante : LogroEstudiante ) : void Public [ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 



eliminarLogroEstudiante (logroEstudiante : LogroEstudiante ) : void Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_Rol_** 

_Class in package 'ModeloDeDominio'_ 

Rol Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

**ATTRIBUTES** 

Page 73 of 78 

Model Report 

16 July, 2026 

##### **ATTRIBUTES** 



idRol : int  Private [ Is static True. Containment is Not Specified. ] nombreRol : String  Private [ Is static True. Containment is Not Specified. ] 



##### **ASSOCIATIONS** 



Association (direction: Destination -> Source) Source: Private rol (Class) Rol Target: Public (Class) Usuario Cardinality:  [1] Cardinality:  [1..*] 

### **_Usuario_** 

_Class in package 'ModeloDeDominio'_ 

Usuario Version 1.0  Phase 1.0  Proposed leosa created on 29/06/2026.  Last modified 12/07/2026 

##### **ATTRIBUTES** 



contraseña : String  Private 



correoElectronico : String  Private 



idUsuario : int  Private nombreUsuario : String  Private rol : Rol  Private telefono : String  Private 







[ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] [ Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Destination -> Source) 

Source: Private usuario (Class) Usuario Target: Public (Class) Persona 

Page 74 of 78 

Model Report 

16 July, 2026 

##### **ASSOCIATIONS** 

Cardinality:  [0..1] 

Cardinality:  [1] 



Association (direction: Destination -> Source) 

Source: Private rol (Class) Rol Cardinality:  [1] 

Target: Public (Class) Usuario Cardinality:  [1..*] 

##### **OPERATIONS** 



validarCredenciales (credencial : String ) : boolean Public 

[ Is static False. Is abstract False. Is return array False. Is query False. Is synchronized False. ] 

### **_EstadoAprobacion_** 

_Enumeration in package 'ModeloDeDominio'_ 

EstadoAprobacion Version 1.0  Phase 1.0  Proposed leosa created on 30/06/2026.  Last modified 12/07/2026 

##### **ATTRIBUTES** 



APROBADO :   Public 

[ Stereotype is «enum». Is static True. Containment is Not Specified. ] 



RECHAZADO :   Public 

[ Stereotype is «enum». Is static True. Containment is Not Specified. ] 



EN_ESPERA :   Public 

[ Stereotype is «enum». Is static True. Containment is Not Specified. ] 



PENDIENTE :   Public 



CANCELADO :   Public 

[ Stereotype is «enum». Is static True. Containment is Not Specified. ] [ Stereotype is «enum». Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Destination -> Source) 

Source: Private estadoAprobacion (Enumeration) EstadoAprobacion Cardinality:  [1] 

Target: Public (Class) EstudianteAspirante Cardinality:  [0..*] 

Page 75 of 78 

Model Report 

16 July, 2026 

### **_EstadoEntrevista_** 

_Enumeration in package 'ModeloDeDominio'_ 

EstadoEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 1/07/2026.  Last modified 12/07/2026 

##### **ATTRIBUTES** 



PROGRAMADA :   Public 



REALIZADA :   Public 



CANCELADA :   Public 

[ Stereotype is «enum». Is static True. Containment is Not Specified. ] [ Stereotype is «enum». Is static True. Containment is Not Specified. ] [ Stereotype is «enum». Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Destination -> Source) 

Source: Private estadoEntrevista (Enumeration) EstadoEntrevista Target: Public (Class) Entrevista Cardinality:  [1] Cardinality:  [0..*] 

### **_EstadoEstudiante_** 

_Enumeration in package 'ModeloDeDominio'_ 

EstadoEstudiante Version 1.0  Phase 1.0  Proposed leosa created on 30/06/2026.  Last modified 12/07/2026 

##### **ATTRIBUTES** 



RETIRADO :   Public 



VACACIONES :   Public 

[ Stereotype is «enum». Is static True. Containment is Not Specified. ] [ Stereotype is «enum». Is static True. Containment is Not Specified. ] 



ACTIVO :   Public 

[ Stereotype is «enum». Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Destination -> Source) 

Source: Private estadoEstudiante (Enumeration) EstadoEstudiante Target: Public (Class) Estudiante Cardinality:  [1] Cardinality:  [0..*] 

Page 76 of 78 

Model Report 

16 July, 2026 

**ASSOCIATIONS** 

### **_EstadoHorarioEntrevista_** 

_Enumeration in package 'ModeloDeDominio'_ 

EstadoHorarioEntrevista Version 1.0  Phase 1.0  Proposed leosa created on 30/06/2026.  Last modified 12/07/2026 

##### **ATTRIBUTES** 



DISPONIBLE :   Public 



OCUPADO :   Public 

[ Stereotype is «enum». Is static True. Containment is Not Specified. ] [ Stereotype is «enum». Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Destination -> Source) 

Source: Private estadoHorarioEntrevista (Enumeration) Target: Public (Class) HorarioEntrevista EstadoHorarioEntrevista Cardinality:  [0..*] Cardinality:  [1] 

### **_EstadoPeriodoAcademico_** 

_Enumeration in package 'ModeloDeDominio'_ 

EstadoPeriodoAcademico Version 1.0  Phase 1.0  Proposed leosa created on 10/07/2026.  Last modified 12/07/2026 

##### **ATTRIBUTES** 



ABIERTO :   Public 



CERRADO :   Public 

[ Stereotype is «enum». Is static True. Containment is Not Specified. ] [ Stereotype is «enum». Is static True. Containment is Not Specified. ] 

##### **ASSOCIATIONS** 



Association (direction: Destination -> Source) 

Source: Private estadoPeriodoAcademico (Enumeration) Target: Public (Class) PeriodoAcademico EstadoPeriodoAcademico Cardinality:  [0..*] Cardinality:  [1] 

Page 77 of 78 

Model Report 

16 July, 2026 

Page 78 of 78 

