create table login_user
(
    user_id  int auto_increment
        primary key,
    username varchar(255) not null,
    password varchar(25)  null,
    constraint login_user_username_uindex
        unique (username)
);

INSERT INTO app.login_user (user_id, username, password) VALUES (31, 'username', 'p3');
INSERT INTO app.login_user (user_id, username, password) VALUES (32, 'user', 'p4');
INSERT INTO app.login_user (user_id, username, password) VALUES (33, 'scx', 'p2');
INSERT INTO app.login_user (user_id, username, password) VALUES (34, 'vertx', 'p2');
INSERT INTO app.login_user (user_id, username, password) VALUES (35, 'mode', 'p2');
