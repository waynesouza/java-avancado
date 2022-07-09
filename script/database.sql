create table if not exists usuario (
    login varchar(10) not null primary key,
    senha varchar(50) not null,
    nome varchar(100) not null
);

create table if not exists categoria (
    codigo bigint not null auto_increment primary key,
    nome varchar(50) not null
);

create table if not exists despesa (
    codigo bigint not null auto_increment primary key,
    usuario varchar(10),
    categoria bigint,
    data datetime not null,
    valor double not null,
    constraint fk_usuario foreign key (usuario) references usuario(login),
    constraint fk_categoria foreign key (categoria) references categoria(codigo)
);

