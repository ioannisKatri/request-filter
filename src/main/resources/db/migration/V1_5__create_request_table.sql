CREATE TABLE request
(
    id                    int(11) unsigned NOT NULL AUTO_INCREMENT,
    customer_id           int(11) unsigned NOT NULL,
    tag_id                int(11) unsigned NOT NULL,
    user_id               varchar(120)     NOT NULL,
    remote_ip             int(11) unsigned NOT NULL,
    timestamp             timestamp        NOT NULL,
    invalid_user_agent_id int(11),
    error_message         varchar(100),
    success               boolean          NOT NULL,
    created_at            DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);