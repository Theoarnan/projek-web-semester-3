drop database komputerDB;
create database komputerDB;
use komputerDB;

create table pegawai(
    id_pegawai varchar(15) not null primary key,
    nama char (30) not null,
    jenis_kelamin enum('L','P'),
    tanggal_lahir date,
    alamat varchar(40)
);

create table laptop(
    kode_laptop char(15) not null primary key,
    nama char(50),
    jenis char(50),
    harga char(50),
    stok char(50)
); 

create table pelanggan(
    id_pelanggan char(15) not null primary key,
    nama char(40),
    jenis_kelamin enum('L','P'),
    alamat varchar(50)
);

create table transaksi(
    no_transaksi char(15) not null primary key,
    tanggal date,
    pegawai_id_pegawai varchar (20) not null,
    pelanggan_id_pelanggan varchar (20) not null,
    foreign key (pegawai_id_pegawai) references pegawai(id_pegawai),
    foreign key (pelanggan_id_pelanggan) references pelanggan(id_pelanggan)
);

create table item(
    no_item char (15) not null primary key,
    jumlah varchar (5) not null,
    transaksi_no_transaksi char(15) not null,
    laptop_kode_laptop char(15) not null,
    foreign key (transaksi_no_transaksi) references transaksi(no_transaksi),
    foreign key (laptop_kode_laptop) references laptop(kode_laptop)
);
create table user(
    username varchar(50) not null primary key,
    password varchar(50) not null
);

insert into user values('admin',md5('admin'));