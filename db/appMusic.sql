create database appMusic

use appMusic

create table USERS
(
	matk int identity(1,1),
	tennd varchar(30) not null,
	matkhau varchar(30) not null,
	email varchar(50) not null,
	ngaysinh date ,
	chucvu bit,
	hinh nvarchar(50),
	ngaytao date
	
	constraint pk_user primary key(matk) ,
);

create table SONG
(
	mabh varchar(8),
	tenbh nvarchar(100) not null,
	theloai nvarchar(30) not null,
	khoangthoigian datetime,
	nguoist nvarchar(100),
	nguoitb nvarchar(100) not null,
	anh nvarchar(50),
	ngaytao date
	
	constraint pk_song primary key(mabh),
);

create table USER_SONG
(
	id int identity(1,1),
	matk int ,
	mabh varchar(8),
	playcount int,
	ngaytao date
	
	constraint pk_usersong primary key(id),
	constraint fk_usersong_user foreign key (matk) references USERS(matk) on delete cascade,
	constraint fk_usersong_song foreign key (mabh) references SONG(mabh),
);

create table PLAYLIST
(
	maplaylist int identity(1,1),
	matk int,
	tieude nvarchar(50),
	counts int,
	ngaytao date
	
	constraint pk_playlist primary key(maplaylist),
	constraint fk_palylist_users foreign key(matk) references USERS(matk) on delete cascade,
);

create table PLAYLIST_SONG
(
	trackno int identity(1,1),
	maplaylist int,
	mabh varchar(8)

	constraint pk_playlistsong primary key(trackno),
	constraint fk_playlistsong_playlist foreign key(maplaylist) references PLAYLIST(maplaylist) on delete cascade,
	constraint fk_playlistsong_song foreign key(mabh) references SONG(mabh) on delete cascade,
);
insert into USERS(tennd,matkhau,email,ngaysinh,chucvu,ngaytao) values 
('nam','123','s@gmail.com','','1','2022-11-10'),
('bao','123','g@gmail.com','2003-05-12','1','2022-11-10'),
('nhien','123','c@gmail.com','','1','2022-11-10'),
('nguyen van b','123','b@gmail.com','2002-08-20','0','2022-11-10'),
('nguyen van a','123','a@gmail.com','','0','2022-11-10');

insert into SONG(mabh,tenbh,theloai,khoangthoigian,nguoist,nguoitb,anh,ngaytao) values
('no1',N'tại vì sao','rap','2022-11-10 00:05:00', N'nô nố', N'á af','abc','2022-11-10'),
('no2',N'fakeeee','3d','2022-11-10 00:02:50', N'nô nố', N'á af','abc','2022-11-10'),
('no3',N'múi','hiện đại','2022-11-10 00:02:00', N'nô nố', N'á af','abc','2022-11-10'),
('no4',N'siba','rap','2022-11-10 00:03:00', N'nô nố', N'á af','abc','2022-11-10'),
('no5',N'hello','cổ điển','2022-11-10 00:04:00', N'nô nố', N'á af','abc','2022-11-10');

insert into USER_SONG(matk,mabh,playcount,ngaytao) values
(1,'no2',50,'2022-11-10'),
(2,'no4',50,'2022-11-10'),
(3,'no2',60,'2022-11-10'),
(2,'no4',20,'2022-11-10'),
(5,'no2',40,'2022-11-10');

insert into PLAYLIST(matk,tieude,ngaytao)  values
(1,'mile','2022-11-10'),
(2,'hay ne','2022-11-10'),
(3,'abc','2022-11-10'),
(4,'mlk','2022-11-10'),
(5,'commit','2022-11-10');

insert into PLAYLIST_SONG(maplaylist,mabh) values
(1,'no2'),
(3,'no3'),
(4,'no5'),
(5,'no1'),
(2,'no4');

