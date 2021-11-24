CREATE TABLE chamber (
    id IDENTITY,
    user CHAR NOT NULL,
    number INT NOT NULL
);
CREATE TABLE userinfo (
    user CHAR NOT NULL PRIMARY KEY,
    height DOUBLE NOT NULL
);
CREATE TABLE fruit (
    id IDENTITY,
    name CHAR NOT NULL,
    price INT NOT NULL
);
/*

CREATE TABLE USER(
    userId INT NOT NULL,
    userName CHAR NOT NULL,
    roleId INT NOT NULL,
    PRIMARIY KEY(userId)
);
 
CREATE TABLE ROLE(
    roleId INT NOT NULL,
    roleName CHAR NOT NULL,
    PRIMARIY KEY(roleId)
);
 
CREATE TABLE MATCH(
    userId INT NOT NULL,
    matchId INT NOT NULL,
    score INT NOT NULL,
    clearMissionCount INT NOT NULL,
    clearInvisibleCount INT NOT NULL,
 
    PRIMARIY KEY(userId,matchId)
);
 
 */

/*
 
CREATE TABLE USER(
    userId INT NOT NULL,
    userName CHAR NOT NULL,
    roleId INT NOT NULL,
    PRIMARIY KEY(userId)
);
 
CREATE TABLE ROLE(
    roleId INT NOT NULL,
    roleName CHAR NOT NULL,
    PRIMARIY KEY(roleId)
);
 
CREATE TABLE FUGITIVEMATCH(//FUGITIVE・・・逃走者
    userId INT NOT NULL,
    matchId INT NOT NULL,
    score INT NOT NULL,
    clearMissionCount INT NOT NULL,
    clearInvisibleCount INT NOT NULL,
 
    PRIMARIY KEY(userId,matchId)
);
 
//鬼側のテーブル
 
*/
