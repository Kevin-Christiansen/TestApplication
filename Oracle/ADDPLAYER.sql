create or replace procedure "ADDPLAYER"
(team_id IN NUMBER,
win IN NUMBER,
loss IN NUMBER,
favoritechampion IN VARCHAR2,
playername IN VARCHAR2)
is
begin
INSERT INTO PLAYERS
    VALUES(team_id, win, loss, favoritechampion, playername);
end;
