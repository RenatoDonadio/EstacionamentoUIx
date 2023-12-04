CREATE DATABASE bd_estacionamento;
USE  bd_estacionamento;
SELECT * FROM veiculos;

CREATE TABLE IF NOT EXISTS veiculos(
ticket INT AUTO_INCREMENT,
carro VARCHAR(120),
placa VARCHAR(80),
horario VARCHAR(80),



CONSTRAINT PK_Ticket PRIMARY KEY (ticket),
CONSTRAINT ValorPago DEFAULT 'Não Pago'


);




CREATE TABLE IF NOT EXISTS Estacionamento(
IdEstacionamento INT auto_increment,
IdTicket INT NOT NULL,

CONSTRAINT PK_Estacionamento PRIMARY KEY (IdEstacionamento),
FOREIGN KEY FK_Ticket (IdTicket) REFERENCES veiculos(ticket)



);







CREATE TABLE IF NOT EXISTS Horario(
IdHorario INT auto_increment,
IdTicket INT NOT NULL,
Horario VARCHAR(80),
HorarioS VARCHAR(50) NOT NULL,

CONSTRAINT PK_Horario PRIMARY KEY (IdHorario),

FOREIGN KEY FK_HorarioTicket (IdTicket) REFERENCES veiculos(Ticket)


);





CREATE TABLE IF NOT EXISTS ValordoTicket(
IdValor INT auto_increment,
placa VARCHAR(80),
ValorTicket DOUBLE NOT NULL,

PRIMARY KEY PK_Valor (IdValor),
CONSTRAINT FK_PlacaF FOREIGN KEY (placa) REFERENCES veiculos(placa)

);





select * from valordoticket;
select * from veiculos;
select * from horario;
select * from estacionamento;

select * from veiculos WHERE ticket = 3;


ALTER TABLE veiculos
ADD COLUMN ValorPago VARCHAR(80) NULL DEFAULT 'Não Pago';















