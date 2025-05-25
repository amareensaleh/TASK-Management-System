
-- drop table invites;
drop table if exists passcodes;
drop table if exists passcode;
drop table if exists program_users;
drop table if exists invites;
drop table if exists user_roles;
drop table if exists roles;
drop table if exists task_record;
drop table if exists task;
drop table if exists program;
drop table if exists users;

-- Table: users
CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    username VARCHAR(255) UNIQUE NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- Table: roles
CREATE TABLE roles (
    id BIGSERIAL PRIMARY KEY,
    name TEXT UNIQUE NOT NULL
);

-- Relationship: user_roles
CREATE TABLE user_roles (
    uid BIGSERIAL REFERENCES users(id) ON DELETE CASCADE,
    rid BIGSERIAL REFERENCES roles(id) ON DELETE CASCADE,
    PRIMARY KEY (uid, rid)
);

-- Table: programs
CREATE TABLE program (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    admin BIGSERIAL REFERENCES users(id) ON DELETE SET NULL
);

-- Relationship: program_users
CREATE TABLE program_users (
    pid BIGSERIAL REFERENCES program(id) ON DELETE CASCADE,
    uid BIGSERIAL REFERENCES users(id) ON DELETE CASCADE,
    PRIMARY KEY (pid, uid)
);

-- Table: tasks
CREATE TABLE task (
    id BIGSERIAL PRIMARY KEY,
    pid BIGSERIAL REFERENCES program(id) ON DELETE CASCADE,
    name VARCHAR(255) NOT NULL,
    created_by BIGSERIAL REFERENCES users(id),
    created_time TIMESTAMP,
    start_time TIMESTAMP,
    deadline TIMESTAMP,
    modified_by BIGSERIAL REFERENCES users(id),
    modified_time TIMESTAMP,
    status VARCHAR(255),
    description TEXT
);

-- Table: task_record
CREATE TABLE task_record (
    id TEXT PRIMARY KEY,
    uid BIGSERIAL REFERENCES users(id) ON DELETE CASCADE,
    pid BIGSERIAL REFERENCES program(id) ON DELETE CASCADE,
    task BIGSERIAL REFERENCES task(id) ON DELETE CASCADE,
    status VARCHAR(255),
    score DECIMAL,
    max DECIMAL,
    remarks TEXT,
    work TEXT
);

-- Table: invites
CREATE TABLE invites (
    id BIGSERIAL PRIMARY KEY,
    pid BIGSERIAL REFERENCES program(id) ON DELETE CASCADE,
    uid BIGSERIAL REFERENCES users(id)
);

-- Table: passcode
CREATE TABLE passcode (
    id BIGSERIAL PRIMARY KEY,
    pid BIGSERIAL REFERENCES program(id) ON DELETE CASCADE,
    code VARCHAR(255) NOT NULL
);
