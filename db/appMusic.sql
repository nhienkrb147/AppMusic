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
	musicpath nvarchar(100) not null,
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

insert into SONG(mabh,tenbh,theloai,khoangthoigian,nguoist,nguoitb,anh,musicpath,ngaytao) values
('MM01',N'Mặt mộc','v-pop','2022-11-10 00:05:00', N'Phạm Nguyên Ngọc', N'Phạm Nguyên Ngọc ft VAnh','abc','matmoc.mp3','2022-11-10');


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

insert into SONG(mabh,tenbh,theloai,nguoist,nguoitb,anh,musicpath,ngaytao) values
('RAP1',N'Anh thèm được ngủ','RAP', N'Khói', N'Khói','abc',N'RAP Khói - anh thèm được ngủ.mp3','2022-11-10');
('RAP2',N'Chỉ còn ta và ta giữa trời','RAP', N'Killic x DBlue', N'Killic x DBlue','abc',N'RAP Chỉ Còn Ta Và Ta Giữa Trời.mp3','2022-11-10');
('RAP3',N'6locc 6a6y','RAP', N'LilRoad', N'LilRoad','abc',N'RAP 6locc 6a6y.mp3','2022-11-10');
('RAP4',N'Calling My Phone','RAP', N'Lil Tjay', N'Lil Tjay','abc',N'RAP Calling My Phone.mp3','2022-11-10');
('RAP5',N'Chỉ một đêm nữa thôi','RAP', N'MCK-Tlinh', N'MCK-Tlinh','abc',N'RAP CHỈ MỘT ĐÊM NỮA THÔI.mp3','2022-11-10');
('RAP6',N'Thích quá rùi nà','RAP', N'Tlinh x Trung Trần', N'Tlinh x Trung Trần','abc',N'RAP Thích Quá Rùi Nà.mp3','2022-11-10');
('RAP7',N'Vầng thái dương','RAP', N'YoungH - Bray', N'YoungH - Bray','abc',N'RAP Vầng Thái Dương.mp3','2022-11-10');
('RAP8',N'XTC','RAP', N'Grovie x Tlinh x MCK', N'Grovie x Tlinh x MCK','abc',N'RAP Xích Thêm Chút.mp3','2022-11-10');

insert into SONG(mabh,tenbh,theloai,nguoist,nguoitb,anh,musicpath,ngaytao) values
('GAMING1',N'Playground','GAMING', N'Bea Miller', N'Bea Miller','abc',N'GAMING Playground.mp3','2022-11-10'),
('GAMING2',N'Legends Never Die','GAMING', N'Against The Current', N'Against The Current','abc',N'GAMING Legends Never Die.mp3','2022-11-10'),
('GAMING3',N'Star walkin','GAMING', N'LilNasx', N'LilNasx','abc',N'GAMING STAR WALKIN.mp3','2022-11-10'),
('GAMING4',N'Enemy','GAMING', N'Imagine Dragons x J.I.D ', N'Imagine Dragons x J.I.D ','abc',N'GAMING Enemy.mp3','2022-11-10'),
('GAMING5',N'Nhạc trend','GAMING', N'MaGaming', N'MaGaminh','abc',N'GAMING.mp3','2022-11-10'),
('GAMING6',N'Warriors','GAMING', N'Imagine Dragons', N'Imagine Dragons','abc',N'GAMING Warriors.mp3','2022-11-10'),
('GAMING7',N'Guns for hire','GAMING', N'Alex Seaver of Mako', N'Woodkid','abc',N'GAMING Guns for Hire.mp3','2022-11-10');

insert into SONG(mabh,tenbh,theloai,nguoist,nguoitb,anh,musicpath,ngaytao) values
('R&B',N'All Night Long','R&B', N'Various', N'Various','abc',N'AllNightLong_R&B.mp3','2022-11-10'),
('R&B1',N'Say My Name','R&B', N'David Guetta, Bebe Rexha & J Balvin', N'David Guetta, Bebe Rexha & J Balvin','abc',N'SayMyName_R&B.mp3','2022-11-10'),
('R&B2',N'Too Close','R&B', N'Alex Clare', N'Alex Clare','abc',N'Too Close_R&B.mp3','2022-11-10'),
('R&B3',N'Ty Dolla','R&B', N'Ty Dolla $ign', N'Ty Dolla $ign','abc',N'TyDollaIgn_R&B.mp3','2022-11-10'),
('R&B4',N'Give Me Everything','GAMING', N'Pitbull ft. Neyo, Nayer & Afrojack', N'Pitbull ft. Neyo, Nayer & Afrojack','abc',N'GiveMeEverything_R&B.mp3','2022-11-10'),


select * from Song