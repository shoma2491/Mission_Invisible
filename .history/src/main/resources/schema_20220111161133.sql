CREATE TABLE USER(
    userId IDENTITY,
    userName CHAR NOT NULL,
    roleId INT NOT NULL /*1=USER,2=ONI */
);

CREATE TABLE MATCH(
    userId INT,
    turn INT,
    imgNum INT
)

CREATE TABLE RESULT(
    turn INT,
    u
)

/*



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

CREATE TABLE FUGITIVEUSER(
    fugitiveUserId INT NOT NULL,
    fugitiveUserName CHAR NOT NULL,
    PRIMARIY KEY(fugitiveUserId)
);

CREATE TABLE DEMONUSER(
    demonUserId INT NOT NULL,
    demonUserName CHAR NOT NULL,
    PRIMARIY KEY(demonUserId)
);

CREATE TABLE FUGITIVEMATCH(//FUGITIVE・・・逃走者
    matchId INT NOT NULL,
    fugitiveUserId INT NOT NULL,
    fugitiveScore INT NOT NULL,
    PRIMARIY KEY(matchId,fugitiveUserId)
);

CREATE TABLE DEMONMATCH(//DEMON・・・鬼
    matchId INT NOT NULL,
    demonUserId INT NOT NULL,
    demonScore INT NOT NULL,
    clearMissionCount INT NOT NULL,
    clearInvisibleCount INT NOT NULL,
    PRIMARIY KEY(matchId,fugitiveUserId)
);

*/
