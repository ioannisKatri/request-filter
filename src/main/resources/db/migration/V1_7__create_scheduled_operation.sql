CREATE TABLE scheduled_operations
(
    id           int(11) unsigned NOT NULL AUTO_INCREMENT,
    scheduler_id int(11)          NOT NULL REFERENCES scheduler(id),
    last_id  int(11)          NOT NULL,
    created_at   DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);