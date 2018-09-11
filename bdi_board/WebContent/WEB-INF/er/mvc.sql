SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Comment_info;
DROP TABLE IF EXISTS Board_info;
DROP TABLE IF EXISTS user_info;




/* Create Tables */

CREATE TABLE Board_info
(
	BINUM int unsigned NOT NULL AUTO_INCREMENT,
	BITITLE varchar(3000) NOT NULL,
	BITEXT text NOT NULL,
	BIFILE varchar(50),
	BICREDAT datetime NOT NULL,
	BIMODAT datetime NOT NULL,
	BICNT int DEFAULT 0 NOT NULL,
	BIACTIVE tinyint DEFAULT 1 NOT NULL,
	UINUM int unsigned NOT NULL,
	PRIMARY KEY (BINUM)
);


CREATE TABLE Comment_info
(
	CINUM int unsigned NOT NULL AUTO_INCREMENT,
	CITEXT varchar(3000) NOT NULL,
	CICREDAT datetime NOT NULL,
	CIMODAT datetime NOT NULL,
	UINUM int unsigned NOT NULL,
	BINUM int unsigned NOT NULL,
	PRIMARY KEY (CINUM)
);


CREATE TABLE user_info
(
	UINUM int unsigned NOT NULL AUTO_INCREMENT,
	UIID varchar(30) NOT NULL,
	UIPWD varchar(30) NOT NULL,
	UINAME varchar(30) NOT NULL,
	UIEMAIL varchar(100),
	PRIMARY KEY (UINUM),
	UNIQUE (UIID)
);



/* Create Foreign Keys */

ALTER TABLE Comment_info
	ADD FOREIGN KEY (BINUM)
	REFERENCES Board_info (BINUM)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Board_info
	ADD FOREIGN KEY (UINUM)
	REFERENCES user_info (UINUM)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Comment_info
	ADD FOREIGN KEY (UINUM)
	REFERENCES user_info (UINUM)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



