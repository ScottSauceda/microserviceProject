CREATE TABLE posts (
    id SERIAL,
    title VARCHAR(200) NOT NULL,
    description VARCHAR(200),
    username VARCHAR(50) NOT NULL,
    user_id INT NOT NULL
);