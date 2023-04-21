
    package ru.netology.service;

    public class CashbackHackService {
        private final int boundary = 1000;

        public int remain() {
            int amount = 950;
            return boundary - amount % boundary;
        }
    }

