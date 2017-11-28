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
    email character varying(255) NOT NULL,

);


ALTER TABLE ONLY "profile"
ADD CONSTRAINT profile_pkey PRIMARY KEY (id_profile);

ALTER TABLE ONLY "member"
ADD CONSTRAINT member_pkey PRIMARY KEY (id_member);
