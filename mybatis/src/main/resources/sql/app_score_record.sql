create table score_record
(
    record_id int auto_increment
        primary key,
    user_id   int        not null,
    count     int        null,
    timestamp mediumtext not null,
    type      int        null
);

create index score_record_user_id_index
    on score_record (user_id);

INSERT INTO app.score_record (record_id, user_id, count, timestamp, type) VALUES (1, 31, 2, '1213456', 1);
INSERT INTO app.score_record (record_id, user_id, count, timestamp, type) VALUES (2, 31, 3, '212321231', 1);
