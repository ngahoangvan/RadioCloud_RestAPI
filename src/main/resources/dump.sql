CREATE TABLE "member" (
    id_member integer NOT NULL,
    username character varying(64) NOT NULL,
    password text NOT NULL,
    role character varying(32) DEFAULT 'user'::character varying NOT NULL,
    enabled boolean DEFAULT true NOT NULL
);

CREATE TABLE "profile" (
    id_profile integer NOT NULL,
    name character varying(255) NOT NULL,
    gender text NOT NULL,
    date_of_birth character varying(255) NOT NULL,
    address character varying(255) NOT NULL,
    email character varying(255) NOT NULL
);

CREATE TABLE "radio" (
    id_radio integer NOT NULL,
    name character varying(255) NOT NULL,
    time time NOT NULL,
    details text NOT NULL,
    picture text  NOT NULL

);

CREATE TABLE "music" (
    id_music integer NOT NULL,
    name character varying(255) NOT NULL,
    author character varying(255) NOT NULL
    link text NOT NULL,
    id_radio integer NOT NULL
);


ALTER TABLE ONLY "profile"
ADD CONSTRAINT profile_pkey PRIMARY KEY (id_profile);

ALTER TABLE ONLY "member"
ADD CONSTRAINT member_pkey PRIMARY KEY (id_member);

ALTER TABLE ONLY "radio"
ADD CONSTRAINT radio_pkey PRIMARY KEY (id_radio);

ALTER TABLE ONLY "music"
ADD CONSTRAINT music_pkey PRIMARY KEY (id_music);
