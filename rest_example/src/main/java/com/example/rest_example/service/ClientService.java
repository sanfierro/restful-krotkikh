package com.example.rest_example.service;

import com.example.rest_example.model.Client;

import java.util.List;

public interface ClientService {
        /**
        * Створює нового клієнта
        * @Param client - клієнт для створення
        */
        void create (Client client);
        /**
        * Повертає список всіх наявних клієнтів
        * @Return список клієнтів
        */
        List<Client> readAll ();
        /**
        * Повертає клієнта по його ID
        * @Param id - ID клієнта
        * @Return - об'єкт клієнта з заданим ID
        */
        Client read (int id);
        /**
        * Обновляє клієнта з заданим ID,
        * Відповідно до переданим клієнтом
        * @Param client - клієнт у відповідності з яким потрібно оновити дані
        * @Param id - id клієнта якого потрібно оновити
        * @Return - true якщо дані були оновлені, інакше false
        */
        boolean update (Client client, int id);
        /**
        * Видаляє клієнта з заданим ID
        * @Param id - id клієнта, якого потрібно видалити
        * @Return - true якщо клієнт був видалений, інакше false
        */
        boolean delete (int id);
        }
