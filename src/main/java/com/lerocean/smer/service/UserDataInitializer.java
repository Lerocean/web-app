package com.lerocean.smer.service;

import com.lerocean.smer.entity.User;
import com.lerocean.smer.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDataInitializer {

    private final UserRepository userRepository;

    @PostConstruct
    public void addDataInUserTable() {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setName("Бендикуп Камберкроп");
        user1.setEmail("beni@mail.ru");

        User user2 = new User();
        user2.setName("Брэд Питтсбург");
        user2.setEmail("bred@mail.ru");

        User user3 = new User();
        user1.setName("Марго Роббингуд");
        user1.setEmail("margo@mail.ru");

        User user4 = new User();
        user1.setName("Ева Мендесовна");
        user1.setEmail("eva@mail.ru");

        User user5 = new User();
        user1.setName("Райан простигосподи Гослинг");
        user1.setEmail("rayan@mail.ru");

        User user6 = new User();
        user1.setName("Эмма Стоунхендж");
        user1.setEmail("emma@mail.ru");

        User user7 = new User();
        user1.setName("Николас Кейджевич");
        user1.setEmail("nik@mail.ru");

        User user8 = new User();
        user1.setName("Обри лады Плаза");
        user1.setEmail("aubrey@mail.ru");

        User user9 = new User();
        user1.setName("Джейсон все не воробей, кроме воробья Стетхем");
        user1.setEmail("jason@mail.ru");

        User user10 = new User();
        user1.setName("Алан rip Рикман");
        user1.setEmail("alan@mail.ru");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        userRepository.saveAll(users);
    }
}
