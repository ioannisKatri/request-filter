CREATE TABLE scheduler
(
    id   int(11) unsigned NOT NULL AUTO_INCREMENT,
    name int(11)          NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO scheduler (id, name) values (1, 'CountRequestsScheduler');