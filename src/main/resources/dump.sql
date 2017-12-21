CREATE TABLE "member" (
    id_member serial NOT NULL,
    username character varying(64),
    password text,
    role varchar(32) DEFAULT 'ROLE_USER':: character varying NOT NULL,
    enabled boolean DEFAULT true NOT NULL
);

CREATE TABLE "profile" (
    id_profile serial NOT NULL,
    name character varying(255) ,
    gender text ,
    date_of_birth character varying(255),
    address character varying(255) ,
    email character varying(255)
);

CREATE TABLE "period" (
    id_period serial NOT NULL,
    name character varying(255) NOT NULL,
    time time NOT NULL,
    picture text  NOT NULL

);

CREATE TABLE "radio" (
    id_radio serial NOT NULL,
    name character varying(255) NOT NULL,
    author character varying(255) NOT NULL,
    link text NOT NULL,
    details text NOT NULL,
    id_period integer NOT NULL
);



ALTER TABLE ONLY "profile"
ADD CONSTRAINT profile_pkey PRIMARY KEY (id_profile);

ALTER TABLE ONLY "member"
ADD CONSTRAINT member_pkey PRIMARY KEY (id_member);

ALTER TABLE ONLY "period"
ADD CONSTRAINT period_pkey PRIMARY KEY (id_period);

ALTER TABLE ONLY "radio"
ADD CONSTRAINT radio_pkey PRIMARY KEY (id_radio);


INSERT INTO public.member(
	 username, password, role, enabled)
	VALUES ( 'vannga', '123123', 'ROLE_ADMIN',true),
    ( 'duchuy', '123123', 'ROLE_USER',true);

INSERT INTO public.profile(
	name, gender, date_of_birth, address, email)
	VALUES ('Hoàng Văn Ngà', 'Nam', '21/6/1997', 'Đà Nẵng, Việt Nam', 'ngahv2222@gmail.com'),
    ('Trần Đức Huy', 'Nam', '18/8/1997', 'Đà Nẵng, Việt Nam', 'bentran808@gmail.com');