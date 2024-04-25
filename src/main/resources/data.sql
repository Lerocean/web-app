CREATE TABLE users
(
    id    INT AUTO_INCREMENT NOT NULL,
    name  VARCHAR(50) NOT NULL,
    email VARCHAR(20) NOT NULL
);

CREATE TABLE diary_records
(
    id    INT AUTO_INCREMENT NOT NULL,
    date_time DATE,
    event VARCHAR(50) NOT NULL,
    automatically_thought VARCHAR(100) NOT NULL,
    emotion VARCHAR(50) NOT NULL,
    action VARCHAR(50) NOT NULL,
    distortions VARCHAR(50) NOT NULL,
    answer VARCHAR(300) NOT NULL
);


INSERT INTO users (id, name, email) VALUES (1, 'Бендикуп Камберкроп', 'beni@mail.ru');
INSERT INTO users (id, name, email) VALUES (2, 'Брэд Питтсбург', 'bred@mail.ru');
INSERT INTO users (id, name, email) VALUES (3, 'Марго Роббингуд', 'margo@mail.ru');
INSERT INTO users (id, name, email) VALUES (4, 'Ева Мендесовна', 'eva@mail.ru');
INSERT INTO users (id, name, email) VALUES (5, 'Райан простигосподи Гослинг', 'rayan@mail.ru');
INSERT INTO users (id, name, email) VALUES (6, 'Эмма Стоунхендж', 'emma@mail.ru');
INSERT INTO users (id, name, email) VALUES (7, 'Николас Кейджевич', 'nik@mail.ru');
INSERT INTO users (id, name, email) VALUES (8, 'Обри лады Плаза', 'aubrey@mail.ru');
INSERT INTO users (id, name, email) VALUES (9, 'Джейсон все не воробей, кроме воробья Стетхем', 'jason@mail.ru');
INSERT INTO users (id, name, email) VALUES (10, 'Алан rip Рикман', 'alan@mail.ru');